// #Sireum
// @formatter:off

// This file is auto-generated from ThreatSampleValue.scala, IntentValue.scala, CargoBandValue.scala, CapacitorBandValue.scala, LocationValue.scala, ActionOutcomeValue.scala, ThreatValidityValue.scala, ThreatDispositionValue.scala, RecoveryGateValue.scala, EmergencyStateValue.scala, RecoveryStateValue.scala, ProposalValue.scala, MobilityProposalValue.scala, ActionValue.scala, SelectedCauseValue.scala, PublicResultValue.scala, MiningAvailabilityValue.scala, DefenseAvailabilityValue.scala, RetreatAvailabilityValue.scala, DestinationAvailabilityValue.scala, ServiceAvailabilityValue.scala, ReadinessAssessmentValue.scala, Base_Types.scala, Threat_Observation_supervisor_process_threat_observation_Containers.scala, Intent_Acquisition_supervisor_process_intent_acquisition_Containers.scala, Resource_Observation_supervisor_process_resource_observation_Containers.scala, Availability_Observation_supervisor_process_availability_observation_Containers.scala, Outcome_Observation_supervisor_process_outcome_observation_Containers.scala, Threat_Qualification_supervisor_process_threat_qualification_Containers.scala, Readiness_Assessment_supervisor_process_readiness_assessment_Containers.scala, Recovery_Control_supervisor_process_recovery_control_Containers.scala, Mining_Eligibility_supervisor_process_mining_eligibility_Containers.scala, Defense_Eligibility_supervisor_process_defense_eligibility_Containers.scala, Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_Containers.scala, Priority_Arbitration_supervisor_process_priority_arbitration_Containers.scala, Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printMining_Threat_Retreat_SupervisionThreatSampleValue(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ThreatSampleValue""""),
        ("sample_code", printS32(o.sample_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionThreatSampleValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionIntentValue(o: Mining_Threat_Retreat_Supervision.IntentValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.IntentValue""""),
        ("intent_code", printS32(o.intent_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionIntentValue_Payload(o: Mining_Threat_Retreat_Supervision.IntentValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.IntentValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionIntentValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionCargoBandValue(o: Mining_Threat_Retreat_Supervision.CargoBandValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.CargoBandValue""""),
        ("cargo_code", printS32(o.cargo_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.CargoBandValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionCargoBandValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionCapacitorBandValue(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.CapacitorBandValue""""),
        ("capacitor_code", printS32(o.capacitor_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionCapacitorBandValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionLocationValue(o: Mining_Threat_Retreat_Supervision.LocationValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.LocationValue""""),
        ("location_code", printS32(o.location_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionLocationValue_Payload(o: Mining_Threat_Retreat_Supervision.LocationValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.LocationValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionLocationValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionActionOutcomeValue(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ActionOutcomeValue""""),
        ("outcome_code", printS32(o.outcome_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionActionOutcomeValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreatValidityValue(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ThreatValidityValue""""),
        ("validity_code", printS32(o.validity_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionThreatValidityValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreatDispositionValue(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ThreatDispositionValue""""),
        ("disposition_code", printS32(o.disposition_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecoveryGateValue(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.RecoveryGateValue""""),
        ("gate_code", printS32(o.gate_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionEmergencyStateValue(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.EmergencyStateValue""""),
        ("emergency_code", printS32(o.emergency_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionEmergencyStateValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecoveryStateValue(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.RecoveryStateValue""""),
        ("state_code", printS32(o.state_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionRecoveryStateValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionProposalValue(o: Mining_Threat_Retreat_Supervision.ProposalValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ProposalValue""""),
        ("proposal_code", printS32(o.proposal_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.ProposalValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ProposalValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionProposalValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMobilityProposalValue(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.MobilityProposalValue""""),
        ("proposal_code", printS32(o.proposal_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionMobilityProposalValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionActionValue(o: Mining_Threat_Retreat_Supervision.ActionValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ActionValue""""),
        ("action_code", printS32(o.action_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionActionValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ActionValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionActionValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionSelectedCauseValue(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.SelectedCauseValue""""),
        ("cause_code", printS32(o.cause_code))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionSelectedCauseValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionPublicResultValue(o: Mining_Threat_Retreat_Supervision.PublicResultValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.PublicResultValue""""),
        ("selected_action", printS32(o.selected_action)),
        ("selected_cause", printS32(o.selected_cause)),
        ("mode", printS32(o.mode)),
        ("recovery_state", printS32(o.recovery_state))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.PublicResultValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionPublicResultValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.MiningAvailabilityValue""""),
        ("available", printB(o.available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue""""),
        ("available", printB(o.available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue""""),
        ("available", printB(o.available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue""""),
        ("available", printB(o.available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue""""),
        ("available", printB(o.available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue""""),
        ("mining_ready", printB(o.mining_ready)),
        ("defense_ready", printB(o.defense_ready)),
        ("retreat_feasible", printB(o.retreat_feasible)),
        ("cargo_full", printB(o.cargo_full)),
        ("dock_service_applicable", printB(o.dock_service_applicable))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.value))
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

    @pure def printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P""""),
        ("api_threat_sample", printMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS""""),
        ("api_threat_sample", printMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P""""),
        ("api_intent_defense", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_defense)),
        ("api_intent_mining", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mining)),
        ("api_intent_mobility", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mobility)),
        ("api_intent_recovery", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_recovery))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS""""),
        ("api_intent_defense", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_defense)),
        ("api_intent_mining", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mining)),
        ("api_intent_mobility", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mobility)),
        ("api_intent_recovery", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_recovery))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P""""),
        ("api_capacitor_band", printMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)),
        ("api_cargo_band", printMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)),
        ("api_location", printMining_Threat_Retreat_SupervisionLocationValue(o.api_location))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS""""),
        ("api_capacitor_band", printMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)),
        ("api_cargo_band", printMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)),
        ("api_location", printMining_Threat_Retreat_SupervisionLocationValue(o.api_location))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P""""),
        ("api_defense_available", printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)),
        ("api_destination_available", printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)),
        ("api_mining_available", printMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)),
        ("api_retreat_available", printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)),
        ("api_service_available", printMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS""""),
        ("api_defense_available", printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)),
        ("api_destination_available", printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)),
        ("api_mining_available", printMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)),
        ("api_retreat_available", printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)),
        ("api_service_available", printMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS"""")
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P""""),
        ("api_action_outcome", printMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS""""),
        ("api_action_outcome", printMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P""""),
        ("api_threat_sample", printMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS""""),
        ("api_threat_sample", printMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P""""),
        ("api_disposition_defense", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_defense)),
        ("api_disposition_mining", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mining)),
        ("api_disposition_mobility", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mobility)),
        ("api_threat_validity", printMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS""""),
        ("api_disposition_defense", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_defense)),
        ("api_disposition_mining", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mining)),
        ("api_disposition_mobility", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mobility)),
        ("api_threat_validity", printMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P""""),
        ("api_capacitor_band", printMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)),
        ("api_cargo_band", printMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)),
        ("api_defense_available", printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)),
        ("api_destination_available", printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)),
        ("api_location", printMining_Threat_Retreat_SupervisionLocationValue(o.api_location)),
        ("api_mining_available", printMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)),
        ("api_retreat_available", printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)),
        ("api_service_available", printMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS""""),
        ("api_capacitor_band", printMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)),
        ("api_cargo_band", printMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)),
        ("api_defense_available", printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)),
        ("api_destination_available", printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)),
        ("api_location", printMining_Threat_Retreat_SupervisionLocationValue(o.api_location)),
        ("api_mining_available", printMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)),
        ("api_retreat_available", printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)),
        ("api_service_available", printMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P""""),
        ("api_assessment_defense", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_defense)),
        ("api_assessment_mining", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mining)),
        ("api_assessment_mobility", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mobility))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS""""),
        ("api_assessment_defense", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_defense)),
        ("api_assessment_mining", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mining)),
        ("api_assessment_mobility", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mobility))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P""""),
        ("api_action_outcome", printMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_threat_validity", printMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS""""),
        ("In_recovery_memory", printS32(o.In_recovery_memory)),
        ("api_action_outcome", printMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_threat_validity", printMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P""""),
        ("api_emergency_state", printMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)),
        ("api_gate_defense", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_defense)),
        ("api_gate_mining", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mining)),
        ("api_gate_mobility", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mobility)),
        ("api_next_recovery_state", printMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS""""),
        ("recovery_memory", printS32(o.recovery_memory)),
        ("api_emergency_state", printMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)),
        ("api_gate_defense", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_defense)),
        ("api_gate_mining", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mining)),
        ("api_gate_mobility", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mobility)),
        ("api_next_recovery_state", printMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P""""),
        ("api_assessment", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_recovery_gate", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)),
        ("api_threat_disposition", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS""""),
        ("api_assessment", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_recovery_gate", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)),
        ("api_threat_disposition", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P""""),
        ("api_mining_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS""""),
        ("api_mining_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P""""),
        ("api_assessment", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_recovery_gate", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)),
        ("api_threat_disposition", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS""""),
        ("api_assessment", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_recovery_gate", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)),
        ("api_threat_disposition", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P""""),
        ("api_defense_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS""""),
        ("api_defense_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P""""),
        ("api_assessment", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_recovery_gate", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)),
        ("api_threat_disposition", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS""""),
        ("api_assessment", printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)),
        ("api_intent", printMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)),
        ("api_recovery_gate", printMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)),
        ("api_threat_disposition", printMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P""""),
        ("api_mobility_proposal", printMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS""""),
        ("api_mobility_proposal", printMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P""""),
        ("api_defense_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal)),
        ("api_emergency_state", printMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)),
        ("api_mining_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal)),
        ("api_mobility_proposal", printMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS""""),
        ("api_defense_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal)),
        ("api_emergency_state", printMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)),
        ("api_mining_proposal", printMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal)),
        ("api_mobility_proposal", printMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P""""),
        ("api_selected_action", printMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)),
        ("api_selected_cause", printMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS""""),
        ("api_selected_action", printMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)),
        ("api_selected_cause", printMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P""""),
        ("api_next_recovery_state", printMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state)),
        ("api_selected_action", printMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)),
        ("api_selected_cause", printMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS""""),
        ("api_next_recovery_state", printMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state)),
        ("api_selected_action", printMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)),
        ("api_selected_cause", printMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P""""),
        ("api_public_result", printMining_Threat_Retreat_SupervisionPublicResultValue(o.api_public_result))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS""""),
        ("api_public_result", printMining_Threat_Retreat_SupervisionPublicResultValue(o.api_public_result))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_observation_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_observation_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_observation_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_observation_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_observation_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_observation_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_intent_acquisition_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_intent_acquisition_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_intent_acquisition_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_intent_acquisition_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_intent_acquisition_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_intent_acquisition_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_resource_observation_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_resource_observation_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_resource_observation_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_resource_observation_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_resource_observation_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_resource_observation_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_availability_observation_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_availability_observation_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_availability_observation_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_availability_observation_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_availability_observation_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_availability_observation_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_outcome_observation_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_outcome_observation_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_outcome_observation_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_outcome_observation_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_outcome_observation_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_outcome_observation_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_qualification_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_qualification_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_qualification_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_qualification_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_qualification_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_threat_qualification_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_readiness_assessment_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_readiness_assessment_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_readiness_assessment_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_readiness_assessment_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_readiness_assessment_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_readiness_assessment_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_recovery_control_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_recovery_control_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_recovery_control_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_recovery_control_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_recovery_control_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_recovery_control_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mining_eligibility_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mining_eligibility_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mining_eligibility_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mining_eligibility_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mining_eligibility_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mining_eligibility_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_defense_eligibility_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_defense_eligibility_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_defense_eligibility_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_defense_eligibility_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_defense_eligibility_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_defense_eligibility_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mobility_service_eligibility_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mobility_service_eligibility_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mobility_service_eligibility_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mobility_service_eligibility_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mobility_service_eligibility_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mobility_service_eligibility_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_priority_arbitration_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_priority_arbitration_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_priority_arbitration_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_priority_arbitration_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_priority_arbitration_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_priority_arbitration_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mission_mode_and_public_result_postInit => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mission_mode_and_public_result_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mission_mode_and_public_result_preCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mission_mode_and_public_result_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mission_mode_and_public_result_postCompute => "Mining_Threat_Retreat_Supervision_Root_Instance_supervisor_process_mission_mode_and_public_result_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
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
        case o: Mining_Threat_Retreat_Supervision.IntentValue_Payload => return printMining_Threat_Retreat_SupervisionIntentValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ActionValue_Payload => return printMining_Threat_Retreat_SupervisionActionValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.LocationValue_Payload => return printMining_Threat_Retreat_SupervisionLocationValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ProposalValue_Payload => return printMining_Threat_Retreat_SupervisionProposalValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload => return printMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload => return printMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload => return printMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload => return printMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload => return printMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload => return printMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload => return printMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload => return printMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload => return printMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload => return printMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload => return printMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload => return printMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload => return printMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload => return printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload => return printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload => return printMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload => return printMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload => return printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => return printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
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

    def parseMining_Threat_Retreat_SupervisionThreatSampleValue(): Mining_Threat_Retreat_Supervision.ThreatSampleValue = {
      val r = parseMining_Threat_Retreat_SupervisionThreatSampleValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreatSampleValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatSampleValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ThreatSampleValue")
      }
      parser.parseObjectKey("sample_code")
      val sample_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ThreatSampleValue(sample_code)
    }

    def parseMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(): Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionThreatSampleValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreatSampleValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionThreatSampleValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionIntentValue(): Mining_Threat_Retreat_Supervision.IntentValue = {
      val r = parseMining_Threat_Retreat_SupervisionIntentValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionIntentValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.IntentValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.IntentValue")
      }
      parser.parseObjectKey("intent_code")
      val intent_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.IntentValue(intent_code)
    }

    def parseMining_Threat_Retreat_SupervisionIntentValue_Payload(): Mining_Threat_Retreat_Supervision.IntentValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionIntentValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionIntentValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.IntentValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.IntentValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.IntentValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionCargoBandValue(): Mining_Threat_Retreat_Supervision.CargoBandValue = {
      val r = parseMining_Threat_Retreat_SupervisionCargoBandValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionCargoBandValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.CargoBandValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.CargoBandValue")
      }
      parser.parseObjectKey("cargo_code")
      val cargo_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.CargoBandValue(cargo_code)
    }

    def parseMining_Threat_Retreat_SupervisionCargoBandValue_Payload(): Mining_Threat_Retreat_Supervision.CargoBandValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionCargoBandValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionCargoBandValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.CargoBandValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.CargoBandValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionCargoBandValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.CargoBandValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionCapacitorBandValue(): Mining_Threat_Retreat_Supervision.CapacitorBandValue = {
      val r = parseMining_Threat_Retreat_SupervisionCapacitorBandValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionCapacitorBandValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.CapacitorBandValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.CapacitorBandValue")
      }
      parser.parseObjectKey("capacitor_code")
      val capacitor_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.CapacitorBandValue(capacitor_code)
    }

    def parseMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(): Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionCapacitorBandValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionCapacitorBandValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionCapacitorBandValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionLocationValue(): Mining_Threat_Retreat_Supervision.LocationValue = {
      val r = parseMining_Threat_Retreat_SupervisionLocationValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionLocationValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.LocationValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.LocationValue")
      }
      parser.parseObjectKey("location_code")
      val location_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.LocationValue(location_code)
    }

    def parseMining_Threat_Retreat_SupervisionLocationValue_Payload(): Mining_Threat_Retreat_Supervision.LocationValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionLocationValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionLocationValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.LocationValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.LocationValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionLocationValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.LocationValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionActionOutcomeValue(): Mining_Threat_Retreat_Supervision.ActionOutcomeValue = {
      val r = parseMining_Threat_Retreat_SupervisionActionOutcomeValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionActionOutcomeValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionOutcomeValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ActionOutcomeValue")
      }
      parser.parseObjectKey("outcome_code")
      val outcome_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ActionOutcomeValue(outcome_code)
    }

    def parseMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(): Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionActionOutcomeValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionActionOutcomeValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionActionOutcomeValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionThreatValidityValue(): Mining_Threat_Retreat_Supervision.ThreatValidityValue = {
      val r = parseMining_Threat_Retreat_SupervisionThreatValidityValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreatValidityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatValidityValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ThreatValidityValue")
      }
      parser.parseObjectKey("validity_code")
      val validity_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ThreatValidityValue(validity_code)
    }

    def parseMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(): Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionThreatValidityValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreatValidityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionThreatValidityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionThreatDispositionValue(): Mining_Threat_Retreat_Supervision.ThreatDispositionValue = {
      val r = parseMining_Threat_Retreat_SupervisionThreatDispositionValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreatDispositionValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatDispositionValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ThreatDispositionValue")
      }
      parser.parseObjectKey("disposition_code")
      val disposition_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ThreatDispositionValue(disposition_code)
    }

    def parseMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(): Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionThreatDispositionValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreatDispositionValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryGateValue(): Mining_Threat_Retreat_Supervision.RecoveryGateValue = {
      val r = parseMining_Threat_Retreat_SupervisionRecoveryGateValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryGateValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryGateValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.RecoveryGateValue")
      }
      parser.parseObjectKey("gate_code")
      val gate_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.RecoveryGateValue(gate_code)
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(): Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionRecoveryGateValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryGateValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionEmergencyStateValue(): Mining_Threat_Retreat_Supervision.EmergencyStateValue = {
      val r = parseMining_Threat_Retreat_SupervisionEmergencyStateValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionEmergencyStateValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.EmergencyStateValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.EmergencyStateValue")
      }
      parser.parseObjectKey("emergency_code")
      val emergency_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.EmergencyStateValue(emergency_code)
    }

    def parseMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(): Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionEmergencyStateValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionEmergencyStateValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionEmergencyStateValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryStateValue(): Mining_Threat_Retreat_Supervision.RecoveryStateValue = {
      val r = parseMining_Threat_Retreat_SupervisionRecoveryStateValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryStateValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryStateValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.RecoveryStateValue")
      }
      parser.parseObjectKey("state_code")
      val state_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.RecoveryStateValue(state_code)
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(): Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionRecoveryStateValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecoveryStateValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionRecoveryStateValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionProposalValue(): Mining_Threat_Retreat_Supervision.ProposalValue = {
      val r = parseMining_Threat_Retreat_SupervisionProposalValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionProposalValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ProposalValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ProposalValue")
      }
      parser.parseObjectKey("proposal_code")
      val proposal_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ProposalValue(proposal_code)
    }

    def parseMining_Threat_Retreat_SupervisionProposalValue_Payload(): Mining_Threat_Retreat_Supervision.ProposalValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionProposalValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionProposalValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ProposalValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ProposalValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ProposalValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionMobilityProposalValue(): Mining_Threat_Retreat_Supervision.MobilityProposalValue = {
      val r = parseMining_Threat_Retreat_SupervisionMobilityProposalValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMobilityProposalValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.MobilityProposalValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.MobilityProposalValue")
      }
      parser.parseObjectKey("proposal_code")
      val proposal_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.MobilityProposalValue(proposal_code)
    }

    def parseMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(): Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionMobilityProposalValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMobilityProposalValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionMobilityProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionActionValue(): Mining_Threat_Retreat_Supervision.ActionValue = {
      val r = parseMining_Threat_Retreat_SupervisionActionValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionActionValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ActionValue")
      }
      parser.parseObjectKey("action_code")
      val action_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ActionValue(action_code)
    }

    def parseMining_Threat_Retreat_SupervisionActionValue_Payload(): Mining_Threat_Retreat_Supervision.ActionValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionActionValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionActionValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ActionValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionActionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ActionValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionSelectedCauseValue(): Mining_Threat_Retreat_Supervision.SelectedCauseValue = {
      val r = parseMining_Threat_Retreat_SupervisionSelectedCauseValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionSelectedCauseValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.SelectedCauseValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.SelectedCauseValue")
      }
      parser.parseObjectKey("cause_code")
      val cause_code = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.SelectedCauseValue(cause_code)
    }

    def parseMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(): Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionSelectedCauseValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionSelectedCauseValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionSelectedCauseValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionPublicResultValue(): Mining_Threat_Retreat_Supervision.PublicResultValue = {
      val r = parseMining_Threat_Retreat_SupervisionPublicResultValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionPublicResultValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.PublicResultValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.PublicResultValue")
      }
      parser.parseObjectKey("selected_action")
      val selected_action = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("selected_cause")
      val selected_cause = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_state")
      val recovery_state = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.PublicResultValue(selected_action, selected_cause, mode, recovery_state)
    }

    def parseMining_Threat_Retreat_SupervisionPublicResultValue_Payload(): Mining_Threat_Retreat_Supervision.PublicResultValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionPublicResultValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionPublicResultValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.PublicResultValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.PublicResultValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionPublicResultValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.PublicResultValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue(): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue = {
      val r = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMiningAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.MiningAvailabilityValue")
      }
      parser.parseObjectKey("available")
      val available = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.MiningAvailabilityValue(available)
    }

    def parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue = {
      val r = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue")
      }
      parser.parseObjectKey("available")
      val available = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue(available)
    }

    def parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue = {
      val r = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue")
      }
      parser.parseObjectKey("available")
      val available = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue(available)
    }

    def parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue = {
      val r = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue")
      }
      parser.parseObjectKey("available")
      val available = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue(available)
    }

    def parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue(): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue = {
      val r = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionServiceAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue")
      }
      parser.parseObjectKey("available")
      val available = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue(available)
    }

    def parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue(): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue = {
      val r = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionReadinessAssessmentValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue")
      }
      parser.parseObjectKey("mining_ready")
      val mining_ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("defense_ready")
      val defense_ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("retreat_feasible")
      val retreat_feasible = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("cargo_full")
      val cargo_full = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dock_service_applicable")
      val dock_service_applicable = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue(mining_ready, defense_ready, retreat_feasible, cargo_full, dock_service_applicable)
    }

    def parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload = {
      val r = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload(value)
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

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P")
      }
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P()
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS")
      }
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS()
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P")
      }
      parser.parseObjectKey("api_threat_sample")
      val api_threat_sample = parseMining_Threat_Retreat_SupervisionThreatSampleValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P(api_threat_sample)
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_threat_sample")
      val api_threat_sample = parseMining_Threat_Retreat_SupervisionThreatSampleValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS(api_threat_sample)
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P")
      }
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P()
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS")
      }
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS()
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_intent_defense")
      val api_intent_defense = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent_mining")
      val api_intent_mining = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent_mobility")
      val api_intent_mobility = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent_recovery")
      val api_intent_recovery = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(api_intent_defense, api_intent_mining, api_intent_mobility, api_intent_recovery)
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_intent_defense")
      val api_intent_defense = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent_mining")
      val api_intent_mining = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent_mobility")
      val api_intent_mobility = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent_recovery")
      val api_intent_recovery = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(api_intent_defense, api_intent_mining, api_intent_mobility, api_intent_recovery)
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P")
      }
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P()
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS")
      }
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS()
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P")
      }
      parser.parseObjectKey("api_capacitor_band")
      val api_capacitor_band = parseMining_Threat_Retreat_SupervisionCapacitorBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cargo_band")
      val api_cargo_band = parseMining_Threat_Retreat_SupervisionCargoBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_location")
      val api_location = parseMining_Threat_Retreat_SupervisionLocationValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P(api_capacitor_band, api_cargo_band, api_location)
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_capacitor_band")
      val api_capacitor_band = parseMining_Threat_Retreat_SupervisionCapacitorBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cargo_band")
      val api_cargo_band = parseMining_Threat_Retreat_SupervisionCargoBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_location")
      val api_location = parseMining_Threat_Retreat_SupervisionLocationValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS(api_capacitor_band, api_cargo_band, api_location)
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P")
      }
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P()
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS")
      }
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS()
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P")
      }
      parser.parseObjectKey("api_defense_available")
      val api_defense_available = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_destination_available")
      val api_destination_available = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_available")
      val api_mining_available = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreat_available")
      val api_retreat_available = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_available")
      val api_service_available = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P(api_defense_available, api_destination_available, api_mining_available, api_retreat_available, api_service_available)
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defense_available")
      val api_defense_available = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_destination_available")
      val api_destination_available = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_available")
      val api_mining_available = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreat_available")
      val api_retreat_available = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_available")
      val api_service_available = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS(api_defense_available, api_destination_available, api_mining_available, api_retreat_available, api_service_available)
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P")
      }
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P()
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS")
      }
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS()
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P")
      }
      parser.parseObjectKey("api_action_outcome")
      val api_action_outcome = parseMining_Threat_Retreat_SupervisionActionOutcomeValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(api_action_outcome)
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_action_outcome")
      val api_action_outcome = parseMining_Threat_Retreat_SupervisionActionOutcomeValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(api_action_outcome)
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_threat_sample")
      val api_threat_sample = parseMining_Threat_Retreat_SupervisionThreatSampleValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(api_threat_sample)
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_threat_sample")
      val api_threat_sample = parseMining_Threat_Retreat_SupervisionThreatSampleValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(api_threat_sample)
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_disposition_defense")
      val api_disposition_defense = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_disposition_mining")
      val api_disposition_mining = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_disposition_mobility")
      val api_disposition_mobility = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_validity")
      val api_threat_validity = parseMining_Threat_Retreat_SupervisionThreatValidityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(api_disposition_defense, api_disposition_mining, api_disposition_mobility, api_threat_validity)
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_disposition_defense")
      val api_disposition_defense = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_disposition_mining")
      val api_disposition_mining = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_disposition_mobility")
      val api_disposition_mobility = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_validity")
      val api_threat_validity = parseMining_Threat_Retreat_SupervisionThreatValidityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(api_disposition_defense, api_disposition_mining, api_disposition_mobility, api_threat_validity)
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_capacitor_band")
      val api_capacitor_band = parseMining_Threat_Retreat_SupervisionCapacitorBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cargo_band")
      val api_cargo_band = parseMining_Threat_Retreat_SupervisionCargoBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defense_available")
      val api_defense_available = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_destination_available")
      val api_destination_available = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_location")
      val api_location = parseMining_Threat_Retreat_SupervisionLocationValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_available")
      val api_mining_available = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreat_available")
      val api_retreat_available = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_available")
      val api_service_available = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(api_capacitor_band, api_cargo_band, api_defense_available, api_destination_available, api_location, api_mining_available, api_retreat_available, api_service_available)
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_capacitor_band")
      val api_capacitor_band = parseMining_Threat_Retreat_SupervisionCapacitorBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cargo_band")
      val api_cargo_band = parseMining_Threat_Retreat_SupervisionCargoBandValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defense_available")
      val api_defense_available = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_destination_available")
      val api_destination_available = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_location")
      val api_location = parseMining_Threat_Retreat_SupervisionLocationValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_available")
      val api_mining_available = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreat_available")
      val api_retreat_available = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_available")
      val api_service_available = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(api_capacitor_band, api_cargo_band, api_defense_available, api_destination_available, api_location, api_mining_available, api_retreat_available, api_service_available)
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_assessment_defense")
      val api_assessment_defense = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_mining")
      val api_assessment_mining = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_mobility")
      val api_assessment_mobility = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(api_assessment_defense, api_assessment_mining, api_assessment_mobility)
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_assessment_defense")
      val api_assessment_defense = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_mining")
      val api_assessment_mining = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_mobility")
      val api_assessment_mobility = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(api_assessment_defense, api_assessment_mining, api_assessment_mobility)
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_action_outcome")
      val api_action_outcome = parseMining_Threat_Retreat_SupervisionActionOutcomeValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_validity")
      val api_threat_validity = parseMining_Threat_Retreat_SupervisionThreatValidityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P(api_action_outcome, api_intent, api_threat_validity)
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS")
      }
      parser.parseObjectKey("In_recovery_memory")
      val In_recovery_memory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_action_outcome")
      val api_action_outcome = parseMining_Threat_Retreat_SupervisionActionOutcomeValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_validity")
      val api_threat_validity = parseMining_Threat_Retreat_SupervisionThreatValidityValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS(In_recovery_memory, api_action_outcome, api_intent, api_threat_validity)
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseMining_Threat_Retreat_SupervisionEmergencyStateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_defense")
      val api_gate_defense = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_mining")
      val api_gate_mining = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_mobility")
      val api_gate_mobility = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_next_recovery_state")
      val api_next_recovery_state = parseMining_Threat_Retreat_SupervisionRecoveryStateValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P(api_emergency_state, api_gate_defense, api_gate_mining, api_gate_mobility, api_next_recovery_state)
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS")
      }
      parser.parseObjectKey("recovery_memory")
      val recovery_memory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseMining_Threat_Retreat_SupervisionEmergencyStateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_defense")
      val api_gate_defense = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_mining")
      val api_gate_mining = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_mobility")
      val api_gate_mobility = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_next_recovery_state")
      val api_next_recovery_state = parseMining_Threat_Retreat_SupervisionRecoveryStateValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS(recovery_memory, api_emergency_state, api_gate_defense, api_gate_mining, api_gate_mobility, api_next_recovery_state)
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_disposition")
      val api_threat_disposition = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_disposition")
      val api_threat_disposition = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_mining_proposal")
      val api_mining_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(api_mining_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_mining_proposal")
      val api_mining_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(api_mining_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_disposition")
      val api_threat_disposition = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_disposition")
      val api_threat_disposition = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_defense_proposal")
      val api_defense_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(api_defense_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defense_proposal")
      val api_defense_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(api_defense_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_disposition")
      val api_threat_disposition = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_intent")
      val api_intent = parseMining_Threat_Retreat_SupervisionIntentValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_disposition")
      val api_threat_disposition = parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_mobility_proposal")
      val api_mobility_proposal = parseMining_Threat_Retreat_SupervisionMobilityProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(api_mobility_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_mobility_proposal")
      val api_mobility_proposal = parseMining_Threat_Retreat_SupervisionMobilityProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(api_mobility_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_defense_proposal")
      val api_defense_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseMining_Threat_Retreat_SupervisionEmergencyStateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_proposal")
      val api_mining_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mobility_proposal")
      val api_mobility_proposal = parseMining_Threat_Retreat_SupervisionMobilityProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(api_defense_proposal, api_emergency_state, api_mining_proposal, api_mobility_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defense_proposal")
      val api_defense_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseMining_Threat_Retreat_SupervisionEmergencyStateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_proposal")
      val api_mining_proposal = parseMining_Threat_Retreat_SupervisionProposalValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mobility_proposal")
      val api_mobility_proposal = parseMining_Threat_Retreat_SupervisionMobilityProposalValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(api_defense_proposal, api_emergency_state, api_mining_proposal, api_mobility_proposal)
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseMining_Threat_Retreat_SupervisionActionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_cause")
      val api_selected_cause = parseMining_Threat_Retreat_SupervisionSelectedCauseValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(api_selected_action, api_selected_cause)
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseMining_Threat_Retreat_SupervisionActionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_cause")
      val api_selected_cause = parseMining_Threat_Retreat_SupervisionSelectedCauseValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(api_selected_action, api_selected_cause)
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P")
      }
      parser.parseObjectKey("api_next_recovery_state")
      val api_next_recovery_state = parseMining_Threat_Retreat_SupervisionRecoveryStateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseMining_Threat_Retreat_SupervisionActionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_cause")
      val api_selected_cause = parseMining_Threat_Retreat_SupervisionSelectedCauseValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(api_next_recovery_state, api_selected_action, api_selected_cause)
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS")
      }
      parser.parseObjectKey("api_next_recovery_state")
      val api_next_recovery_state = parseMining_Threat_Retreat_SupervisionRecoveryStateValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseMining_Threat_Retreat_SupervisionActionValue()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_cause")
      val api_selected_cause = parseMining_Threat_Retreat_SupervisionSelectedCauseValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(api_next_recovery_state, api_selected_action, api_selected_cause)
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P")
      }
      parser.parseObjectKey("api_public_result")
      val api_public_result = parseMining_Threat_Retreat_SupervisionPublicResultValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(api_public_result)
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS")
      }
      parser.parseObjectKey("api_public_result")
      val api_public_result = parseMining_Threat_Retreat_SupervisionPublicResultValue()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(api_public_result)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Mining_Threat_Retreat_Supervision.IntentValue_Payload", "Mining_Threat_Retreat_Supervision.ActionValue_Payload", "Mining_Threat_Retreat_Supervision.LocationValue_Payload", "Mining_Threat_Retreat_Supervision.ProposalValue_Payload", "Mining_Threat_Retreat_Supervision.CargoBandValue_Payload", "Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload", "Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload", "Mining_Threat_Retreat_Supervision.PublicResultValue_Payload", "Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload", "Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload", "Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload", "Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload", "Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload", "Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload", "Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload", "Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload", "Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload", "Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload", "Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload", "Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload", "Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload", "Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P", "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS"))
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
        case "Mining_Threat_Retreat_Supervision.IntentValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionIntentValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ActionValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionActionValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.LocationValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionLocationValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ProposalValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionProposalValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.CargoBandValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionCargoBandValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionRecoveryGateValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionThreatSampleValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.PublicResultValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionPublicResultValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionRecoveryStateValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionSelectedCauseValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionActionOutcomeValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionCapacitorBandValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionThreatValidityValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionEmergencyStateValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionMobilityProposalValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionThreatDispositionValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload" => val r = parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
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

  def fromMining_Threat_Retreat_SupervisionThreatSampleValue(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreatSampleValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreatSampleValue(s: String): Either[Mining_Threat_Retreat_Supervision.ThreatSampleValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatSampleValue(parser: Parser): Mining_Threat_Retreat_Supervision.ThreatSampleValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreatSampleValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreatSampleValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreatSampleValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreatSampleValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntentValue(o: Mining_Threat_Retreat_Supervision.IntentValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntentValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntentValue(s: String): Either[Mining_Threat_Retreat_Supervision.IntentValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntentValue(parser: Parser): Mining_Threat_Retreat_Supervision.IntentValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntentValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntentValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntentValue_Payload(o: Mining_Threat_Retreat_Supervision.IntentValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntentValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntentValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.IntentValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntentValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.IntentValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntentValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntentValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCargoBandValue(o: Mining_Threat_Retreat_Supervision.CargoBandValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionCargoBandValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionCargoBandValue(s: String): Either[Mining_Threat_Retreat_Supervision.CargoBandValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCargoBandValue(parser: Parser): Mining_Threat_Retreat_Supervision.CargoBandValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionCargoBandValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionCargoBandValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionCargoBandValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.CargoBandValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCargoBandValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.CargoBandValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionCargoBandValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionCargoBandValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCapacitorBandValue(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionCapacitorBandValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionCapacitorBandValue(s: String): Either[Mining_Threat_Retreat_Supervision.CapacitorBandValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCapacitorBandValue(parser: Parser): Mining_Threat_Retreat_Supervision.CapacitorBandValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionCapacitorBandValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionCapacitorBandValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionLocationValue(o: Mining_Threat_Retreat_Supervision.LocationValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionLocationValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionLocationValue(s: String): Either[Mining_Threat_Retreat_Supervision.LocationValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionLocationValue(parser: Parser): Mining_Threat_Retreat_Supervision.LocationValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionLocationValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionLocationValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionLocationValue_Payload(o: Mining_Threat_Retreat_Supervision.LocationValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionLocationValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionLocationValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.LocationValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionLocationValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.LocationValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionLocationValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionLocationValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionOutcomeValue(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionActionOutcomeValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionActionOutcomeValue(s: String): Either[Mining_Threat_Retreat_Supervision.ActionOutcomeValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionOutcomeValue(parser: Parser): Mining_Threat_Retreat_Supervision.ActionOutcomeValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionActionOutcomeValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionActionOutcomeValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatValidityValue(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreatValidityValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreatValidityValue(s: String): Either[Mining_Threat_Retreat_Supervision.ThreatValidityValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatValidityValue(parser: Parser): Mining_Threat_Retreat_Supervision.ThreatValidityValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreatValidityValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreatValidityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreatValidityValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreatValidityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatDispositionValue(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreatDispositionValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreatDispositionValue(s: String): Either[Mining_Threat_Retreat_Supervision.ThreatDispositionValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatDispositionValue(parser: Parser): Mining_Threat_Retreat_Supervision.ThreatDispositionValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreatDispositionValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryGateValue(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecoveryGateValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecoveryGateValue(s: String): Either[Mining_Threat_Retreat_Supervision.RecoveryGateValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryGateValue(parser: Parser): Mining_Threat_Retreat_Supervision.RecoveryGateValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecoveryGateValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecoveryGateValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionEmergencyStateValue(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionEmergencyStateValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionEmergencyStateValue(s: String): Either[Mining_Threat_Retreat_Supervision.EmergencyStateValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionEmergencyStateValue(parser: Parser): Mining_Threat_Retreat_Supervision.EmergencyStateValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionEmergencyStateValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionEmergencyStateValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryStateValue(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecoveryStateValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecoveryStateValue(s: String): Either[Mining_Threat_Retreat_Supervision.RecoveryStateValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryStateValue(parser: Parser): Mining_Threat_Retreat_Supervision.RecoveryStateValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecoveryStateValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecoveryStateValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionProposalValue(o: Mining_Threat_Retreat_Supervision.ProposalValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionProposalValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionProposalValue(s: String): Either[Mining_Threat_Retreat_Supervision.ProposalValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionProposalValue(parser: Parser): Mining_Threat_Retreat_Supervision.ProposalValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionProposalValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionProposalValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.ProposalValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionProposalValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionProposalValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ProposalValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionProposalValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ProposalValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionProposalValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionProposalValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobilityProposalValue(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobilityProposalValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobilityProposalValue(s: String): Either[Mining_Threat_Retreat_Supervision.MobilityProposalValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobilityProposalValue(parser: Parser): Mining_Threat_Retreat_Supervision.MobilityProposalValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobilityProposalValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobilityProposalValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionValue(o: Mining_Threat_Retreat_Supervision.ActionValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionActionValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionActionValue(s: String): Either[Mining_Threat_Retreat_Supervision.ActionValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionValue(parser: Parser): Mining_Threat_Retreat_Supervision.ActionValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionActionValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionActionValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionActionValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionActionValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ActionValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ActionValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionActionValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionActionValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionSelectedCauseValue(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionSelectedCauseValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionSelectedCauseValue(s: String): Either[Mining_Threat_Retreat_Supervision.SelectedCauseValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionSelectedCauseValue(parser: Parser): Mining_Threat_Retreat_Supervision.SelectedCauseValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionSelectedCauseValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionSelectedCauseValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPublicResultValue(o: Mining_Threat_Retreat_Supervision.PublicResultValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPublicResultValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPublicResultValue(s: String): Either[Mining_Threat_Retreat_Supervision.PublicResultValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPublicResultValue(parser: Parser): Mining_Threat_Retreat_Supervision.PublicResultValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPublicResultValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPublicResultValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPublicResultValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.PublicResultValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPublicResultValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.PublicResultValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPublicResultValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPublicResultValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMiningAvailabilityValue(s: String): Either[Mining_Threat_Retreat_Supervision.MiningAvailabilityValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMiningAvailabilityValue(parser: Parser): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMiningAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(s: String): Either[Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(parser: Parser): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(s: String): Either[Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(parser: Parser): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(s: String): Either[Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(parser: Parser): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionServiceAvailabilityValue(s: String): Either[Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionServiceAvailabilityValue(parser: Parser): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionServiceAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadinessAssessmentValue(s: String): Either[Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadinessAssessmentValue(parser: Parser): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadinessAssessmentValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(s: String): Either[Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(parser: Parser): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload _)
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

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS _)
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