// #Sireum
// @formatter:off

// This file is auto-generated from Validity.scala, Arrival.scala, EnableChoice.scala, FilterPolicy.scala, HumidityPolicy.scala, RoutineAirflow.scala, CandidateClass.scala, AirCondition.scala, AirEvidence.scala, HumidityCondition.scala, HumidityEvidence.scala, PathGrant.scala, PathDisposition.scala, BlowerReadiness.scala, FilterUnitReadiness.scala, HumidifierReadiness.scala, DehumidifierReadiness.scala, FilterBranchBlowerDisposition.scala, FilterBranchPathDisposition.scala, HumidityBranchBlowerDisposition.scala, HumidityBranchHumidifierDisposition.scala, HumidityBranchDehumidifierDisposition.scala, RoutineBranchBlowerDisposition.scala, ComposerBlowerDisposition.scala, ComposerFilterDisposition.scala, ComposerHumidifierDisposition.scala, ComposerDehumidifierDisposition.scala, TrustState.scala, AirRecoveryEvent.scala, HumidityRecoveryEvent.scala, PreferenceEvent.scala, FilterProposal.scala, StatusCause.scala, HumidityProposal.scala, RoutineProposal.scala, SelectedIntent.scala, FlowClass.scala, TreatmentAction.scala, AuthorityUse.scala, SupervisorMode.scala, UserAirPreference.scala, QualifiedPreferenceCandidate.scala, AirQualityObservation.scala, HumidityObservation.scala, SharedAirPathAuthority.scala, AirTreatmentReadiness.scala, FilterCapabilityFacts.scala, HumidityCapabilityFacts.scala, BlowerCapabilityFact.scala, CapabilitySet.scala, AirRecoveryReport.scala, HumidityRecoveryReport.scala, AcceptedPreference.scala, FilterProposalReport.scala, HumidityProposalReport.scala, RoutineProposalReport.scala, SelectionReport.scala, CompositionReport.scala, CabinAirTreatmentPlan.scala, CabinAirSupervisorStatus.scala, Base_Types.scala, PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_Containers.scala, AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_Containers.scala, HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_Containers.scala, SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_Containers.scala, TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_Containers.scala, AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_Containers.scala, HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_Containers.scala, PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_Containers.scala, FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_Containers.scala, HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_Containers.scala, RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_Containers.scala, CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_Containers.scala, AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_Containers.scala, StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package cabin_air_quality_humidity_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Cabin_Air_Quality_Humidity_SupervisorValidity_Payload: Z = -32

    val Cabin_Air_Quality_Humidity_SupervisorArrival_Payload: Z = -31

    val Cabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload: Z = -30

    val Cabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload: Z = -29

    val Cabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload: Z = -28

    val Cabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload: Z = -27

    val Cabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload: Z = -26

    val Cabin_Air_Quality_Humidity_SupervisorAirCondition_Payload: Z = -25

    val Cabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload: Z = -24

    val Cabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload: Z = -23

    val Cabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload: Z = -22

    val Cabin_Air_Quality_Humidity_SupervisorPathGrant_Payload: Z = -21

    val Cabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload: Z = -20

    val Cabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload: Z = -19

    val Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload: Z = -18

    val Cabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload: Z = -17

    val Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload: Z = -16

    val Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload: Z = -15

    val Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload: Z = -14

    val Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload: Z = -13

    val Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload: Z = -12

    val Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload: Z = -11

    val Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload: Z = -10

    val Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload: Z = -9

    val Cabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload: Z = -8

    val Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload: Z = -7

    val Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload: Z = -6

    val Cabin_Air_Quality_Humidity_SupervisorTrustState_Payload: Z = -5

    val Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload: Z = -4

    val Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload: Z = -3

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload: Z = -2

    val Cabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload: Z = -1

    val Cabin_Air_Quality_Humidity_SupervisorStatusCause_Payload: Z = 0

    val Cabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload: Z = 1

    val Cabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload: Z = 2

    val Cabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload: Z = 3

    val Cabin_Air_Quality_Humidity_SupervisorFlowClass_Payload: Z = 4

    val Cabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload: Z = 5

    val Cabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload: Z = 6

    val Cabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload: Z = 7

    val Cabin_Air_Quality_Humidity_SupervisorUserAirPreference: Z = 8

    val Cabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload: Z = 9

    val Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate: Z = 10

    val Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload: Z = 11

    val Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation: Z = 12

    val Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload: Z = 13

    val Cabin_Air_Quality_Humidity_SupervisorHumidityObservation: Z = 14

    val Cabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload: Z = 15

    val Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority: Z = 16

    val Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload: Z = 17

    val Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness: Z = 18

    val Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload: Z = 19

    val Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts: Z = 20

    val Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload: Z = 21

    val Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts: Z = 22

    val Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload: Z = 23

    val Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact: Z = 24

    val Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload: Z = 25

    val Cabin_Air_Quality_Humidity_SupervisorCapabilitySet: Z = 26

    val Cabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload: Z = 27

    val Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport: Z = 28

    val Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload: Z = 29

    val Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport: Z = 30

    val Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload: Z = 31

    val Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference: Z = 32

    val Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload: Z = 33

    val Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport: Z = 34

    val Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload: Z = 35

    val Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport: Z = 36

    val Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload: Z = 37

    val Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport: Z = 38

    val Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload: Z = 39

    val Cabin_Air_Quality_Humidity_SupervisorSelectionReport: Z = 40

    val Cabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload: Z = 41

    val Cabin_Air_Quality_Humidity_SupervisorCompositionReport: Z = 42

    val Cabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload: Z = 43

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan: Z = 44

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload: Z = 45

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus: Z = 46

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload: Z = 47

    val Base_TypesBoolean_Payload: Z = 48

    val Base_TypesInteger_Payload: Z = 49

    val Base_TypesInteger_8_Payload: Z = 50

    val Base_TypesInteger_16_Payload: Z = 51

    val Base_TypesInteger_32_Payload: Z = 52

    val Base_TypesInteger_64_Payload: Z = 53

    val Base_TypesUnsigned_8_Payload: Z = 54

    val Base_TypesUnsigned_16_Payload: Z = 55

    val Base_TypesUnsigned_32_Payload: Z = 56

    val Base_TypesUnsigned_64_Payload: Z = 57

    val Base_TypesFloat_Payload: Z = 58

    val Base_TypesFloat_32_Payload: Z = 59

    val Base_TypesFloat_64_Payload: Z = 60

    val Base_TypesCharacter_Payload: Z = 61

    val Base_TypesString_Payload: Z = 62

    val Base_TypesBits_Payload: Z = 63

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P: Z = 64

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS: Z = 65

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P: Z = 66

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS: Z = 67

    val Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P: Z = 68

    val Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS: Z = 69

    val Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P: Z = 70

    val Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS: Z = 71

    val Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P: Z = 72

    val Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS: Z = 73

    val Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P: Z = 74

    val Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS: Z = 75

    val Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P: Z = 76

    val Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS: Z = 77

    val Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P: Z = 78

    val Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS: Z = 79

    val Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P: Z = 80

    val Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS: Z = 81

    val Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P: Z = 82

    val Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS: Z = 83

    val Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P: Z = 84

    val Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS: Z = 85

    val Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P: Z = 86

    val Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS: Z = 87

    val Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P: Z = 88

    val Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS: Z = 89

    val Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P: Z = 90

    val Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS: Z = 91

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P: Z = 92

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS: Z = 93

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P: Z = 94

    val Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS: Z = 95

    val Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P: Z = 96

    val Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS: Z = 97

    val Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P: Z = 98

    val Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS: Z = 99

    val Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P: Z = 100

    val Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS: Z = 101

    val Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P: Z = 102

    val Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS: Z = 103

    val Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P: Z = 104

    val Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS: Z = 105

    val Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P: Z = 106

    val Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS: Z = 107

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P: Z = 108

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS: Z = 109

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P: Z = 110

    val Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS: Z = 111

    val Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P: Z = 112

    val Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS: Z = 113

    val Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P: Z = 114

    val Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS: Z = 115

    val Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P: Z = 116

    val Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS: Z = 117

    val Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P: Z = 118

    val Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS: Z = 119

    val utilEmptyContainer: Z = 120

    val _artEmpty: Z = 121

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeCabin_Air_Quality_Humidity_SupervisorValidityType(o: Cabin_Air_Quality_Humidity_Supervisor.Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorValidity_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorValidity_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorValidityType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorArrivalType(o: Cabin_Air_Quality_Humidity_Supervisor.Arrival.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorArrival_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorArrival_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorArrivalType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorEnableChoiceType(o: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorEnableChoiceType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterPolicyType(o: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFilterPolicyType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCandidateClassType(o: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorCandidateClassType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirConditionType(o: Cabin_Air_Quality_Humidity_Supervisor.AirCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirCondition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAirConditionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityConditionType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityConditionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPathGrantType(o: Cabin_Air_Quality_Humidity_Supervisor.PathGrant.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPathGrant_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorPathGrantType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorBlowerReadinessType(o: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorBlowerReadinessType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType(o: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType(o: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTrustStateType(o: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTrustState_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTrustState_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorTrustStateType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType(o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceEventType(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorPreferenceEventType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterProposalType(o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFilterProposalType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o: Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusCause_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalType(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalType(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSelectedIntentType(o: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorSelectedIntentType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFlowClassType(o: Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFlowClass_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFlowClassType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentActionType(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorTreatmentActionType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthorityUseType(o: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAuthorityUseType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSupervisorModeType(o: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorSupervisorModeType(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference(o: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorUserAirPreference)
      writeCabin_Air_Quality_Humidity_SupervisorValidityType(o.validity)
      writeCabin_Air_Quality_Humidity_SupervisorArrivalType(o.arrival)
      writeCabin_Air_Quality_Humidity_SupervisorEnableChoiceType(o.enable)
      writeCabin_Air_Quality_Humidity_SupervisorFilterPolicyType(o.filterPolicy)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(o.humidityPolicy)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(o.routineAirflow)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate)
      writeCabin_Air_Quality_Humidity_SupervisorCandidateClassType(o.candidateClass)
      writeCabin_Air_Quality_Humidity_SupervisorEnableChoiceType(o.enable)
      writeCabin_Air_Quality_Humidity_SupervisorFilterPolicyType(o.filterPolicy)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(o.humidityPolicy)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(o.routineAirflow)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation)
      writeCabin_Air_Quality_Humidity_SupervisorValidityType(o.validity)
      writeCabin_Air_Quality_Humidity_SupervisorAirConditionType(o.condition)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityObservation)
      writeCabin_Air_Quality_Humidity_SupervisorValidityType(o.validity)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityConditionType(o.condition)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(o: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority)
      writeCabin_Air_Quality_Humidity_SupervisorValidityType(o.validity)
      writeCabin_Air_Quality_Humidity_SupervisorPathGrantType(o.grant)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(o: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness)
      writeCabin_Air_Quality_Humidity_SupervisorValidityType(o.validity)
      writeCabin_Air_Quality_Humidity_SupervisorBlowerReadinessType(o.blowerReadiness)
      writeCabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType(o.filterUnit)
      writeCabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType(o.humidifier)
      writeCabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType(o.dehumidifier)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts)
      writeCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType(o.filterBlowerDisposition)
      writeCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType(o.filterDisposition)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType(o.humidityBlowerDisposition)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType(o.humidifierDisposition)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType(o.dehumidifierDisposition)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType(o.routineBlowerDisposition)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCapabilitySet)
      writeCabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType(o.sharedBlowerDisposition)
      writeCabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType(o.sharedFilterDisposition)
      writeCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType(o.sharedHumidifierDisposition)
      writeCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType(o.sharedDehumidifierDisposition)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport)
      writeCabin_Air_Quality_Humidity_SupervisorTrustStateType(o.trust)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType(o.transitionEvent)
      writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(o.evidence)
      writer.writeB(o.gateOpen)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport)
      writeCabin_Air_Quality_Humidity_SupervisorTrustStateType(o.trust)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType(o.transitionEvent)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(o.evidence)
      writer.writeB(o.gateOpen)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference)
      writeCabin_Air_Quality_Humidity_SupervisorEnableChoiceType(o.enable)
      writeCabin_Air_Quality_Humidity_SupervisorFilterPolicyType(o.filterPolicy)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(o.humidityPolicy)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(o.routineAirflow)
      writeCabin_Air_Quality_Humidity_SupervisorPreferenceEventType(o.preferenceEvent)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport)
      writeCabin_Air_Quality_Humidity_SupervisorFilterProposalType(o.proposal)
      writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o.cause)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalType(o.proposal)
      writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o.cause)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalType(o.proposal)
      writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o.cause)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSelectionReport)
      writeCabin_Air_Quality_Humidity_SupervisorSelectedIntentType(o.intent)
      writeCabin_Air_Quality_Humidity_SupervisorFlowClassType(o.flowClass)
      writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o.cause)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCompositionReport(o: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCompositionReport)
      writeCabin_Air_Quality_Humidity_SupervisorTreatmentActionType(o.treatmentAction)
      writeCabin_Air_Quality_Humidity_SupervisorFlowClassType(o.flowClass)
      writeCabin_Air_Quality_Humidity_SupervisorAuthorityUseType(o.authorityUse)
      writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o.cause)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorCompositionReport(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan)
      writeCabin_Air_Quality_Humidity_SupervisorTreatmentActionType(o.treatmentAction)
      writeCabin_Air_Quality_Humidity_SupervisorFlowClassType(o.flowClass)
      writeCabin_Air_Quality_Humidity_SupervisorAuthorityUseType(o.authorityUse)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(o.value)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus)
      writeCabin_Air_Quality_Humidity_SupervisorSupervisorModeType(o.mode)
      writeCabin_Air_Quality_Humidity_SupervisorStatusCauseType(o.cause)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload)
      writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(o.value)
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

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference(o.api_preference)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference(o.api_preference)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o.api_candidate)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o.api_candidate)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(o.api_observation)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(o.api_observation)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation(o.api_observation)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation(o.api_observation)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(o.api_authority)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(o.api_authority)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_disposition_to_composer)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_disposition_to_routine)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_disposition_to_composer)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_disposition_to_routine)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(o.api_readiness)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(o.api_readiness)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o.api_blower_fact)
      writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o.api_capability_set)
      writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o.api_filter_facts)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o.api_humidity_facts)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o.api_blower_fact)
      writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o.api_capability_set)
      writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o.api_filter_facts)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o.api_humidity_facts)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_report_to_filter)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_report_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_report_to_filter)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_report_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(o.api_evidence)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_report_to_humidity)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_report_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_report_to_humidity)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_report_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o.api_candidate)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o.api_candidate)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_arbiter)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_filter)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_humidity)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_routine)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_arbiter)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_filter)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_humidity)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_routine)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_air_report)
      writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o.api_capabilities)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_air_report)
      writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o.api_capabilities)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o.api_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o.api_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o.api_capabilities)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_humidity_report)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o.api_capabilities)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_humidity_report)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o.api_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o.api_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o.api_capability)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_path)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o.api_capability)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_path)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o.api_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o.api_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o.api_filter_proposal)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o.api_humidity_proposal)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o.api_routine_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o.api_filter_proposal)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o.api_humidity_proposal)
      writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o.api_routine_proposal)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection_to_composer)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection_to_composer)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection_to_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o.api_capabilities)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_path)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o.api_capabilities)
      writeCabin_Air_Quality_Humidity_SupervisorPathDispositionType(o.api_path)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorCompositionReport(o.api_composition_to_status)
      writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(o.api_treatment_plan)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorCompositionReport(o.api_composition_to_status)
      writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(o.api_treatment_plan)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_air_report)
      writeCabin_Air_Quality_Humidity_SupervisorCompositionReport(o.api_composed_result)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_humidity_report)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o.api_accepted)
      writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o.api_air_report)
      writeCabin_Air_Quality_Humidity_SupervisorCompositionReport(o.api_composed_result)
      writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o.api_humidity_report)
      writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o.api_selection)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P)
      writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(o.api_supervisor_status)
    }

    def writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS)
      writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(o.api_supervisor_status)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(o)
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
        case o: Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload => writeCabin_Air_Quality_Humidity_SupervisorArrival_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload => writeCabin_Air_Quality_Humidity_SupervisorValidity_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload => writeCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload => writeCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload => writeCabin_Air_Quality_Humidity_SupervisorTrustState_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload => writeCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload => writeCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload => writeCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload => writeCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload => writeCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload => writeCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload => writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload => writeCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload => writeCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload => writeCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload => writeCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload => writeCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload => writeCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload => writeCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload => writeCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload => writeCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload => writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload => writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload => writeCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload => writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload => writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload => writeCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload => writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload => writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload => writeCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload => writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload => writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload => writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload => writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload => writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload => writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload => writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload => writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload => writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(o)
        case o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(o)
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

    def readCabin_Air_Quality_Humidity_SupervisorValidityType(): Cabin_Air_Quality_Humidity_Supervisor.Validity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.Validity.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorValidity_Payload(): Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorValidity_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorValidity_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorValidityType()
      return Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorArrivalType(): Cabin_Air_Quality_Humidity_Supervisor.Arrival.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.Arrival.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorArrival_Payload(): Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorArrival_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorArrival_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorArrival_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorArrivalType()
      return Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorEnableChoiceType(): Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(): Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorEnableChoice_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorEnableChoice_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorEnableChoiceType()
      return Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterPolicyType(): Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterPolicy_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterPolicy_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFilterPolicyType()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCandidateClassType(): Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(): Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCandidateClass_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCandidateClass_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorCandidateClassType()
      return Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirConditionType(): Cabin_Air_Quality_Humidity_Supervisor.AirCondition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.AirCondition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirCondition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirCondition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirCondition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAirConditionType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceType(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidence_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidence_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityConditionType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityCondition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityCondition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityConditionType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPathGrantType(): Cabin_Air_Quality_Humidity_Supervisor.PathGrant.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.PathGrant.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(): Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPathGrant_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPathGrant_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPathGrant_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorPathGrantType()
      return Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPathDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPathDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPathDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorBlowerReadinessType(): Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(): Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorBlowerReadinessType()
      return Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType(): Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType(): Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType(): Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(): Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType()
      return Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType(): Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(): Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorTrustStateType(): Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.TrustState.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorTrustState_Payload(): Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorTrustState_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorTrustState_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTrustState_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorTrustStateType()
      return Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType(): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceEventType(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorPreferenceEventType()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterProposalType(): Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterProposal_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterProposal_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFilterProposalType()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusCauseType(): Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.StatusCause.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(): Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorStatusCause_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusCause_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusCause_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorStatusCauseType()
      return Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalType(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposal_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposal_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineProposalType(): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineProposal_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineProposal_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalType()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSelectedIntentType(): Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(): Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSelectedIntent_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSelectedIntent_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorSelectedIntentType()
      return Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFlowClassType(): Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.FlowClass.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFlowClass_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFlowClass_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFlowClass_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFlowClassType()
      return Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentActionType(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentAction_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentAction_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorTreatmentActionType()
      return Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthorityUseType(): Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAuthorityUse_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthorityUse_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAuthorityUseType()
      return Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSupervisorModeType(): Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Type = {
      val r = reader.readZ()
      return Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.byOrdinal(r).get
    }

    def readCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(): Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSupervisorMode_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSupervisorMode_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorSupervisorModeType()
      return Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorUserAirPreference(): Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference = {
      val r = readCabin_Air_Quality_Humidity_SupervisorUserAirPreferenceT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorUserAirPreferenceT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorUserAirPreference)
      }
      val validity = readCabin_Air_Quality_Humidity_SupervisorValidityType()
      val arrival = readCabin_Air_Quality_Humidity_SupervisorArrivalType()
      val enable = readCabin_Air_Quality_Humidity_SupervisorEnableChoiceType()
      val filterPolicy = readCabin_Air_Quality_Humidity_SupervisorFilterPolicyType()
      val humidityPolicy = readCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType()
      val routineAirflow = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType()
      return Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference(validity, arrival, enable, filterPolicy, humidityPolicy, routineAirflow)
    }

    def readCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(): Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorUserAirPreference_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorUserAirPreference_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorUserAirPreference()
      return Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(): Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate = {
      val r = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidateT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidateT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate)
      }
      val candidateClass = readCabin_Air_Quality_Humidity_SupervisorCandidateClassType()
      val enable = readCabin_Air_Quality_Humidity_SupervisorEnableChoiceType()
      val filterPolicy = readCabin_Air_Quality_Humidity_SupervisorFilterPolicyType()
      val humidityPolicy = readCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType()
      val routineAirflow = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType()
      return Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate(candidateClass, enable, filterPolicy, humidityPolicy, routineAirflow)
    }

    def readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(): Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate()
      return Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityObservationT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityObservationT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation)
      }
      val validity = readCabin_Air_Quality_Humidity_SupervisorValidityType()
      val condition = readCabin_Air_Quality_Humidity_SupervisorAirConditionType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation(validity, condition)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation()
      return Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityObservation(): Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityObservationT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityObservationT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityObservation)
      }
      val validity = readCabin_Air_Quality_Humidity_SupervisorValidityType()
      val condition = readCabin_Air_Quality_Humidity_SupervisorHumidityConditionType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation(validity, condition)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityObservation_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityObservation_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityObservation()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(): Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthorityT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthorityT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority)
      }
      val validity = readCabin_Air_Quality_Humidity_SupervisorValidityType()
      val grant = readCabin_Air_Quality_Humidity_SupervisorPathGrantType()
      return Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority(validity, grant)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(): Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority()
      return Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(): Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadinessT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadinessT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness)
      }
      val validity = readCabin_Air_Quality_Humidity_SupervisorValidityType()
      val blowerReadiness = readCabin_Air_Quality_Humidity_SupervisorBlowerReadinessType()
      val filterUnit = readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType()
      val humidifier = readCabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType()
      val dehumidifier = readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness(validity, blowerReadiness, filterUnit, humidifier, dehumidifier)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness()
      return Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(): Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFactsT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFactsT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts)
      }
      val filterBlowerDisposition = readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType()
      val filterDisposition = readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts(filterBlowerDisposition, filterDisposition)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(): Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFactsT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFactsT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts)
      }
      val humidityBlowerDisposition = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType()
      val humidifierDisposition = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType()
      val dehumidifierDisposition = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts(humidityBlowerDisposition, humidifierDisposition, dehumidifierDisposition)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(): Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact = {
      val r = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFactT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFactT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact)
      }
      val routineBlowerDisposition = readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact(routineBlowerDisposition)
    }

    def readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(): Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact()
      return Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCapabilitySet(): Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCapabilitySetT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCapabilitySetT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCapabilitySet)
      }
      val sharedBlowerDisposition = readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType()
      val sharedFilterDisposition = readCabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType()
      val sharedHumidifierDisposition = readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType()
      val sharedDehumidifierDisposition = readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet(sharedBlowerDisposition, sharedFilterDisposition, sharedHumidifierDisposition, sharedDehumidifierDisposition)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(): Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCapabilitySet_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCapabilitySet_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorCapabilitySet()
      return Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReportT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReportT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport)
      }
      val trust = readCabin_Air_Quality_Humidity_SupervisorTrustStateType()
      val transitionEvent = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType()
      val evidence = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceType()
      val gateOpen = reader.readB()
      return Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport(trust, transitionEvent, evidence, gateOpen)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReportT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReportT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport)
      }
      val trust = readCabin_Air_Quality_Humidity_SupervisorTrustStateType()
      val transitionEvent = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType()
      val evidence = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType()
      val gateOpen = reader.readB()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport(trust, transitionEvent, evidence, gateOpen)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(): Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreferenceT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAcceptedPreferenceT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference)
      }
      val enable = readCabin_Air_Quality_Humidity_SupervisorEnableChoiceType()
      val filterPolicy = readCabin_Air_Quality_Humidity_SupervisorFilterPolicyType()
      val humidityPolicy = readCabin_Air_Quality_Humidity_SupervisorHumidityPolicyType()
      val routineAirflow = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowType()
      val preferenceEvent = readCabin_Air_Quality_Humidity_SupervisorPreferenceEventType()
      return Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference(enable, filterPolicy, humidityPolicy, routineAirflow, preferenceEvent)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(): Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      return Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(): Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReportT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterProposalReportT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport)
      }
      val proposal = readCabin_Air_Quality_Humidity_SupervisorFilterProposalType()
      val cause = readCabin_Air_Quality_Humidity_SupervisorStatusCauseType()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(proposal, cause)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(): Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReportT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReportT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport)
      }
      val proposal = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalType()
      val cause = readCabin_Air_Quality_Humidity_SupervisorStatusCauseType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(proposal, cause)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReportT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReportT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport)
      }
      val proposal = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalType()
      val cause = readCabin_Air_Quality_Humidity_SupervisorStatusCauseType()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(proposal, cause)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSelectionReport(): Cabin_Air_Quality_Humidity_Supervisor.SelectionReport = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSelectionReportT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSelectionReportT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SelectionReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSelectionReport)
      }
      val intent = readCabin_Air_Quality_Humidity_SupervisorSelectedIntentType()
      val flowClass = readCabin_Air_Quality_Humidity_SupervisorFlowClassType()
      val cause = readCabin_Air_Quality_Humidity_SupervisorStatusCauseType()
      return Cabin_Air_Quality_Humidity_Supervisor.SelectionReport(intent, flowClass, cause)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(): Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSelectionReport_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSelectionReport_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCompositionReport(): Cabin_Air_Quality_Humidity_Supervisor.CompositionReport = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCompositionReportT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCompositionReportT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CompositionReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCompositionReport)
      }
      val treatmentAction = readCabin_Air_Quality_Humidity_SupervisorTreatmentActionType()
      val flowClass = readCabin_Air_Quality_Humidity_SupervisorFlowClassType()
      val authorityUse = readCabin_Air_Quality_Humidity_SupervisorAuthorityUseType()
      val cause = readCabin_Air_Quality_Humidity_SupervisorStatusCauseType()
      return Cabin_Air_Quality_Humidity_Supervisor.CompositionReport(treatmentAction, flowClass, authorityUse, cause)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(): Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCompositionReport_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCompositionReport_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorCompositionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlanT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlanT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan)
      }
      val treatmentAction = readCabin_Air_Quality_Humidity_SupervisorTreatmentActionType()
      val flowClass = readCabin_Air_Quality_Humidity_SupervisorFlowClassType()
      val authorityUse = readCabin_Air_Quality_Humidity_SupervisorAuthorityUseType()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan(treatmentAction, flowClass, authorityUse)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload(value)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatusT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatusT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus)
      }
      val mode = readCabin_Air_Quality_Humidity_SupervisorSupervisorModeType()
      val cause = readCabin_Air_Quality_Humidity_SupervisorStatusCauseType()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus(mode, cause)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_PayloadT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_PayloadT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload)
      }
      val value = readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload(value)
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

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P)
      }
      val api_preference = readCabin_Air_Quality_Humidity_SupervisorUserAirPreference()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(api_preference)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS)
      }
      val api_preference = readCabin_Air_Quality_Humidity_SupervisorUserAirPreference()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(api_preference)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P)
      }
      val api_candidate = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(api_candidate)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS)
      }
      val api_candidate = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(api_candidate)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P)
      }
      val api_observation = readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation()
      return Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(api_observation)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS)
      }
      val api_observation = readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation()
      return Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(api_observation)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P)
      }
      val api_observation = readCabin_Air_Quality_Humidity_SupervisorHumidityObservation()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(api_observation)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS)
      }
      val api_observation = readCabin_Air_Quality_Humidity_SupervisorHumidityObservation()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(api_observation)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P)
      }
      val api_authority = readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority()
      return Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(api_authority)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS)
      }
      val api_authority = readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority()
      return Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(api_authority)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P)
      }
      val api_disposition_to_composer = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      val api_disposition_to_routine = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(api_disposition_to_composer, api_disposition_to_routine)
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS)
      }
      val api_disposition_to_composer = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      val api_disposition_to_routine = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(api_disposition_to_composer, api_disposition_to_routine)
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P)
      }
      val api_readiness = readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness()
      return Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(api_readiness)
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS)
      }
      val api_readiness = readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness()
      return Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(api_readiness)
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P)
      }
      val api_blower_fact = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact()
      val api_capability_set = readCabin_Air_Quality_Humidity_SupervisorCapabilitySet()
      val api_filter_facts = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts()
      val api_humidity_facts = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts()
      return Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(api_blower_fact, api_capability_set, api_filter_facts, api_humidity_facts)
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS)
      }
      val api_blower_fact = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact()
      val api_capability_set = readCabin_Air_Quality_Humidity_SupervisorCapabilitySet()
      val api_filter_facts = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts()
      val api_humidity_facts = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts()
      return Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(api_blower_fact, api_capability_set, api_filter_facts, api_humidity_facts)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P)
      }
      val api_report_to_filter = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      val api_report_to_status = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(api_report_to_filter, api_report_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS)
      }
      val api_report_to_filter = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      val api_report_to_status = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(api_report_to_filter, api_report_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS)
      }
      val api_evidence = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(api_evidence)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P)
      }
      val api_report_to_humidity = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      val api_report_to_status = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(api_report_to_humidity, api_report_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS)
      }
      val api_report_to_humidity = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      val api_report_to_status = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(api_report_to_humidity, api_report_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P)
      }
      val api_candidate = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(api_candidate)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS)
      }
      val api_candidate = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(api_candidate)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P)
      }
      val api_accepted_to_arbiter = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_filter = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_humidity = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_routine = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_status = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(api_accepted_to_arbiter, api_accepted_to_filter, api_accepted_to_humidity, api_accepted_to_routine, api_accepted_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS)
      }
      val api_accepted_to_arbiter = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_filter = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_humidity = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_routine = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_accepted_to_status = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      return Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(api_accepted_to_arbiter, api_accepted_to_filter, api_accepted_to_humidity, api_accepted_to_routine, api_accepted_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_air_report = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      val api_capabilities = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts()
      return Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(api_accepted, api_air_report, api_capabilities)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_air_report = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      val api_capabilities = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts()
      return Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(api_accepted, api_air_report, api_capabilities)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P)
      }
      val api_proposal = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(api_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS)
      }
      val api_proposal = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(api_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_capabilities = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts()
      val api_humidity_report = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(api_accepted, api_capabilities, api_humidity_report)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_capabilities = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts()
      val api_humidity_report = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(api_accepted, api_capabilities, api_humidity_report)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P)
      }
      val api_proposal = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(api_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS)
      }
      val api_proposal = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(api_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_capability = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact()
      val api_path = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(api_accepted, api_capability, api_path)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_capability = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact()
      val api_path = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(api_accepted, api_capability, api_path)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P)
      }
      val api_proposal = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(api_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS)
      }
      val api_proposal = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(api_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_filter_proposal = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport()
      val api_humidity_proposal = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport()
      val api_routine_proposal = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(api_accepted, api_filter_proposal, api_humidity_proposal, api_routine_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_filter_proposal = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport()
      val api_humidity_proposal = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport()
      val api_routine_proposal = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(api_accepted, api_filter_proposal, api_humidity_proposal, api_routine_proposal)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P)
      }
      val api_selection_to_composer = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      val api_selection_to_status = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(api_selection_to_composer, api_selection_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS)
      }
      val api_selection_to_composer = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      val api_selection_to_status = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(api_selection_to_composer, api_selection_to_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P)
      }
      val api_capabilities = readCabin_Air_Quality_Humidity_SupervisorCapabilitySet()
      val api_path = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      val api_selection = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(api_capabilities, api_path, api_selection)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS)
      }
      val api_capabilities = readCabin_Air_Quality_Humidity_SupervisorCapabilitySet()
      val api_path = readCabin_Air_Quality_Humidity_SupervisorPathDispositionType()
      val api_selection = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(api_capabilities, api_path, api_selection)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P)
      }
      val api_composition_to_status = readCabin_Air_Quality_Humidity_SupervisorCompositionReport()
      val api_treatment_plan = readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan()
      return Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(api_composition_to_status, api_treatment_plan)
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS)
      }
      val api_composition_to_status = readCabin_Air_Quality_Humidity_SupervisorCompositionReport()
      val api_treatment_plan = readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan()
      return Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(api_composition_to_status, api_treatment_plan)
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_air_report = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      val api_composed_result = readCabin_Air_Quality_Humidity_SupervisorCompositionReport()
      val api_humidity_report = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      val api_selection = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(api_accepted, api_air_report, api_composed_result, api_humidity_report, api_selection)
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS)
      }
      val api_accepted = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      val api_air_report = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      val api_composed_result = readCabin_Air_Quality_Humidity_SupervisorCompositionReport()
      val api_humidity_report = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      val api_selection = readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(api_accepted, api_air_report, api_composed_result, api_humidity_report, api_selection)
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P = {
      val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PT(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P)
      }
      val api_supervisor_status = readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus()
      return Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(api_supervisor_status)
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS = {
      val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PST(typeParsed: B): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS)
      }
      val api_supervisor_status = readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus()
      return Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(api_supervisor_status)
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
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(T)
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
        case Constants.Cabin_Air_Quality_Humidity_SupervisorArrival_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorArrival_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorValidity_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPathGrant_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorPathGrant_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFlowClass_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFlowClass_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTrustState_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorTrustState_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidence_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusCause_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorStatusCause_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorEnableChoice_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirCondition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAirCondition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAuthorityUse_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFilterPolicy_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorCapabilitySet_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFilterProposal_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorCandidateClass_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorSelectedIntent_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorSupervisorMode_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorPathDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineProposal_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentAction_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorSelectionReport_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposal_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityCondition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorCompositionReport_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorUserAirPreference_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityObservation_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_PayloadT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PST(T)
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

  def fromCabin_Air_Quality_Humidity_SupervisorValidity_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorValidity_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorValidity_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorArrival_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorArrival_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorArrival_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorArrival_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorArrival_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorArrival_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirCondition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPathGrant_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTrustState_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTrustState_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTrustState_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTrustState_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTrustState_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTrustState_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorStatusCause_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFlowClass_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorUserAirPreference(o: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorUserAirPreference(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorUserAirPreference(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorUserAirPreference()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorUserAirPreference _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityObservation(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityObservation _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityObservation(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityObservation(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityObservation(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityObservation()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityObservation _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(o: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(o: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCapabilitySet(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCapabilitySet(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCapabilitySet()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCapabilitySet _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAcceptedPreference(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAcceptedPreference _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterProposalReport(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterProposalReport _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSelectionReport(o: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSelectionReport(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSelectionReport(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SelectionReport, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSelectionReport(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SelectionReport = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSelectionReport()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSelectionReport _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCompositionReport(o: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCompositionReport(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCompositionReport(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CompositionReport, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCompositionReport(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CompositionReport = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCompositionReport()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCompositionReport _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload _)
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

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(o: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(reader: Reader): Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS = {
      val r = reader.readCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS _)
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