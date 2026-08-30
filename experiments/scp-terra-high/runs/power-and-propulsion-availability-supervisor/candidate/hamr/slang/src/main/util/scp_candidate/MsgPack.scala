// #Sireum
// @formatter:off

// This file is auto-generated from BatteryQuality.scala, EvidenceValidity.scala, EvidenceFreshness.scala, AdmissionResult.scala, BatteryAssessment.scala, PowerCondition.scala, PowerAssessment.scala, EnginePositionOneCondition.scala, EnginePositionTwoCondition.scala, EnginePairAssessment.scala, EngineCount.scala, AlternatingKinds.scala, ConfigurationAssessment.scala, PropulsionAssessment.scala, ChargerCoupling.scala, ChargingAssessment.scala, ControlEvent.scala, ActuationFeedback.scala, PriorityDirective.scala, DemandPhase.scala, RequestContextEvent.scala, FaultStatus.scala, FaultCause.scala, SummaryDirective.scala, RecoveryPhase.scala, RecoveryGate.scala, AvailabilityValue.scala, AvailabilityCause.scala, ReportAvailabilityValue.scala, ReportAvailabilityCause.scala, ReportDemandPhase.scala, ReportRecoveryPhase.scala, PowerCommand.scala, BatteryObservation.scala, QualifiedBatteryObservation.scala, PowerEvidence.scala, EnginePairEvidence.scala, ConfigurationEvidence.scala, ChargerEvidence.scala, RequestContext.scala, FaultActionSummary.scala, RecoveryFrame.scala, AvailabilityDecision.scala, AvailabilityReport.scala, Base_Types.scala, BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_Containers.scala, BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Containers.scala, PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Containers.scala, OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Containers.scala, EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_Containers.scala, FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_Containers.scala, PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Containers.scala, ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Containers.scala, EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_Containers.scala, FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_Containers.scala, RecoveryQualificationOwner_supervisor_process_recovery_qualification_Containers.scala, AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_Containers.scala, PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Power_Propulsion_Availability_SupervisorBatteryQuality_Payload: Z = -32

    val Power_Propulsion_Availability_SupervisorEvidenceValidity_Payload: Z = -31

    val Power_Propulsion_Availability_SupervisorEvidenceFreshness_Payload: Z = -30

    val Power_Propulsion_Availability_SupervisorAdmissionResult_Payload: Z = -29

    val Power_Propulsion_Availability_SupervisorBatteryAssessment_Payload: Z = -28

    val Power_Propulsion_Availability_SupervisorPowerCondition_Payload: Z = -27

    val Power_Propulsion_Availability_SupervisorPowerAssessment_Payload: Z = -26

    val Power_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload: Z = -25

    val Power_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload: Z = -24

    val Power_Propulsion_Availability_SupervisorEnginePairAssessment_Payload: Z = -23

    val Power_Propulsion_Availability_SupervisorEngineCount_Payload: Z = -22

    val Power_Propulsion_Availability_SupervisorAlternatingKinds_Payload: Z = -21

    val Power_Propulsion_Availability_SupervisorConfigurationAssessment_Payload: Z = -20

    val Power_Propulsion_Availability_SupervisorPropulsionAssessment_Payload: Z = -19

    val Power_Propulsion_Availability_SupervisorChargerCoupling_Payload: Z = -18

    val Power_Propulsion_Availability_SupervisorChargingAssessment_Payload: Z = -17

    val Power_Propulsion_Availability_SupervisorControlEvent_Payload: Z = -16

    val Power_Propulsion_Availability_SupervisorActuationFeedback_Payload: Z = -15

    val Power_Propulsion_Availability_SupervisorPriorityDirective_Payload: Z = -14

    val Power_Propulsion_Availability_SupervisorDemandPhase_Payload: Z = -13

    val Power_Propulsion_Availability_SupervisorRequestContextEvent_Payload: Z = -12

    val Power_Propulsion_Availability_SupervisorFaultStatus_Payload: Z = -11

    val Power_Propulsion_Availability_SupervisorFaultCause_Payload: Z = -10

    val Power_Propulsion_Availability_SupervisorSummaryDirective_Payload: Z = -9

    val Power_Propulsion_Availability_SupervisorRecoveryPhase_Payload: Z = -8

    val Power_Propulsion_Availability_SupervisorRecoveryGate_Payload: Z = -7

    val Power_Propulsion_Availability_SupervisorAvailabilityValue_Payload: Z = -6

    val Power_Propulsion_Availability_SupervisorAvailabilityCause_Payload: Z = -5

    val Power_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload: Z = -4

    val Power_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload: Z = -3

    val Power_Propulsion_Availability_SupervisorReportDemandPhase_Payload: Z = -2

    val Power_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload: Z = -1

    val Power_Propulsion_Availability_SupervisorPowerCommand_Payload: Z = 0

    val Power_Propulsion_Availability_SupervisorBatteryObservation: Z = 1

    val Power_Propulsion_Availability_SupervisorBatteryObservation_Payload: Z = 2

    val Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation: Z = 3

    val Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload: Z = 4

    val Power_Propulsion_Availability_SupervisorPowerEvidence: Z = 5

    val Power_Propulsion_Availability_SupervisorPowerEvidence_Payload: Z = 6

    val Power_Propulsion_Availability_SupervisorEnginePairEvidence: Z = 7

    val Power_Propulsion_Availability_SupervisorEnginePairEvidence_Payload: Z = 8

    val Power_Propulsion_Availability_SupervisorConfigurationEvidence: Z = 9

    val Power_Propulsion_Availability_SupervisorConfigurationEvidence_Payload: Z = 10

    val Power_Propulsion_Availability_SupervisorChargerEvidence: Z = 11

    val Power_Propulsion_Availability_SupervisorChargerEvidence_Payload: Z = 12

    val Power_Propulsion_Availability_SupervisorRequestContext: Z = 13

    val Power_Propulsion_Availability_SupervisorRequestContext_Payload: Z = 14

    val Power_Propulsion_Availability_SupervisorFaultActionSummary: Z = 15

    val Power_Propulsion_Availability_SupervisorFaultActionSummary_Payload: Z = 16

    val Power_Propulsion_Availability_SupervisorRecoveryFrame: Z = 17

    val Power_Propulsion_Availability_SupervisorRecoveryFrame_Payload: Z = 18

    val Power_Propulsion_Availability_SupervisorAvailabilityDecision: Z = 19

    val Power_Propulsion_Availability_SupervisorAvailabilityDecision_Payload: Z = 20

    val Power_Propulsion_Availability_SupervisorAvailabilityReport: Z = 21

    val Power_Propulsion_Availability_SupervisorAvailabilityReport_Payload: Z = 22

    val Base_TypesBoolean_Payload: Z = 23

    val Base_TypesInteger_Payload: Z = 24

    val Base_TypesInteger_8_Payload: Z = 25

    val Base_TypesInteger_16_Payload: Z = 26

    val Base_TypesInteger_32_Payload: Z = 27

    val Base_TypesInteger_64_Payload: Z = 28

    val Base_TypesUnsigned_8_Payload: Z = 29

    val Base_TypesUnsigned_16_Payload: Z = 30

    val Base_TypesUnsigned_32_Payload: Z = 31

    val Base_TypesUnsigned_64_Payload: Z = 32

    val Base_TypesFloat_Payload: Z = 33

    val Base_TypesFloat_32_Payload: Z = 34

    val Base_TypesFloat_64_Payload: Z = 35

    val Base_TypesCharacter_Payload: Z = 36

    val Base_TypesString_Payload: Z = 37

    val Base_TypesBits_Payload: Z = 38

    val Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P: Z = 39

    val Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS: Z = 40

    val Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P: Z = 41

    val Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS: Z = 42

    val Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P: Z = 43

    val Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS: Z = 44

    val Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P: Z = 45

    val Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS: Z = 46

    val Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P: Z = 47

    val Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS: Z = 48

    val Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P: Z = 49

    val Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS: Z = 50

    val Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P: Z = 51

    val Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS: Z = 52

    val Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P: Z = 53

    val Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS: Z = 54

    val Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P: Z = 55

    val Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS: Z = 56

    val Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P: Z = 57

    val Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS: Z = 58

    val Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P: Z = 59

    val Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS: Z = 60

    val Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P: Z = 61

    val Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS: Z = 62

    val Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P: Z = 63

    val Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS: Z = 64

    val Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P: Z = 65

    val Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS: Z = 66

    val Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P: Z = 67

    val Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS: Z = 68

    val Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P: Z = 69

    val Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS: Z = 70

    val Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P: Z = 71

    val Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS: Z = 72

    val Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P: Z = 73

    val Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS: Z = 74

    val Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P: Z = 75

    val Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS: Z = 76

    val Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P: Z = 77

    val Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS: Z = 78

    val Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P: Z = 79

    val Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS: Z = 80

    val Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P: Z = 81

    val Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS: Z = 82

    val Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P: Z = 83

    val Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS: Z = 84

    val Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P: Z = 85

    val Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS: Z = 86

    val Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P: Z = 87

    val Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS: Z = 88

    val Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P: Z = 89

    val Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS: Z = 90

    val utilEmptyContainer: Z = 91

    val _artEmpty: Z = 92

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writePower_Propulsion_Availability_SupervisorBatteryQualityType(o: Power_Propulsion_Availability_Supervisor.BatteryQuality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryQuality_Payload)
      writePower_Propulsion_Availability_SupervisorBatteryQualityType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorEvidenceValidityType(o: Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEvidenceValidity_Payload)
      writePower_Propulsion_Availability_SupervisorEvidenceValidityType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEvidenceFreshness_Payload)
      writePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorAdmissionResultType(o: Power_Propulsion_Availability_Supervisor.AdmissionResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAdmissionResult_Payload)
      writePower_Propulsion_Availability_SupervisorAdmissionResultType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o: Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryAssessment_Payload)
      writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorPowerConditionType(o: Power_Propulsion_Availability_Supervisor.PowerCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorPowerCondition_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerCondition_Payload)
      writePower_Propulsion_Availability_SupervisorPowerConditionType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o: Power_Propulsion_Availability_Supervisor.PowerAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerAssessment_Payload)
      writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload)
      writePower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload)
      writePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnginePairAssessment_Payload)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorEngineCountType(o: Power_Propulsion_Availability_Supervisor.EngineCount.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorEngineCount_Payload(o: Power_Propulsion_Availability_Supervisor.EngineCount_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEngineCount_Payload)
      writePower_Propulsion_Availability_SupervisorEngineCountType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorAlternatingKindsType(o: Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAlternatingKinds_Payload)
      writePower_Propulsion_Availability_SupervisorAlternatingKindsType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorConfigurationAssessment_Payload)
      writePower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionAssessment_Payload)
      writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorChargerCouplingType(o: Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargerCoupling_Payload)
      writePower_Propulsion_Availability_SupervisorChargerCouplingType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o: Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargingAssessment_Payload)
      writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorControlEventType(o: Power_Propulsion_Availability_Supervisor.ControlEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorControlEvent_Payload(o: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorControlEvent_Payload)
      writePower_Propulsion_Availability_SupervisorControlEventType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorActuationFeedbackType(o: Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorActuationFeedback_Payload)
      writePower_Propulsion_Availability_SupervisorActuationFeedbackType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o: Power_Propulsion_Availability_Supervisor.PriorityDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPriorityDirective_Payload)
      writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorDemandPhaseType(o: Power_Propulsion_Availability_Supervisor.DemandPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorDemandPhase_Payload)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorRequestContextEventType(o: Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRequestContextEvent_Payload)
      writePower_Propulsion_Availability_SupervisorRequestContextEventType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorFaultStatusType(o: Power_Propulsion_Availability_Supervisor.FaultStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorFaultStatus_Payload(o: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultStatus_Payload)
      writePower_Propulsion_Availability_SupervisorFaultStatusType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorFaultCauseType(o: Power_Propulsion_Availability_Supervisor.FaultCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorFaultCause_Payload(o: Power_Propulsion_Availability_Supervisor.FaultCause_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultCause_Payload)
      writePower_Propulsion_Availability_SupervisorFaultCauseType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorSummaryDirectiveType(o: Power_Propulsion_Availability_Supervisor.SummaryDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorSummaryDirective_Payload)
      writePower_Propulsion_Availability_SupervisorSummaryDirectiveType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryPhaseType(o: Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryPhase_Payload)
      writePower_Propulsion_Availability_SupervisorRecoveryPhaseType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryGateType(o: Power_Propulsion_Availability_Supervisor.RecoveryGate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryGate_Payload)
      writePower_Propulsion_Availability_SupervisorRecoveryGateType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityValueType(o: Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityValue_Payload)
      writePower_Propulsion_Availability_SupervisorAvailabilityValueType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityCauseType(o: Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityCause_Payload)
      writePower_Propulsion_Availability_SupervisorAvailabilityCauseType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorReportAvailabilityValueType(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload)
      writePower_Propulsion_Availability_SupervisorReportAvailabilityValueType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload)
      writePower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorReportDemandPhaseType(o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorReportDemandPhase_Payload)
      writePower_Propulsion_Availability_SupervisorReportDemandPhaseType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload)
      writePower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommandType(o: Power_Propulsion_Availability_Supervisor.PowerCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommand_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommand_Payload)
      writePower_Propulsion_Availability_SupervisorPowerCommandType(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryObservation(o: Power_Propulsion_Availability_Supervisor.BatteryObservation): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservation)
      writePower_Propulsion_Availability_SupervisorBatteryQualityType(o.quality)
      writePower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)
      writePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservation_Payload)
      writePower_Propulsion_Availability_SupervisorBatteryObservation(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation)
      writePower_Propulsion_Availability_SupervisorAdmissionResultType(o.admission)
      writePower_Propulsion_Availability_SupervisorBatteryQualityType(o.quality)
    }

    def writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload)
      writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorPowerEvidence(o: Power_Propulsion_Availability_Supervisor.PowerEvidence): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerEvidence)
      writePower_Propulsion_Availability_SupervisorPowerConditionType(o.condition)
      writePower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)
      writePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness)
    }

    def writePower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerEvidence_Payload)
      writePower_Propulsion_Availability_SupervisorPowerEvidence(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePairEvidence(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnginePairEvidence)
      writePower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(o.positionOneState)
      writePower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(o.positionTwoState)
      writePower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)
      writePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness)
    }

    def writePower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnginePairEvidence_Payload)
      writePower_Propulsion_Availability_SupervisorEnginePairEvidence(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorConfigurationEvidence(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorConfigurationEvidence)
      writePower_Propulsion_Availability_SupervisorEngineCountType(o.engineCount)
      writePower_Propulsion_Availability_SupervisorAlternatingKindsType(o.alternatingKinds)
      writePower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)
      writePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness)
    }

    def writePower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorConfigurationEvidence_Payload)
      writePower_Propulsion_Availability_SupervisorConfigurationEvidence(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorChargerEvidence(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargerEvidence)
      writePower_Propulsion_Availability_SupervisorChargerCouplingType(o.coupling)
      writePower_Propulsion_Availability_SupervisorEvidenceValidityType(o.validity)
      writePower_Propulsion_Availability_SupervisorEvidenceFreshnessType(o.freshness)
    }

    def writePower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargerEvidence_Payload)
      writePower_Propulsion_Availability_SupervisorChargerEvidence(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorRequestContext(o: Power_Propulsion_Availability_Supervisor.RequestContext): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRequestContext)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.demand)
      writePower_Propulsion_Availability_SupervisorRequestContextEventType(o.candidateEvent)
    }

    def writePower_Propulsion_Availability_SupervisorRequestContext_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContext_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRequestContext_Payload)
      writePower_Propulsion_Availability_SupervisorRequestContext(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionSummary(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionSummary)
      writePower_Propulsion_Availability_SupervisorFaultStatusType(o.fault)
      writePower_Propulsion_Availability_SupervisorFaultCauseType(o.cause)
      writePower_Propulsion_Availability_SupervisorSummaryDirectiveType(o.directive)
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionSummary_Payload)
      writePower_Propulsion_Availability_SupervisorFaultActionSummary(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryFrame(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryFrame)
      writePower_Propulsion_Availability_SupervisorRecoveryPhaseType(o.phase)
      writePower_Propulsion_Availability_SupervisorRecoveryGateType(o.gate)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryFrame_Payload)
      writePower_Propulsion_Availability_SupervisorRecoveryFrame(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecision(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecision)
      writePower_Propulsion_Availability_SupervisorAvailabilityValueType(o.decision)
      writePower_Propulsion_Availability_SupervisorAvailabilityCauseType(o.cause)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecision_Payload)
      writePower_Propulsion_Availability_SupervisorAvailabilityDecision(o.value)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityReport(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityReport)
      writePower_Propulsion_Availability_SupervisorReportAvailabilityValueType(o.decision)
      writePower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(o.cause)
      writePower_Propulsion_Availability_SupervisorReportDemandPhaseType(o.demand)
      writePower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(o.recovery)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityReport_Payload)
      writePower_Propulsion_Availability_SupervisorAvailabilityReport(o.value)
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

    def writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorBatteryObservation(o.api_battery_observation)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorBatteryObservation(o.api_battery_observation)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o.api_qualified_battery)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorPowerEvidence(o.api_power_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorPowerEvidence(o.api_power_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_odd_engine_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_odd_engine_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_even_engine_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorEnginePairEvidence(o.api_even_engine_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorConfigurationEvidence(o.api_configuration_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorConfigurationEvidence(o.api_configuration_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorConfigurationAssessmentType(o.api_configuration_assessment)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_even_engine_assessment)
      writePower_Propulsion_Availability_SupervisorEnginePairAssessmentType(o.api_odd_engine_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorChargerEvidence(o.api_charger_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorChargerEvidence(o.api_charger_evidence)
    }

    def writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)
    }

    def writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writePower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)
      writePower_Propulsion_Availability_SupervisorControlEventType(o.api_control_event)
    }

    def writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writePower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)
      writePower_Propulsion_Availability_SupervisorControlEventType(o.api_control_event)
    }

    def writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)
      writePower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context)
    }

    def writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)
      writePower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context)
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)
      writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)
      writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)
      writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)
      writePower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context)
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)
      writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)
      writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)
      writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)
      writePower_Propulsion_Availability_SupervisorRequestContext(o.api_request_context)
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writePower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)
    }

    def writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writePower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame)
      writePower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate)
    }

    def writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame)
      writePower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)
      writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)
      writePower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)
      writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)
      writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)
      writePower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorBatteryAssessmentType(o.api_battery_assessment)
      writePower_Propulsion_Availability_SupervisorChargingAssessmentType(o.api_charging_assessment)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)
      writePower_Propulsion_Availability_SupervisorFaultActionSummary(o.api_fault_action_summary)
      writePower_Propulsion_Availability_SupervisorPowerAssessmentType(o.api_power_assessment)
      writePower_Propulsion_Availability_SupervisorPropulsionAssessmentType(o.api_propulsion_assessment)
      writePower_Propulsion_Availability_SupervisorRecoveryFrame(o.api_recovery_frame)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)
      writePower_Propulsion_Availability_SupervisorAvailabilityReport(o.api_availability_report)
    }

    def writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)
      writePower_Propulsion_Availability_SupervisorAvailabilityReport(o.api_availability_report)
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P)
      writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writePower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)
      writePower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)
      writePower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate)
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS)
      writePower_Propulsion_Availability_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writePower_Propulsion_Availability_SupervisorActuationFeedbackType(o.api_actuation_feedback)
      writePower_Propulsion_Availability_SupervisorAvailabilityDecision(o.api_availability_decision)
      writePower_Propulsion_Availability_SupervisorDemandPhaseType(o.api_demand_view)
      writePower_Propulsion_Availability_SupervisorRecoveryGateType(o.api_recovery_gate)
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container): Unit = {
      o match {
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
      }
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P)
      writePower_Propulsion_Availability_SupervisorPowerCommandType(o.api_power_command)
    }

    def writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS)
      writePower_Propulsion_Availability_SupervisorPowerCommandType(o.api_power_command)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
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
        case o: Power_Propulsion_Availability_Supervisor.FaultCause_Payload => writePower_Propulsion_Availability_SupervisorFaultCause_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload => writePower_Propulsion_Availability_SupervisorFaultStatus_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EngineCount_Payload => writePower_Propulsion_Availability_SupervisorEngineCount_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload => writePower_Propulsion_Availability_SupervisorDemandPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload => writePower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload => writePower_Propulsion_Availability_SupervisorPowerCommand_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload => writePower_Propulsion_Availability_SupervisorControlEvent_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload => writePower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload => writePower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload => writePower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload => writePower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload => writePower_Propulsion_Availability_SupervisorPowerCondition_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RequestContext_Payload => writePower_Propulsion_Availability_SupervisorRequestContext_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload => writePower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload => writePower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload => writePower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload => writePower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload => writePower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload => writePower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload => writePower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload => writePower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload => writePower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload => writePower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload => writePower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload => writePower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload => writePower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload => writePower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload => writePower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload => writePower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload => writePower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload => writePower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload => writePower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload => writePower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload => writePower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload => writePower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload => writePower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload => writePower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload => writePower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload => writePower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload => writePower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload => writePower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload => writePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload => writePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload => writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
        case o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
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

    def readPower_Propulsion_Availability_SupervisorBatteryQualityType(): Power_Propulsion_Availability_Supervisor.BatteryQuality.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.BatteryQuality.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(): Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryQuality_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryQuality_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryQuality_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorBatteryQualityType()
      return Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorEvidenceValidityType(): Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.EvidenceValidity.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(): Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorEvidenceValidity_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEvidenceValidity_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEvidenceValidity_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorEvidenceValidityType()
      return Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorEvidenceFreshnessType(): Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.EvidenceFreshness.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(): Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorEvidenceFreshness_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEvidenceFreshness_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEvidenceFreshness_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      return Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorAdmissionResultType(): Power_Propulsion_Availability_Supervisor.AdmissionResult.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.AdmissionResult.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(): Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorAdmissionResult_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAdmissionResult_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAdmissionResult_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorAdmissionResultType()
      return Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryAssessmentType(): Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.BatteryAssessment.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(): Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryAssessment_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryAssessment_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      return Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorPowerConditionType(): Power_Propulsion_Availability_Supervisor.PowerCondition.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.PowerCondition.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorPowerCondition_Payload(): Power_Propulsion_Availability_Supervisor.PowerCondition_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorPowerCondition_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerCondition_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerCondition_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorPowerConditionType()
      return Power_Propulsion_Availability_Supervisor.PowerCondition_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorPowerAssessmentType(): Power_Propulsion_Availability_Supervisor.PowerAssessment.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.PowerAssessment.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(): Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorPowerAssessment_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerAssessment_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorPowerAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorEnginePositionOneConditionType(): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorEnginePositionOneConditionType()
      return Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType()
      return Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType(): Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.EnginePairAssessment.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(): Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorEnginePairAssessment_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnginePairAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnginePairAssessment_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      return Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorEngineCountType(): Power_Propulsion_Availability_Supervisor.EngineCount.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.EngineCount.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorEngineCount_Payload(): Power_Propulsion_Availability_Supervisor.EngineCount_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorEngineCount_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEngineCount_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EngineCount_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEngineCount_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorEngineCountType()
      return Power_Propulsion_Availability_Supervisor.EngineCount_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorAlternatingKindsType(): Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.AlternatingKinds.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(): Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorAlternatingKinds_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAlternatingKinds_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAlternatingKinds_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorAlternatingKindsType()
      return Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorConfigurationAssessmentType(): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorConfigurationAssessment_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorConfigurationAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorConfigurationAssessment_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      return Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType(): Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.PropulsionAssessment.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(): Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorPropulsionAssessment_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionAssessment_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorChargerCouplingType(): Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ChargerCoupling.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(): Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorChargerCoupling_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargerCoupling_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargerCoupling_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorChargerCouplingType()
      return Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorChargingAssessmentType(): Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ChargingAssessment.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(): Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorChargingAssessment_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargingAssessment_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargingAssessment_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorChargingAssessmentType()
      return Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorControlEventType(): Power_Propulsion_Availability_Supervisor.ControlEvent.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ControlEvent.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorControlEvent_Payload(): Power_Propulsion_Availability_Supervisor.ControlEvent_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorControlEvent_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorControlEvent_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ControlEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorControlEvent_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorControlEventType()
      return Power_Propulsion_Availability_Supervisor.ControlEvent_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorActuationFeedbackType(): Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ActuationFeedback.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(): Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorActuationFeedback_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorActuationFeedback_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorActuationFeedback_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorActuationFeedbackType()
      return Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorPriorityDirectiveType(): Power_Propulsion_Availability_Supervisor.PriorityDirective.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.PriorityDirective.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(): Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorPriorityDirective_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPriorityDirective_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPriorityDirective_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      return Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorDemandPhaseType(): Power_Propulsion_Availability_Supervisor.DemandPhase.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.DemandPhase.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorDemandPhase_Payload(): Power_Propulsion_Availability_Supervisor.DemandPhase_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorDemandPhase_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorDemandPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.DemandPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorDemandPhase_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      return Power_Propulsion_Availability_Supervisor.DemandPhase_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorRequestContextEventType(): Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.RequestContextEvent.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(): Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorRequestContextEvent_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRequestContextEvent_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRequestContextEvent_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorRequestContextEventType()
      return Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorFaultStatusType(): Power_Propulsion_Availability_Supervisor.FaultStatus.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.FaultStatus.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorFaultStatus_Payload(): Power_Propulsion_Availability_Supervisor.FaultStatus_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorFaultStatus_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultStatus_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultStatus_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorFaultStatusType()
      return Power_Propulsion_Availability_Supervisor.FaultStatus_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorFaultCauseType(): Power_Propulsion_Availability_Supervisor.FaultCause.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.FaultCause.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorFaultCause_Payload(): Power_Propulsion_Availability_Supervisor.FaultCause_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorFaultCause_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultCause_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultCause_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorFaultCauseType()
      return Power_Propulsion_Availability_Supervisor.FaultCause_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorSummaryDirectiveType(): Power_Propulsion_Availability_Supervisor.SummaryDirective.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.SummaryDirective.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(): Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorSummaryDirective_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorSummaryDirective_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorSummaryDirective_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorSummaryDirectiveType()
      return Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryPhaseType(): Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.RecoveryPhase.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(): Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryPhase_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorRecoveryPhaseType()
      return Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryGateType(): Power_Propulsion_Availability_Supervisor.RecoveryGate.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.RecoveryGate.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(): Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryGate_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryGate_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryGate_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorRecoveryGateType()
      return Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityValueType(): Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.AvailabilityValue.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityValue_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityValue_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityValue_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorAvailabilityValueType()
      return Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityCauseType(): Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.AvailabilityCause.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityCause_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityCause_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityCause_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorAvailabilityCauseType()
      return Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorReportAvailabilityValueType(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorReportAvailabilityValue_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorReportAvailabilityValue_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorReportAvailabilityValueType()
      return Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorReportAvailabilityCauseType(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorReportAvailabilityCause_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorReportAvailabilityCause_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorReportAvailabilityCauseType()
      return Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorReportDemandPhaseType(): Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ReportDemandPhase.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(): Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorReportDemandPhase_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorReportDemandPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorReportDemandPhase_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorReportDemandPhaseType()
      return Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorReportRecoveryPhaseType(): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorReportRecoveryPhase_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorReportRecoveryPhase_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorReportRecoveryPhaseType()
      return Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandType(): Power_Propulsion_Availability_Supervisor.PowerCommand.Type = {
      val r = reader.readZ()
      return Power_Propulsion_Availability_Supervisor.PowerCommand.byOrdinal(r).get
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommand_Payload(): Power_Propulsion_Availability_Supervisor.PowerCommand_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorPowerCommand_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommand_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommand_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorPowerCommandType()
      return Power_Propulsion_Availability_Supervisor.PowerCommand_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservation(): Power_Propulsion_Availability_Supervisor.BatteryObservation = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryObservationT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservation)
      }
      val quality = readPower_Propulsion_Availability_SupervisorBatteryQualityType()
      val validity = readPower_Propulsion_Availability_SupervisorEvidenceValidityType()
      val freshness = readPower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      return Power_Propulsion_Availability_Supervisor.BatteryObservation(quality, validity, freshness)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(): Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryObservation_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservation_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservation_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = {
      val r = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservationT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservationT(typeParsed: B): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation)
      }
      val admission = readPower_Propulsion_Availability_SupervisorAdmissionResultType()
      val quality = readPower_Propulsion_Availability_SupervisorBatteryQualityType()
      return Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(admission, quality)
    }

    def readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorPowerEvidence(): Power_Propulsion_Availability_Supervisor.PowerEvidence = {
      val r = readPower_Propulsion_Availability_SupervisorPowerEvidenceT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerEvidence)
      }
      val condition = readPower_Propulsion_Availability_SupervisorPowerConditionType()
      val validity = readPower_Propulsion_Availability_SupervisorEvidenceValidityType()
      val freshness = readPower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      return Power_Propulsion_Availability_Supervisor.PowerEvidence(condition, validity, freshness)
    }

    def readPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(): Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorPowerEvidence_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerEvidence_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorPowerEvidence()
      return Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorEnginePairEvidence(): Power_Propulsion_Availability_Supervisor.EnginePairEvidence = {
      val r = readPower_Propulsion_Availability_SupervisorEnginePairEvidenceT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnginePairEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePairEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnginePairEvidence)
      }
      val positionOneState = readPower_Propulsion_Availability_SupervisorEnginePositionOneConditionType()
      val positionTwoState = readPower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType()
      val validity = readPower_Propulsion_Availability_SupervisorEvidenceValidityType()
      val freshness = readPower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      return Power_Propulsion_Availability_Supervisor.EnginePairEvidence(positionOneState, positionTwoState, validity, freshness)
    }

    def readPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(): Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorEnginePairEvidence_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnginePairEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnginePairEvidence_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorEnginePairEvidence()
      return Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorConfigurationEvidence(): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence = {
      val r = readPower_Propulsion_Availability_SupervisorConfigurationEvidenceT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorConfigurationEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorConfigurationEvidence)
      }
      val engineCount = readPower_Propulsion_Availability_SupervisorEngineCountType()
      val alternatingKinds = readPower_Propulsion_Availability_SupervisorAlternatingKindsType()
      val validity = readPower_Propulsion_Availability_SupervisorEvidenceValidityType()
      val freshness = readPower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      return Power_Propulsion_Availability_Supervisor.ConfigurationEvidence(engineCount, alternatingKinds, validity, freshness)
    }

    def readPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorConfigurationEvidence_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorConfigurationEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorConfigurationEvidence_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorConfigurationEvidence()
      return Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorChargerEvidence(): Power_Propulsion_Availability_Supervisor.ChargerEvidence = {
      val r = readPower_Propulsion_Availability_SupervisorChargerEvidenceT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargerEvidenceT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargerEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargerEvidence)
      }
      val coupling = readPower_Propulsion_Availability_SupervisorChargerCouplingType()
      val validity = readPower_Propulsion_Availability_SupervisorEvidenceValidityType()
      val freshness = readPower_Propulsion_Availability_SupervisorEvidenceFreshnessType()
      return Power_Propulsion_Availability_Supervisor.ChargerEvidence(coupling, validity, freshness)
    }

    def readPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(): Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorChargerEvidence_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargerEvidence_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargerEvidence_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorChargerEvidence()
      return Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorRequestContext(): Power_Propulsion_Availability_Supervisor.RequestContext = {
      val r = readPower_Propulsion_Availability_SupervisorRequestContextT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRequestContextT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RequestContext = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRequestContext)
      }
      val demand = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      val candidateEvent = readPower_Propulsion_Availability_SupervisorRequestContextEventType()
      return Power_Propulsion_Availability_Supervisor.RequestContext(demand, candidateEvent)
    }

    def readPower_Propulsion_Availability_SupervisorRequestContext_Payload(): Power_Propulsion_Availability_Supervisor.RequestContext_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorRequestContext_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRequestContext_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RequestContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRequestContext_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorRequestContext()
      return Power_Propulsion_Availability_Supervisor.RequestContext_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionSummary(): Power_Propulsion_Availability_Supervisor.FaultActionSummary = {
      val r = readPower_Propulsion_Availability_SupervisorFaultActionSummaryT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionSummaryT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionSummary = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionSummary)
      }
      val fault = readPower_Propulsion_Availability_SupervisorFaultStatusType()
      val cause = readPower_Propulsion_Availability_SupervisorFaultCauseType()
      val directive = readPower_Propulsion_Availability_SupervisorSummaryDirectiveType()
      return Power_Propulsion_Availability_Supervisor.FaultActionSummary(fault, cause, directive)
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(): Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorFaultActionSummary_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionSummary_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionSummary_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      return Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryFrame(): Power_Propulsion_Availability_Supervisor.RecoveryFrame = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryFrameT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryFrameT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryFrame)
      }
      val phase = readPower_Propulsion_Availability_SupervisorRecoveryPhaseType()
      val gate = readPower_Propulsion_Availability_SupervisorRecoveryGateType()
      return Power_Propulsion_Availability_Supervisor.RecoveryFrame(phase, gate)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(): Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryFrame_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryFrame_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryFrame_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorRecoveryFrame()
      return Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecision(): Power_Propulsion_Availability_Supervisor.AvailabilityDecision = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecision)
      }
      val decision = readPower_Propulsion_Availability_SupervisorAvailabilityValueType()
      val cause = readPower_Propulsion_Availability_SupervisorAvailabilityCauseType()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecision(decision, cause)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecision_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecision_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecision_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorAvailabilityDecision()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload(value)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityReport(): Power_Propulsion_Availability_Supervisor.AvailabilityReport = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityReportT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityReportT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityReport)
      }
      val decision = readPower_Propulsion_Availability_SupervisorReportAvailabilityValueType()
      val cause = readPower_Propulsion_Availability_SupervisorReportAvailabilityCauseType()
      val demand = readPower_Propulsion_Availability_SupervisorReportDemandPhaseType()
      val recovery = readPower_Propulsion_Availability_SupervisorReportRecoveryPhaseType()
      return Power_Propulsion_Availability_Supervisor.AvailabilityReport(decision, cause, demand, recovery)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(): Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityReport_PayloadT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityReport_PayloadT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityReport_Payload)
      }
      val value = readPower_Propulsion_Availability_SupervisorAvailabilityReport()
      return Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload(value)
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

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P)
      }
      val api_battery_observation = readPower_Propulsion_Availability_SupervisorBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(api_battery_observation)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS)
      }
      val api_battery_observation = readPower_Propulsion_Availability_SupervisorBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(api_battery_observation)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P)
      }
      val api_qualified_battery = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(api_qualified_battery)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS)
      }
      val api_qualified_battery = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(api_qualified_battery)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P)
      }
      val api_qualified_battery = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(api_qualified_battery)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS)
      }
      val api_qualified_battery = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(api_qualified_battery)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P)
      }
      val api_battery_assessment = readPower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(api_battery_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS)
      }
      val api_battery_assessment = readPower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      return Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(api_battery_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P)
      }
      val api_power_evidence = readPower_Propulsion_Availability_SupervisorPowerEvidence()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(api_power_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS)
      }
      val api_power_evidence = readPower_Propulsion_Availability_SupervisorPowerEvidence()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(api_power_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P)
      }
      val api_power_assessment = readPower_Propulsion_Availability_SupervisorPowerAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(api_power_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS)
      }
      val api_power_assessment = readPower_Propulsion_Availability_SupervisorPowerAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(api_power_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P)
      }
      val api_odd_engine_evidence = readPower_Propulsion_Availability_SupervisorEnginePairEvidence()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(api_odd_engine_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS)
      }
      val api_odd_engine_evidence = readPower_Propulsion_Availability_SupervisorEnginePairEvidence()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(api_odd_engine_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P)
      }
      val api_odd_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(api_odd_engine_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS)
      }
      val api_odd_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      return Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(api_odd_engine_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P)
      }
      val api_even_engine_evidence = readPower_Propulsion_Availability_SupervisorEnginePairEvidence()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(api_even_engine_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS)
      }
      val api_even_engine_evidence = readPower_Propulsion_Availability_SupervisorEnginePairEvidence()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(api_even_engine_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P)
      }
      val api_even_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(api_even_engine_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS)
      }
      val api_even_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      return Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(api_even_engine_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P)
      }
      val api_configuration_evidence = readPower_Propulsion_Availability_SupervisorConfigurationEvidence()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(api_configuration_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS)
      }
      val api_configuration_evidence = readPower_Propulsion_Availability_SupervisorConfigurationEvidence()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(api_configuration_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P)
      }
      val api_configuration_assessment = readPower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(api_configuration_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS)
      }
      val api_configuration_assessment = readPower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      return Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(api_configuration_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P)
      }
      val api_configuration_assessment = readPower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      val api_even_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      val api_odd_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(api_configuration_assessment, api_even_engine_assessment, api_odd_engine_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS)
      }
      val api_configuration_assessment = readPower_Propulsion_Availability_SupervisorConfigurationAssessmentType()
      val api_even_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      val api_odd_engine_assessment = readPower_Propulsion_Availability_SupervisorEnginePairAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(api_configuration_assessment, api_even_engine_assessment, api_odd_engine_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P)
      }
      val api_propulsion_assessment = readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(api_propulsion_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS)
      }
      val api_propulsion_assessment = readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      return Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(api_propulsion_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P)
      }
      val api_charger_evidence = readPower_Propulsion_Availability_SupervisorChargerEvidence()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(api_charger_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS)
      }
      val api_charger_evidence = readPower_Propulsion_Availability_SupervisorChargerEvidence()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(api_charger_evidence)
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P)
      }
      val api_charging_assessment = readPower_Propulsion_Availability_SupervisorChargingAssessmentType()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(api_charging_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS)
      }
      val api_charging_assessment = readPower_Propulsion_Availability_SupervisorChargingAssessmentType()
      return Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(api_charging_assessment)
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P)
      }
      val api_accepted_directive = readPower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      val api_actuation_feedback = readPower_Propulsion_Availability_SupervisorActuationFeedbackType()
      val api_control_event = readPower_Propulsion_Availability_SupervisorControlEventType()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(api_accepted_directive, api_actuation_feedback, api_control_event)
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS)
      }
      val api_accepted_directive = readPower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      val api_actuation_feedback = readPower_Propulsion_Availability_SupervisorActuationFeedbackType()
      val api_control_event = readPower_Propulsion_Availability_SupervisorControlEventType()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(api_accepted_directive, api_actuation_feedback, api_control_event)
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P)
      }
      val api_demand_view = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      val api_request_context = readPower_Propulsion_Availability_SupervisorRequestContext()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(api_demand_view, api_request_context)
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS)
      }
      val api_demand_view = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      val api_request_context = readPower_Propulsion_Availability_SupervisorRequestContext()
      return Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(api_demand_view, api_request_context)
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P)
      }
      val api_battery_assessment = readPower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      val api_charging_assessment = readPower_Propulsion_Availability_SupervisorChargingAssessmentType()
      val api_power_assessment = readPower_Propulsion_Availability_SupervisorPowerAssessmentType()
      val api_propulsion_assessment = readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      val api_request_context = readPower_Propulsion_Availability_SupervisorRequestContext()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(api_battery_assessment, api_charging_assessment, api_power_assessment, api_propulsion_assessment, api_request_context)
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS)
      }
      val api_battery_assessment = readPower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      val api_charging_assessment = readPower_Propulsion_Availability_SupervisorChargingAssessmentType()
      val api_power_assessment = readPower_Propulsion_Availability_SupervisorPowerAssessmentType()
      val api_propulsion_assessment = readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      val api_request_context = readPower_Propulsion_Availability_SupervisorRequestContext()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(api_battery_assessment, api_charging_assessment, api_power_assessment, api_propulsion_assessment, api_request_context)
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P)
      }
      val api_accepted_directive = readPower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      val api_fault_action_summary = readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(api_accepted_directive, api_fault_action_summary)
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS)
      }
      val api_accepted_directive = readPower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      val api_fault_action_summary = readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      return Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(api_accepted_directive, api_fault_action_summary)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P)
      }
      val api_fault_action_summary = readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(api_fault_action_summary)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS)
      }
      val api_fault_action_summary = readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(api_fault_action_summary)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P)
      }
      val api_recovery_frame = readPower_Propulsion_Availability_SupervisorRecoveryFrame()
      val api_recovery_gate = readPower_Propulsion_Availability_SupervisorRecoveryGateType()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(api_recovery_frame, api_recovery_gate)
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS)
      }
      val api_recovery_frame = readPower_Propulsion_Availability_SupervisorRecoveryFrame()
      val api_recovery_gate = readPower_Propulsion_Availability_SupervisorRecoveryGateType()
      return Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(api_recovery_frame, api_recovery_gate)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P)
      }
      val api_battery_assessment = readPower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      val api_charging_assessment = readPower_Propulsion_Availability_SupervisorChargingAssessmentType()
      val api_demand_view = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      val api_fault_action_summary = readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      val api_power_assessment = readPower_Propulsion_Availability_SupervisorPowerAssessmentType()
      val api_propulsion_assessment = readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      val api_recovery_frame = readPower_Propulsion_Availability_SupervisorRecoveryFrame()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(api_battery_assessment, api_charging_assessment, api_demand_view, api_fault_action_summary, api_power_assessment, api_propulsion_assessment, api_recovery_frame)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS)
      }
      val api_battery_assessment = readPower_Propulsion_Availability_SupervisorBatteryAssessmentType()
      val api_charging_assessment = readPower_Propulsion_Availability_SupervisorChargingAssessmentType()
      val api_demand_view = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      val api_fault_action_summary = readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      val api_power_assessment = readPower_Propulsion_Availability_SupervisorPowerAssessmentType()
      val api_propulsion_assessment = readPower_Propulsion_Availability_SupervisorPropulsionAssessmentType()
      val api_recovery_frame = readPower_Propulsion_Availability_SupervisorRecoveryFrame()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(api_battery_assessment, api_charging_assessment, api_demand_view, api_fault_action_summary, api_power_assessment, api_propulsion_assessment, api_recovery_frame)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P)
      }
      val api_availability_decision = readPower_Propulsion_Availability_SupervisorAvailabilityDecision()
      val api_availability_report = readPower_Propulsion_Availability_SupervisorAvailabilityReport()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(api_availability_decision, api_availability_report)
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS)
      }
      val api_availability_decision = readPower_Propulsion_Availability_SupervisorAvailabilityDecision()
      val api_availability_report = readPower_Propulsion_Availability_SupervisorAvailabilityReport()
      return Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(api_availability_decision, api_availability_report)
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P)
      }
      val api_accepted_directive = readPower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      val api_actuation_feedback = readPower_Propulsion_Availability_SupervisorActuationFeedbackType()
      val api_availability_decision = readPower_Propulsion_Availability_SupervisorAvailabilityDecision()
      val api_demand_view = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      val api_recovery_gate = readPower_Propulsion_Availability_SupervisorRecoveryGateType()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(api_accepted_directive, api_actuation_feedback, api_availability_decision, api_demand_view, api_recovery_gate)
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS)
      }
      val api_accepted_directive = readPower_Propulsion_Availability_SupervisorPriorityDirectiveType()
      val api_actuation_feedback = readPower_Propulsion_Availability_SupervisorActuationFeedbackType()
      val api_availability_decision = readPower_Propulsion_Availability_SupervisorAvailabilityDecision()
      val api_demand_view = readPower_Propulsion_Availability_SupervisorDemandPhaseType()
      val api_recovery_gate = readPower_Propulsion_Availability_SupervisorRecoveryGateType()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(api_accepted_directive, api_actuation_feedback, api_availability_decision, api_demand_view, api_recovery_gate)
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container.")
          val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T)
          return r
      }
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P = {
      val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P)
      }
      val api_power_command = readPower_Propulsion_Availability_SupervisorPowerCommandType()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(api_power_command)
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS = {
      val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(F)
      return r
    }

    def readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(typeParsed: B): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS)
      }
      val api_power_command = readPower_Propulsion_Availability_SupervisorPowerCommandType()
      return Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(api_power_command)
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
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T)
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
        case Constants.Power_Propulsion_Availability_SupervisorFaultCause_Payload => val r = readPower_Propulsion_Availability_SupervisorFaultCause_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultStatus_Payload => val r = readPower_Propulsion_Availability_SupervisorFaultStatus_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEngineCount_Payload => val r = readPower_Propulsion_Availability_SupervisorEngineCount_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorDemandPhase_Payload => val r = readPower_Propulsion_Availability_SupervisorDemandPhase_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryGate_Payload => val r = readPower_Propulsion_Availability_SupervisorRecoveryGate_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommand_Payload => val r = readPower_Propulsion_Availability_SupervisorPowerCommand_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorControlEvent_Payload => val r = readPower_Propulsion_Availability_SupervisorControlEvent_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryPhase_Payload => val r = readPower_Propulsion_Availability_SupervisorRecoveryPhase_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryFrame_Payload => val r = readPower_Propulsion_Availability_SupervisorRecoveryFrame_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerEvidence_Payload => val r = readPower_Propulsion_Availability_SupervisorPowerEvidence_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryQuality_Payload => val r = readPower_Propulsion_Availability_SupervisorBatteryQuality_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCondition_Payload => val r = readPower_Propulsion_Availability_SupervisorPowerCondition_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRequestContext_Payload => val r = readPower_Propulsion_Availability_SupervisorRequestContext_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAdmissionResult_Payload => val r = readPower_Propulsion_Availability_SupervisorAdmissionResult_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargerCoupling_Payload => val r = readPower_Propulsion_Availability_SupervisorChargerCoupling_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerAssessment_Payload => val r = readPower_Propulsion_Availability_SupervisorPowerAssessment_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargerEvidence_Payload => val r = readPower_Propulsion_Availability_SupervisorChargerEvidence_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvidenceValidity_Payload => val r = readPower_Propulsion_Availability_SupervisorEvidenceValidity_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorSummaryDirective_Payload => val r = readPower_Propulsion_Availability_SupervisorSummaryDirective_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAlternatingKinds_Payload => val r = readPower_Propulsion_Availability_SupervisorAlternatingKinds_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvidenceFreshness_Payload => val r = readPower_Propulsion_Availability_SupervisorEvidenceFreshness_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorReportDemandPhase_Payload => val r = readPower_Propulsion_Availability_SupervisorReportDemandPhase_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityValue_Payload => val r = readPower_Propulsion_Availability_SupervisorAvailabilityValue_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPriorityDirective_Payload => val r = readPower_Propulsion_Availability_SupervisorPriorityDirective_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorActuationFeedback_Payload => val r = readPower_Propulsion_Availability_SupervisorActuationFeedback_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryAssessment_Payload => val r = readPower_Propulsion_Availability_SupervisorBatteryAssessment_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityCause_Payload => val r = readPower_Propulsion_Availability_SupervisorAvailabilityCause_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingAssessment_Payload => val r = readPower_Propulsion_Availability_SupervisorChargingAssessment_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionSummary_Payload => val r = readPower_Propulsion_Availability_SupervisorFaultActionSummary_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservation_Payload => val r = readPower_Propulsion_Availability_SupervisorBatteryObservation_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityReport_Payload => val r = readPower_Propulsion_Availability_SupervisorAvailabilityReport_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnginePairEvidence_Payload => val r = readPower_Propulsion_Availability_SupervisorEnginePairEvidence_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload => val r = readPower_Propulsion_Availability_SupervisorReportRecoveryPhase_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRequestContextEvent_Payload => val r = readPower_Propulsion_Availability_SupervisorRequestContextEvent_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionAssessment_Payload => val r = readPower_Propulsion_Availability_SupervisorPropulsionAssessment_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnginePairAssessment_Payload => val r = readPower_Propulsion_Availability_SupervisorEnginePairAssessment_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecision_Payload => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecision_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorConfigurationEvidence_Payload => val r = readPower_Propulsion_Availability_SupervisorConfigurationEvidence_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload => val r = readPower_Propulsion_Availability_SupervisorReportAvailabilityValue_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorConfigurationAssessment_Payload => val r = readPower_Propulsion_Availability_SupervisorConfigurationAssessment_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload => val r = readPower_Propulsion_Availability_SupervisorReportAvailabilityCause_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload => val r = readPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload => val r = readPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload => val r = readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_PayloadT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PST(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PT(T); return r
        case Constants.Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PST(T)
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

  def fromPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryQuality_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryQuality_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryQuality_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryQuality_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAdmissionResult_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAdmissionResult_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAdmissionResult_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAdmissionResult_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCondition_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCondition_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCondition_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCondition_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCondition_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCondition_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCondition_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCondition_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerAssessment_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerAssessment_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerAssessment_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEngineCount_Payload(o: Power_Propulsion_Availability_Supervisor.EngineCount_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEngineCount_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEngineCount_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EngineCount_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEngineCount_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.EngineCount_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEngineCount_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEngineCount_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargerCoupling_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargerCoupling_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargerCoupling_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargerCoupling_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargingAssessment_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingAssessment_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargingAssessment_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargingAssessment_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorControlEvent_Payload(o: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorControlEvent_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorControlEvent_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ControlEvent_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorControlEvent_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ControlEvent_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorControlEvent_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorControlEvent_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorActuationFeedback_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorActuationFeedback_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorActuationFeedback_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorActuationFeedback_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPriorityDirective_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPriorityDirective_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPriorityDirective_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPriorityDirective_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorDemandPhase_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorDemandPhase_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.DemandPhase_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorDemandPhase_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.DemandPhase_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorDemandPhase_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorDemandPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultStatus_Payload(o: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultStatus_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultStatus_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultStatus_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultStatus_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultStatus_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultStatus_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultStatus_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultCause_Payload(o: Power_Propulsion_Availability_Supervisor.FaultCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultCause_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultCause_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultCause_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultCause_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultCause_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultCause_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultCause_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorSummaryDirective_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorSummaryDirective_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorSummaryDirective_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorSummaryDirective_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryGate_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryGate_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryGate_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryGate_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommand_Payload(o: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCommand_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommand_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCommand_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommand_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCommand_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCommand_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCommand_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservation(o: Power_Propulsion_Availability_Supervisor.BatteryObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservation(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservation(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservation, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservation(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservation = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservation()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservation _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservation_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservation_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservation_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservation_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation(reader: Reader): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = {
      val r = reader.readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerEvidence(o: Power_Propulsion_Availability_Supervisor.PowerEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerEvidence(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerEvidence(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerEvidence, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerEvidence(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerEvidence = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerEvidence()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerEvidence_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerEvidence_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerEvidence_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePairEvidence(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnginePairEvidence(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnginePairEvidence(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnginePairEvidence, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePairEvidence(reader: Reader): Power_Propulsion_Availability_Supervisor.EnginePairEvidence = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnginePairEvidence()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnginePairEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorConfigurationEvidence(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorConfigurationEvidence(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorConfigurationEvidence(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorConfigurationEvidence(reader: Reader): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence = {
      val r = reader.readPower_Propulsion_Availability_SupervisorConfigurationEvidence()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorConfigurationEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargerEvidence(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargerEvidence(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargerEvidence(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargerEvidence, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargerEvidence(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargerEvidence = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargerEvidence()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargerEvidence _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargerEvidence_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargerEvidence_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargerEvidence_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargerEvidence_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRequestContext(o: Power_Propulsion_Availability_Supervisor.RequestContext, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRequestContext(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRequestContext(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RequestContext, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRequestContext(reader: Reader): Power_Propulsion_Availability_Supervisor.RequestContext = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRequestContext()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRequestContext _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRequestContext_Payload(o: Power_Propulsion_Availability_Supervisor.RequestContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRequestContext_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRequestContext_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RequestContext_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRequestContext_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.RequestContext_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRequestContext_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRequestContext_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionSummary(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionSummary(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionSummary(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionSummary, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionSummary(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionSummary = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionSummary()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionSummary _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryFrame(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryFrame(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryFrame(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryFrame, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryFrame(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryFrame = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryFrame()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryFrame _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecision(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecision(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecision(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecision, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecision(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecision = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecision()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecision _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityReport(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityReport(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityReport(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityReport, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityReport(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityReport = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityReport()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityReport _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload _)
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

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P _)
    return r
  }

  def fromPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(o)
    return w.result
  }

  def toPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(data: ISZ[U8]): Either[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(reader: Reader): Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS = {
      val r = reader.readPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS()
      return r
    }
    val r = to(data, fPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS _)
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