// #Sireum
// @formatter:off

// This file is auto-generated from BatteryQuality.scala, EvidenceValidity.scala, EvidenceFreshness.scala, AdmissionResult.scala, BatteryAssessment.scala, PowerCondition.scala, PowerAssessment.scala, EnginePositionOneCondition.scala, EnginePositionTwoCondition.scala, EnginePairAssessment.scala, EngineCount.scala, AlternatingKinds.scala, ConfigurationAssessment.scala, PropulsionAssessment.scala, ChargerCoupling.scala, ChargingAssessment.scala, ControlEvent.scala, ActuationFeedback.scala, PriorityDirective.scala, DemandPhase.scala, RequestContextEvent.scala, FaultStatus.scala, FaultCause.scala, SummaryDirective.scala, RecoveryPhase.scala, RecoveryGate.scala, AvailabilityValue.scala, AvailabilityCause.scala, ReportAvailabilityValue.scala, ReportAvailabilityCause.scala, ReportDemandPhase.scala, ReportRecoveryPhase.scala, PowerCommand.scala, BatteryObservation.scala, QualifiedBatteryObservation.scala, PowerEvidence.scala, EnginePairEvidence.scala, ConfigurationEvidence.scala, ChargerEvidence.scala, RequestContext.scala, FaultActionSummary.scala, RecoveryFrame.scala, AvailabilityDecision.scala, AvailabilityReport.scala, Base_Types.scala, BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_Containers.scala, BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Containers.scala, PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Containers.scala, OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Containers.scala, EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_Containers.scala, FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_Containers.scala, PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Containers.scala, ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Containers.scala, EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_Containers.scala, FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_Containers.scala, RecoveryQualificationOwner_supervisor_process_recovery_qualification_Containers.scala, AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_Containers.scala, PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package power_propulsion_availability_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printPower_Propulsion_Availability_SupervisorBatteryQualityType(o: Power_Propulsion_Availability_Supervisor.BatteryQuality.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.BatteryQuality.ADEQUATE => "ADEQUATE"
        case Power_Propulsion_Availability_Supervisor.BatteryQuality.LIMITED => "LIMITED"
        case Power_Propulsion_Availability_Supervisor.BatteryQuality.DEPLETED => "DEPLETED"
        case Power_Propulsion_Availability_Supervisor.BatteryQuality.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.BatteryQuality")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorBatteryQualityType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvidenceValidityType(o: Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.EvidenceValidity.VALID => "VALID"
        case Power_Propulsion_Availability_Supervisor.EvidenceValidity.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.EvidenceValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorEvidenceValidityType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.EvidenceFreshness.CURRENT => "CURRENT"
        case Power_Propulsion_Availability_Supervisor.EvidenceFreshness.STALE => "STALE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.EvidenceFreshness")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAdmissionResultType(o: Power_Propulsion_Availability_Supervisor.AdmissionResult.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.AdmissionResult.ADMITTED_NONE => "ADMITTED_NONE"
        case Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_INVALID => "REJECTED_INVALID"
        case Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_STALE => "REJECTED_STALE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.AdmissionResult")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorAdmissionResultType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o: Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.BatteryAssessment.READY_NONE => "READY_NONE"
        case Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_INVALID => "NOT_READY_INVALID"
        case Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_STALE => "NOT_READY_STALE"
        case Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_LIMITED => "NOT_READY_LIMITED"
        case Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_DEPLETED_OR_UNKNOWN => "NOT_READY_DEPLETED_OR_UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.BatteryAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerConditionType(o: Power_Propulsion_Availability_Supervisor.PowerCondition.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.PowerCondition.NOMINAL => "NOMINAL"
        case Power_Propulsion_Availability_Supervisor.PowerCondition.DEGRADED => "DEGRADED"
        case Power_Propulsion_Availability_Supervisor.PowerCondition.UNAVAILABLE => "UNAVAILABLE"
        case Power_Propulsion_Availability_Supervisor.PowerCondition.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.PowerCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCondition_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerCondition_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorPowerConditionType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o: Power_Propulsion_Availability_Supervisor.PowerAssessment.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.PowerAssessment.READY_NONE => "READY_NONE"
        case Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_INVALID => "NOT_READY_INVALID"
        case Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_STALE => "NOT_READY_STALE"
        case Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_CONDITION => "NOT_READY_CONDITION"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.PowerAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.NOMINAL => "NOMINAL"
        case Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.NON_NOMINAL => "NON_NOMINAL"
        case Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.UNAVAILABLE => "UNAVAILABLE"
        case Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.NOMINAL => "NOMINAL"
        case Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.NON_NOMINAL => "NON_NOMINAL"
        case Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.UNAVAILABLE => "UNAVAILABLE"
        case Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.EnginePairAssessment.READY_NONE => "READY_NONE"
        case Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID => "NOT_READY_INVALID"
        case Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_STALE => "NOT_READY_STALE"
        case Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_FIRST_POSITION => "NOT_READY_FIRST_POSITION"
        case Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_SECOND_POSITION => "NOT_READY_SECOND_POSITION"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.EnginePairAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEngineCountType(o: Power_Propulsion_Availability_Supervisor.EngineCount.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.EngineCount.FOUR => "FOUR"
        case Power_Propulsion_Availability_Supervisor.EngineCount.OTHER => "OTHER"
        case Power_Propulsion_Availability_Supervisor.EngineCount.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.EngineCount")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEngineCount_Payload(o: Power_Propulsion_Availability_Supervisor.EngineCount_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EngineCount_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorEngineCountType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAlternatingKindsType(o: Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.AlternatingKinds.MATCHES_SOURCE => "MATCHES_SOURCE"
        case Power_Propulsion_Availability_Supervisor.AlternatingKinds.DOES_NOT_MATCH => "DOES_NOT_MATCH"
        case Power_Propulsion_Availability_Supervisor.AlternatingKinds.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.AlternatingKinds")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorAlternatingKindsType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.READY_NONE => "READY_NONE"
        case Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_INVALID => "NOT_READY_INVALID"
        case Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_STALE => "NOT_READY_STALE"
        case Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_ENGINE_COUNT => "NOT_READY_ENGINE_COUNT"
        case Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_ALTERNATION => "NOT_READY_ALTERNATION"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ConfigurationAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.PropulsionAssessment.READY_NONE => "READY_NONE"
        case Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP => "NOT_READY_ODD_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP => "NOT_READY_EVEN_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_CONFIGURATION => "NOT_READY_CONFIGURATION"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.PropulsionAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargerCouplingType(o: Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ChargerCoupling.DISCONNECTED => "DISCONNECTED"
        case Power_Propulsion_Availability_Supervisor.ChargerCoupling.CONNECTED_IDLE => "CONNECTED_IDLE"
        case Power_Propulsion_Availability_Supervisor.ChargerCoupling.CHARGING => "CHARGING"
        case Power_Propulsion_Availability_Supervisor.ChargerCoupling.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ChargerCoupling")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorChargerCouplingType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o: Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ChargingAssessment.READY_NONE => "READY_NONE"
        case Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_INVALID => "NOT_READY_INVALID"
        case Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_STALE => "NOT_READY_STALE"
        case Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_CONNECTED_IDLE => "NOT_READY_CONNECTED_IDLE"
        case Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_CHARGING_OR_UNKNOWN => "NOT_READY_CHARGING_OR_UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ChargingAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorControlEventType(o: Power_Propulsion_Availability_Supervisor.ControlEvent.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ControlEvent.NONE => "NONE"
        case Power_Propulsion_Availability_Supervisor.ControlEvent.REQUEST_ENABLE => "REQUEST_ENABLE"
        case Power_Propulsion_Availability_Supervisor.ControlEvent.REQUEST_DISABLE => "REQUEST_DISABLE"
        case Power_Propulsion_Availability_Supervisor.ControlEvent.ACKNOWLEDGE_RECOVERY => "ACKNOWLEDGE_RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ControlEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorControlEvent_Payload(o: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ControlEvent_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorControlEventType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorActuationFeedbackType(o: Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ActuationFeedback.DISABLED_CONFIRMED => "DISABLED_CONFIRMED"
        case Power_Propulsion_Availability_Supervisor.ActuationFeedback.ENABLED_CONFIRMED => "ENABLED_CONFIRMED"
        case Power_Propulsion_Availability_Supervisor.ActuationFeedback.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ActuationFeedback")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorActuationFeedbackType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o: Power_Propulsion_Availability_Supervisor.PriorityDirective.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT => "INHIBIT"
        case Power_Propulsion_Availability_Supervisor.PriorityDirective.DISABLE => "DISABLE"
        case Power_Propulsion_Availability_Supervisor.PriorityDirective.RECOVER => "RECOVER"
        case Power_Propulsion_Availability_Supervisor.PriorityDirective.ENABLE => "ENABLE"
        case Power_Propulsion_Availability_Supervisor.PriorityDirective.HOLD => "HOLD"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.PriorityDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorDemandPhaseType(o: Power_Propulsion_Availability_Supervisor.DemandPhase.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE => "IDLE"
        case Power_Propulsion_Availability_Supervisor.DemandPhase.REQUESTED => "REQUESTED"
        case Power_Propulsion_Availability_Supervisor.DemandPhase.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.DemandPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.DemandPhase_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRequestContextEventType(o: Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.RequestContextEvent.NONE => "NONE"
        case Power_Propulsion_Availability_Supervisor.RequestContextEvent.REQUEST_ENABLE => "REQUEST_ENABLE"
        case Power_Propulsion_Availability_Supervisor.RequestContextEvent.REQUEST_DISABLE => "REQUEST_DISABLE"
        case Power_Propulsion_Availability_Supervisor.RequestContextEvent.ACKNOWLEDGE_RECOVERY => "ACKNOWLEDGE_RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.RequestContextEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorRequestContextEventType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultStatusType(o: Power_Propulsion_Availability_Supervisor.FaultStatus.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.FaultStatus.CLEAR => "CLEAR"
        case Power_Propulsion_Availability_Supervisor.FaultStatus.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.FaultStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultStatus_Payload(o: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultStatus_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorFaultStatusType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultCauseType(o: Power_Propulsion_Availability_Supervisor.FaultCause.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.FaultCause.NONE => "NONE"
        case Power_Propulsion_Availability_Supervisor.FaultCause.BATTERY => "BATTERY"
        case Power_Propulsion_Availability_Supervisor.FaultCause.POWER_MANAGEMENT => "POWER_MANAGEMENT"
        case Power_Propulsion_Availability_Supervisor.FaultCause.ODD_ENGINE_GROUP => "ODD_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.FaultCause.EVEN_ENGINE_GROUP => "EVEN_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.FaultCause.CONFIGURATION => "CONFIGURATION"
        case Power_Propulsion_Availability_Supervisor.FaultCause.CHARGER => "CHARGER"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.FaultCause")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultCause_Payload(o: Power_Propulsion_Availability_Supervisor.FaultCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultCause_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorFaultCauseType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorSummaryDirectiveType(o: Power_Propulsion_Availability_Supervisor.SummaryDirective.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.SummaryDirective.INHIBIT => "INHIBIT"
        case Power_Propulsion_Availability_Supervisor.SummaryDirective.DISABLE => "DISABLE"
        case Power_Propulsion_Availability_Supervisor.SummaryDirective.RECOVER => "RECOVER"
        case Power_Propulsion_Availability_Supervisor.SummaryDirective.ENABLE => "ENABLE"
        case Power_Propulsion_Availability_Supervisor.SummaryDirective.HOLD => "HOLD"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.SummaryDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorSummaryDirectiveType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryPhaseType(o: Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.RecoveryPhase.NORMAL => "NORMAL"
        case Power_Propulsion_Availability_Supervisor.RecoveryPhase.QUARANTINED => "QUARANTINED"
        case Power_Propulsion_Availability_Supervisor.RecoveryPhase.AWAITING_ACK => "AWAITING_ACK"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.RecoveryPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorRecoveryPhaseType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryGateType(o: Power_Propulsion_Availability_Supervisor.RecoveryGate.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.RecoveryGate.OPEN => "OPEN"
        case Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED => "CLOSED"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.RecoveryGate")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorRecoveryGateType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityValueType(o: Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.AvailabilityValue.UNAVAILABLE => "UNAVAILABLE"
        case Power_Propulsion_Availability_Supervisor.AvailabilityValue.AVAILABLE_FOR_ENABLE => "AVAILABLE_FOR_ENABLE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.AvailabilityValue")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorAvailabilityValueType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityCauseType(o: Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.NONE => "NONE"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.BATTERY => "BATTERY"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.POWER_MANAGEMENT => "POWER_MANAGEMENT"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.ODD_ENGINE_GROUP => "ODD_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.EVEN_ENGINE_GROUP => "EVEN_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.CONFIGURATION => "CONFIGURATION"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.CHARGER => "CHARGER"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.RECOVERY => "RECOVERY"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.NO_DEMAND => "NO_DEMAND"
        case Power_Propulsion_Availability_Supervisor.AvailabilityCause.OPERATOR_DISABLE => "OPERATOR_DISABLE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.AvailabilityCause")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorAvailabilityCauseType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportAvailabilityValueType(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.UNAVAILABLE => "UNAVAILABLE"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.AVAILABLE_FOR_ENABLE => "AVAILABLE_FOR_ENABLE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorReportAvailabilityValueType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.NONE => "NONE"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.BATTERY => "BATTERY"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.POWER_MANAGEMENT => "POWER_MANAGEMENT"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.ODD_ENGINE_GROUP => "ODD_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.EVEN_ENGINE_GROUP => "EVEN_ENGINE_GROUP"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.CONFIGURATION => "CONFIGURATION"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.CHARGER => "CHARGER"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.RECOVERY => "RECOVERY"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.NO_DEMAND => "NO_DEMAND"
        case Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.OPERATOR_DISABLE => "OPERATOR_DISABLE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportDemandPhaseType(o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ReportDemandPhase.IDLE => "IDLE"
        case Power_Propulsion_Availability_Supervisor.ReportDemandPhase.REQUESTED => "REQUESTED"
        case Power_Propulsion_Availability_Supervisor.ReportDemandPhase.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ReportDemandPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorReportDemandPhaseType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.NORMAL => "NORMAL"
        case Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.QUARANTINED => "QUARANTINED"
        case Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.AWAITING_ACK => "AWAITING_ACK"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommandType(o: Power_Propulsion_Availability_Supervisor.PowerCommand.Type): ST = {
      val value: String = o match {
        case Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE => "DISABLE"
        case Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_NEW => "ENABLE_NEW"
        case Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_HOLD => "ENABLE_HOLD"
      }
      return printObject(ISZ(
        ("type", printString("Power_Propulsion_Availability_Supervisor.PowerCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommand_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerCommand_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorPowerCommandType(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservation(o: Power_Propulsion_Availability_Supervisor.BatteryObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryObservation""""),
        ("quality", printPower_Propulsion_Availability_SupervisorBatteryQualityType(o.quality)),
        ("validity", printPower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)),
        ("freshness", printPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorBatteryObservation(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation""""),
        ("admission", printPower_Propulsion_Availability_SupervisorAdmissionResultType(o.admission)),
        ("quality", printPower_Propulsion_Availability_SupervisorBatteryQualityType(o.quality))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerEvidence(o: Power_Propulsion_Availability_Supervisor.PowerEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerEvidence""""),
        ("condition", printPower_Propulsion_Availability_SupervisorPowerConditionType(o.condition)),
        ("validity", printPower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)),
        ("freshness", printPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorPowerEvidence(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePairEvidence(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnginePairEvidence""""),
        ("positionOneState", printPower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(o.positionOneState)),
        ("positionTwoState", printPower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(o.positionTwoState)),
        ("validity", printPower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)),
        ("freshness", printPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorEnginePairEvidence(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorConfigurationEvidence(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ConfigurationEvidence""""),
        ("engineCount", printPower_Propulsion_Availability_SupervisorEngineCountType(o.engineCount)),
        ("alternatingKinds", printPower_Propulsion_Availability_SupervisorAlternatingKindsType(o.alternatingKinds)),
        ("validity", printPower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)),
        ("freshness", printPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorConfigurationEvidence(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargerEvidence(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargerEvidence""""),
        ("coupling", printPower_Propulsion_Availability_SupervisorChargerCouplingType(o.coupling)),
        ("validity", printPower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)),
        ("freshness", printPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorChargerEvidence(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRequestContext(o: Power_Propulsion_Availability_Supervisor.RequestContext): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RequestContext""""),
        ("demand", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.demand)),
        ("candidateEvent", printPower_Propulsion_Availability_SupervisorRequestContextEventType(o.candidateEvent))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRequestContext_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RequestContext_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorRequestContext(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionSummary(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultActionSummary""""),
        ("fault", printPower_Propulsion_Availability_SupervisorFaultStatusType(o.fault)),
        ("cause", printPower_Propulsion_Availability_SupervisorFaultCauseType(o.cause)),
        ("directive", printPower_Propulsion_Availability_SupervisorSummaryDirectiveType(o.directive))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorFaultActionSummary(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryFrame(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryFrame""""),
        ("phase", printPower_Propulsion_Availability_SupervisorRecoveryPhaseType(o.phase)),
        ("gate", printPower_Propulsion_Availability_SupervisorRecoveryGateType(o.gate))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorRecoveryFrame(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecision(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityDecision""""),
        ("decision", printPower_Propulsion_Availability_SupervisorAvailabilityValueType(o.decision)),
        ("cause", printPower_Propulsion_Availability_SupervisorAvailabilityCauseType(o.cause))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorAvailabilityDecision(o.value))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityReport(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityReport""""),
        ("decision", printPower_Propulsion_Availability_SupervisorReportAvailabilityValueType(o.decision)),
        ("cause", printPower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(o.cause)),
        ("demand", printPower_Propulsion_Availability_SupervisorReportDemandPhaseType(o.demand)),
        ("recovery", printPower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(o.recovery))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload""""),
        ("value", printPower_Propulsion_Availability_SupervisorAvailabilityReport(o.value))
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

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P""""),
        ("api_battery_observation", printPower_Propulsion_Availability_SupervisorBatteryObservation(o.api_battery_observation))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS""""),
        ("api_battery_observation", printPower_Propulsion_Availability_SupervisorBatteryObservation(o.api_battery_observation))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P""""),
        ("api_qualified_battery", printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS""""),
        ("api_qualified_battery", printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P""""),
        ("api_qualified_battery", printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS""""),
        ("api_qualified_battery", printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P""""),
        ("api_battery_assessment", printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS""""),
        ("api_battery_assessment", printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P""""),
        ("api_power_evidence", printPower_Propulsion_Availability_SupervisorPowerEvidence(o.api_power_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS""""),
        ("api_power_evidence", printPower_Propulsion_Availability_SupervisorPowerEvidence(o.api_power_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P""""),
        ("api_power_assessment", printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS""""),
        ("api_power_assessment", printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P""""),
        ("api_odd_engine_evidence", printPower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_odd_engine_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS""""),
        ("api_odd_engine_evidence", printPower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_odd_engine_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P""""),
        ("api_odd_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS""""),
        ("api_odd_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P""""),
        ("api_even_engine_evidence", printPower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_even_engine_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS""""),
        ("api_even_engine_evidence", printPower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_even_engine_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P""""),
        ("api_even_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS""""),
        ("api_even_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P""""),
        ("api_configuration_evidence", printPower_Propulsion_Availability_SupervisorConfigurationEvidence(o.api_configuration_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS""""),
        ("api_configuration_evidence", printPower_Propulsion_Availability_SupervisorConfigurationEvidence(o.api_configuration_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P""""),
        ("api_configuration_assessment", printPower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS""""),
        ("api_configuration_assessment", printPower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P""""),
        ("api_configuration_assessment", printPower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment)),
        ("api_even_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment)),
        ("api_odd_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS""""),
        ("api_configuration_assessment", printPower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment)),
        ("api_even_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment)),
        ("api_odd_engine_assessment", printPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P""""),
        ("api_propulsion_assessment", printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS""""),
        ("api_propulsion_assessment", printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P""""),
        ("api_charger_evidence", printPower_Propulsion_Availability_SupervisorChargerEvidence(o.api_charger_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS""""),
        ("api_charger_evidence", printPower_Propulsion_Availability_SupervisorChargerEvidence(o.api_charger_evidence))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P""""),
        ("api_charging_assessment", printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS""""),
        ("api_charging_assessment", printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P""""),
        ("api_accepted_directive", printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_actuation_feedback", printPower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)),
        ("api_control_event", printPower_Propulsion_Availability_SupervisorControlEventType(o.api_control_event))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS""""),
        ("api_accepted_directive", printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_actuation_feedback", printPower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)),
        ("api_control_event", printPower_Propulsion_Availability_SupervisorControlEventType(o.api_control_event))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P""""),
        ("api_demand_view", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)),
        ("api_request_context", printPower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS""""),
        ("api_demand_view", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)),
        ("api_request_context", printPower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P""""),
        ("api_battery_assessment", printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)),
        ("api_charging_assessment", printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)),
        ("api_power_assessment", printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)),
        ("api_propulsion_assessment", printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)),
        ("api_request_context", printPower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS""""),
        ("api_battery_assessment", printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)),
        ("api_charging_assessment", printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)),
        ("api_power_assessment", printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)),
        ("api_propulsion_assessment", printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)),
        ("api_request_context", printPower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P""""),
        ("api_accepted_directive", printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_fault_action_summary", printPower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS""""),
        ("api_accepted_directive", printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_fault_action_summary", printPower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P""""),
        ("api_fault_action_summary", printPower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS""""),
        ("api_fault_action_summary", printPower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P""""),
        ("api_recovery_frame", printPower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_recovery_gate", printPower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS""""),
        ("api_recovery_frame", printPower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_recovery_gate", printPower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P""""),
        ("api_battery_assessment", printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)),
        ("api_charging_assessment", printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)),
        ("api_demand_view", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)),
        ("api_fault_action_summary", printPower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)),
        ("api_power_assessment", printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)),
        ("api_propulsion_assessment", printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)),
        ("api_recovery_frame", printPower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS""""),
        ("api_battery_assessment", printPower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)),
        ("api_charging_assessment", printPower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)),
        ("api_demand_view", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)),
        ("api_fault_action_summary", printPower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)),
        ("api_power_assessment", printPower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)),
        ("api_propulsion_assessment", printPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)),
        ("api_recovery_frame", printPower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P""""),
        ("api_availability_decision", printPower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)),
        ("api_availability_report", printPower_Propulsion_Availability_SupervisorAvailabilityReport(o.api_availability_report))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS""""),
        ("api_availability_decision", printPower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)),
        ("api_availability_report", printPower_Propulsion_Availability_SupervisorAvailabilityReport(o.api_availability_report))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P""""),
        ("api_accepted_directive", printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_actuation_feedback", printPower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)),
        ("api_availability_decision", printPower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)),
        ("api_demand_view", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)),
        ("api_recovery_gate", printPower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS""""),
        ("api_accepted_directive", printPower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_actuation_feedback", printPower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)),
        ("api_availability_decision", printPower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)),
        ("api_demand_view", printPower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)),
        ("api_recovery_gate", printPower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container): ST = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
      }
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P""""),
        ("api_power_command", printPower_Propulsion_Availability_SupervisorPowerCommandType(o.api_power_command))
      ))
    }

    @pure def printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS""""),
        ("api_power_command", printPower_Propulsion_Availability_SupervisorPowerCommandType(o.api_power_command))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_observation_admission_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_observation_admission_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_observation_admission_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_observation_admission_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_observation_admission_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_observation_admission_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_capacity_assessment_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_capacity_assessment_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_capacity_assessment_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_capacity_assessment_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_capacity_assessment_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_battery_capacity_assessment_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_management_assessment_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_management_assessment_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_management_assessment_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_management_assessment_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_management_assessment_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_management_assessment_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_odd_engine_group_assessor_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_odd_engine_group_assessor_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_odd_engine_group_assessor_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_odd_engine_group_assessor_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_odd_engine_group_assessor_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_odd_engine_group_assessor_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_even_engine_group_assessor_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_even_engine_group_assessor_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_even_engine_group_assessor_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_even_engine_group_assessor_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_even_engine_group_assessor_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_even_engine_group_assessor_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_four_engine_configuration_assessor_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_four_engine_configuration_assessor_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_four_engine_configuration_assessor_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_four_engine_configuration_assessor_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_four_engine_configuration_assessor_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_four_engine_configuration_assessor_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_propulsion_evidence_composer_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_propulsion_evidence_composer_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_propulsion_evidence_composer_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_propulsion_evidence_composer_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_propulsion_evidence_composer_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_propulsion_evidence_composer_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_charging_interlock_assessor_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_charging_interlock_assessor_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_charging_interlock_assessor_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_charging_interlock_assessor_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_charging_interlock_assessor_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_charging_interlock_assessor_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_enable_demand_lifecycle_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_enable_demand_lifecycle_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_enable_demand_lifecycle_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_enable_demand_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_enable_demand_lifecycle_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_enable_demand_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_fault_action_priority_resolver_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_fault_action_priority_resolver_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_fault_action_priority_resolver_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_fault_action_priority_resolver_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_fault_action_priority_resolver_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_fault_action_priority_resolver_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_recovery_qualification_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_recovery_qualification_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_recovery_qualification_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_recovery_qualification_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_recovery_qualification_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_recovery_qualification_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_availability_decision_owner_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_availability_decision_owner_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_availability_decision_owner_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_availability_decision_owner_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_availability_decision_owner_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_availability_decision_owner_postCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_command_interlock_postInit => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_command_interlock_postInit"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_command_interlock_preCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_command_interlock_preCompute"
        case runtimemonitor.ObservationKind.PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_command_interlock_postCompute => "PowerPropulsionAvailabilitySystem_Instance_supervisor_process_power_command_interlock_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
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
        case o: Power_Propulsion_Availability_Supervisor.FaultCause_Payload => return printPower_Propulsion_Availability_SupervisorFaultCause_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload => return printPower_Propulsion_Availability_SupervisorFaultStatus_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EngineCount_Payload => return printPower_Propulsion_Availability_SupervisorEngineCount_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload => return printPower_Propulsion_Availability_SupervisorDemandPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload => return printPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload => return printPower_Propulsion_Availability_SupervisorPowerCommand_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload => return printPower_Propulsion_Availability_SupervisorControlEvent_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload => return printPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload => return printPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload => return printPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload => return printPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload => return printPower_Propulsion_Availability_SupervisorPowerCondition_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RequestContext_Payload => return printPower_Propulsion_Availability_SupervisorRequestContext_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload => return printPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload => return printPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload => return printPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload => return printPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload => return printPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload => return printPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload => return printPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload => return printPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload => return printPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload => return printPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload => return printPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload => return printPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload => return printPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload => return printPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload => return printPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload => return printPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload => return printPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload => return printPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload => return printPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload => return printPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload => return printPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload => return printPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload => return printPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload => return printPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload => return printPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload => return printPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload => return printPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload => return printPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload => return printPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload => return printPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload => return printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => return printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
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

    def parsePower_Propulsion_Availability_SupervisorBatteryQualityType(): Power_Propulsion_Availability_Supervisor.BatteryQuality.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryQualityT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryQualityT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryQuality.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryQuality")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.BatteryQuality.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.BatteryQuality.")
          return Power_Propulsion_Availability_Supervisor.BatteryQuality.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryQuality_Payload(): Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryQuality_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryQuality_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorBatteryQualityType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceValidityType(): Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorEvidenceValidityT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceValidityT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvidenceValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.EvidenceValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.EvidenceValidity.")
          return Power_Propulsion_Availability_Supervisor.EvidenceValidity.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(): Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorEvidenceValidity_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceValidity_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorEvidenceValidityType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(): Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvidenceFreshness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.EvidenceFreshness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.EvidenceFreshness.")
          return Power_Propulsion_Availability_Supervisor.EvidenceFreshness.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(): Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorEvidenceFreshness_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvidenceFreshness_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorAdmissionResultType(): Power_Propulsion_Availability_Supervisor.AdmissionResult.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorAdmissionResultT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAdmissionResultT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AdmissionResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AdmissionResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.AdmissionResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.AdmissionResult.")
          return Power_Propulsion_Availability_Supervisor.AdmissionResult.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorAdmissionResult_Payload(): Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorAdmissionResult_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAdmissionResult_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorAdmissionResultType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType(): Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryAssessmentT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.BatteryAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.BatteryAssessment.")
          return Power_Propulsion_Availability_Supervisor.BatteryAssessment.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(): Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryAssessment_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerConditionType(): Power_Propulsion_Availability_Supervisor.PowerCondition.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerConditionT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerConditionT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.PowerCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.PowerCondition.")
          return Power_Propulsion_Availability_Supervisor.PowerCondition.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCondition_Payload(): Power_Propulsion_Availability_Supervisor.PowerCondition_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerCondition_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCondition_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorPowerConditionType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerCondition_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerAssessmentType(): Power_Propulsion_Availability_Supervisor.PowerAssessment.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerAssessmentT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerAssessmentT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.PowerAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.PowerAssessment.")
          return Power_Propulsion_Availability_Supervisor.PowerAssessment.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPowerAssessment_Payload(): Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerAssessment_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorPowerAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePositionOneConditionT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionOneConditionT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.")
          return Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorEnginePositionOneConditionType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.")
          return Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(): Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePairAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.EnginePairAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.EnginePairAssessment.")
          return Power_Propulsion_Availability_Supervisor.EnginePairAssessment.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(): Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePairAssessment_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorEngineCountType(): Power_Propulsion_Availability_Supervisor.EngineCount.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorEngineCountT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEngineCountT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EngineCount.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EngineCount")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.EngineCount.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.EngineCount.")
          return Power_Propulsion_Availability_Supervisor.EngineCount.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEngineCount_Payload(): Power_Propulsion_Availability_Supervisor.EngineCount_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorEngineCount_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEngineCount_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EngineCount_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EngineCount_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorEngineCountType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EngineCount_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorAlternatingKindsType(): Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorAlternatingKindsT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAlternatingKindsT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AlternatingKinds")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.AlternatingKinds.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.AlternatingKinds.")
          return Power_Propulsion_Availability_Supervisor.AlternatingKinds.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(): Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorAlternatingKinds_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAlternatingKinds_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorAlternatingKindsType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentType(): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ConfigurationAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.")
          return Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorConfigurationAssessment_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(): Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PropulsionAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.PropulsionAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.PropulsionAssessment.")
          return Power_Propulsion_Availability_Supervisor.PropulsionAssessment.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(): Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorPropulsionAssessment_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorChargerCouplingType(): Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorChargerCouplingT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargerCouplingT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargerCoupling")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ChargerCoupling.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ChargerCoupling.")
          return Power_Propulsion_Availability_Supervisor.ChargerCoupling.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorChargerCoupling_Payload(): Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorChargerCoupling_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargerCoupling_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorChargerCouplingType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorChargingAssessmentType(): Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorChargingAssessmentT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargingAssessmentT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargingAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ChargingAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ChargingAssessment.")
          return Power_Propulsion_Availability_Supervisor.ChargingAssessment.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorChargingAssessment_Payload(): Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorChargingAssessment_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargingAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorChargingAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorControlEventType(): Power_Propulsion_Availability_Supervisor.ControlEvent.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorControlEventT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorControlEventT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ControlEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ControlEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ControlEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ControlEvent.")
          return Power_Propulsion_Availability_Supervisor.ControlEvent.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorControlEvent_Payload(): Power_Propulsion_Availability_Supervisor.ControlEvent_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorControlEvent_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorControlEvent_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ControlEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ControlEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorControlEventType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ControlEvent_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorActuationFeedbackType(): Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorActuationFeedbackT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorActuationFeedbackT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ActuationFeedback")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ActuationFeedback.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ActuationFeedback.")
          return Power_Propulsion_Availability_Supervisor.ActuationFeedback.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorActuationFeedback_Payload(): Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorActuationFeedback_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorActuationFeedback_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorActuationFeedbackType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType(): Power_Propulsion_Availability_Supervisor.PriorityDirective.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPriorityDirectiveT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PriorityDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PriorityDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.PriorityDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.PriorityDirective.")
          return Power_Propulsion_Availability_Supervisor.PriorityDirective.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPriorityDirective_Payload(): Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorPriorityDirective_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPriorityDirective_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorDemandPhaseType(): Power_Propulsion_Availability_Supervisor.DemandPhase.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorDemandPhaseT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorDemandPhaseT(typeParsed: B): Power_Propulsion_Availability_Supervisor.DemandPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.DemandPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.DemandPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.DemandPhase.")
          return Power_Propulsion_Availability_Supervisor.DemandPhase.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorDemandPhase_Payload(): Power_Propulsion_Availability_Supervisor.DemandPhase_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorDemandPhase_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorDemandPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.DemandPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.DemandPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.DemandPhase_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContextEventType(): Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorRequestContextEventT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContextEventT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RequestContextEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.RequestContextEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.RequestContextEvent.")
          return Power_Propulsion_Availability_Supervisor.RequestContextEvent.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(): Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorRequestContextEvent_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContextEvent_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorRequestContextEventType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultStatusType(): Power_Propulsion_Availability_Supervisor.FaultStatus.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultStatusT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultStatusT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.FaultStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.FaultStatus.")
          return Power_Propulsion_Availability_Supervisor.FaultStatus.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorFaultStatus_Payload(): Power_Propulsion_Availability_Supervisor.FaultStatus_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultStatus_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultStatus_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorFaultStatusType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultStatus_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultCauseType(): Power_Propulsion_Availability_Supervisor.FaultCause.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultCauseT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultCauseT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.FaultCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.FaultCause.")
          return Power_Propulsion_Availability_Supervisor.FaultCause.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorFaultCause_Payload(): Power_Propulsion_Availability_Supervisor.FaultCause_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultCause_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultCause_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorFaultCauseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultCause_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorSummaryDirectiveType(): Power_Propulsion_Availability_Supervisor.SummaryDirective.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorSummaryDirectiveT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorSummaryDirectiveT(typeParsed: B): Power_Propulsion_Availability_Supervisor.SummaryDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.SummaryDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.SummaryDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.SummaryDirective.")
          return Power_Propulsion_Availability_Supervisor.SummaryDirective.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorSummaryDirective_Payload(): Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorSummaryDirective_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorSummaryDirective_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorSummaryDirectiveType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryPhaseType(): Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryPhaseT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryPhaseT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.RecoveryPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.RecoveryPhase.")
          return Power_Propulsion_Availability_Supervisor.RecoveryPhase.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(): Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryGateType(): Power_Propulsion_Availability_Supervisor.RecoveryGate.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryGateT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryGateT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryGate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryGate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.RecoveryGate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.RecoveryGate.")
          return Power_Propulsion_Availability_Supervisor.RecoveryGate.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryGate_Payload(): Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryGate_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryGate_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityValueType(): Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityValueT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityValueT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.AvailabilityValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.AvailabilityValue.")
          return Power_Propulsion_Availability_Supervisor.AvailabilityValue.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityValue_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityValue_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorAvailabilityValueType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityCauseType(): Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityCauseT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityCauseT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.AvailabilityCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.AvailabilityCause.")
          return Power_Propulsion_Availability_Supervisor.AvailabilityCause.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityCause_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityCause_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorAvailabilityCauseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityValueType(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorReportAvailabilityValueT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityValueT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.")
          return Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorReportAvailabilityValue_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityValue_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorReportAvailabilityValueType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorReportAvailabilityCauseT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityCauseT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.")
          return Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorReportAvailabilityCause_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportAvailabilityCause_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorReportAvailabilityCauseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorReportDemandPhaseType(): Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorReportDemandPhaseT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportDemandPhaseT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportDemandPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ReportDemandPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ReportDemandPhase.")
          return Power_Propulsion_Availability_Supervisor.ReportDemandPhase.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(): Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorReportDemandPhase_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportDemandPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorReportDemandPhaseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorReportRecoveryPhaseT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportRecoveryPhaseT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.")
          return Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorReportRecoveryPhase_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorReportRecoveryPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorReportRecoveryPhaseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandType(): Power_Propulsion_Availability_Supervisor.PowerCommand.Type = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerCommandT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Power_Propulsion_Availability_Supervisor.PowerCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Power_Propulsion_Availability_Supervisor.PowerCommand.")
          return Power_Propulsion_Availability_Supervisor.PowerCommand.byOrdinal(0).get
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommand_Payload(): Power_Propulsion_Availability_Supervisor.PowerCommand_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerCommand_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommand_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorPowerCommandType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerCommand_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservation(): Power_Propulsion_Availability_Supervisor.BatteryObservation = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryObservation")
      }
      parser.parseObjectKey("quality")
      val quality = parsePower_Propulsion_Availability_SupervisorBatteryQualityType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parsePower_Propulsion_Availability_SupervisorEvidenceValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryObservation(quality, validity, freshness)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservation_Payload(): Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryObservation_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservation_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = {
      val r = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservationT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservationT(typeParsed: B): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation")
      }
      parser.parseObjectKey("admission")
      val admission = parsePower_Propulsion_Availability_SupervisorAdmissionResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("quality")
      val quality = parsePower_Propulsion_Availability_SupervisorBatteryQualityType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(admission, quality)
    }

    def parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerEvidence(): Power_Propulsion_Availability_Supervisor.PowerEvidence = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerEvidenceT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerEvidence")
      }
      parser.parseObjectKey("condition")
      val condition = parsePower_Propulsion_Availability_SupervisorPowerConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parsePower_Propulsion_Availability_SupervisorEvidenceValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerEvidence(condition, validity, freshness)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerEvidence_Payload(): Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerEvidence_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorPowerEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairEvidence(): Power_Propulsion_Availability_Supervisor.EnginePairEvidence = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePairEvidenceT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePairEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePairEvidence")
      }
      parser.parseObjectKey("positionOneState")
      val positionOneState = parsePower_Propulsion_Availability_SupervisorEnginePositionOneConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("positionTwoState")
      val positionTwoState = parsePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parsePower_Propulsion_Availability_SupervisorEvidenceValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnginePairEvidence(positionOneState, positionTwoState, validity, freshness)
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(): Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorEnginePairEvidence_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnginePairEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorEnginePairEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationEvidence(): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence = {
      val r = parsePower_Propulsion_Availability_SupervisorConfigurationEvidenceT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ConfigurationEvidence")
      }
      parser.parseObjectKey("engineCount")
      val engineCount = parsePower_Propulsion_Availability_SupervisorEngineCountType()
      parser.parseObjectNext()
      parser.parseObjectKey("alternatingKinds")
      val alternatingKinds = parsePower_Propulsion_Availability_SupervisorAlternatingKindsType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parsePower_Propulsion_Availability_SupervisorEvidenceValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ConfigurationEvidence(engineCount, alternatingKinds, validity, freshness)
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorConfigurationEvidence_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorConfigurationEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorConfigurationEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorChargerEvidence(): Power_Propulsion_Availability_Supervisor.ChargerEvidence = {
      val r = parsePower_Propulsion_Availability_SupervisorChargerEvidenceT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargerEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargerEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargerEvidence")
      }
      parser.parseObjectKey("coupling")
      val coupling = parsePower_Propulsion_Availability_SupervisorChargerCouplingType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parsePower_Propulsion_Availability_SupervisorEvidenceValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parsePower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargerEvidence(coupling, validity, freshness)
    }

    def parsePower_Propulsion_Availability_SupervisorChargerEvidence_Payload(): Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorChargerEvidence_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargerEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorChargerEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContext(): Power_Propulsion_Availability_Supervisor.RequestContext = {
      val r = parsePower_Propulsion_Availability_SupervisorRequestContextT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContextT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RequestContext = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RequestContext")
      }
      parser.parseObjectKey("demand")
      val demand = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("candidateEvent")
      val candidateEvent = parsePower_Propulsion_Availability_SupervisorRequestContextEventType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RequestContext(demand, candidateEvent)
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContext_Payload(): Power_Propulsion_Availability_Supervisor.RequestContext_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorRequestContext_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRequestContext_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RequestContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RequestContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorRequestContext()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RequestContext_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionSummary(): Power_Propulsion_Availability_Supervisor.FaultActionSummary = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultActionSummaryT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionSummaryT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionSummary = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultActionSummary")
      }
      parser.parseObjectKey("fault")
      val fault = parsePower_Propulsion_Availability_SupervisorFaultStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parsePower_Propulsion_Availability_SupervisorFaultCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("directive")
      val directive = parsePower_Propulsion_Availability_SupervisorSummaryDirectiveType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultActionSummary(fault, cause, directive)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(): Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultActionSummary_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionSummary_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryFrame(): Power_Propulsion_Availability_Supervisor.RecoveryFrame = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryFrameT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryFrameT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryFrame")
      }
      parser.parseObjectKey("phase")
      val phase = parsePower_Propulsion_Availability_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("gate")
      val gate = parsePower_Propulsion_Availability_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryFrame(phase, gate)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(): Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryFrame_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryFrame_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecision(): Power_Propulsion_Availability_Supervisor.AvailabilityDecision = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityDecision")
      }
      parser.parseObjectKey("decision")
      val decision = parsePower_Propulsion_Availability_SupervisorAvailabilityValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parsePower_Propulsion_Availability_SupervisorAvailabilityCauseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecision(decision, cause)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecision_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecision_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorAvailabilityDecision()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload(value)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityReport(): Power_Propulsion_Availability_Supervisor.AvailabilityReport = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityReportT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityReportT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityReport = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityReport")
      }
      parser.parseObjectKey("decision")
      val decision = parsePower_Propulsion_Availability_SupervisorReportAvailabilityValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parsePower_Propulsion_Availability_SupervisorReportAvailabilityCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("demand")
      val demand = parsePower_Propulsion_Availability_SupervisorReportDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery")
      val recovery = parsePower_Propulsion_Availability_SupervisorReportRecoveryPhaseType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityReport(decision, cause, demand, recovery)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityReport_PayloadT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityReport_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parsePower_Propulsion_Availability_SupervisorAvailabilityReport()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload(value)
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

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_observation")
      val api_battery_observation = parsePower_Propulsion_Availability_SupervisorBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(api_battery_observation)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS")
      }
      parser.parseObjectKey("api_battery_observation")
      val api_battery_observation = parsePower_Propulsion_Availability_SupervisorBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(api_battery_observation)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_battery")
      val api_qualified_battery = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(api_qualified_battery)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_battery")
      val api_qualified_battery = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(api_qualified_battery)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_battery")
      val api_qualified_battery = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(api_qualified_battery)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_battery")
      val api_qualified_battery = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(api_qualified_battery)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(api_battery_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(api_battery_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_power_evidence")
      val api_power_evidence = parsePower_Propulsion_Availability_SupervisorPowerEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(api_power_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_power_evidence")
      val api_power_evidence = parsePower_Propulsion_Availability_SupervisorPowerEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(api_power_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_power_assessment")
      val api_power_assessment = parsePower_Propulsion_Availability_SupervisorPowerAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(api_power_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_power_assessment")
      val api_power_assessment = parsePower_Propulsion_Availability_SupervisorPowerAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(api_power_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_odd_engine_evidence")
      val api_odd_engine_evidence = parsePower_Propulsion_Availability_SupervisorEnginePairEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(api_odd_engine_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_odd_engine_evidence")
      val api_odd_engine_evidence = parsePower_Propulsion_Availability_SupervisorEnginePairEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(api_odd_engine_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_odd_engine_assessment")
      val api_odd_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(api_odd_engine_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_odd_engine_assessment")
      val api_odd_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(api_odd_engine_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_even_engine_evidence")
      val api_even_engine_evidence = parsePower_Propulsion_Availability_SupervisorEnginePairEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(api_even_engine_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_even_engine_evidence")
      val api_even_engine_evidence = parsePower_Propulsion_Availability_SupervisorEnginePairEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(api_even_engine_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_even_engine_assessment")
      val api_even_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(api_even_engine_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_even_engine_assessment")
      val api_even_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(api_even_engine_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_configuration_evidence")
      val api_configuration_evidence = parsePower_Propulsion_Availability_SupervisorConfigurationEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(api_configuration_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_configuration_evidence")
      val api_configuration_evidence = parsePower_Propulsion_Availability_SupervisorConfigurationEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(api_configuration_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_configuration_assessment")
      val api_configuration_assessment = parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(api_configuration_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_configuration_assessment")
      val api_configuration_assessment = parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(api_configuration_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P")
      }
      parser.parseObjectKey("api_configuration_assessment")
      val api_configuration_assessment = parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_even_engine_assessment")
      val api_even_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_odd_engine_assessment")
      val api_odd_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(api_configuration_assessment, api_even_engine_assessment, api_odd_engine_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_configuration_assessment")
      val api_configuration_assessment = parsePower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_even_engine_assessment")
      val api_even_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_odd_engine_assessment")
      val api_odd_engine_assessment = parsePower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(api_configuration_assessment, api_even_engine_assessment, api_odd_engine_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P")
      }
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(api_propulsion_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(api_propulsion_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_charger_evidence")
      val api_charger_evidence = parsePower_Propulsion_Availability_SupervisorChargerEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(api_charger_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_charger_evidence")
      val api_charger_evidence = parsePower_Propulsion_Availability_SupervisorChargerEvidence()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(api_charger_evidence)
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_charging_assessment")
      val api_charging_assessment = parsePower_Propulsion_Availability_SupervisorChargingAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(api_charging_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_charging_assessment")
      val api_charging_assessment = parsePower_Propulsion_Availability_SupervisorChargingAssessmentType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(api_charging_assessment)
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_actuation_feedback")
      val api_actuation_feedback = parsePower_Propulsion_Availability_SupervisorActuationFeedbackType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_control_event")
      val api_control_event = parsePower_Propulsion_Availability_SupervisorControlEventType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(api_accepted_directive, api_actuation_feedback, api_control_event)
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_actuation_feedback")
      val api_actuation_feedback = parsePower_Propulsion_Availability_SupervisorActuationFeedbackType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_control_event")
      val api_control_event = parsePower_Propulsion_Availability_SupervisorControlEventType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(api_accepted_directive, api_actuation_feedback, api_control_event)
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_demand_view")
      val api_demand_view = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_context")
      val api_request_context = parsePower_Propulsion_Availability_SupervisorRequestContext()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(api_demand_view, api_request_context)
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_demand_view")
      val api_demand_view = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_context")
      val api_request_context = parsePower_Propulsion_Availability_SupervisorRequestContext()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(api_demand_view, api_request_context)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charging_assessment")
      val api_charging_assessment = parsePower_Propulsion_Availability_SupervisorChargingAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_assessment")
      val api_power_assessment = parsePower_Propulsion_Availability_SupervisorPowerAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_context")
      val api_request_context = parsePower_Propulsion_Availability_SupervisorRequestContext()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(api_battery_assessment, api_charging_assessment, api_power_assessment, api_propulsion_assessment, api_request_context)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charging_assessment")
      val api_charging_assessment = parsePower_Propulsion_Availability_SupervisorChargingAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_assessment")
      val api_power_assessment = parsePower_Propulsion_Availability_SupervisorPowerAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_context")
      val api_request_context = parsePower_Propulsion_Availability_SupervisorRequestContext()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(api_battery_assessment, api_charging_assessment, api_power_assessment, api_propulsion_assessment, api_request_context)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_action_summary")
      val api_fault_action_summary = parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(api_accepted_directive, api_fault_action_summary)
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_action_summary")
      val api_fault_action_summary = parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(api_accepted_directive, api_fault_action_summary)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_fault_action_summary")
      val api_fault_action_summary = parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(api_fault_action_summary)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fault_action_summary")
      val api_fault_action_summary = parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(api_fault_action_summary)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parsePower_Propulsion_Availability_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parsePower_Propulsion_Availability_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(api_recovery_frame, api_recovery_gate)
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parsePower_Propulsion_Availability_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parsePower_Propulsion_Availability_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(api_recovery_frame, api_recovery_gate)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charging_assessment")
      val api_charging_assessment = parsePower_Propulsion_Availability_SupervisorChargingAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_view")
      val api_demand_view = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_action_summary")
      val api_fault_action_summary = parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_assessment")
      val api_power_assessment = parsePower_Propulsion_Availability_SupervisorPowerAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parsePower_Propulsion_Availability_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(api_battery_assessment, api_charging_assessment, api_demand_view, api_fault_action_summary, api_power_assessment, api_propulsion_assessment, api_recovery_frame)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parsePower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charging_assessment")
      val api_charging_assessment = parsePower_Propulsion_Availability_SupervisorChargingAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_view")
      val api_demand_view = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_action_summary")
      val api_fault_action_summary = parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_assessment")
      val api_power_assessment = parsePower_Propulsion_Availability_SupervisorPowerAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parsePower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parsePower_Propulsion_Availability_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(api_battery_assessment, api_charging_assessment, api_demand_view, api_fault_action_summary, api_power_assessment, api_propulsion_assessment, api_recovery_frame)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_availability_decision")
      val api_availability_decision = parsePower_Propulsion_Availability_SupervisorAvailabilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_availability_report")
      val api_availability_report = parsePower_Propulsion_Availability_SupervisorAvailabilityReport()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(api_availability_decision, api_availability_report)
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_availability_decision")
      val api_availability_decision = parsePower_Propulsion_Availability_SupervisorAvailabilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_availability_report")
      val api_availability_report = parsePower_Propulsion_Availability_SupervisorAvailabilityReport()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(api_availability_decision, api_availability_report)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_actuation_feedback")
      val api_actuation_feedback = parsePower_Propulsion_Availability_SupervisorActuationFeedbackType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_availability_decision")
      val api_availability_decision = parsePower_Propulsion_Availability_SupervisorAvailabilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_view")
      val api_demand_view = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parsePower_Propulsion_Availability_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(api_accepted_directive, api_actuation_feedback, api_availability_decision, api_demand_view, api_recovery_gate)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parsePower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_actuation_feedback")
      val api_actuation_feedback = parsePower_Propulsion_Availability_SupervisorActuationFeedbackType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_availability_decision")
      val api_availability_decision = parsePower_Propulsion_Availability_SupervisorAvailabilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_view")
      val api_demand_view = parsePower_Propulsion_Availability_SupervisorDemandPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parsePower_Propulsion_Availability_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(api_accepted_directive, api_actuation_feedback, api_availability_decision, api_demand_view, api_recovery_gate)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS"))
      t.native match {
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T); return r
      }
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P")
      }
      parser.parseObjectKey("api_power_command")
      val api_power_command = parsePower_Propulsion_Availability_SupervisorPowerCommandType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(api_power_command)
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS = {
      val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(F)
      return r
    }

    def parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS")
      }
      parser.parseObjectKey("api_power_command")
      val api_power_command = parsePower_Propulsion_Availability_SupervisorPowerCommandType()
      parser.parseObjectNext()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(api_power_command)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Power_Propulsion_Availability_Supervisor.FaultCause_Payload", "Power_Propulsion_Availability_Supervisor.FaultStatus_Payload", "Power_Propulsion_Availability_Supervisor.EngineCount_Payload", "Power_Propulsion_Availability_Supervisor.DemandPhase_Payload", "Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload", "Power_Propulsion_Availability_Supervisor.PowerCommand_Payload", "Power_Propulsion_Availability_Supervisor.ControlEvent_Payload", "Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload", "Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload", "Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload", "Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload", "Power_Propulsion_Availability_Supervisor.PowerCondition_Payload", "Power_Propulsion_Availability_Supervisor.RequestContext_Payload", "Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload", "Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload", "Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload", "Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload", "Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload", "Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload", "Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload", "Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload", "Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload", "Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload", "Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload", "Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload", "Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload", "Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload", "Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload", "Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload", "Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload", "Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload", "Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload", "Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload", "Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload", "Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload", "Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload", "Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload", "Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload", "Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload", "Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload", "Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload", "Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload", "Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload", "Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P", "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS"))
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
        case "Power_Propulsion_Availability_Supervisor.FaultCause_Payload" => val r = parsePower_Propulsion_Availability_SupervisorFaultCause_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultStatus_Payload" => val r = parsePower_Propulsion_Availability_SupervisorFaultStatus_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EngineCount_Payload" => val r = parsePower_Propulsion_Availability_SupervisorEngineCount_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.DemandPhase_Payload" => val r = parsePower_Propulsion_Availability_SupervisorDemandPhase_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryGate_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommand_Payload" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommand_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ControlEvent_Payload" => val r = parsePower_Propulsion_Availability_SupervisorControlEvent_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryPhase_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryFrame_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload" => val r = parsePower_Propulsion_Availability_SupervisorPowerEvidence_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload" => val r = parsePower_Propulsion_Availability_SupervisorBatteryQuality_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCondition_Payload" => val r = parsePower_Propulsion_Availability_SupervisorPowerCondition_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RequestContext_Payload" => val r = parsePower_Propulsion_Availability_SupervisorRequestContext_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload" => val r = parsePower_Propulsion_Availability_SupervisorAdmissionResult_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload" => val r = parsePower_Propulsion_Availability_SupervisorChargerCoupling_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload" => val r = parsePower_Propulsion_Availability_SupervisorPowerAssessment_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload" => val r = parsePower_Propulsion_Availability_SupervisorChargerEvidence_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload" => val r = parsePower_Propulsion_Availability_SupervisorEvidenceValidity_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload" => val r = parsePower_Propulsion_Availability_SupervisorSummaryDirective_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload" => val r = parsePower_Propulsion_Availability_SupervisorAlternatingKinds_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload" => val r = parsePower_Propulsion_Availability_SupervisorEvidenceFreshness_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload" => val r = parsePower_Propulsion_Availability_SupervisorReportDemandPhase_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityValue_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload" => val r = parsePower_Propulsion_Availability_SupervisorPriorityDirective_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload" => val r = parsePower_Propulsion_Availability_SupervisorActuationFeedback_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload" => val r = parsePower_Propulsion_Availability_SupervisorBatteryAssessment_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityCause_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload" => val r = parsePower_Propulsion_Availability_SupervisorChargingAssessment_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionSummary_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservation_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityReport_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload" => val r = parsePower_Propulsion_Availability_SupervisorEnginePairEvidence_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload" => val r = parsePower_Propulsion_Availability_SupervisorReportRecoveryPhase_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload" => val r = parsePower_Propulsion_Availability_SupervisorRequestContextEvent_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionAssessment_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload" => val r = parsePower_Propulsion_Availability_SupervisorEnginePairAssessment_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecision_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload" => val r = parsePower_Propulsion_Availability_SupervisorConfigurationEvidence_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload" => val r = parsePower_Propulsion_Availability_SupervisorReportAvailabilityValue_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload" => val r = parsePower_Propulsion_Availability_SupervisorConfigurationAssessment_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload" => val r = parsePower_Propulsion_Availability_SupervisorReportAvailabilityCause_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload" => val r = parsePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload" => val r = parsePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload" => val r = parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_PayloadT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(T); return r
        case "Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS" => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
        case _ => val r = parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
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

  def fromPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryQuality_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryQuality_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvidenceValidity_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAdmissionResult_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAdmissionResult_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryAssessment_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCondition_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCondition_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCondition_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCondition_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCondition_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCondition_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCondition_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerAssessment_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEngineCount_Payload(o: Power_Propulsion_Availability_Supervisor.EngineCount_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEngineCount_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEngineCount_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.EngineCount_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEngineCount_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.EngineCount_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEngineCount_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEngineCount_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAlternatingKinds_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargerCoupling_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargerCoupling_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargingAssessment_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargingAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorControlEvent_Payload(o: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorControlEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorControlEvent_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ControlEvent_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorControlEvent_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ControlEvent_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorControlEvent_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorControlEvent_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorActuationFeedback_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorActuationFeedback_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPriorityDirective_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPriorityDirective_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorDemandPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorDemandPhase_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.DemandPhase_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorDemandPhase_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.DemandPhase_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorDemandPhase_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorDemandPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRequestContextEvent_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultStatus_Payload(o: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultStatus_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultStatus_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultStatus_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultStatus_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultStatus_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultStatus_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultCause_Payload(o: Power_Propulsion_Availability_Supervisor.FaultCause_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultCause_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultCause_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultCause_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultCause_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultCause_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultCause_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorSummaryDirective_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorSummaryDirective_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryGate_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryGate_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityValue_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityCause_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorReportDemandPhase_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommand_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommand_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCommand_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommand_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCommand_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCommand_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCommand_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservation(o: Power_Propulsion_Availability_Supervisor.BatteryObservation, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservation(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservation, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservation(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservation = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservation()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservation _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservation_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservation_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(s: String): Either[Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(parser: Parser): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerEvidence(o: Power_Propulsion_Availability_Supervisor.PowerEvidence, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerEvidence(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerEvidence, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerEvidence(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerEvidence = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerEvidence()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerEvidence_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePairEvidence(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnginePairEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnginePairEvidence(s: String): Either[Power_Propulsion_Availability_Supervisor.EnginePairEvidence, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePairEvidence(parser: Parser): Power_Propulsion_Availability_Supervisor.EnginePairEvidence = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnginePairEvidence()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnginePairEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorConfigurationEvidence(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorConfigurationEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorConfigurationEvidence(s: String): Either[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorConfigurationEvidence(parser: Parser): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorConfigurationEvidence()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorConfigurationEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargerEvidence(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargerEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargerEvidence(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargerEvidence, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargerEvidence(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargerEvidence = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargerEvidence()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargerEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargerEvidence_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargerEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRequestContext(o: Power_Propulsion_Availability_Supervisor.RequestContext, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRequestContext(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRequestContext(s: String): Either[Power_Propulsion_Availability_Supervisor.RequestContext, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRequestContext(parser: Parser): Power_Propulsion_Availability_Supervisor.RequestContext = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRequestContext()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRequestContext _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRequestContext_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContext_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRequestContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRequestContext_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.RequestContext_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRequestContext_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.RequestContext_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRequestContext_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRequestContext_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionSummary(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionSummary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionSummary(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionSummary, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionSummary(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionSummary = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionSummary()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionSummary _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionSummary_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryFrame(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryFrame(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryFrame, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryFrame(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryFrame = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryFrame()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryFrame _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryFrame_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecision(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecision(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecision, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecision(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecision = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecision()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecision _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityReport(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityReport(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityReport, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityReport(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityReport = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityReport()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityReport _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityReport_Payload()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload _)
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

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(s: String): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS, Json.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(parser: Parser): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS = {
      val r = parser.parsePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS()
      return r
    }
    val r = to(s, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS _)
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