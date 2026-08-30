// #Sireum
// @formatter:off

// This file is auto-generated from EnergyQuality.scala, Validity.scala, Freshness.scala, EnergyCause.scala, GpsCondition.scala, InertialCondition.scala, BarometricCondition.scala, NavigationCause.scala, EquipmentCondition.scala, SingleEquipmentCause.scala, Engine1Condition.scala, Engine2Condition.scala, Engine3Condition.scala, Engine4Condition.scala, Confirmation.scala, PropulsionCause.scala, OperatorEvent.scala, PriorityDirective.scala, ReleaseFeedback.scala, RequestPhase.scala, FaultState.scala, EquipmentCause.scala, RecoveryPhase.scala, RecoveryGate.scala, CarriedPriority.scala, SortieDirective.scala, EligibilityReason.scala, StatusRequestPhase.scala, StatusFaultState.scala, StatusRecoveryPhase.scala, StatusDecision.scala, LimitingCause.scala, EnergyEvidence.scala, EnergyAssessment.scala, NavigationEvidenceRecord.scala, NavigationAssessment.scala, EquipmentEvidence.scala, SingleEquipmentAssessment.scala, PropulsionEvidence.scala, PropulsionAssessment.scala, FaultSummary.scala, RecoveryFacts.scala, EligibilityDecision.scala, EligibilityStatus.scala, Base_Types.scala, EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Containers.scala, NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_Containers.scala, CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_Containers.scala, ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_Containers.scala, ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_Containers.scala, PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_Containers.scala, RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_Containers.scala, FaultRegistry_eligibility_supervisor_process_fault_registry_Containers.scala, PriorityArbiter_eligibility_supervisor_process_priority_arbiter_Containers.scala, RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_Containers.scala, EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_Containers.scala, PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_Containers.scala, StatusComposer_eligibility_supervisor_process_status_composer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Observation_Sortie_Eligibility_SupervisorEnergyQuality_Payload: Z = -32

    val Observation_Sortie_Eligibility_SupervisorValidity_Payload: Z = -31

    val Observation_Sortie_Eligibility_SupervisorFreshness_Payload: Z = -30

    val Observation_Sortie_Eligibility_SupervisorEnergyCause_Payload: Z = -29

    val Observation_Sortie_Eligibility_SupervisorGpsCondition_Payload: Z = -28

    val Observation_Sortie_Eligibility_SupervisorInertialCondition_Payload: Z = -27

    val Observation_Sortie_Eligibility_SupervisorBarometricCondition_Payload: Z = -26

    val Observation_Sortie_Eligibility_SupervisorNavigationCause_Payload: Z = -25

    val Observation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload: Z = -24

    val Observation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload: Z = -23

    val Observation_Sortie_Eligibility_SupervisorEngine1Condition_Payload: Z = -22

    val Observation_Sortie_Eligibility_SupervisorEngine2Condition_Payload: Z = -21

    val Observation_Sortie_Eligibility_SupervisorEngine3Condition_Payload: Z = -20

    val Observation_Sortie_Eligibility_SupervisorEngine4Condition_Payload: Z = -19

    val Observation_Sortie_Eligibility_SupervisorConfirmation_Payload: Z = -18

    val Observation_Sortie_Eligibility_SupervisorPropulsionCause_Payload: Z = -17

    val Observation_Sortie_Eligibility_SupervisorOperatorEvent_Payload: Z = -16

    val Observation_Sortie_Eligibility_SupervisorPriorityDirective_Payload: Z = -15

    val Observation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload: Z = -14

    val Observation_Sortie_Eligibility_SupervisorRequestPhase_Payload: Z = -13

    val Observation_Sortie_Eligibility_SupervisorFaultState_Payload: Z = -12

    val Observation_Sortie_Eligibility_SupervisorEquipmentCause_Payload: Z = -11

    val Observation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload: Z = -10

    val Observation_Sortie_Eligibility_SupervisorRecoveryGate_Payload: Z = -9

    val Observation_Sortie_Eligibility_SupervisorCarriedPriority_Payload: Z = -8

    val Observation_Sortie_Eligibility_SupervisorSortieDirective_Payload: Z = -7

    val Observation_Sortie_Eligibility_SupervisorEligibilityReason_Payload: Z = -6

    val Observation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload: Z = -5

    val Observation_Sortie_Eligibility_SupervisorStatusFaultState_Payload: Z = -4

    val Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload: Z = -3

    val Observation_Sortie_Eligibility_SupervisorStatusDecision_Payload: Z = -2

    val Observation_Sortie_Eligibility_SupervisorLimitingCause_Payload: Z = -1

    val Observation_Sortie_Eligibility_SupervisorEnergyEvidence: Z = 0

    val Observation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload: Z = 1

    val Observation_Sortie_Eligibility_SupervisorEnergyAssessment: Z = 2

    val Observation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload: Z = 3

    val Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord: Z = 4

    val Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload: Z = 5

    val Observation_Sortie_Eligibility_SupervisorNavigationAssessment: Z = 6

    val Observation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload: Z = 7

    val Observation_Sortie_Eligibility_SupervisorEquipmentEvidence: Z = 8

    val Observation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload: Z = 9

    val Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment: Z = 10

    val Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload: Z = 11

    val Observation_Sortie_Eligibility_SupervisorPropulsionEvidence: Z = 12

    val Observation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload: Z = 13

    val Observation_Sortie_Eligibility_SupervisorPropulsionAssessment: Z = 14

    val Observation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload: Z = 15

    val Observation_Sortie_Eligibility_SupervisorFaultSummary: Z = 16

    val Observation_Sortie_Eligibility_SupervisorFaultSummary_Payload: Z = 17

    val Observation_Sortie_Eligibility_SupervisorRecoveryFacts: Z = 18

    val Observation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload: Z = 19

    val Observation_Sortie_Eligibility_SupervisorEligibilityDecision: Z = 20

    val Observation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload: Z = 21

    val Observation_Sortie_Eligibility_SupervisorEligibilityStatus: Z = 22

    val Observation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload: Z = 23

    val Base_TypesBoolean_Payload: Z = 24

    val Base_TypesInteger_Payload: Z = 25

    val Base_TypesInteger_8_Payload: Z = 26

    val Base_TypesInteger_16_Payload: Z = 27

    val Base_TypesInteger_32_Payload: Z = 28

    val Base_TypesInteger_64_Payload: Z = 29

    val Base_TypesUnsigned_8_Payload: Z = 30

    val Base_TypesUnsigned_16_Payload: Z = 31

    val Base_TypesUnsigned_32_Payload: Z = 32

    val Base_TypesUnsigned_64_Payload: Z = 33

    val Base_TypesFloat_Payload: Z = 34

    val Base_TypesFloat_32_Payload: Z = 35

    val Base_TypesFloat_64_Payload: Z = 36

    val Base_TypesCharacter_Payload: Z = 37

    val Base_TypesString_Payload: Z = 38

    val Base_TypesBits_Payload: Z = 39

    val Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P: Z = 40

    val Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS: Z = 41

    val Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P: Z = 42

    val Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS: Z = 43

    val Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P: Z = 44

    val Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS: Z = 45

    val Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P: Z = 46

    val Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS: Z = 47

    val Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P: Z = 48

    val Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS: Z = 49

    val Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P: Z = 50

    val Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS: Z = 51

    val Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P: Z = 52

    val Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS: Z = 53

    val Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P: Z = 54

    val Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS: Z = 55

    val Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P: Z = 56

    val Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS: Z = 57

    val Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P: Z = 58

    val Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS: Z = 59

    val Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P: Z = 60

    val Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS: Z = 61

    val Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P: Z = 62

    val Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS: Z = 63

    val Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P: Z = 64

    val Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS: Z = 65

    val Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P: Z = 66

    val Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS: Z = 67

    val Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P: Z = 68

    val Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS: Z = 69

    val Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P: Z = 70

    val Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS: Z = 71

    val Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P: Z = 72

    val Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS: Z = 73

    val Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P: Z = 74

    val Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS: Z = 75

    val Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P: Z = 76

    val Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS: Z = 77

    val Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P: Z = 78

    val Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS: Z = 79

    val Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P: Z = 80

    val Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS: Z = 81

    val Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P: Z = 82

    val Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS: Z = 83

    val Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P: Z = 84

    val Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS: Z = 85

    val Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P: Z = 86

    val Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS: Z = 87

    val Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P: Z = 88

    val Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS: Z = 89

    val Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P: Z = 90

    val Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS: Z = 91

    val utilEmptyContainer: Z = 92

    val _artEmpty: Z = 93

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeObservation_Sortie_Eligibility_SupervisorEnergyQualityType(o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyQuality_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEnergyQualityType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorValidityType(o: Observation_Sortie_Eligibility_Supervisor.Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorValidity_Payload(o: Observation_Sortie_Eligibility_Supervisor.Validity_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorValidity_Payload)
      writeObservation_Sortie_Eligibility_SupervisorValidityType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFreshnessType(o: Observation_Sortie_Eligibility_Supervisor.Freshness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFreshness_Payload)
      writeObservation_Sortie_Eligibility_SupervisorFreshnessType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyCauseType(o: Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyCause_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEnergyCauseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorGpsConditionType(o: Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorGpsCondition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorGpsConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorInertialConditionType(o: Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorInertialCondition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorInertialConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorBarometricConditionType(o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorBarometricCondition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorBarometricConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationCauseType(o: Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationCause_Payload)
      writeObservation_Sortie_Eligibility_SupervisorNavigationCauseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine1Condition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine2Condition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine3Condition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine4Condition_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorConfirmationType(o: Observation_Sortie_Eligibility_Supervisor.Confirmation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorConfirmation_Payload)
      writeObservation_Sortie_Eligibility_SupervisorConfirmationType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionCause_Payload)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorOperatorEvent_Payload)
      writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityDirective_Payload)
      writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload)
      writeObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestPhase_Payload)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultStateType(o: Observation_Sortie_Eligibility_Supervisor.FaultState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultState_Payload)
      writeObservation_Sortie_Eligibility_SupervisorFaultStateType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentCause_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryGateType(o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryGate_Payload)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryGateType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorCarriedPriority_Payload)
      writeObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o: Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorSortieDirective_Payload)
      writeObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityReason_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload)
      writeObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusFaultState_Payload)
      writeObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload)
      writeObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusDecisionType(o: Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusDecision_Payload)
      writeObservation_Sortie_Eligibility_SupervisorStatusDecisionType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorLimitingCauseType(o: Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorLimitingCause_Payload)
      writeObservation_Sortie_Eligibility_SupervisorLimitingCauseType(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidence)
      writeObservation_Sortie_Eligibility_SupervisorEnergyQualityType(o.quality)
      writeObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)
      writeObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyAssessment)
      writer.writeB(o.ready)
      writeObservation_Sortie_Eligibility_SupervisorEnergyCauseType(o.localCause)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord)
      writeObservation_Sortie_Eligibility_SupervisorGpsConditionType(o.gpsCondition)
      writeObservation_Sortie_Eligibility_SupervisorInertialConditionType(o.inertial)
      writeObservation_Sortie_Eligibility_SupervisorBarometricConditionType(o.barometric)
      writeObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)
      writeObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload)
      writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationAssessment)
      writer.writeB(o.ready)
      writeObservation_Sortie_Eligibility_SupervisorNavigationCauseType(o.localCause)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload)
      writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentEvidence)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(o.condition)
      writeObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)
      writeObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment)
      writer.writeB(o.ready)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(o.localCause)
    }

    def writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidence)
      writeObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(o.engine1)
      writeObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(o.engine2)
      writeObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(o.engine3)
      writeObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(o.engine4)
      writeObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)
      writeObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness)
      writeObservation_Sortie_Eligibility_SupervisorConfirmationType(o.alternatingKindsConfirmed)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionAssessment)
      writer.writeB(o.ready)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(o.localCause)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultSummary)
      writeObservation_Sortie_Eligibility_SupervisorFaultStateType(o.faultState)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(o.primaryCause)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultSummary_Payload)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryFacts)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.phase)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryGateType(o.gate)
      writeObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(o.carriedPriority)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecision)
      writeObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.directive)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(o.reason)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.value)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityStatus)
      writeObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(o.requestPhase)
      writeObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(o.faultState)
      writeObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(o.recoveryPhase)
      writeObservation_Sortie_Eligibility_SupervisorStatusDecisionType(o.decisionDirective)
      writeObservation_Sortie_Eligibility_SupervisorLimitingCauseType(o.limitingCause)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o.value)
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

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o.api_energy_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o.api_energy_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o.api_navigation_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o.api_navigation_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_communication_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_communication_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_observation_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_observation_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_obstacle_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_obstacle_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o.api_propulsion_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o.api_propulsion_evidence)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_operator_event)
      writeObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_operator_event)
      writeObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)
      writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)
      writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)
      writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)
      writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)
      writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)
      writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)
      writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)
      writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)
      writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)
      writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)
    }

    def writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback)
      writeObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.api_sortie_directive)
    }

    def writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback)
      writeObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.api_sortie_directive)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)
      writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)
      writeObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase)
      writeObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container): Unit = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
      }
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o.api_eligibility_status)
    }

    def writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS)
      writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o.api_eligibility_status)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
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
        case o: Observation_Sortie_Eligibility_Supervisor.Validity_Payload => writeObservation_Sortie_Eligibility_SupervisorValidity_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload => writeObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload => writeObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload => writeObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload => writeObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload => writeObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload => writeObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload => writeObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload => writeObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload => writeObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload => writeObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload => writeObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload => writeObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload => writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload => writeObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload => writeObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload => writeObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload => writeObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload => writeObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload => writeObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload => writeObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload => writeObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload => writeObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload => writeObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload => writeObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload => writeObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload => writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload => writeObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload => writeObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload => writeObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload => writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload => writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload => writeObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload => writeObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload => writeObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload => writeObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload => writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload => writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload => writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload => writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
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

    def readObservation_Sortie_Eligibility_SupervisorEnergyQualityType(): Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.EnergyQuality.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyQuality_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyQuality_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyQuality_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEnergyQualityType()
      return Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorValidityType(): Observation_Sortie_Eligibility_Supervisor.Validity.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.Validity.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorValidity_Payload(): Observation_Sortie_Eligibility_Supervisor.Validity_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorValidity_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorValidity_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorValidity_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorValidityType()
      return Observation_Sortie_Eligibility_Supervisor.Validity_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorFreshnessType(): Observation_Sortie_Eligibility_Supervisor.Freshness.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.Freshness.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorFreshness_Payload(): Observation_Sortie_Eligibility_Supervisor.Freshness_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorFreshness_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFreshness_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Freshness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFreshness_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorFreshnessType()
      return Observation_Sortie_Eligibility_Supervisor.Freshness_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyCauseType(): Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.EnergyCause.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyCause_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyCause_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEnergyCauseType()
      return Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorGpsConditionType(): Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.GpsCondition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorGpsCondition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorGpsCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorGpsCondition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorGpsConditionType()
      return Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorInertialConditionType(): Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.InertialCondition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorInertialCondition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorInertialCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorInertialCondition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorInertialConditionType()
      return Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorBarometricConditionType(): Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.BarometricCondition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorBarometricCondition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorBarometricCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorBarometricCondition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorBarometricConditionType()
      return Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationCauseType(): Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.NavigationCause.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(): Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationCause_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationCause_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorNavigationCauseType()
      return Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEquipmentCondition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEquipmentConditionType()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType()
      return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.Engine1Condition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEngine1Condition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine1Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine1Condition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEngine1ConditionType()
      return Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.Engine2Condition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEngine2Condition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine2Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine2Condition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEngine2ConditionType()
      return Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.Engine3Condition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEngine3Condition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine3Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine3Condition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEngine3ConditionType()
      return Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.Engine4Condition.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEngine4Condition_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEngine4Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEngine4Condition_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEngine4ConditionType()
      return Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorConfirmationType(): Observation_Sortie_Eligibility_Supervisor.Confirmation.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.Confirmation.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(): Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorConfirmation_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorConfirmation_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorConfirmation_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorConfirmationType()
      return Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(): Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionCause.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(): Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionCause_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionCause_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorPropulsionCauseType()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorOperatorEventType(): Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.OperatorEvent.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(): Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorOperatorEvent_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorOperatorEvent_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorOperatorEvent_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      return Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(): Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.PriorityDirective.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(): Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorPriorityDirective_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityDirective_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityDirective_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      return Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorReleaseFeedback_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorReleaseFeedback_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      return Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestPhaseType(): Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.RequestPhase.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorRequestPhase_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestPhase_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultStateType(): Observation_Sortie_Eligibility_Supervisor.FaultState.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.FaultState.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultState_Payload(): Observation_Sortie_Eligibility_Supervisor.FaultState_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorFaultState_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultState_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultState_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorFaultStateType()
      return Observation_Sortie_Eligibility_Supervisor.FaultState_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(): Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentCause.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(): Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEquipmentCause_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentCause_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEquipmentCauseType()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryGateType(): Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryGate.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(): Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryGate_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryGate_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryGate_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorRecoveryGateType()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(): Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.CarriedPriority.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(): Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorCarriedPriority_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorCarriedPriority_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorCarriedPriority_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorCarriedPriorityType()
      return Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(): Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.SortieDirective.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(): Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorSortieDirective_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorSortieDirective_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorSortieDirective_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      return Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(): Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityReason.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(): Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityReason_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityReason_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityReason_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEligibilityReasonType()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(): Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.StatusFaultState.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusFaultState_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusFaultState_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusFaultState_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorStatusFaultStateType()
      return Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusDecisionType(): Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.StatusDecision.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusDecision_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusDecision_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusDecision_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorStatusDecisionType()
      return Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorLimitingCauseType(): Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type = {
      val r = reader.readZ()
      return Observation_Sortie_Eligibility_Supervisor.LimitingCause.byOrdinal(r).get
    }

    def readObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(): Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorLimitingCause_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorLimitingCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorLimitingCause_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorLimitingCauseType()
      return Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidence(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidence)
      }
      val quality = readObservation_Sortie_Eligibility_SupervisorEnergyQualityType()
      val validity = readObservation_Sortie_Eligibility_SupervisorValidityType()
      val freshness = readObservation_Sortie_Eligibility_SupervisorFreshnessType()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidence(quality, validity, freshness)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidence_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidence_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyAssessment(): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyAssessmentT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyAssessment)
      }
      val ready = reader.readB()
      val localCause = readObservation_Sortie_Eligibility_SupervisorEnergyCauseType()
      return Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready, localCause)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      return Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecordT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecordT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord)
      }
      val gpsCondition = readObservation_Sortie_Eligibility_SupervisorGpsConditionType()
      val inertial = readObservation_Sortie_Eligibility_SupervisorInertialConditionType()
      val barometric = readObservation_Sortie_Eligibility_SupervisorBarometricConditionType()
      val validity = readObservation_Sortie_Eligibility_SupervisorValidityType()
      val freshness = readObservation_Sortie_Eligibility_SupervisorFreshnessType()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord(gpsCondition, inertial, barometric, validity, freshness)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationAssessment(): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationAssessmentT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationAssessment)
      }
      val ready = reader.readB()
      val localCause = readObservation_Sortie_Eligibility_SupervisorNavigationCauseType()
      return Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(ready, localCause)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      return Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence = {
      val r = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidenceT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentEvidenceT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentEvidence)
      }
      val condition = readObservation_Sortie_Eligibility_SupervisorEquipmentConditionType()
      val validity = readObservation_Sortie_Eligibility_SupervisorValidityType()
      val freshness = readObservation_Sortie_Eligibility_SupervisorFreshnessType()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence(condition, validity, freshness)
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = {
      val r = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessmentT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment)
      }
      val ready = reader.readB()
      val localCause = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType()
      return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(ready, localCause)
    }

    def readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidence)
      }
      val engine1 = readObservation_Sortie_Eligibility_SupervisorEngine1ConditionType()
      val engine2 = readObservation_Sortie_Eligibility_SupervisorEngine2ConditionType()
      val engine3 = readObservation_Sortie_Eligibility_SupervisorEngine3ConditionType()
      val engine4 = readObservation_Sortie_Eligibility_SupervisorEngine4ConditionType()
      val validity = readObservation_Sortie_Eligibility_SupervisorValidityType()
      val freshness = readObservation_Sortie_Eligibility_SupervisorFreshnessType()
      val alternatingKindsConfirmed = readObservation_Sortie_Eligibility_SupervisorConfirmationType()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence(engine1, engine2, engine3, engine4, validity, freshness, alternatingKindsConfirmed)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessmentT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionAssessment)
      }
      val ready = reader.readB()
      val localCause = readObservation_Sortie_Eligibility_SupervisorPropulsionCauseType()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(ready, localCause)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultSummary(): Observation_Sortie_Eligibility_Supervisor.FaultSummary = {
      val r = readObservation_Sortie_Eligibility_SupervisorFaultSummaryT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultSummaryT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultSummary = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultSummary)
      }
      val faultState = readObservation_Sortie_Eligibility_SupervisorFaultStateType()
      val primaryCause = readObservation_Sortie_Eligibility_SupervisorEquipmentCauseType()
      return Observation_Sortie_Eligibility_Supervisor.FaultSummary(faultState, primaryCause)
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(): Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorFaultSummary_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultSummary_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultSummary_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryFacts(): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryFactsT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryFactsT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryFacts)
      }
      val phase = readObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      val gate = readObservation_Sortie_Eligibility_SupervisorRecoveryGateType()
      val carriedPriority = readObservation_Sortie_Eligibility_SupervisorCarriedPriorityType()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryFacts(phase, gate, carriedPriority)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryFacts_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryFacts_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecision(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecision)
      }
      val directive = readObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      val reason = readObservation_Sortie_Eligibility_SupervisorEligibilityReasonType()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(directive, reason)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecision_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload(value)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityStatus(): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityStatusT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityStatusT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityStatus)
      }
      val requestPhase = readObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType()
      val faultState = readObservation_Sortie_Eligibility_SupervisorStatusFaultStateType()
      val recoveryPhase = readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType()
      val decisionDirective = readObservation_Sortie_Eligibility_SupervisorStatusDecisionType()
      val limitingCause = readObservation_Sortie_Eligibility_SupervisorLimitingCauseType()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityStatus(requestPhase, faultState, recoveryPhase, decisionDirective, limitingCause)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityStatus_PayloadT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityStatus_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload)
      }
      val value = readObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload(value)
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

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P)
      }
      val api_energy_evidence = readObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(api_energy_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS)
      }
      val api_energy_evidence = readObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(api_energy_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P)
      }
      val api_energy_assessment = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(api_energy_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS)
      }
      val api_energy_assessment = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(api_energy_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P)
      }
      val api_navigation_evidence = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(api_navigation_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS)
      }
      val api_navigation_evidence = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(api_navigation_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P)
      }
      val api_navigation_assessment = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(api_navigation_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS)
      }
      val api_navigation_assessment = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(api_navigation_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P)
      }
      val api_communication_evidence = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(api_communication_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS)
      }
      val api_communication_evidence = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(api_communication_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P)
      }
      val api_communication_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(api_communication_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS)
      }
      val api_communication_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(api_communication_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P)
      }
      val api_observation_evidence = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(api_observation_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS)
      }
      val api_observation_evidence = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(api_observation_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P)
      }
      val api_observation_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(api_observation_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS)
      }
      val api_observation_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(api_observation_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P)
      }
      val api_obstacle_evidence = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(api_obstacle_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS)
      }
      val api_obstacle_evidence = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(api_obstacle_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P)
      }
      val api_obstacle_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(api_obstacle_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS)
      }
      val api_obstacle_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(api_obstacle_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P)
      }
      val api_propulsion_evidence = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(api_propulsion_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS)
      }
      val api_propulsion_evidence = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(api_propulsion_evidence)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P)
      }
      val api_propulsion_assessment = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(api_propulsion_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS)
      }
      val api_propulsion_assessment = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(api_propulsion_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P)
      }
      val api_accepted_directive = readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      val api_operator_event = readObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      val api_release_feedback = readObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(api_accepted_directive, api_operator_event, api_release_feedback)
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS)
      }
      val api_accepted_directive = readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      val api_operator_event = readObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      val api_release_feedback = readObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(api_accepted_directive, api_operator_event, api_release_feedback)
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P)
      }
      val api_candidate_event = readObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(api_candidate_event, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS)
      }
      val api_candidate_event = readObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(api_candidate_event, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P)
      }
      val api_communication_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_energy_assessment = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      val api_navigation_assessment = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      val api_observation_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_obstacle_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_propulsion_assessment = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS)
      }
      val api_communication_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_energy_assessment = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      val api_navigation_assessment = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      val api_observation_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_obstacle_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_propulsion_assessment = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment)
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P)
      }
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(api_fault_summary)
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS)
      }
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(api_fault_summary)
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P)
      }
      val api_candidate_event = readObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(api_candidate_event, api_fault_summary)
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS)
      }
      val api_candidate_event = readObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(api_candidate_event, api_fault_summary)
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P)
      }
      val api_accepted_directive = readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(api_accepted_directive)
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS)
      }
      val api_accepted_directive = readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(api_accepted_directive)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P)
      }
      val api_accepted_directive = readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(api_accepted_directive, api_fault_summary)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS)
      }
      val api_accepted_directive = readObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(api_accepted_directive, api_fault_summary)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P)
      }
      val api_recovery_facts = readObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      val api_recovery_phase = readObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(api_recovery_facts, api_recovery_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS)
      }
      val api_recovery_facts = readObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      val api_recovery_phase = readObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(api_recovery_facts, api_recovery_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P)
      }
      val api_communication_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_energy_assessment = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      val api_navigation_assessment = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      val api_observation_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_obstacle_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_propulsion_assessment = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      val api_recovery_facts = readObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment, api_recovery_facts, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS)
      }
      val api_communication_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_energy_assessment = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      val api_navigation_assessment = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      val api_observation_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_obstacle_assessment = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      val api_propulsion_assessment = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      val api_recovery_facts = readObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment, api_recovery_facts, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P)
      }
      val api_eligibility_decision = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(api_eligibility_decision)
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS)
      }
      val api_eligibility_decision = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(api_eligibility_decision)
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P)
      }
      val api_eligibility_decision = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(api_eligibility_decision, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS)
      }
      val api_eligibility_decision = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(api_eligibility_decision, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P)
      }
      val api_release_feedback = readObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      val api_sortie_directive = readObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(api_release_feedback, api_sortie_directive)
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS)
      }
      val api_release_feedback = readObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      val api_sortie_directive = readObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(api_release_feedback, api_sortie_directive)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P)
      }
      val api_eligibility_decision = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      val api_recovery_phase = readObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(api_eligibility_decision, api_fault_summary, api_recovery_phase, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS)
      }
      val api_eligibility_decision = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      val api_fault_summary = readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      val api_recovery_phase = readObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      val api_request_phase = readObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(api_eligibility_decision, api_fault_summary, api_recovery_phase, api_request_phase)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T)
          return r
      }
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P)
      }
      val api_eligibility_status = readObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(api_eligibility_status)
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS = {
      val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(F)
      return r
    }

    def readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS)
      }
      val api_eligibility_status = readObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(api_eligibility_status)
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
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T)
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
        case Constants.Observation_Sortie_Eligibility_SupervisorValidity_Payload => val r = readObservation_Sortie_Eligibility_SupervisorValidity_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFreshness_Payload => val r = readObservation_Sortie_Eligibility_SupervisorFreshness_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultState_Payload => val r = readObservation_Sortie_Eligibility_SupervisorFaultState_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyCause_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEnergyCause_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryGate_Payload => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryGate_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestPhase_Payload => val r = readObservation_Sortie_Eligibility_SupervisorRequestPhase_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorConfirmation_Payload => val r = readObservation_Sortie_Eligibility_SupervisorConfirmation_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorGpsCondition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorGpsCondition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultSummary_Payload => val r = readObservation_Sortie_Eligibility_SupervisorFaultSummary_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryPhase_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyQuality_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEnergyQuality_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorOperatorEvent_Payload => val r = readObservation_Sortie_Eligibility_SupervisorOperatorEvent_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorLimitingCause_Payload => val r = readObservation_Sortie_Eligibility_SupervisorLimitingCause_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryFacts_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusDecision_Payload => val r = readObservation_Sortie_Eligibility_SupervisorStatusDecision_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEquipmentCause_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEquipmentCause_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidence_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorSortieDirective_Payload => val r = readObservation_Sortie_Eligibility_SupervisorSortieDirective_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload => val r = readObservation_Sortie_Eligibility_SupervisorReleaseFeedback_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCarriedPriority_Payload => val r = readObservation_Sortie_Eligibility_SupervisorCarriedPriority_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationCause_Payload => val r = readObservation_Sortie_Eligibility_SupervisorNavigationCause_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionCause_Payload => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionCause_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusFaultState_Payload => val r = readObservation_Sortie_Eligibility_SupervisorStatusFaultState_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEngine1Condition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEngine1Condition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEngine2Condition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEngine2Condition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEngine3Condition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEngine3Condition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEngine4Condition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEngine4Condition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEnergyAssessment_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityReason_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityReason_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorInertialCondition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorInertialCondition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityDirective_Payload => val r = readObservation_Sortie_Eligibility_SupervisorPriorityDirective_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityStatus_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload => val r = readObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEquipmentCondition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload => val r = readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorBarometricCondition_Payload => val r = readObservation_Sortie_Eligibility_SupervisorBarometricCondition_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecision_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload => val r = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload => val r = readObservation_Sortie_Eligibility_SupervisorNavigationAssessment_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload => val r = readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_PayloadT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(T); return r
        case Constants.Observation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T)
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

  def fromObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorValidity_Payload(o: Observation_Sortie_Eligibility_Supervisor.Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorValidity_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorValidity_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.Validity_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorValidity_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.Validity_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorValidity_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorValidity_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFreshness_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.Freshness_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFreshness_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.Freshness_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFreshness_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFreshness_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorConfirmation_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorConfirmation_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultState_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultState_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultState_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultState_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultState_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultState_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidence(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidence(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidence _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyAssessment(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyAssessment(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationAssessment(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationAssessment(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(reader: Reader): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultSummary(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultSummary(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultSummary(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultSummary, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultSummary(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultSummary = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultSummary _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryFacts(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryFacts, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryFacts(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryFacts _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecision(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecision(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecision _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityStatus(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityStatus, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityStatus(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityStatus _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload _)
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

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
    return w.result
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(data: ISZ[U8]): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(reader: Reader): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS = {
      val r = reader.readObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS()
      return r
    }
    val r = to(data, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS _)
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