// #Sireum
// @formatter:off

// This file is auto-generated from ThreatSampleValue.scala, IntentValue.scala, CargoBandValue.scala, CapacitorBandValue.scala, LocationValue.scala, ActionOutcomeValue.scala, ThreatValidityValue.scala, ThreatDispositionValue.scala, RecoveryGateValue.scala, EmergencyStateValue.scala, RecoveryStateValue.scala, ProposalValue.scala, MobilityProposalValue.scala, ActionValue.scala, SelectedCauseValue.scala, PublicResultValue.scala, MiningAvailabilityValue.scala, DefenseAvailabilityValue.scala, RetreatAvailabilityValue.scala, DestinationAvailabilityValue.scala, ServiceAvailabilityValue.scala, ReadinessAssessmentValue.scala, Base_Types.scala, Threat_Observation_supervisor_process_threat_observation_Containers.scala, Intent_Acquisition_supervisor_process_intent_acquisition_Containers.scala, Resource_Observation_supervisor_process_resource_observation_Containers.scala, Availability_Observation_supervisor_process_availability_observation_Containers.scala, Outcome_Observation_supervisor_process_outcome_observation_Containers.scala, Threat_Qualification_supervisor_process_threat_qualification_Containers.scala, Readiness_Assessment_supervisor_process_readiness_assessment_Containers.scala, Recovery_Control_supervisor_process_recovery_control_Containers.scala, Mining_Eligibility_supervisor_process_mining_eligibility_Containers.scala, Defense_Eligibility_supervisor_process_defense_eligibility_Containers.scala, Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_Containers.scala, Priority_Arbitration_supervisor_process_priority_arbitration_Containers.scala, Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package mining_threat_retreat_supervision

import org.sireum._

object MsgPack {

  object Constants {

    val Mining_Threat_Retreat_SupervisionThreatSampleValue: Z = -32

    val Mining_Threat_Retreat_SupervisionThreatSampleValue_Payload: Z = -31

    val Mining_Threat_Retreat_SupervisionIntentValue: Z = -30

    val Mining_Threat_Retreat_SupervisionIntentValue_Payload: Z = -29

    val Mining_Threat_Retreat_SupervisionCargoBandValue: Z = -28

    val Mining_Threat_Retreat_SupervisionCargoBandValue_Payload: Z = -27

    val Mining_Threat_Retreat_SupervisionCapacitorBandValue: Z = -26

    val Mining_Threat_Retreat_SupervisionCapacitorBandValue_Payload: Z = -25

    val Mining_Threat_Retreat_SupervisionLocationValue: Z = -24

    val Mining_Threat_Retreat_SupervisionLocationValue_Payload: Z = -23

    val Mining_Threat_Retreat_SupervisionActionOutcomeValue: Z = -22

    val Mining_Threat_Retreat_SupervisionActionOutcomeValue_Payload: Z = -21

    val Mining_Threat_Retreat_SupervisionThreatValidityValue: Z = -20

    val Mining_Threat_Retreat_SupervisionThreatValidityValue_Payload: Z = -19

    val Mining_Threat_Retreat_SupervisionThreatDispositionValue: Z = -18

    val Mining_Threat_Retreat_SupervisionThreatDispositionValue_Payload: Z = -17

    val Mining_Threat_Retreat_SupervisionRecoveryGateValue: Z = -16

    val Mining_Threat_Retreat_SupervisionRecoveryGateValue_Payload: Z = -15

    val Mining_Threat_Retreat_SupervisionEmergencyStateValue: Z = -14

    val Mining_Threat_Retreat_SupervisionEmergencyStateValue_Payload: Z = -13

    val Mining_Threat_Retreat_SupervisionRecoveryStateValue: Z = -12

    val Mining_Threat_Retreat_SupervisionRecoveryStateValue_Payload: Z = -11

    val Mining_Threat_Retreat_SupervisionProposalValue: Z = -10

    val Mining_Threat_Retreat_SupervisionProposalValue_Payload: Z = -9

    val Mining_Threat_Retreat_SupervisionMobilityProposalValue: Z = -8

    val Mining_Threat_Retreat_SupervisionMobilityProposalValue_Payload: Z = -7

    val Mining_Threat_Retreat_SupervisionActionValue: Z = -6

    val Mining_Threat_Retreat_SupervisionActionValue_Payload: Z = -5

    val Mining_Threat_Retreat_SupervisionSelectedCauseValue: Z = -4

    val Mining_Threat_Retreat_SupervisionSelectedCauseValue_Payload: Z = -3

    val Mining_Threat_Retreat_SupervisionPublicResultValue: Z = -2

    val Mining_Threat_Retreat_SupervisionPublicResultValue_Payload: Z = -1

    val Mining_Threat_Retreat_SupervisionMiningAvailabilityValue: Z = 0

    val Mining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload: Z = 1

    val Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue: Z = 2

    val Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload: Z = 3

    val Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue: Z = 4

    val Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload: Z = 5

    val Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue: Z = 6

    val Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload: Z = 7

    val Mining_Threat_Retreat_SupervisionServiceAvailabilityValue: Z = 8

    val Mining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload: Z = 9

    val Mining_Threat_Retreat_SupervisionReadinessAssessmentValue: Z = 10

    val Mining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload: Z = 11

    val Base_TypesBoolean_Payload: Z = 12

    val Base_TypesInteger_Payload: Z = 13

    val Base_TypesInteger_8_Payload: Z = 14

    val Base_TypesInteger_16_Payload: Z = 15

    val Base_TypesInteger_32_Payload: Z = 16

    val Base_TypesInteger_64_Payload: Z = 17

    val Base_TypesUnsigned_8_Payload: Z = 18

    val Base_TypesUnsigned_16_Payload: Z = 19

    val Base_TypesUnsigned_32_Payload: Z = 20

    val Base_TypesUnsigned_64_Payload: Z = 21

    val Base_TypesFloat_Payload: Z = 22

    val Base_TypesFloat_32_Payload: Z = 23

    val Base_TypesFloat_64_Payload: Z = 24

    val Base_TypesCharacter_Payload: Z = 25

    val Base_TypesString_Payload: Z = 26

    val Base_TypesBits_Payload: Z = 27

    val Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P: Z = 28

    val Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS: Z = 29

    val Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P: Z = 30

    val Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS: Z = 31

    val Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P: Z = 32

    val Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS: Z = 33

    val Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P: Z = 34

    val Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS: Z = 35

    val Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P: Z = 36

    val Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS: Z = 37

    val Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P: Z = 38

    val Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS: Z = 39

    val Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P: Z = 40

    val Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS: Z = 41

    val Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P: Z = 42

    val Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS: Z = 43

    val Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P: Z = 44

    val Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS: Z = 45

    val Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P: Z = 46

    val Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS: Z = 47

    val Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P: Z = 48

    val Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS: Z = 49

    val Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P: Z = 50

    val Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS: Z = 51

    val Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P: Z = 52

    val Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS: Z = 53

    val Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P: Z = 54

    val Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS: Z = 55

    val Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P: Z = 56

    val Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS: Z = 57

    val Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P: Z = 58

    val Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS: Z = 59

    val Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P: Z = 60

    val Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS: Z = 61

    val Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P: Z = 62

    val Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS: Z = 63

    val Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P: Z = 64

    val Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS: Z = 65

    val Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P: Z = 66

    val Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS: Z = 67

    val Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P: Z = 68

    val Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS: Z = 69

    val Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P: Z = 70

    val Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS: Z = 71

    val Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P: Z = 72

    val Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS: Z = 73

    val Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P: Z = 74

    val Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS: Z = 75

    val Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P: Z = 76

    val Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS: Z = 77

    val Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P: Z = 78

    val Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS: Z = 79

    val utilEmptyContainer: Z = 80

    val _artEmpty: Z = 81

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeMining_Threat_Retreat_SupervisionThreatSampleValue(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreatSampleValue)
      writer.writeS32(o.sample_code)
    }

    def writeMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreatSampleValue_Payload)
      writeMining_Threat_Retreat_SupervisionThreatSampleValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionIntentValue(o: Mining_Threat_Retreat_Supervision.IntentValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionIntentValue)
      writer.writeS32(o.intent_code)
    }

    def writeMining_Threat_Retreat_SupervisionIntentValue_Payload(o: Mining_Threat_Retreat_Supervision.IntentValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionIntentValue_Payload)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionCargoBandValue(o: Mining_Threat_Retreat_Supervision.CargoBandValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionCargoBandValue)
      writer.writeS32(o.cargo_code)
    }

    def writeMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionCargoBandValue_Payload)
      writeMining_Threat_Retreat_SupervisionCargoBandValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionCapacitorBandValue(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionCapacitorBandValue)
      writer.writeS32(o.capacitor_code)
    }

    def writeMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionCapacitorBandValue_Payload)
      writeMining_Threat_Retreat_SupervisionCapacitorBandValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionLocationValue(o: Mining_Threat_Retreat_Supervision.LocationValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionLocationValue)
      writer.writeS32(o.location_code)
    }

    def writeMining_Threat_Retreat_SupervisionLocationValue_Payload(o: Mining_Threat_Retreat_Supervision.LocationValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionLocationValue_Payload)
      writeMining_Threat_Retreat_SupervisionLocationValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionActionOutcomeValue(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionActionOutcomeValue)
      writer.writeS32(o.outcome_code)
    }

    def writeMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionActionOutcomeValue_Payload)
      writeMining_Threat_Retreat_SupervisionActionOutcomeValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionThreatValidityValue(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreatValidityValue)
      writer.writeS32(o.validity_code)
    }

    def writeMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreatValidityValue_Payload)
      writeMining_Threat_Retreat_SupervisionThreatValidityValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreatDispositionValue)
      writer.writeS32(o.disposition_code)
    }

    def writeMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreatDispositionValue_Payload)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryGateValue)
      writer.writeS32(o.gate_code)
    }

    def writeMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryGateValue_Payload)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionEmergencyStateValue(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionEmergencyStateValue)
      writer.writeS32(o.emergency_code)
    }

    def writeMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionEmergencyStateValue_Payload)
      writeMining_Threat_Retreat_SupervisionEmergencyStateValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionRecoveryStateValue(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryStateValue)
      writer.writeS32(o.state_code)
    }

    def writeMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryStateValue_Payload)
      writeMining_Threat_Retreat_SupervisionRecoveryStateValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionProposalValue(o: Mining_Threat_Retreat_Supervision.ProposalValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionProposalValue)
      writer.writeS32(o.proposal_code)
    }

    def writeMining_Threat_Retreat_SupervisionProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.ProposalValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionProposalValue_Payload)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionMobilityProposalValue(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMobilityProposalValue)
      writer.writeS32(o.proposal_code)
    }

    def writeMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMobilityProposalValue_Payload)
      writeMining_Threat_Retreat_SupervisionMobilityProposalValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionActionValue(o: Mining_Threat_Retreat_Supervision.ActionValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionActionValue)
      writer.writeS32(o.action_code)
    }

    def writeMining_Threat_Retreat_SupervisionActionValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionActionValue_Payload)
      writeMining_Threat_Retreat_SupervisionActionValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionSelectedCauseValue(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionSelectedCauseValue)
      writer.writeS32(o.cause_code)
    }

    def writeMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionSelectedCauseValue_Payload)
      writeMining_Threat_Retreat_SupervisionSelectedCauseValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionPublicResultValue(o: Mining_Threat_Retreat_Supervision.PublicResultValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionPublicResultValue)
      writer.writeS32(o.selected_action)
      writer.writeS32(o.selected_cause)
      writer.writeS32(o.mode)
      writer.writeS32(o.recovery_state)
    }

    def writeMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionPublicResultValue_Payload)
      writeMining_Threat_Retreat_SupervisionPublicResultValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMiningAvailabilityValue)
      writer.writeB(o.available)
    }

    def writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload)
      writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue)
      writer.writeB(o.available)
    }

    def writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload)
      writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue)
      writer.writeB(o.available)
    }

    def writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload)
      writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue)
      writer.writeB(o.available)
    }

    def writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload)
      writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionServiceAvailabilityValue)
      writer.writeB(o.available)
    }

    def writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload)
      writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.value)
    }

    def writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionReadinessAssessmentValue)
      writer.writeB(o.mining_ready)
      writer.writeB(o.defense_ready)
      writer.writeB(o.retreat_feasible)
      writer.writeB(o.cargo_full)
      writer.writeB(o.dock_service_applicable)
    }

    def writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample)
    }

    def writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P)
    }

    def writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS)
    }

    def writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_defense)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mining)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mobility)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_recovery)
    }

    def writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_defense)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mining)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_mobility)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent_recovery)
    }

    def writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P)
    }

    def writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS)
    }

    def writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)
      writeMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)
      writeMining_Threat_Retreat_SupervisionLocationValue(o.api_location)
    }

    def writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)
      writeMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)
      writeMining_Threat_Retreat_SupervisionLocationValue(o.api_location)
    }

    def writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P)
    }

    def writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS)
    }

    def writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)
      writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)
      writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)
      writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)
      writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available)
    }

    def writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)
      writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)
      writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)
      writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)
      writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available)
    }

    def writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P)
    }

    def writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS)
    }

    def writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome)
    }

    def writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionThreatSampleValue(o.api_threat_sample)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_defense)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mining)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mobility)
      writeMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity)
    }

    def writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_defense)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mining)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_disposition_mobility)
      writeMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity)
    }

    def writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)
      writeMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)
      writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)
      writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)
      writeMining_Threat_Retreat_SupervisionLocationValue(o.api_location)
      writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)
      writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)
      writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available)
    }

    def writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionCapacitorBandValue(o.api_capacitor_band)
      writeMining_Threat_Retreat_SupervisionCargoBandValue(o.api_cargo_band)
      writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o.api_defense_available)
      writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o.api_destination_available)
      writeMining_Threat_Retreat_SupervisionLocationValue(o.api_location)
      writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o.api_mining_available)
      writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o.api_retreat_available)
      writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o.api_service_available)
    }

    def writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_defense)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mining)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mobility)
    }

    def writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_defense)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mining)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment_mobility)
    }

    def writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity)
    }

    def writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionActionOutcomeValue(o.api_action_outcome)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionThreatValidityValue(o.api_threat_validity)
    }

    def writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_defense)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mining)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mobility)
      writeMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state)
    }

    def writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_defense)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mining)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_gate_mobility)
      writeMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state)
    }

    def writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition)
    }

    def writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition)
    }

    def writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition)
    }

    def writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition)
    }

    def writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition)
    }

    def writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o.api_assessment)
      writeMining_Threat_Retreat_SupervisionIntentValue(o.api_intent)
      writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o.api_recovery_gate)
      writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o.api_threat_disposition)
    }

    def writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal)
      writeMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal)
      writeMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_defense_proposal)
      writeMining_Threat_Retreat_SupervisionEmergencyStateValue(o.api_emergency_state)
      writeMining_Threat_Retreat_SupervisionProposalValue(o.api_mining_proposal)
      writeMining_Threat_Retreat_SupervisionMobilityProposalValue(o.api_mobility_proposal)
    }

    def writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)
      writeMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause)
    }

    def writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)
      writeMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause)
    }

    def writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state)
      writeMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)
      writeMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause)
    }

    def writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisionRecoveryStateValue(o.api_next_recovery_state)
      writeMining_Threat_Retreat_SupervisionActionValue(o.api_selected_action)
      writeMining_Threat_Retreat_SupervisionSelectedCauseValue(o.api_selected_cause)
    }

    def writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisionPublicResultValue(o.api_public_result)
    }

    def writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisionPublicResultValue(o.api_public_result)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervision.IntentValue_Payload => writeMining_Threat_Retreat_SupervisionIntentValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ActionValue_Payload => writeMining_Threat_Retreat_SupervisionActionValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.LocationValue_Payload => writeMining_Threat_Retreat_SupervisionLocationValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ProposalValue_Payload => writeMining_Threat_Retreat_SupervisionProposalValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload => writeMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload => writeMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload => writeMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload => writeMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload => writeMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload => writeMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload => writeMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload => writeMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload => writeMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload => writeMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload => writeMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload => writeMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload => writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload => writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload => writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload => writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload => writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload => writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readMining_Threat_Retreat_SupervisionThreatSampleValue(): Mining_Threat_Retreat_Supervision.ThreatSampleValue = {
      val r = readMining_Threat_Retreat_SupervisionThreatSampleValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreatSampleValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatSampleValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreatSampleValue)
      }
      val sample_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.ThreatSampleValue(sample_code)
    }

    def readMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(): Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionThreatSampleValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreatSampleValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreatSampleValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionThreatSampleValue()
      return Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionIntentValue(): Mining_Threat_Retreat_Supervision.IntentValue = {
      val r = readMining_Threat_Retreat_SupervisionIntentValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionIntentValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.IntentValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionIntentValue)
      }
      val intent_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.IntentValue(intent_code)
    }

    def readMining_Threat_Retreat_SupervisionIntentValue_Payload(): Mining_Threat_Retreat_Supervision.IntentValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionIntentValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionIntentValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.IntentValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionIntentValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionIntentValue()
      return Mining_Threat_Retreat_Supervision.IntentValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionCargoBandValue(): Mining_Threat_Retreat_Supervision.CargoBandValue = {
      val r = readMining_Threat_Retreat_SupervisionCargoBandValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionCargoBandValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.CargoBandValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionCargoBandValue)
      }
      val cargo_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.CargoBandValue(cargo_code)
    }

    def readMining_Threat_Retreat_SupervisionCargoBandValue_Payload(): Mining_Threat_Retreat_Supervision.CargoBandValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionCargoBandValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionCargoBandValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.CargoBandValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionCargoBandValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionCargoBandValue()
      return Mining_Threat_Retreat_Supervision.CargoBandValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionCapacitorBandValue(): Mining_Threat_Retreat_Supervision.CapacitorBandValue = {
      val r = readMining_Threat_Retreat_SupervisionCapacitorBandValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionCapacitorBandValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.CapacitorBandValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionCapacitorBandValue)
      }
      val capacitor_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.CapacitorBandValue(capacitor_code)
    }

    def readMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(): Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionCapacitorBandValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionCapacitorBandValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionCapacitorBandValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionCapacitorBandValue()
      return Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionLocationValue(): Mining_Threat_Retreat_Supervision.LocationValue = {
      val r = readMining_Threat_Retreat_SupervisionLocationValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionLocationValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.LocationValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionLocationValue)
      }
      val location_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.LocationValue(location_code)
    }

    def readMining_Threat_Retreat_SupervisionLocationValue_Payload(): Mining_Threat_Retreat_Supervision.LocationValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionLocationValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionLocationValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.LocationValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionLocationValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionLocationValue()
      return Mining_Threat_Retreat_Supervision.LocationValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionActionOutcomeValue(): Mining_Threat_Retreat_Supervision.ActionOutcomeValue = {
      val r = readMining_Threat_Retreat_SupervisionActionOutcomeValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionActionOutcomeValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionOutcomeValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionActionOutcomeValue)
      }
      val outcome_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.ActionOutcomeValue(outcome_code)
    }

    def readMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(): Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionActionOutcomeValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionActionOutcomeValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionActionOutcomeValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionActionOutcomeValue()
      return Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionThreatValidityValue(): Mining_Threat_Retreat_Supervision.ThreatValidityValue = {
      val r = readMining_Threat_Retreat_SupervisionThreatValidityValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreatValidityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatValidityValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreatValidityValue)
      }
      val validity_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.ThreatValidityValue(validity_code)
    }

    def readMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(): Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionThreatValidityValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreatValidityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreatValidityValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionThreatValidityValue()
      return Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionThreatDispositionValue(): Mining_Threat_Retreat_Supervision.ThreatDispositionValue = {
      val r = readMining_Threat_Retreat_SupervisionThreatDispositionValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreatDispositionValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatDispositionValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreatDispositionValue)
      }
      val disposition_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.ThreatDispositionValue(disposition_code)
    }

    def readMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(): Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionThreatDispositionValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreatDispositionValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreatDispositionValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionRecoveryGateValue(): Mining_Threat_Retreat_Supervision.RecoveryGateValue = {
      val r = readMining_Threat_Retreat_SupervisionRecoveryGateValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecoveryGateValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryGateValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryGateValue)
      }
      val gate_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.RecoveryGateValue(gate_code)
    }

    def readMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(): Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionRecoveryGateValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecoveryGateValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryGateValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      return Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionEmergencyStateValue(): Mining_Threat_Retreat_Supervision.EmergencyStateValue = {
      val r = readMining_Threat_Retreat_SupervisionEmergencyStateValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionEmergencyStateValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.EmergencyStateValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionEmergencyStateValue)
      }
      val emergency_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.EmergencyStateValue(emergency_code)
    }

    def readMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(): Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionEmergencyStateValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionEmergencyStateValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionEmergencyStateValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionEmergencyStateValue()
      return Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionRecoveryStateValue(): Mining_Threat_Retreat_Supervision.RecoveryStateValue = {
      val r = readMining_Threat_Retreat_SupervisionRecoveryStateValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecoveryStateValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryStateValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryStateValue)
      }
      val state_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.RecoveryStateValue(state_code)
    }

    def readMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(): Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionRecoveryStateValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecoveryStateValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecoveryStateValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionRecoveryStateValue()
      return Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionProposalValue(): Mining_Threat_Retreat_Supervision.ProposalValue = {
      val r = readMining_Threat_Retreat_SupervisionProposalValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionProposalValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ProposalValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionProposalValue)
      }
      val proposal_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.ProposalValue(proposal_code)
    }

    def readMining_Threat_Retreat_SupervisionProposalValue_Payload(): Mining_Threat_Retreat_Supervision.ProposalValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionProposalValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionProposalValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ProposalValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionProposalValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionProposalValue()
      return Mining_Threat_Retreat_Supervision.ProposalValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionMobilityProposalValue(): Mining_Threat_Retreat_Supervision.MobilityProposalValue = {
      val r = readMining_Threat_Retreat_SupervisionMobilityProposalValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMobilityProposalValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.MobilityProposalValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMobilityProposalValue)
      }
      val proposal_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.MobilityProposalValue(proposal_code)
    }

    def readMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(): Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionMobilityProposalValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMobilityProposalValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMobilityProposalValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionMobilityProposalValue()
      return Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionActionValue(): Mining_Threat_Retreat_Supervision.ActionValue = {
      val r = readMining_Threat_Retreat_SupervisionActionValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionActionValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionActionValue)
      }
      val action_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.ActionValue(action_code)
    }

    def readMining_Threat_Retreat_SupervisionActionValue_Payload(): Mining_Threat_Retreat_Supervision.ActionValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionActionValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionActionValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ActionValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionActionValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionActionValue()
      return Mining_Threat_Retreat_Supervision.ActionValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionSelectedCauseValue(): Mining_Threat_Retreat_Supervision.SelectedCauseValue = {
      val r = readMining_Threat_Retreat_SupervisionSelectedCauseValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionSelectedCauseValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.SelectedCauseValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionSelectedCauseValue)
      }
      val cause_code = reader.readS32()
      return Mining_Threat_Retreat_Supervision.SelectedCauseValue(cause_code)
    }

    def readMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(): Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionSelectedCauseValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionSelectedCauseValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionSelectedCauseValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionSelectedCauseValue()
      return Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionPublicResultValue(): Mining_Threat_Retreat_Supervision.PublicResultValue = {
      val r = readMining_Threat_Retreat_SupervisionPublicResultValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionPublicResultValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.PublicResultValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionPublicResultValue)
      }
      val selected_action = reader.readS32()
      val selected_cause = reader.readS32()
      val mode = reader.readS32()
      val recovery_state = reader.readS32()
      return Mining_Threat_Retreat_Supervision.PublicResultValue(selected_action, selected_cause, mode, recovery_state)
    }

    def readMining_Threat_Retreat_SupervisionPublicResultValue_Payload(): Mining_Threat_Retreat_Supervision.PublicResultValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionPublicResultValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionPublicResultValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.PublicResultValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionPublicResultValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionPublicResultValue()
      return Mining_Threat_Retreat_Supervision.PublicResultValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionMiningAvailabilityValue(): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue = {
      val r = readMining_Threat_Retreat_SupervisionMiningAvailabilityValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMiningAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMiningAvailabilityValue)
      }
      val available = reader.readB()
      return Mining_Threat_Retreat_Supervision.MiningAvailabilityValue(available)
    }

    def readMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionMiningAvailabilityValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMiningAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue = {
      val r = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDefenseAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue)
      }
      val available = reader.readB()
      return Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue(available)
    }

    def readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue = {
      val r = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRetreatAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue)
      }
      val available = reader.readB()
      return Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue(available)
    }

    def readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue = {
      val r = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDestinationAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue)
      }
      val available = reader.readB()
      return Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue(available)
    }

    def readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionServiceAvailabilityValue(): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue = {
      val r = readMining_Threat_Retreat_SupervisionServiceAvailabilityValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionServiceAvailabilityValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionServiceAvailabilityValue)
      }
      val available = reader.readB()
      return Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue(available)
    }

    def readMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionServiceAvailabilityValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionServiceAvailabilityValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionReadinessAssessmentValue(): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue = {
      val r = readMining_Threat_Retreat_SupervisionReadinessAssessmentValueT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionReadinessAssessmentValueT(typeParsed: B): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionReadinessAssessmentValue)
      }
      val mining_ready = reader.readB()
      val defense_ready = reader.readB()
      val retreat_feasible = reader.readB()
      val cargo_full = reader.readB()
      val dock_service_applicable = reader.readB()
      return Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue(mining_ready, defense_ready, retreat_feasible, cargo_full, dock_service_applicable)
    }

    def readMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload = {
      val r = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionReadinessAssessmentValue_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      return Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P)
      }
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P()
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS)
      }
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS()
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P)
      }
      val api_threat_sample = readMining_Threat_Retreat_SupervisionThreatSampleValue()
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P(api_threat_sample)
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS)
      }
      val api_threat_sample = readMining_Threat_Retreat_SupervisionThreatSampleValue()
      return Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS(api_threat_sample)
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P)
      }
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P()
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS)
      }
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS()
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P)
      }
      val api_intent_defense = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_intent_mining = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_intent_mobility = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_intent_recovery = readMining_Threat_Retreat_SupervisionIntentValue()
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(api_intent_defense, api_intent_mining, api_intent_mobility, api_intent_recovery)
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS)
      }
      val api_intent_defense = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_intent_mining = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_intent_mobility = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_intent_recovery = readMining_Threat_Retreat_SupervisionIntentValue()
      return Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(api_intent_defense, api_intent_mining, api_intent_mobility, api_intent_recovery)
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P)
      }
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P()
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS)
      }
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS()
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P)
      }
      val api_capacitor_band = readMining_Threat_Retreat_SupervisionCapacitorBandValue()
      val api_cargo_band = readMining_Threat_Retreat_SupervisionCargoBandValue()
      val api_location = readMining_Threat_Retreat_SupervisionLocationValue()
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P(api_capacitor_band, api_cargo_band, api_location)
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS)
      }
      val api_capacitor_band = readMining_Threat_Retreat_SupervisionCapacitorBandValue()
      val api_cargo_band = readMining_Threat_Retreat_SupervisionCargoBandValue()
      val api_location = readMining_Threat_Retreat_SupervisionLocationValue()
      return Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS(api_capacitor_band, api_cargo_band, api_location)
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P)
      }
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P()
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS)
      }
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS()
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P)
      }
      val api_defense_available = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      val api_destination_available = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      val api_mining_available = readMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      val api_retreat_available = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      val api_service_available = readMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P(api_defense_available, api_destination_available, api_mining_available, api_retreat_available, api_service_available)
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS)
      }
      val api_defense_available = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      val api_destination_available = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      val api_mining_available = readMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      val api_retreat_available = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      val api_service_available = readMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS(api_defense_available, api_destination_available, api_mining_available, api_retreat_available, api_service_available)
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P)
      }
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P()
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS)
      }
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS()
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P)
      }
      val api_action_outcome = readMining_Threat_Retreat_SupervisionActionOutcomeValue()
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(api_action_outcome)
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS)
      }
      val api_action_outcome = readMining_Threat_Retreat_SupervisionActionOutcomeValue()
      return Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(api_action_outcome)
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P)
      }
      val api_threat_sample = readMining_Threat_Retreat_SupervisionThreatSampleValue()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(api_threat_sample)
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS)
      }
      val api_threat_sample = readMining_Threat_Retreat_SupervisionThreatSampleValue()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(api_threat_sample)
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P)
      }
      val api_disposition_defense = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      val api_disposition_mining = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      val api_disposition_mobility = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      val api_threat_validity = readMining_Threat_Retreat_SupervisionThreatValidityValue()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(api_disposition_defense, api_disposition_mining, api_disposition_mobility, api_threat_validity)
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS)
      }
      val api_disposition_defense = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      val api_disposition_mining = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      val api_disposition_mobility = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      val api_threat_validity = readMining_Threat_Retreat_SupervisionThreatValidityValue()
      return Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(api_disposition_defense, api_disposition_mining, api_disposition_mobility, api_threat_validity)
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P)
      }
      val api_capacitor_band = readMining_Threat_Retreat_SupervisionCapacitorBandValue()
      val api_cargo_band = readMining_Threat_Retreat_SupervisionCargoBandValue()
      val api_defense_available = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      val api_destination_available = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      val api_location = readMining_Threat_Retreat_SupervisionLocationValue()
      val api_mining_available = readMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      val api_retreat_available = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      val api_service_available = readMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(api_capacitor_band, api_cargo_band, api_defense_available, api_destination_available, api_location, api_mining_available, api_retreat_available, api_service_available)
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS)
      }
      val api_capacitor_band = readMining_Threat_Retreat_SupervisionCapacitorBandValue()
      val api_cargo_band = readMining_Threat_Retreat_SupervisionCargoBandValue()
      val api_defense_available = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      val api_destination_available = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      val api_location = readMining_Threat_Retreat_SupervisionLocationValue()
      val api_mining_available = readMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      val api_retreat_available = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      val api_service_available = readMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(api_capacitor_band, api_cargo_band, api_defense_available, api_destination_available, api_location, api_mining_available, api_retreat_available, api_service_available)
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P)
      }
      val api_assessment_defense = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_assessment_mining = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_assessment_mobility = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(api_assessment_defense, api_assessment_mining, api_assessment_mobility)
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS)
      }
      val api_assessment_defense = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_assessment_mining = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_assessment_mobility = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      return Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(api_assessment_defense, api_assessment_mining, api_assessment_mobility)
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P)
      }
      val api_action_outcome = readMining_Threat_Retreat_SupervisionActionOutcomeValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_threat_validity = readMining_Threat_Retreat_SupervisionThreatValidityValue()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P(api_action_outcome, api_intent, api_threat_validity)
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS)
      }
      val api_action_outcome = readMining_Threat_Retreat_SupervisionActionOutcomeValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_threat_validity = readMining_Threat_Retreat_SupervisionThreatValidityValue()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS(api_action_outcome, api_intent, api_threat_validity)
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P)
      }
      val api_emergency_state = readMining_Threat_Retreat_SupervisionEmergencyStateValue()
      val api_gate_defense = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_gate_mining = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_gate_mobility = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_next_recovery_state = readMining_Threat_Retreat_SupervisionRecoveryStateValue()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P(api_emergency_state, api_gate_defense, api_gate_mining, api_gate_mobility, api_next_recovery_state)
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS)
      }
      val api_emergency_state = readMining_Threat_Retreat_SupervisionEmergencyStateValue()
      val api_gate_defense = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_gate_mining = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_gate_mobility = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_next_recovery_state = readMining_Threat_Retreat_SupervisionRecoveryStateValue()
      return Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS(api_emergency_state, api_gate_defense, api_gate_mining, api_gate_mobility, api_next_recovery_state)
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P)
      }
      val api_assessment = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_recovery_gate = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_threat_disposition = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS)
      }
      val api_assessment = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_recovery_gate = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_threat_disposition = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P)
      }
      val api_mining_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(api_mining_proposal)
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS)
      }
      val api_mining_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      return Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(api_mining_proposal)
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P)
      }
      val api_assessment = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_recovery_gate = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_threat_disposition = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS)
      }
      val api_assessment = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_recovery_gate = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_threat_disposition = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P)
      }
      val api_defense_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(api_defense_proposal)
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS)
      }
      val api_defense_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      return Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(api_defense_proposal)
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P)
      }
      val api_assessment = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_recovery_gate = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_threat_disposition = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS)
      }
      val api_assessment = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      val api_intent = readMining_Threat_Retreat_SupervisionIntentValue()
      val api_recovery_gate = readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      val api_threat_disposition = readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(api_assessment, api_intent, api_recovery_gate, api_threat_disposition)
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P)
      }
      val api_mobility_proposal = readMining_Threat_Retreat_SupervisionMobilityProposalValue()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(api_mobility_proposal)
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS)
      }
      val api_mobility_proposal = readMining_Threat_Retreat_SupervisionMobilityProposalValue()
      return Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(api_mobility_proposal)
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P)
      }
      val api_defense_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      val api_emergency_state = readMining_Threat_Retreat_SupervisionEmergencyStateValue()
      val api_mining_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      val api_mobility_proposal = readMining_Threat_Retreat_SupervisionMobilityProposalValue()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(api_defense_proposal, api_emergency_state, api_mining_proposal, api_mobility_proposal)
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS)
      }
      val api_defense_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      val api_emergency_state = readMining_Threat_Retreat_SupervisionEmergencyStateValue()
      val api_mining_proposal = readMining_Threat_Retreat_SupervisionProposalValue()
      val api_mobility_proposal = readMining_Threat_Retreat_SupervisionMobilityProposalValue()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(api_defense_proposal, api_emergency_state, api_mining_proposal, api_mobility_proposal)
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P)
      }
      val api_selected_action = readMining_Threat_Retreat_SupervisionActionValue()
      val api_selected_cause = readMining_Threat_Retreat_SupervisionSelectedCauseValue()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(api_selected_action, api_selected_cause)
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS)
      }
      val api_selected_action = readMining_Threat_Retreat_SupervisionActionValue()
      val api_selected_cause = readMining_Threat_Retreat_SupervisionSelectedCauseValue()
      return Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(api_selected_action, api_selected_cause)
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P)
      }
      val api_next_recovery_state = readMining_Threat_Retreat_SupervisionRecoveryStateValue()
      val api_selected_action = readMining_Threat_Retreat_SupervisionActionValue()
      val api_selected_cause = readMining_Threat_Retreat_SupervisionSelectedCauseValue()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(api_next_recovery_state, api_selected_action, api_selected_cause)
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS)
      }
      val api_next_recovery_state = readMining_Threat_Retreat_SupervisionRecoveryStateValue()
      val api_selected_action = readMining_Threat_Retreat_SupervisionActionValue()
      val api_selected_cause = readMining_Threat_Retreat_SupervisionSelectedCauseValue()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(api_next_recovery_state, api_selected_action, api_selected_cause)
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P)
      }
      val api_public_result = readMining_Threat_Retreat_SupervisionPublicResultValue()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(api_public_result)
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS)
      }
      val api_public_result = readMining_Threat_Retreat_SupervisionPublicResultValue()
      return Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(api_public_result)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntentValue_Payload => val r = readMining_Threat_Retreat_SupervisionIntentValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionActionValue_Payload => val r = readMining_Threat_Retreat_SupervisionActionValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionLocationValue_Payload => val r = readMining_Threat_Retreat_SupervisionLocationValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionProposalValue_Payload => val r = readMining_Threat_Retreat_SupervisionProposalValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionCargoBandValue_Payload => val r = readMining_Threat_Retreat_SupervisionCargoBandValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecoveryGateValue_Payload => val r = readMining_Threat_Retreat_SupervisionRecoveryGateValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreatSampleValue_Payload => val r = readMining_Threat_Retreat_SupervisionThreatSampleValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPublicResultValue_Payload => val r = readMining_Threat_Retreat_SupervisionPublicResultValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecoveryStateValue_Payload => val r = readMining_Threat_Retreat_SupervisionRecoveryStateValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionSelectedCauseValue_Payload => val r = readMining_Threat_Retreat_SupervisionSelectedCauseValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionActionOutcomeValue_Payload => val r = readMining_Threat_Retreat_SupervisionActionOutcomeValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionCapacitorBandValue_Payload => val r = readMining_Threat_Retreat_SupervisionCapacitorBandValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreatValidityValue_Payload => val r = readMining_Threat_Retreat_SupervisionThreatValidityValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionEmergencyStateValue_Payload => val r = readMining_Threat_Retreat_SupervisionEmergencyStateValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobilityProposalValue_Payload => val r = readMining_Threat_Retreat_SupervisionMobilityProposalValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreatDispositionValue_Payload => val r = readMining_Threat_Retreat_SupervisionThreatDispositionValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload => val r = readMining_Threat_Retreat_SupervisionMiningAvailabilityValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload => val r = readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload => val r = readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload => val r = readMining_Threat_Retreat_SupervisionServiceAvailabilityValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload => val r = readMining_Threat_Retreat_SupervisionReadinessAssessmentValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload => val r = readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromMining_Threat_Retreat_SupervisionThreatSampleValue(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreatSampleValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreatSampleValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ThreatSampleValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatSampleValue(reader: Reader): Mining_Threat_Retreat_Supervision.ThreatSampleValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreatSampleValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreatSampleValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatSampleValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreatSampleValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreatSampleValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntentValue(o: Mining_Threat_Retreat_Supervision.IntentValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntentValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntentValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.IntentValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntentValue(reader: Reader): Mining_Threat_Retreat_Supervision.IntentValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntentValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntentValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntentValue_Payload(o: Mining_Threat_Retreat_Supervision.IntentValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntentValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntentValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.IntentValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntentValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.IntentValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntentValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntentValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCargoBandValue(o: Mining_Threat_Retreat_Supervision.CargoBandValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionCargoBandValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionCargoBandValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.CargoBandValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCargoBandValue(reader: Reader): Mining_Threat_Retreat_Supervision.CargoBandValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionCargoBandValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionCargoBandValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionCargoBandValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionCargoBandValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.CargoBandValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCargoBandValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.CargoBandValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionCargoBandValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionCargoBandValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCapacitorBandValue(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionCapacitorBandValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionCapacitorBandValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.CapacitorBandValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCapacitorBandValue(reader: Reader): Mining_Threat_Retreat_Supervision.CapacitorBandValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionCapacitorBandValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionCapacitorBandValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionLocationValue(o: Mining_Threat_Retreat_Supervision.LocationValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionLocationValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionLocationValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.LocationValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionLocationValue(reader: Reader): Mining_Threat_Retreat_Supervision.LocationValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionLocationValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionLocationValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionLocationValue_Payload(o: Mining_Threat_Retreat_Supervision.LocationValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionLocationValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionLocationValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.LocationValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionLocationValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.LocationValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionLocationValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionLocationValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionOutcomeValue(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionActionOutcomeValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionActionOutcomeValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ActionOutcomeValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionOutcomeValue(reader: Reader): Mining_Threat_Retreat_Supervision.ActionOutcomeValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionActionOutcomeValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionActionOutcomeValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatValidityValue(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreatValidityValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreatValidityValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ThreatValidityValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatValidityValue(reader: Reader): Mining_Threat_Retreat_Supervision.ThreatValidityValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreatValidityValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreatValidityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatValidityValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreatValidityValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreatValidityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatDispositionValue(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreatDispositionValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreatDispositionValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ThreatDispositionValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatDispositionValue(reader: Reader): Mining_Threat_Retreat_Supervision.ThreatDispositionValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreatDispositionValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreatDispositionValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryGateValue(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecoveryGateValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecoveryGateValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.RecoveryGateValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryGateValue(reader: Reader): Mining_Threat_Retreat_Supervision.RecoveryGateValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecoveryGateValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecoveryGateValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionEmergencyStateValue(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionEmergencyStateValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionEmergencyStateValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.EmergencyStateValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionEmergencyStateValue(reader: Reader): Mining_Threat_Retreat_Supervision.EmergencyStateValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionEmergencyStateValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionEmergencyStateValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryStateValue(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecoveryStateValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecoveryStateValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.RecoveryStateValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryStateValue(reader: Reader): Mining_Threat_Retreat_Supervision.RecoveryStateValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecoveryStateValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecoveryStateValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionProposalValue(o: Mining_Threat_Retreat_Supervision.ProposalValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionProposalValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionProposalValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ProposalValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionProposalValue(reader: Reader): Mining_Threat_Retreat_Supervision.ProposalValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionProposalValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionProposalValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.ProposalValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionProposalValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionProposalValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ProposalValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionProposalValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ProposalValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionProposalValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionProposalValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobilityProposalValue(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobilityProposalValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobilityProposalValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.MobilityProposalValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobilityProposalValue(reader: Reader): Mining_Threat_Retreat_Supervision.MobilityProposalValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobilityProposalValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobilityProposalValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionValue(o: Mining_Threat_Retreat_Supervision.ActionValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionActionValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionActionValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ActionValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionValue(reader: Reader): Mining_Threat_Retreat_Supervision.ActionValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionActionValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionActionValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionActionValue_Payload(o: Mining_Threat_Retreat_Supervision.ActionValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionActionValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionActionValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ActionValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionActionValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ActionValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionActionValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionActionValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionSelectedCauseValue(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionSelectedCauseValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionSelectedCauseValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.SelectedCauseValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionSelectedCauseValue(reader: Reader): Mining_Threat_Retreat_Supervision.SelectedCauseValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionSelectedCauseValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionSelectedCauseValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPublicResultValue(o: Mining_Threat_Retreat_Supervision.PublicResultValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPublicResultValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPublicResultValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.PublicResultValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPublicResultValue(reader: Reader): Mining_Threat_Retreat_Supervision.PublicResultValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionPublicResultValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPublicResultValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPublicResultValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPublicResultValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.PublicResultValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPublicResultValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.PublicResultValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionPublicResultValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPublicResultValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMiningAvailabilityValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.MiningAvailabilityValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMiningAvailabilityValue(reader: Reader): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionMiningAvailabilityValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMiningAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue(reader: Reader): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue(reader: Reader): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue(reader: Reader): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionServiceAvailabilityValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionServiceAvailabilityValue(reader: Reader): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionServiceAvailabilityValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionServiceAvailabilityValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadinessAssessmentValue(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadinessAssessmentValue(reader: Reader): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadinessAssessmentValue()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadinessAssessmentValue _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(reader: Reader): Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}