// #Sireum
// @formatter:off

// This file is auto-generated from AccessRequest.scala, RequestOperation.scala, Correlation.scala, VesselStatus.scala, VesselClass.scala, StationReport.scala, StationProgress.scala, ServiceActivity.scala, ServiceClass.scala, LifecycleState.scala, RequestDisposition.scala, ControlEvent.scala, BerthState.scala, GateState.scala, RecoveryState.scala, RecoveryIntent.scala, LifecycleDirective.scala, DecisionContext.scala, BerthEvidenceKind.scala, GateDirective.scala, PriorityKind.scala, SupervisoryAction.scala, DecisionCause.scala, PublicMode.scala, AccessStatus.scala, DockingOutcome.scala, RequestFacts.scala, VesselFacts.scala, StationFacts.scala, ServiceFacts.scala, AdmissionGuard.scala, PriorLifecycleView.scala, AdmissionDecision.scala, RecoveryTransition.scala, CoordinationFrame.scala, BerthTransitionEvidence.scala, GateSafetyFrame.scala, PriorityDirective.scala, DockingProposal.scala, AccessProposal.scala, UndockingProposal.scala, DockingDecisionFrame.scala, DockingAccessResult.scala, Base_Types.scala, RequestClassification_supervisor_process_request_classification_Containers.scala, VesselStatusAssessment_supervisor_process_vessel_status_assessment_Containers.scala, StationReportAssessment_supervisor_process_station_report_assessment_Containers.scala, ServiceActivityAssessment_supervisor_process_service_activity_assessment_Containers.scala, RequestAdmission_supervisor_process_request_admission_Containers.scala, AccessCoherence_supervisor_process_access_coherence_Containers.scala, DockingLifecycle_supervisor_process_docking_lifecycle_Containers.scala, BerthCommitment_supervisor_process_berth_commitment_Containers.scala, ServiceAccessGate_supervisor_process_service_access_gate_Containers.scala, RecoverySupervisor_supervisor_process_recovery_supervisor_Containers.scala, DockingActionEligibility_supervisor_process_docking_action_eligibility_Containers.scala, AccessActionEligibility_supervisor_process_access_action_eligibility_Containers.scala, UndockingActionEligibility_supervisor_process_undocking_action_eligibility_Containers.scala, DockingActionArbitration_supervisor_process_docking_action_arbitration_Containers.scala, ResultComposition_supervisor_process_result_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Docking_Access_SupervisorAccessRequest_Payload: Z = -32

    val Docking_Access_SupervisorRequestOperation_Payload: Z = -31

    val Docking_Access_SupervisorCorrelation_Payload: Z = -30

    val Docking_Access_SupervisorVesselStatus_Payload: Z = -29

    val Docking_Access_SupervisorVesselClass_Payload: Z = -28

    val Docking_Access_SupervisorStationReport_Payload: Z = -27

    val Docking_Access_SupervisorStationProgress_Payload: Z = -26

    val Docking_Access_SupervisorServiceActivity_Payload: Z = -25

    val Docking_Access_SupervisorServiceClass_Payload: Z = -24

    val Docking_Access_SupervisorLifecycleState_Payload: Z = -23

    val Docking_Access_SupervisorRequestDisposition_Payload: Z = -22

    val Docking_Access_SupervisorControlEvent_Payload: Z = -21

    val Docking_Access_SupervisorBerthState_Payload: Z = -20

    val Docking_Access_SupervisorGateState_Payload: Z = -19

    val Docking_Access_SupervisorRecoveryState_Payload: Z = -18

    val Docking_Access_SupervisorRecoveryIntent_Payload: Z = -17

    val Docking_Access_SupervisorLifecycleDirective_Payload: Z = -16

    val Docking_Access_SupervisorDecisionContext_Payload: Z = -15

    val Docking_Access_SupervisorBerthEvidenceKind_Payload: Z = -14

    val Docking_Access_SupervisorGateDirective_Payload: Z = -13

    val Docking_Access_SupervisorPriorityKind_Payload: Z = -12

    val Docking_Access_SupervisorSupervisoryAction_Payload: Z = -11

    val Docking_Access_SupervisorDecisionCause_Payload: Z = -10

    val Docking_Access_SupervisorPublicMode_Payload: Z = -9

    val Docking_Access_SupervisorAccessStatus_Payload: Z = -8

    val Docking_Access_SupervisorDockingOutcome_Payload: Z = -7

    val Docking_Access_SupervisorRequestFacts: Z = -6

    val Docking_Access_SupervisorRequestFacts_Payload: Z = -5

    val Docking_Access_SupervisorVesselFacts: Z = -4

    val Docking_Access_SupervisorVesselFacts_Payload: Z = -3

    val Docking_Access_SupervisorStationFacts: Z = -2

    val Docking_Access_SupervisorStationFacts_Payload: Z = -1

    val Docking_Access_SupervisorServiceFacts: Z = 0

    val Docking_Access_SupervisorServiceFacts_Payload: Z = 1

    val Docking_Access_SupervisorAdmissionGuard: Z = 2

    val Docking_Access_SupervisorAdmissionGuard_Payload: Z = 3

    val Docking_Access_SupervisorPriorLifecycleView: Z = 4

    val Docking_Access_SupervisorPriorLifecycleView_Payload: Z = 5

    val Docking_Access_SupervisorAdmissionDecision: Z = 6

    val Docking_Access_SupervisorAdmissionDecision_Payload: Z = 7

    val Docking_Access_SupervisorRecoveryTransition: Z = 8

    val Docking_Access_SupervisorRecoveryTransition_Payload: Z = 9

    val Docking_Access_SupervisorCoordinationFrame: Z = 10

    val Docking_Access_SupervisorCoordinationFrame_Payload: Z = 11

    val Docking_Access_SupervisorBerthTransitionEvidence: Z = 12

    val Docking_Access_SupervisorBerthTransitionEvidence_Payload: Z = 13

    val Docking_Access_SupervisorGateSafetyFrame: Z = 14

    val Docking_Access_SupervisorGateSafetyFrame_Payload: Z = 15

    val Docking_Access_SupervisorPriorityDirective: Z = 16

    val Docking_Access_SupervisorPriorityDirective_Payload: Z = 17

    val Docking_Access_SupervisorDockingProposal: Z = 18

    val Docking_Access_SupervisorDockingProposal_Payload: Z = 19

    val Docking_Access_SupervisorAccessProposal: Z = 20

    val Docking_Access_SupervisorAccessProposal_Payload: Z = 21

    val Docking_Access_SupervisorUndockingProposal: Z = 22

    val Docking_Access_SupervisorUndockingProposal_Payload: Z = 23

    val Docking_Access_SupervisorDockingDecisionFrame: Z = 24

    val Docking_Access_SupervisorDockingDecisionFrame_Payload: Z = 25

    val Docking_Access_SupervisorDockingAccessResult: Z = 26

    val Docking_Access_SupervisorDockingAccessResult_Payload: Z = 27

    val Base_TypesBoolean_Payload: Z = 28

    val Base_TypesInteger_Payload: Z = 29

    val Base_TypesInteger_8_Payload: Z = 30

    val Base_TypesInteger_16_Payload: Z = 31

    val Base_TypesInteger_32_Payload: Z = 32

    val Base_TypesInteger_64_Payload: Z = 33

    val Base_TypesUnsigned_8_Payload: Z = 34

    val Base_TypesUnsigned_16_Payload: Z = 35

    val Base_TypesUnsigned_32_Payload: Z = 36

    val Base_TypesUnsigned_64_Payload: Z = 37

    val Base_TypesFloat_Payload: Z = 38

    val Base_TypesFloat_32_Payload: Z = 39

    val Base_TypesFloat_64_Payload: Z = 40

    val Base_TypesCharacter_Payload: Z = 41

    val Base_TypesString_Payload: Z = 42

    val Base_TypesBits_Payload: Z = 43

    val Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P: Z = 44

    val Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS: Z = 45

    val Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P: Z = 46

    val Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS: Z = 47

    val Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P: Z = 48

    val Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS: Z = 49

    val Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P: Z = 50

    val Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS: Z = 51

    val Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P: Z = 52

    val Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS: Z = 53

    val Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P: Z = 54

    val Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS: Z = 55

    val Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P: Z = 56

    val Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS: Z = 57

    val Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P: Z = 58

    val Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS: Z = 59

    val Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P: Z = 60

    val Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS: Z = 61

    val Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P: Z = 62

    val Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS: Z = 63

    val Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P: Z = 64

    val Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS: Z = 65

    val Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P: Z = 66

    val Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS: Z = 67

    val Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P: Z = 68

    val Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS: Z = 69

    val Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P: Z = 70

    val Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS: Z = 71

    val Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P: Z = 72

    val Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS: Z = 73

    val Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P: Z = 74

    val Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS: Z = 75

    val Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P: Z = 76

    val Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS: Z = 77

    val Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P: Z = 78

    val Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS: Z = 79

    val Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P: Z = 80

    val Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS: Z = 81

    val Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P: Z = 82

    val Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS: Z = 83

    val Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P: Z = 84

    val Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS: Z = 85

    val Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P: Z = 86

    val Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS: Z = 87

    val Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P: Z = 88

    val Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS: Z = 89

    val Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P: Z = 90

    val Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS: Z = 91

    val Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P: Z = 92

    val Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS: Z = 93

    val Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P: Z = 94

    val Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS: Z = 95

    val Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P: Z = 96

    val Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS: Z = 97

    val Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P: Z = 98

    val Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS: Z = 99

    val Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P: Z = 100

    val Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS: Z = 101

    val Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P: Z = 102

    val Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS: Z = 103

    val utilEmptyContainer: Z = 104

    val _artEmpty: Z = 105

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDocking_Access_SupervisorAccessRequestType(o: Docking_Access_Supervisor.AccessRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorAccessRequest_Payload(o: Docking_Access_Supervisor.AccessRequest_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessRequest_Payload)
      writeDocking_Access_SupervisorAccessRequestType(o.value)
    }

    def writeDocking_Access_SupervisorRequestOperationType(o: Docking_Access_Supervisor.RequestOperation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorRequestOperation_Payload(o: Docking_Access_Supervisor.RequestOperation_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestOperation_Payload)
      writeDocking_Access_SupervisorRequestOperationType(o.value)
    }

    def writeDocking_Access_SupervisorCorrelationType(o: Docking_Access_Supervisor.Correlation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorCorrelation_Payload(o: Docking_Access_Supervisor.Correlation_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorCorrelation_Payload)
      writeDocking_Access_SupervisorCorrelationType(o.value)
    }

    def writeDocking_Access_SupervisorVesselStatusType(o: Docking_Access_Supervisor.VesselStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorVesselStatus_Payload(o: Docking_Access_Supervisor.VesselStatus_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselStatus_Payload)
      writeDocking_Access_SupervisorVesselStatusType(o.value)
    }

    def writeDocking_Access_SupervisorVesselClassType(o: Docking_Access_Supervisor.VesselClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorVesselClass_Payload(o: Docking_Access_Supervisor.VesselClass_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselClass_Payload)
      writeDocking_Access_SupervisorVesselClassType(o.value)
    }

    def writeDocking_Access_SupervisorStationReportType(o: Docking_Access_Supervisor.StationReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorStationReport_Payload(o: Docking_Access_Supervisor.StationReport_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationReport_Payload)
      writeDocking_Access_SupervisorStationReportType(o.value)
    }

    def writeDocking_Access_SupervisorStationProgressType(o: Docking_Access_Supervisor.StationProgress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorStationProgress_Payload(o: Docking_Access_Supervisor.StationProgress_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationProgress_Payload)
      writeDocking_Access_SupervisorStationProgressType(o.value)
    }

    def writeDocking_Access_SupervisorServiceActivityType(o: Docking_Access_Supervisor.ServiceActivity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorServiceActivity_Payload(o: Docking_Access_Supervisor.ServiceActivity_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceActivity_Payload)
      writeDocking_Access_SupervisorServiceActivityType(o.value)
    }

    def writeDocking_Access_SupervisorServiceClassType(o: Docking_Access_Supervisor.ServiceClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorServiceClass_Payload(o: Docking_Access_Supervisor.ServiceClass_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceClass_Payload)
      writeDocking_Access_SupervisorServiceClassType(o.value)
    }

    def writeDocking_Access_SupervisorLifecycleStateType(o: Docking_Access_Supervisor.LifecycleState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorLifecycleState_Payload(o: Docking_Access_Supervisor.LifecycleState_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorLifecycleState_Payload)
      writeDocking_Access_SupervisorLifecycleStateType(o.value)
    }

    def writeDocking_Access_SupervisorRequestDispositionType(o: Docking_Access_Supervisor.RequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorRequestDisposition_Payload(o: Docking_Access_Supervisor.RequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestDisposition_Payload)
      writeDocking_Access_SupervisorRequestDispositionType(o.value)
    }

    def writeDocking_Access_SupervisorControlEventType(o: Docking_Access_Supervisor.ControlEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorControlEvent_Payload(o: Docking_Access_Supervisor.ControlEvent_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorControlEvent_Payload)
      writeDocking_Access_SupervisorControlEventType(o.value)
    }

    def writeDocking_Access_SupervisorBerthStateType(o: Docking_Access_Supervisor.BerthState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorBerthState_Payload(o: Docking_Access_Supervisor.BerthState_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthState_Payload)
      writeDocking_Access_SupervisorBerthStateType(o.value)
    }

    def writeDocking_Access_SupervisorGateStateType(o: Docking_Access_Supervisor.GateState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorGateState_Payload(o: Docking_Access_Supervisor.GateState_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorGateState_Payload)
      writeDocking_Access_SupervisorGateStateType(o.value)
    }

    def writeDocking_Access_SupervisorRecoveryStateType(o: Docking_Access_Supervisor.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorRecoveryState_Payload(o: Docking_Access_Supervisor.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoveryState_Payload)
      writeDocking_Access_SupervisorRecoveryStateType(o.value)
    }

    def writeDocking_Access_SupervisorRecoveryIntentType(o: Docking_Access_Supervisor.RecoveryIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorRecoveryIntent_Payload(o: Docking_Access_Supervisor.RecoveryIntent_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoveryIntent_Payload)
      writeDocking_Access_SupervisorRecoveryIntentType(o.value)
    }

    def writeDocking_Access_SupervisorLifecycleDirectiveType(o: Docking_Access_Supervisor.LifecycleDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorLifecycleDirective_Payload(o: Docking_Access_Supervisor.LifecycleDirective_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorLifecycleDirective_Payload)
      writeDocking_Access_SupervisorLifecycleDirectiveType(o.value)
    }

    def writeDocking_Access_SupervisorDecisionContextType(o: Docking_Access_Supervisor.DecisionContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorDecisionContext_Payload(o: Docking_Access_Supervisor.DecisionContext_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDecisionContext_Payload)
      writeDocking_Access_SupervisorDecisionContextType(o.value)
    }

    def writeDocking_Access_SupervisorBerthEvidenceKindType(o: Docking_Access_Supervisor.BerthEvidenceKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorBerthEvidenceKind_Payload(o: Docking_Access_Supervisor.BerthEvidenceKind_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthEvidenceKind_Payload)
      writeDocking_Access_SupervisorBerthEvidenceKindType(o.value)
    }

    def writeDocking_Access_SupervisorGateDirectiveType(o: Docking_Access_Supervisor.GateDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorGateDirective_Payload(o: Docking_Access_Supervisor.GateDirective_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorGateDirective_Payload)
      writeDocking_Access_SupervisorGateDirectiveType(o.value)
    }

    def writeDocking_Access_SupervisorPriorityKindType(o: Docking_Access_Supervisor.PriorityKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorPriorityKind_Payload(o: Docking_Access_Supervisor.PriorityKind_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorPriorityKind_Payload)
      writeDocking_Access_SupervisorPriorityKindType(o.value)
    }

    def writeDocking_Access_SupervisorSupervisoryActionType(o: Docking_Access_Supervisor.SupervisoryAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorSupervisoryAction_Payload(o: Docking_Access_Supervisor.SupervisoryAction_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorSupervisoryAction_Payload)
      writeDocking_Access_SupervisorSupervisoryActionType(o.value)
    }

    def writeDocking_Access_SupervisorDecisionCauseType(o: Docking_Access_Supervisor.DecisionCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorDecisionCause_Payload(o: Docking_Access_Supervisor.DecisionCause_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDecisionCause_Payload)
      writeDocking_Access_SupervisorDecisionCauseType(o.value)
    }

    def writeDocking_Access_SupervisorPublicModeType(o: Docking_Access_Supervisor.PublicMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorPublicMode_Payload(o: Docking_Access_Supervisor.PublicMode_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorPublicMode_Payload)
      writeDocking_Access_SupervisorPublicModeType(o.value)
    }

    def writeDocking_Access_SupervisorAccessStatusType(o: Docking_Access_Supervisor.AccessStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorAccessStatus_Payload(o: Docking_Access_Supervisor.AccessStatus_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessStatus_Payload)
      writeDocking_Access_SupervisorAccessStatusType(o.value)
    }

    def writeDocking_Access_SupervisorDockingOutcomeType(o: Docking_Access_Supervisor.DockingOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocking_Access_SupervisorDockingOutcome_Payload(o: Docking_Access_Supervisor.DockingOutcome_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingOutcome_Payload)
      writeDocking_Access_SupervisorDockingOutcomeType(o.value)
    }

    def writeDocking_Access_SupervisorRequestFacts(o: Docking_Access_Supervisor.RequestFacts): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestFacts)
      writer.writeB(o.present)
      writer.writeB(o.usable)
      writeDocking_Access_SupervisorRequestOperationType(o.operation)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writer.writeB(o.startsAuthorization)
    }

    def writeDocking_Access_SupervisorRequestFacts_Payload(o: Docking_Access_Supervisor.RequestFacts_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestFacts_Payload)
      writeDocking_Access_SupervisorRequestFacts(o.value)
    }

    def writeDocking_Access_SupervisorVesselFacts(o: Docking_Access_Supervisor.VesselFacts): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselFacts)
      writer.writeB(o.usable)
      writeDocking_Access_SupervisorVesselClassType(o.lifecycleClass)
      writer.writeB(o.approachReady)
      writer.writeB(o.docked)
      writer.writeB(o.departed)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
    }

    def writeDocking_Access_SupervisorVesselFacts_Payload(o: Docking_Access_Supervisor.VesselFacts_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselFacts_Payload)
      writeDocking_Access_SupervisorVesselFacts(o.value)
    }

    def writeDocking_Access_SupervisorStationFacts(o: Docking_Access_Supervisor.StationFacts): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationFacts)
      writer.writeB(o.present)
      writer.writeB(o.usable)
      writeDocking_Access_SupervisorStationProgressType(o.progress)
      writer.writeB(o.available)
      writer.writeB(o.denied)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
    }

    def writeDocking_Access_SupervisorStationFacts_Payload(o: Docking_Access_Supervisor.StationFacts_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationFacts_Payload)
      writeDocking_Access_SupervisorStationFacts(o.value)
    }

    def writeDocking_Access_SupervisorServiceFacts(o: Docking_Access_Supervisor.ServiceFacts): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceFacts)
      writer.writeB(o.usable)
      writeDocking_Access_SupervisorServiceClassType(o.serviceClass)
      writer.writeB(o.quiescent)
      writer.writeB(o.active)
      writer.writeB(o.requestPermitted)
    }

    def writeDocking_Access_SupervisorServiceFacts_Payload(o: Docking_Access_Supervisor.ServiceFacts_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceFacts_Payload)
      writeDocking_Access_SupervisorServiceFacts(o.value)
    }

    def writeDocking_Access_SupervisorAdmissionGuard(o: Docking_Access_Supervisor.AdmissionGuard): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAdmissionGuard)
      writer.writeB(o.open)
      writeDocking_Access_SupervisorLifecycleStateType(o.lifecycle)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writer.writeB(o.berthAvailable)
      writer.writeB(o.gateClosed)
      writer.writeB(o.recoveryHealthy)
    }

    def writeDocking_Access_SupervisorAdmissionGuard_Payload(o: Docking_Access_Supervisor.AdmissionGuard_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAdmissionGuard_Payload)
      writeDocking_Access_SupervisorAdmissionGuard(o.value)
    }

    def writeDocking_Access_SupervisorPriorLifecycleView(o: Docking_Access_Supervisor.PriorLifecycleView): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorPriorLifecycleView)
      writeDocking_Access_SupervisorLifecycleStateType(o.lifecycle)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
    }

    def writeDocking_Access_SupervisorPriorLifecycleView_Payload(o: Docking_Access_Supervisor.PriorLifecycleView_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorPriorLifecycleView_Payload)
      writeDocking_Access_SupervisorPriorLifecycleView(o.value)
    }

    def writeDocking_Access_SupervisorAdmissionDecision(o: Docking_Access_Supervisor.AdmissionDecision): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAdmissionDecision)
      writeDocking_Access_SupervisorRequestDispositionType(o.disposition)
      writeDocking_Access_SupervisorRequestOperationType(o.operation)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writer.writeB(o.accepted)
      writer.writeB(o.startsAuthorization)
    }

    def writeDocking_Access_SupervisorAdmissionDecision_Payload(o: Docking_Access_Supervisor.AdmissionDecision_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAdmissionDecision_Payload)
      writeDocking_Access_SupervisorAdmissionDecision(o.value)
    }

    def writeDocking_Access_SupervisorRecoveryTransition(o: Docking_Access_Supervisor.RecoveryTransition): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoveryTransition)
      writeDocking_Access_SupervisorRecoveryIntentType(o.intent)
      writer.writeB(o.fault)
      writer.writeB(o.verifiedAnchor)
    }

    def writeDocking_Access_SupervisorRecoveryTransition_Payload(o: Docking_Access_Supervisor.RecoveryTransition_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoveryTransition_Payload)
      writeDocking_Access_SupervisorRecoveryTransition(o.value)
    }

    def writeDocking_Access_SupervisorCoordinationFrame(o: Docking_Access_Supervisor.CoordinationFrame): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorCoordinationFrame)
      writeDocking_Access_SupervisorLifecycleDirectiveType(o.directive)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writer.writeB(o.qualified)
      writeDocking_Access_SupervisorDecisionContextType(o.decisionContext)
    }

    def writeDocking_Access_SupervisorCoordinationFrame_Payload(o: Docking_Access_Supervisor.CoordinationFrame_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorCoordinationFrame_Payload)
      writeDocking_Access_SupervisorCoordinationFrame(o.value)
    }

    def writeDocking_Access_SupervisorBerthTransitionEvidence(o: Docking_Access_Supervisor.BerthTransitionEvidence): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthTransitionEvidence)
      writeDocking_Access_SupervisorBerthEvidenceKindType(o.eventKind)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writer.writeB(o.qualified)
    }

    def writeDocking_Access_SupervisorBerthTransitionEvidence_Payload(o: Docking_Access_Supervisor.BerthTransitionEvidence_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthTransitionEvidence_Payload)
      writeDocking_Access_SupervisorBerthTransitionEvidence(o.value)
    }

    def writeDocking_Access_SupervisorGateSafetyFrame(o: Docking_Access_Supervisor.GateSafetyFrame): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorGateSafetyFrame)
      writeDocking_Access_SupervisorGateDirectiveType(o.directive)
      writer.writeB(o.safeToOpen)
      writeDocking_Access_SupervisorDecisionContextType(o.decisionContext)
    }

    def writeDocking_Access_SupervisorGateSafetyFrame_Payload(o: Docking_Access_Supervisor.GateSafetyFrame_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorGateSafetyFrame_Payload)
      writeDocking_Access_SupervisorGateSafetyFrame(o.value)
    }

    def writeDocking_Access_SupervisorPriorityDirective(o: Docking_Access_Supervisor.PriorityDirective): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorPriorityDirective)
      writeDocking_Access_SupervisorPriorityKindType(o.priority)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writeDocking_Access_SupervisorDecisionContextType(o.decisionContext)
    }

    def writeDocking_Access_SupervisorPriorityDirective_Payload(o: Docking_Access_Supervisor.PriorityDirective_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorPriorityDirective_Payload)
      writeDocking_Access_SupervisorPriorityDirective(o.value)
    }

    def writeDocking_Access_SupervisorDockingProposal(o: Docking_Access_Supervisor.DockingProposal): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingProposal)
      writer.writeB(o.applicable)
      writeDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)
      writeDocking_Access_SupervisorDecisionCauseType(o.cause)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writeDocking_Access_SupervisorDecisionContextType(o.decisionContext)
    }

    def writeDocking_Access_SupervisorDockingProposal_Payload(o: Docking_Access_Supervisor.DockingProposal_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingProposal_Payload)
      writeDocking_Access_SupervisorDockingProposal(o.value)
    }

    def writeDocking_Access_SupervisorAccessProposal(o: Docking_Access_Supervisor.AccessProposal): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessProposal)
      writer.writeB(o.applicable)
      writeDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)
      writeDocking_Access_SupervisorDecisionCauseType(o.cause)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writeDocking_Access_SupervisorDecisionContextType(o.decisionContext)
    }

    def writeDocking_Access_SupervisorAccessProposal_Payload(o: Docking_Access_Supervisor.AccessProposal_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessProposal_Payload)
      writeDocking_Access_SupervisorAccessProposal(o.value)
    }

    def writeDocking_Access_SupervisorUndockingProposal(o: Docking_Access_Supervisor.UndockingProposal): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorUndockingProposal)
      writer.writeB(o.applicable)
      writeDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)
      writeDocking_Access_SupervisorDecisionCauseType(o.cause)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writeDocking_Access_SupervisorDecisionContextType(o.decisionContext)
    }

    def writeDocking_Access_SupervisorUndockingProposal_Payload(o: Docking_Access_Supervisor.UndockingProposal_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorUndockingProposal_Payload)
      writeDocking_Access_SupervisorUndockingProposal(o.value)
    }

    def writeDocking_Access_SupervisorDockingDecisionFrame(o: Docking_Access_Supervisor.DockingDecisionFrame): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingDecisionFrame)
      writeDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)
      writeDocking_Access_SupervisorDecisionCauseType(o.cause)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writeDocking_Access_SupervisorDecisionContextType(o.decisionContext)
    }

    def writeDocking_Access_SupervisorDockingDecisionFrame_Payload(o: Docking_Access_Supervisor.DockingDecisionFrame_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingDecisionFrame_Payload)
      writeDocking_Access_SupervisorDockingDecisionFrame(o.value)
    }

    def writeDocking_Access_SupervisorDockingAccessResult(o: Docking_Access_Supervisor.DockingAccessResult): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingAccessResult)
      writeDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)
      writeDocking_Access_SupervisorDecisionCauseType(o.cause)
      writeDocking_Access_SupervisorPublicModeType(o.mode)
      writeDocking_Access_SupervisorCorrelationType(o.correlation)
      writeDocking_Access_SupervisorRequestDispositionType(o.disposition)
      writeDocking_Access_SupervisorAccessStatusType(o.status)
      writeDocking_Access_SupervisorDockingOutcomeType(o.outcome)
    }

    def writeDocking_Access_SupervisorDockingAccessResult_Payload(o: Docking_Access_Supervisor.DockingAccessResult_Payload): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingAccessResult_Payload)
      writeDocking_Access_SupervisorDockingAccessResult(o.value)
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

    def writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P)
      writeDocking_Access_SupervisorAccessRequestType(o.api_access_request)
    }

    def writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS)
      writeDocking_Access_SupervisorAccessRequestType(o.api_access_request)
    }

    def writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P)
      writeDocking_Access_SupervisorRequestFacts(o.api_request_facts)
    }

    def writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS)
      writeDocking_Access_SupervisorRequestFacts(o.api_request_facts)
    }

    def writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P)
      writeDocking_Access_SupervisorVesselStatusType(o.api_vessel_status)
    }

    def writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS)
      writeDocking_Access_SupervisorVesselStatusType(o.api_vessel_status)
    }

    def writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_facts)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness)
    }

    def writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_facts)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness)
    }

    def writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P)
      writeDocking_Access_SupervisorStationReportType(o.api_station_report)
    }

    def writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS)
      writeDocking_Access_SupervisorStationReportType(o.api_station_report)
    }

    def writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P)
      writeDocking_Access_SupervisorStationFacts(o.api_station_facts)
    }

    def writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS)
      writeDocking_Access_SupervisorStationFacts(o.api_station_facts)
    }

    def writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P)
      writeDocking_Access_SupervisorServiceActivityType(o.api_service_activity)
    }

    def writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS)
      writeDocking_Access_SupervisorServiceActivityType(o.api_service_activity)
    }

    def writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_facts)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_readiness)
    }

    def writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_facts)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_readiness)
    }

    def writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P)
      writeDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)
      writeDocking_Access_SupervisorRequestFacts(o.api_request_facts)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_readiness)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness)
    }

    def writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS)
      writeDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)
      writeDocking_Access_SupervisorRequestFacts(o.api_request_facts)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_readiness)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness)
    }

    def writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_access_admission)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_docking_admission)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_gate_admission)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_lifecycle_admission)
      writeDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_undocking_admission)
    }

    def writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_access_admission)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_docking_admission)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_gate_admission)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_lifecycle_admission)
      writeDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_undocking_admission)
    }

    def writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P)
      writeDocking_Access_SupervisorControlEventType(o.api_control_event)
      writeDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state)
      writeDocking_Access_SupervisorGateStateType(o.api_prior_gate_state)
      writeDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view)
      writeDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_facts)
      writeDocking_Access_SupervisorStationFacts(o.api_station_facts)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_facts)
    }

    def writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS)
      writeDocking_Access_SupervisorControlEventType(o.api_control_event)
      writeDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state)
      writeDocking_Access_SupervisorGateStateType(o.api_prior_gate_state)
      writeDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view)
      writeDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state)
      writeDocking_Access_SupervisorServiceFacts(o.api_service_facts)
      writeDocking_Access_SupervisorStationFacts(o.api_station_facts)
      writeDocking_Access_SupervisorVesselFacts(o.api_vessel_facts)
    }

    def writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)
      writeDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)
      writeDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame)
      writeDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame)
      writeDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)
      writeDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame)
    }

    def writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)
      writeDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)
      writeDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame)
      writeDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame)
      writeDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)
      writeDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame)
    }

    def writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame)
    }

    def writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame)
    }

    def writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P)
      writeDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view)
    }

    def writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS)
      writeDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view)
    }

    def writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P)
      writeDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence)
    }

    def writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS)
      writeDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence)
    }

    def writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P)
      writeDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state)
    }

    def writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS)
      writeDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state)
    }

    def writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame)
    }

    def writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame)
    }

    def writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P)
      writeDocking_Access_SupervisorGateStateType(o.api_prior_gate_state)
    }

    def writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS)
      writeDocking_Access_SupervisorGateStateType(o.api_prior_gate_state)
    }

    def writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P)
      writeDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition)
    }

    def writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS)
      writeDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition)
    }

    def writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P)
      writeDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state)
    }

    def writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS)
      writeDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state)
    }

    def writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame)
    }

    def writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame)
    }

    def writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P)
      writeDocking_Access_SupervisorDockingProposal(o.api_docking_proposal)
    }

    def writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS)
      writeDocking_Access_SupervisorDockingProposal(o.api_docking_proposal)
    }

    def writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
    }

    def writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
    }

    def writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P)
      writeDocking_Access_SupervisorAccessProposal(o.api_access_proposal)
    }

    def writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS)
      writeDocking_Access_SupervisorAccessProposal(o.api_access_proposal)
    }

    def writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame)
    }

    def writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS)
      writeDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)
      writeDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame)
    }

    def writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P)
      writeDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal)
    }

    def writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS)
      writeDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal)
    }

    def writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P)
      writeDocking_Access_SupervisorAccessProposal(o.api_access_proposal)
      writeDocking_Access_SupervisorDockingProposal(o.api_docking_proposal)
      writeDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)
      writeDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal)
    }

    def writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS)
      writeDocking_Access_SupervisorAccessProposal(o.api_access_proposal)
      writeDocking_Access_SupervisorDockingProposal(o.api_docking_proposal)
      writeDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)
      writeDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal)
    }

    def writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P)
      writeDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision)
    }

    def writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS)
      writeDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision)
    }

    def writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P)
      writeDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision)
      writeDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition)
    }

    def writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS)
      writeDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision)
      writeDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition)
    }

    def writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container): Unit = {
      o match {
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
      }
    }

    def writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P)
      writeDocking_Access_SupervisorDockingAccessResult(o.api_docking_access_result)
    }

    def writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS)
      writeDocking_Access_SupervisorDockingAccessResult(o.api_docking_access_result)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
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
        case o: Docking_Access_Supervisor.GateState_Payload => writeDocking_Access_SupervisorGateState_Payload(o)
        case o: Docking_Access_Supervisor.BerthState_Payload => writeDocking_Access_SupervisorBerthState_Payload(o)
        case o: Docking_Access_Supervisor.PublicMode_Payload => writeDocking_Access_SupervisorPublicMode_Payload(o)
        case o: Docking_Access_Supervisor.Correlation_Payload => writeDocking_Access_SupervisorCorrelation_Payload(o)
        case o: Docking_Access_Supervisor.VesselClass_Payload => writeDocking_Access_SupervisorVesselClass_Payload(o)
        case o: Docking_Access_Supervisor.VesselFacts_Payload => writeDocking_Access_SupervisorVesselFacts_Payload(o)
        case o: Docking_Access_Supervisor.AccessStatus_Payload => writeDocking_Access_SupervisorAccessStatus_Payload(o)
        case o: Docking_Access_Supervisor.ServiceClass_Payload => writeDocking_Access_SupervisorServiceClass_Payload(o)
        case o: Docking_Access_Supervisor.PriorityKind_Payload => writeDocking_Access_SupervisorPriorityKind_Payload(o)
        case o: Docking_Access_Supervisor.ControlEvent_Payload => writeDocking_Access_SupervisorControlEvent_Payload(o)
        case o: Docking_Access_Supervisor.VesselStatus_Payload => writeDocking_Access_SupervisorVesselStatus_Payload(o)
        case o: Docking_Access_Supervisor.ServiceFacts_Payload => writeDocking_Access_SupervisorServiceFacts_Payload(o)
        case o: Docking_Access_Supervisor.RequestFacts_Payload => writeDocking_Access_SupervisorRequestFacts_Payload(o)
        case o: Docking_Access_Supervisor.StationFacts_Payload => writeDocking_Access_SupervisorStationFacts_Payload(o)
        case o: Docking_Access_Supervisor.RecoveryState_Payload => writeDocking_Access_SupervisorRecoveryState_Payload(o)
        case o: Docking_Access_Supervisor.GateDirective_Payload => writeDocking_Access_SupervisorGateDirective_Payload(o)
        case o: Docking_Access_Supervisor.AccessRequest_Payload => writeDocking_Access_SupervisorAccessRequest_Payload(o)
        case o: Docking_Access_Supervisor.StationReport_Payload => writeDocking_Access_SupervisorStationReport_Payload(o)
        case o: Docking_Access_Supervisor.DecisionCause_Payload => writeDocking_Access_SupervisorDecisionCause_Payload(o)
        case o: Docking_Access_Supervisor.RecoveryIntent_Payload => writeDocking_Access_SupervisorRecoveryIntent_Payload(o)
        case o: Docking_Access_Supervisor.DockingOutcome_Payload => writeDocking_Access_SupervisorDockingOutcome_Payload(o)
        case o: Docking_Access_Supervisor.LifecycleState_Payload => writeDocking_Access_SupervisorLifecycleState_Payload(o)
        case o: Docking_Access_Supervisor.AdmissionGuard_Payload => writeDocking_Access_SupervisorAdmissionGuard_Payload(o)
        case o: Docking_Access_Supervisor.AccessProposal_Payload => writeDocking_Access_SupervisorAccessProposal_Payload(o)
        case o: Docking_Access_Supervisor.ServiceActivity_Payload => writeDocking_Access_SupervisorServiceActivity_Payload(o)
        case o: Docking_Access_Supervisor.StationProgress_Payload => writeDocking_Access_SupervisorStationProgress_Payload(o)
        case o: Docking_Access_Supervisor.DecisionContext_Payload => writeDocking_Access_SupervisorDecisionContext_Payload(o)
        case o: Docking_Access_Supervisor.GateSafetyFrame_Payload => writeDocking_Access_SupervisorGateSafetyFrame_Payload(o)
        case o: Docking_Access_Supervisor.DockingProposal_Payload => writeDocking_Access_SupervisorDockingProposal_Payload(o)
        case o: Docking_Access_Supervisor.RequestOperation_Payload => writeDocking_Access_SupervisorRequestOperation_Payload(o)
        case o: Docking_Access_Supervisor.SupervisoryAction_Payload => writeDocking_Access_SupervisorSupervisoryAction_Payload(o)
        case o: Docking_Access_Supervisor.BerthEvidenceKind_Payload => writeDocking_Access_SupervisorBerthEvidenceKind_Payload(o)
        case o: Docking_Access_Supervisor.PriorityDirective_Payload => writeDocking_Access_SupervisorPriorityDirective_Payload(o)
        case o: Docking_Access_Supervisor.CoordinationFrame_Payload => writeDocking_Access_SupervisorCoordinationFrame_Payload(o)
        case o: Docking_Access_Supervisor.AdmissionDecision_Payload => writeDocking_Access_SupervisorAdmissionDecision_Payload(o)
        case o: Docking_Access_Supervisor.UndockingProposal_Payload => writeDocking_Access_SupervisorUndockingProposal_Payload(o)
        case o: Docking_Access_Supervisor.RequestDisposition_Payload => writeDocking_Access_SupervisorRequestDisposition_Payload(o)
        case o: Docking_Access_Supervisor.LifecycleDirective_Payload => writeDocking_Access_SupervisorLifecycleDirective_Payload(o)
        case o: Docking_Access_Supervisor.PriorLifecycleView_Payload => writeDocking_Access_SupervisorPriorLifecycleView_Payload(o)
        case o: Docking_Access_Supervisor.RecoveryTransition_Payload => writeDocking_Access_SupervisorRecoveryTransition_Payload(o)
        case o: Docking_Access_Supervisor.DockingAccessResult_Payload => writeDocking_Access_SupervisorDockingAccessResult_Payload(o)
        case o: Docking_Access_Supervisor.DockingDecisionFrame_Payload => writeDocking_Access_SupervisorDockingDecisionFrame_Payload(o)
        case o: Docking_Access_Supervisor.BerthTransitionEvidence_Payload => writeDocking_Access_SupervisorBerthTransitionEvidence_Payload(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
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

    def readDocking_Access_SupervisorAccessRequestType(): Docking_Access_Supervisor.AccessRequest.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.AccessRequest.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorAccessRequest_Payload(): Docking_Access_Supervisor.AccessRequest_Payload = {
      val r = readDocking_Access_SupervisorAccessRequest_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessRequest_PayloadT(typeParsed: B): Docking_Access_Supervisor.AccessRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessRequest_Payload)
      }
      val value = readDocking_Access_SupervisorAccessRequestType()
      return Docking_Access_Supervisor.AccessRequest_Payload(value)
    }

    def readDocking_Access_SupervisorRequestOperationType(): Docking_Access_Supervisor.RequestOperation.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.RequestOperation.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorRequestOperation_Payload(): Docking_Access_Supervisor.RequestOperation_Payload = {
      val r = readDocking_Access_SupervisorRequestOperation_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestOperation_PayloadT(typeParsed: B): Docking_Access_Supervisor.RequestOperation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestOperation_Payload)
      }
      val value = readDocking_Access_SupervisorRequestOperationType()
      return Docking_Access_Supervisor.RequestOperation_Payload(value)
    }

    def readDocking_Access_SupervisorCorrelationType(): Docking_Access_Supervisor.Correlation.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.Correlation.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorCorrelation_Payload(): Docking_Access_Supervisor.Correlation_Payload = {
      val r = readDocking_Access_SupervisorCorrelation_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorCorrelation_PayloadT(typeParsed: B): Docking_Access_Supervisor.Correlation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorCorrelation_Payload)
      }
      val value = readDocking_Access_SupervisorCorrelationType()
      return Docking_Access_Supervisor.Correlation_Payload(value)
    }

    def readDocking_Access_SupervisorVesselStatusType(): Docking_Access_Supervisor.VesselStatus.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.VesselStatus.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorVesselStatus_Payload(): Docking_Access_Supervisor.VesselStatus_Payload = {
      val r = readDocking_Access_SupervisorVesselStatus_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorVesselStatus_PayloadT(typeParsed: B): Docking_Access_Supervisor.VesselStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselStatus_Payload)
      }
      val value = readDocking_Access_SupervisorVesselStatusType()
      return Docking_Access_Supervisor.VesselStatus_Payload(value)
    }

    def readDocking_Access_SupervisorVesselClassType(): Docking_Access_Supervisor.VesselClass.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.VesselClass.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorVesselClass_Payload(): Docking_Access_Supervisor.VesselClass_Payload = {
      val r = readDocking_Access_SupervisorVesselClass_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorVesselClass_PayloadT(typeParsed: B): Docking_Access_Supervisor.VesselClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselClass_Payload)
      }
      val value = readDocking_Access_SupervisorVesselClassType()
      return Docking_Access_Supervisor.VesselClass_Payload(value)
    }

    def readDocking_Access_SupervisorStationReportType(): Docking_Access_Supervisor.StationReport.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.StationReport.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorStationReport_Payload(): Docking_Access_Supervisor.StationReport_Payload = {
      val r = readDocking_Access_SupervisorStationReport_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorStationReport_PayloadT(typeParsed: B): Docking_Access_Supervisor.StationReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationReport_Payload)
      }
      val value = readDocking_Access_SupervisorStationReportType()
      return Docking_Access_Supervisor.StationReport_Payload(value)
    }

    def readDocking_Access_SupervisorStationProgressType(): Docking_Access_Supervisor.StationProgress.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.StationProgress.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorStationProgress_Payload(): Docking_Access_Supervisor.StationProgress_Payload = {
      val r = readDocking_Access_SupervisorStationProgress_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorStationProgress_PayloadT(typeParsed: B): Docking_Access_Supervisor.StationProgress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationProgress_Payload)
      }
      val value = readDocking_Access_SupervisorStationProgressType()
      return Docking_Access_Supervisor.StationProgress_Payload(value)
    }

    def readDocking_Access_SupervisorServiceActivityType(): Docking_Access_Supervisor.ServiceActivity.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.ServiceActivity.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorServiceActivity_Payload(): Docking_Access_Supervisor.ServiceActivity_Payload = {
      val r = readDocking_Access_SupervisorServiceActivity_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceActivity_PayloadT(typeParsed: B): Docking_Access_Supervisor.ServiceActivity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceActivity_Payload)
      }
      val value = readDocking_Access_SupervisorServiceActivityType()
      return Docking_Access_Supervisor.ServiceActivity_Payload(value)
    }

    def readDocking_Access_SupervisorServiceClassType(): Docking_Access_Supervisor.ServiceClass.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.ServiceClass.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorServiceClass_Payload(): Docking_Access_Supervisor.ServiceClass_Payload = {
      val r = readDocking_Access_SupervisorServiceClass_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceClass_PayloadT(typeParsed: B): Docking_Access_Supervisor.ServiceClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceClass_Payload)
      }
      val value = readDocking_Access_SupervisorServiceClassType()
      return Docking_Access_Supervisor.ServiceClass_Payload(value)
    }

    def readDocking_Access_SupervisorLifecycleStateType(): Docking_Access_Supervisor.LifecycleState.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.LifecycleState.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorLifecycleState_Payload(): Docking_Access_Supervisor.LifecycleState_Payload = {
      val r = readDocking_Access_SupervisorLifecycleState_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorLifecycleState_PayloadT(typeParsed: B): Docking_Access_Supervisor.LifecycleState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorLifecycleState_Payload)
      }
      val value = readDocking_Access_SupervisorLifecycleStateType()
      return Docking_Access_Supervisor.LifecycleState_Payload(value)
    }

    def readDocking_Access_SupervisorRequestDispositionType(): Docking_Access_Supervisor.RequestDisposition.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.RequestDisposition.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorRequestDisposition_Payload(): Docking_Access_Supervisor.RequestDisposition_Payload = {
      val r = readDocking_Access_SupervisorRequestDisposition_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestDisposition_PayloadT(typeParsed: B): Docking_Access_Supervisor.RequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestDisposition_Payload)
      }
      val value = readDocking_Access_SupervisorRequestDispositionType()
      return Docking_Access_Supervisor.RequestDisposition_Payload(value)
    }

    def readDocking_Access_SupervisorControlEventType(): Docking_Access_Supervisor.ControlEvent.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.ControlEvent.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorControlEvent_Payload(): Docking_Access_Supervisor.ControlEvent_Payload = {
      val r = readDocking_Access_SupervisorControlEvent_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorControlEvent_PayloadT(typeParsed: B): Docking_Access_Supervisor.ControlEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorControlEvent_Payload)
      }
      val value = readDocking_Access_SupervisorControlEventType()
      return Docking_Access_Supervisor.ControlEvent_Payload(value)
    }

    def readDocking_Access_SupervisorBerthStateType(): Docking_Access_Supervisor.BerthState.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.BerthState.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorBerthState_Payload(): Docking_Access_Supervisor.BerthState_Payload = {
      val r = readDocking_Access_SupervisorBerthState_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorBerthState_PayloadT(typeParsed: B): Docking_Access_Supervisor.BerthState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthState_Payload)
      }
      val value = readDocking_Access_SupervisorBerthStateType()
      return Docking_Access_Supervisor.BerthState_Payload(value)
    }

    def readDocking_Access_SupervisorGateStateType(): Docking_Access_Supervisor.GateState.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.GateState.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorGateState_Payload(): Docking_Access_Supervisor.GateState_Payload = {
      val r = readDocking_Access_SupervisorGateState_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorGateState_PayloadT(typeParsed: B): Docking_Access_Supervisor.GateState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorGateState_Payload)
      }
      val value = readDocking_Access_SupervisorGateStateType()
      return Docking_Access_Supervisor.GateState_Payload(value)
    }

    def readDocking_Access_SupervisorRecoveryStateType(): Docking_Access_Supervisor.RecoveryState.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.RecoveryState.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorRecoveryState_Payload(): Docking_Access_Supervisor.RecoveryState_Payload = {
      val r = readDocking_Access_SupervisorRecoveryState_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorRecoveryState_PayloadT(typeParsed: B): Docking_Access_Supervisor.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoveryState_Payload)
      }
      val value = readDocking_Access_SupervisorRecoveryStateType()
      return Docking_Access_Supervisor.RecoveryState_Payload(value)
    }

    def readDocking_Access_SupervisorRecoveryIntentType(): Docking_Access_Supervisor.RecoveryIntent.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.RecoveryIntent.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorRecoveryIntent_Payload(): Docking_Access_Supervisor.RecoveryIntent_Payload = {
      val r = readDocking_Access_SupervisorRecoveryIntent_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorRecoveryIntent_PayloadT(typeParsed: B): Docking_Access_Supervisor.RecoveryIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoveryIntent_Payload)
      }
      val value = readDocking_Access_SupervisorRecoveryIntentType()
      return Docking_Access_Supervisor.RecoveryIntent_Payload(value)
    }

    def readDocking_Access_SupervisorLifecycleDirectiveType(): Docking_Access_Supervisor.LifecycleDirective.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.LifecycleDirective.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorLifecycleDirective_Payload(): Docking_Access_Supervisor.LifecycleDirective_Payload = {
      val r = readDocking_Access_SupervisorLifecycleDirective_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorLifecycleDirective_PayloadT(typeParsed: B): Docking_Access_Supervisor.LifecycleDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorLifecycleDirective_Payload)
      }
      val value = readDocking_Access_SupervisorLifecycleDirectiveType()
      return Docking_Access_Supervisor.LifecycleDirective_Payload(value)
    }

    def readDocking_Access_SupervisorDecisionContextType(): Docking_Access_Supervisor.DecisionContext.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.DecisionContext.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorDecisionContext_Payload(): Docking_Access_Supervisor.DecisionContext_Payload = {
      val r = readDocking_Access_SupervisorDecisionContext_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorDecisionContext_PayloadT(typeParsed: B): Docking_Access_Supervisor.DecisionContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDecisionContext_Payload)
      }
      val value = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.DecisionContext_Payload(value)
    }

    def readDocking_Access_SupervisorBerthEvidenceKindType(): Docking_Access_Supervisor.BerthEvidenceKind.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.BerthEvidenceKind.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorBerthEvidenceKind_Payload(): Docking_Access_Supervisor.BerthEvidenceKind_Payload = {
      val r = readDocking_Access_SupervisorBerthEvidenceKind_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorBerthEvidenceKind_PayloadT(typeParsed: B): Docking_Access_Supervisor.BerthEvidenceKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthEvidenceKind_Payload)
      }
      val value = readDocking_Access_SupervisorBerthEvidenceKindType()
      return Docking_Access_Supervisor.BerthEvidenceKind_Payload(value)
    }

    def readDocking_Access_SupervisorGateDirectiveType(): Docking_Access_Supervisor.GateDirective.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.GateDirective.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorGateDirective_Payload(): Docking_Access_Supervisor.GateDirective_Payload = {
      val r = readDocking_Access_SupervisorGateDirective_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorGateDirective_PayloadT(typeParsed: B): Docking_Access_Supervisor.GateDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorGateDirective_Payload)
      }
      val value = readDocking_Access_SupervisorGateDirectiveType()
      return Docking_Access_Supervisor.GateDirective_Payload(value)
    }

    def readDocking_Access_SupervisorPriorityKindType(): Docking_Access_Supervisor.PriorityKind.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.PriorityKind.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorPriorityKind_Payload(): Docking_Access_Supervisor.PriorityKind_Payload = {
      val r = readDocking_Access_SupervisorPriorityKind_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorPriorityKind_PayloadT(typeParsed: B): Docking_Access_Supervisor.PriorityKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorPriorityKind_Payload)
      }
      val value = readDocking_Access_SupervisorPriorityKindType()
      return Docking_Access_Supervisor.PriorityKind_Payload(value)
    }

    def readDocking_Access_SupervisorSupervisoryActionType(): Docking_Access_Supervisor.SupervisoryAction.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.SupervisoryAction.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorSupervisoryAction_Payload(): Docking_Access_Supervisor.SupervisoryAction_Payload = {
      val r = readDocking_Access_SupervisorSupervisoryAction_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorSupervisoryAction_PayloadT(typeParsed: B): Docking_Access_Supervisor.SupervisoryAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorSupervisoryAction_Payload)
      }
      val value = readDocking_Access_SupervisorSupervisoryActionType()
      return Docking_Access_Supervisor.SupervisoryAction_Payload(value)
    }

    def readDocking_Access_SupervisorDecisionCauseType(): Docking_Access_Supervisor.DecisionCause.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.DecisionCause.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorDecisionCause_Payload(): Docking_Access_Supervisor.DecisionCause_Payload = {
      val r = readDocking_Access_SupervisorDecisionCause_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorDecisionCause_PayloadT(typeParsed: B): Docking_Access_Supervisor.DecisionCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDecisionCause_Payload)
      }
      val value = readDocking_Access_SupervisorDecisionCauseType()
      return Docking_Access_Supervisor.DecisionCause_Payload(value)
    }

    def readDocking_Access_SupervisorPublicModeType(): Docking_Access_Supervisor.PublicMode.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.PublicMode.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorPublicMode_Payload(): Docking_Access_Supervisor.PublicMode_Payload = {
      val r = readDocking_Access_SupervisorPublicMode_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorPublicMode_PayloadT(typeParsed: B): Docking_Access_Supervisor.PublicMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorPublicMode_Payload)
      }
      val value = readDocking_Access_SupervisorPublicModeType()
      return Docking_Access_Supervisor.PublicMode_Payload(value)
    }

    def readDocking_Access_SupervisorAccessStatusType(): Docking_Access_Supervisor.AccessStatus.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.AccessStatus.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorAccessStatus_Payload(): Docking_Access_Supervisor.AccessStatus_Payload = {
      val r = readDocking_Access_SupervisorAccessStatus_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessStatus_PayloadT(typeParsed: B): Docking_Access_Supervisor.AccessStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessStatus_Payload)
      }
      val value = readDocking_Access_SupervisorAccessStatusType()
      return Docking_Access_Supervisor.AccessStatus_Payload(value)
    }

    def readDocking_Access_SupervisorDockingOutcomeType(): Docking_Access_Supervisor.DockingOutcome.Type = {
      val r = reader.readZ()
      return Docking_Access_Supervisor.DockingOutcome.byOrdinal(r).get
    }

    def readDocking_Access_SupervisorDockingOutcome_Payload(): Docking_Access_Supervisor.DockingOutcome_Payload = {
      val r = readDocking_Access_SupervisorDockingOutcome_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingOutcome_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingOutcome_Payload)
      }
      val value = readDocking_Access_SupervisorDockingOutcomeType()
      return Docking_Access_Supervisor.DockingOutcome_Payload(value)
    }

    def readDocking_Access_SupervisorRequestFacts(): Docking_Access_Supervisor.RequestFacts = {
      val r = readDocking_Access_SupervisorRequestFactsT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestFactsT(typeParsed: B): Docking_Access_Supervisor.RequestFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestFacts)
      }
      val present = reader.readB()
      val usable = reader.readB()
      val operation = readDocking_Access_SupervisorRequestOperationType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val startsAuthorization = reader.readB()
      return Docking_Access_Supervisor.RequestFacts(present, usable, operation, correlation, startsAuthorization)
    }

    def readDocking_Access_SupervisorRequestFacts_Payload(): Docking_Access_Supervisor.RequestFacts_Payload = {
      val r = readDocking_Access_SupervisorRequestFacts_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.RequestFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestFacts_Payload)
      }
      val value = readDocking_Access_SupervisorRequestFacts()
      return Docking_Access_Supervisor.RequestFacts_Payload(value)
    }

    def readDocking_Access_SupervisorVesselFacts(): Docking_Access_Supervisor.VesselFacts = {
      val r = readDocking_Access_SupervisorVesselFactsT(F)
      return r
    }

    def readDocking_Access_SupervisorVesselFactsT(typeParsed: B): Docking_Access_Supervisor.VesselFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselFacts)
      }
      val usable = reader.readB()
      val lifecycleClass = readDocking_Access_SupervisorVesselClassType()
      val approachReady = reader.readB()
      val docked = reader.readB()
      val departed = reader.readB()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      return Docking_Access_Supervisor.VesselFacts(usable, lifecycleClass, approachReady, docked, departed, correlation)
    }

    def readDocking_Access_SupervisorVesselFacts_Payload(): Docking_Access_Supervisor.VesselFacts_Payload = {
      val r = readDocking_Access_SupervisorVesselFacts_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorVesselFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.VesselFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselFacts_Payload)
      }
      val value = readDocking_Access_SupervisorVesselFacts()
      return Docking_Access_Supervisor.VesselFacts_Payload(value)
    }

    def readDocking_Access_SupervisorStationFacts(): Docking_Access_Supervisor.StationFacts = {
      val r = readDocking_Access_SupervisorStationFactsT(F)
      return r
    }

    def readDocking_Access_SupervisorStationFactsT(typeParsed: B): Docking_Access_Supervisor.StationFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationFacts)
      }
      val present = reader.readB()
      val usable = reader.readB()
      val progress = readDocking_Access_SupervisorStationProgressType()
      val available = reader.readB()
      val denied = reader.readB()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      return Docking_Access_Supervisor.StationFacts(present, usable, progress, available, denied, correlation)
    }

    def readDocking_Access_SupervisorStationFacts_Payload(): Docking_Access_Supervisor.StationFacts_Payload = {
      val r = readDocking_Access_SupervisorStationFacts_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorStationFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.StationFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationFacts_Payload)
      }
      val value = readDocking_Access_SupervisorStationFacts()
      return Docking_Access_Supervisor.StationFacts_Payload(value)
    }

    def readDocking_Access_SupervisorServiceFacts(): Docking_Access_Supervisor.ServiceFacts = {
      val r = readDocking_Access_SupervisorServiceFactsT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceFactsT(typeParsed: B): Docking_Access_Supervisor.ServiceFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceFacts)
      }
      val usable = reader.readB()
      val serviceClass = readDocking_Access_SupervisorServiceClassType()
      val quiescent = reader.readB()
      val active = reader.readB()
      val requestPermitted = reader.readB()
      return Docking_Access_Supervisor.ServiceFacts(usable, serviceClass, quiescent, active, requestPermitted)
    }

    def readDocking_Access_SupervisorServiceFacts_Payload(): Docking_Access_Supervisor.ServiceFacts_Payload = {
      val r = readDocking_Access_SupervisorServiceFacts_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.ServiceFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceFacts_Payload)
      }
      val value = readDocking_Access_SupervisorServiceFacts()
      return Docking_Access_Supervisor.ServiceFacts_Payload(value)
    }

    def readDocking_Access_SupervisorAdmissionGuard(): Docking_Access_Supervisor.AdmissionGuard = {
      val r = readDocking_Access_SupervisorAdmissionGuardT(F)
      return r
    }

    def readDocking_Access_SupervisorAdmissionGuardT(typeParsed: B): Docking_Access_Supervisor.AdmissionGuard = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAdmissionGuard)
      }
      val open = reader.readB()
      val lifecycle = readDocking_Access_SupervisorLifecycleStateType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val berthAvailable = reader.readB()
      val gateClosed = reader.readB()
      val recoveryHealthy = reader.readB()
      return Docking_Access_Supervisor.AdmissionGuard(open, lifecycle, correlation, berthAvailable, gateClosed, recoveryHealthy)
    }

    def readDocking_Access_SupervisorAdmissionGuard_Payload(): Docking_Access_Supervisor.AdmissionGuard_Payload = {
      val r = readDocking_Access_SupervisorAdmissionGuard_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorAdmissionGuard_PayloadT(typeParsed: B): Docking_Access_Supervisor.AdmissionGuard_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAdmissionGuard_Payload)
      }
      val value = readDocking_Access_SupervisorAdmissionGuard()
      return Docking_Access_Supervisor.AdmissionGuard_Payload(value)
    }

    def readDocking_Access_SupervisorPriorLifecycleView(): Docking_Access_Supervisor.PriorLifecycleView = {
      val r = readDocking_Access_SupervisorPriorLifecycleViewT(F)
      return r
    }

    def readDocking_Access_SupervisorPriorLifecycleViewT(typeParsed: B): Docking_Access_Supervisor.PriorLifecycleView = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorPriorLifecycleView)
      }
      val lifecycle = readDocking_Access_SupervisorLifecycleStateType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      return Docking_Access_Supervisor.PriorLifecycleView(lifecycle, correlation)
    }

    def readDocking_Access_SupervisorPriorLifecycleView_Payload(): Docking_Access_Supervisor.PriorLifecycleView_Payload = {
      val r = readDocking_Access_SupervisorPriorLifecycleView_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorPriorLifecycleView_PayloadT(typeParsed: B): Docking_Access_Supervisor.PriorLifecycleView_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorPriorLifecycleView_Payload)
      }
      val value = readDocking_Access_SupervisorPriorLifecycleView()
      return Docking_Access_Supervisor.PriorLifecycleView_Payload(value)
    }

    def readDocking_Access_SupervisorAdmissionDecision(): Docking_Access_Supervisor.AdmissionDecision = {
      val r = readDocking_Access_SupervisorAdmissionDecisionT(F)
      return r
    }

    def readDocking_Access_SupervisorAdmissionDecisionT(typeParsed: B): Docking_Access_Supervisor.AdmissionDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAdmissionDecision)
      }
      val disposition = readDocking_Access_SupervisorRequestDispositionType()
      val operation = readDocking_Access_SupervisorRequestOperationType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val accepted = reader.readB()
      val startsAuthorization = reader.readB()
      return Docking_Access_Supervisor.AdmissionDecision(disposition, operation, correlation, accepted, startsAuthorization)
    }

    def readDocking_Access_SupervisorAdmissionDecision_Payload(): Docking_Access_Supervisor.AdmissionDecision_Payload = {
      val r = readDocking_Access_SupervisorAdmissionDecision_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorAdmissionDecision_PayloadT(typeParsed: B): Docking_Access_Supervisor.AdmissionDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAdmissionDecision_Payload)
      }
      val value = readDocking_Access_SupervisorAdmissionDecision()
      return Docking_Access_Supervisor.AdmissionDecision_Payload(value)
    }

    def readDocking_Access_SupervisorRecoveryTransition(): Docking_Access_Supervisor.RecoveryTransition = {
      val r = readDocking_Access_SupervisorRecoveryTransitionT(F)
      return r
    }

    def readDocking_Access_SupervisorRecoveryTransitionT(typeParsed: B): Docking_Access_Supervisor.RecoveryTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoveryTransition)
      }
      val intent = readDocking_Access_SupervisorRecoveryIntentType()
      val fault = reader.readB()
      val verifiedAnchor = reader.readB()
      return Docking_Access_Supervisor.RecoveryTransition(intent, fault, verifiedAnchor)
    }

    def readDocking_Access_SupervisorRecoveryTransition_Payload(): Docking_Access_Supervisor.RecoveryTransition_Payload = {
      val r = readDocking_Access_SupervisorRecoveryTransition_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorRecoveryTransition_PayloadT(typeParsed: B): Docking_Access_Supervisor.RecoveryTransition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoveryTransition_Payload)
      }
      val value = readDocking_Access_SupervisorRecoveryTransition()
      return Docking_Access_Supervisor.RecoveryTransition_Payload(value)
    }

    def readDocking_Access_SupervisorCoordinationFrame(): Docking_Access_Supervisor.CoordinationFrame = {
      val r = readDocking_Access_SupervisorCoordinationFrameT(F)
      return r
    }

    def readDocking_Access_SupervisorCoordinationFrameT(typeParsed: B): Docking_Access_Supervisor.CoordinationFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorCoordinationFrame)
      }
      val directive = readDocking_Access_SupervisorLifecycleDirectiveType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val qualified = reader.readB()
      val decisionContext = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.CoordinationFrame(directive, correlation, qualified, decisionContext)
    }

    def readDocking_Access_SupervisorCoordinationFrame_Payload(): Docking_Access_Supervisor.CoordinationFrame_Payload = {
      val r = readDocking_Access_SupervisorCoordinationFrame_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorCoordinationFrame_PayloadT(typeParsed: B): Docking_Access_Supervisor.CoordinationFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorCoordinationFrame_Payload)
      }
      val value = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.CoordinationFrame_Payload(value)
    }

    def readDocking_Access_SupervisorBerthTransitionEvidence(): Docking_Access_Supervisor.BerthTransitionEvidence = {
      val r = readDocking_Access_SupervisorBerthTransitionEvidenceT(F)
      return r
    }

    def readDocking_Access_SupervisorBerthTransitionEvidenceT(typeParsed: B): Docking_Access_Supervisor.BerthTransitionEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthTransitionEvidence)
      }
      val eventKind = readDocking_Access_SupervisorBerthEvidenceKindType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val qualified = reader.readB()
      return Docking_Access_Supervisor.BerthTransitionEvidence(eventKind, correlation, qualified)
    }

    def readDocking_Access_SupervisorBerthTransitionEvidence_Payload(): Docking_Access_Supervisor.BerthTransitionEvidence_Payload = {
      val r = readDocking_Access_SupervisorBerthTransitionEvidence_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorBerthTransitionEvidence_PayloadT(typeParsed: B): Docking_Access_Supervisor.BerthTransitionEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthTransitionEvidence_Payload)
      }
      val value = readDocking_Access_SupervisorBerthTransitionEvidence()
      return Docking_Access_Supervisor.BerthTransitionEvidence_Payload(value)
    }

    def readDocking_Access_SupervisorGateSafetyFrame(): Docking_Access_Supervisor.GateSafetyFrame = {
      val r = readDocking_Access_SupervisorGateSafetyFrameT(F)
      return r
    }

    def readDocking_Access_SupervisorGateSafetyFrameT(typeParsed: B): Docking_Access_Supervisor.GateSafetyFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorGateSafetyFrame)
      }
      val directive = readDocking_Access_SupervisorGateDirectiveType()
      val safeToOpen = reader.readB()
      val decisionContext = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.GateSafetyFrame(directive, safeToOpen, decisionContext)
    }

    def readDocking_Access_SupervisorGateSafetyFrame_Payload(): Docking_Access_Supervisor.GateSafetyFrame_Payload = {
      val r = readDocking_Access_SupervisorGateSafetyFrame_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorGateSafetyFrame_PayloadT(typeParsed: B): Docking_Access_Supervisor.GateSafetyFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorGateSafetyFrame_Payload)
      }
      val value = readDocking_Access_SupervisorGateSafetyFrame()
      return Docking_Access_Supervisor.GateSafetyFrame_Payload(value)
    }

    def readDocking_Access_SupervisorPriorityDirective(): Docking_Access_Supervisor.PriorityDirective = {
      val r = readDocking_Access_SupervisorPriorityDirectiveT(F)
      return r
    }

    def readDocking_Access_SupervisorPriorityDirectiveT(typeParsed: B): Docking_Access_Supervisor.PriorityDirective = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorPriorityDirective)
      }
      val priority = readDocking_Access_SupervisorPriorityKindType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val decisionContext = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.PriorityDirective(priority, correlation, decisionContext)
    }

    def readDocking_Access_SupervisorPriorityDirective_Payload(): Docking_Access_Supervisor.PriorityDirective_Payload = {
      val r = readDocking_Access_SupervisorPriorityDirective_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorPriorityDirective_PayloadT(typeParsed: B): Docking_Access_Supervisor.PriorityDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorPriorityDirective_Payload)
      }
      val value = readDocking_Access_SupervisorPriorityDirective()
      return Docking_Access_Supervisor.PriorityDirective_Payload(value)
    }

    def readDocking_Access_SupervisorDockingProposal(): Docking_Access_Supervisor.DockingProposal = {
      val r = readDocking_Access_SupervisorDockingProposalT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingProposalT(typeParsed: B): Docking_Access_Supervisor.DockingProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingProposal)
      }
      val applicable = reader.readB()
      val proposedAction = readDocking_Access_SupervisorSupervisoryActionType()
      val cause = readDocking_Access_SupervisorDecisionCauseType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val decisionContext = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.DockingProposal(applicable, proposedAction, cause, correlation, decisionContext)
    }

    def readDocking_Access_SupervisorDockingProposal_Payload(): Docking_Access_Supervisor.DockingProposal_Payload = {
      val r = readDocking_Access_SupervisorDockingProposal_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingProposal_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingProposal_Payload)
      }
      val value = readDocking_Access_SupervisorDockingProposal()
      return Docking_Access_Supervisor.DockingProposal_Payload(value)
    }

    def readDocking_Access_SupervisorAccessProposal(): Docking_Access_Supervisor.AccessProposal = {
      val r = readDocking_Access_SupervisorAccessProposalT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessProposalT(typeParsed: B): Docking_Access_Supervisor.AccessProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessProposal)
      }
      val applicable = reader.readB()
      val proposedAction = readDocking_Access_SupervisorSupervisoryActionType()
      val cause = readDocking_Access_SupervisorDecisionCauseType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val decisionContext = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.AccessProposal(applicable, proposedAction, cause, correlation, decisionContext)
    }

    def readDocking_Access_SupervisorAccessProposal_Payload(): Docking_Access_Supervisor.AccessProposal_Payload = {
      val r = readDocking_Access_SupervisorAccessProposal_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessProposal_PayloadT(typeParsed: B): Docking_Access_Supervisor.AccessProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessProposal_Payload)
      }
      val value = readDocking_Access_SupervisorAccessProposal()
      return Docking_Access_Supervisor.AccessProposal_Payload(value)
    }

    def readDocking_Access_SupervisorUndockingProposal(): Docking_Access_Supervisor.UndockingProposal = {
      val r = readDocking_Access_SupervisorUndockingProposalT(F)
      return r
    }

    def readDocking_Access_SupervisorUndockingProposalT(typeParsed: B): Docking_Access_Supervisor.UndockingProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorUndockingProposal)
      }
      val applicable = reader.readB()
      val proposedAction = readDocking_Access_SupervisorSupervisoryActionType()
      val cause = readDocking_Access_SupervisorDecisionCauseType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val decisionContext = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.UndockingProposal(applicable, proposedAction, cause, correlation, decisionContext)
    }

    def readDocking_Access_SupervisorUndockingProposal_Payload(): Docking_Access_Supervisor.UndockingProposal_Payload = {
      val r = readDocking_Access_SupervisorUndockingProposal_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorUndockingProposal_PayloadT(typeParsed: B): Docking_Access_Supervisor.UndockingProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorUndockingProposal_Payload)
      }
      val value = readDocking_Access_SupervisorUndockingProposal()
      return Docking_Access_Supervisor.UndockingProposal_Payload(value)
    }

    def readDocking_Access_SupervisorDockingDecisionFrame(): Docking_Access_Supervisor.DockingDecisionFrame = {
      val r = readDocking_Access_SupervisorDockingDecisionFrameT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingDecisionFrameT(typeParsed: B): Docking_Access_Supervisor.DockingDecisionFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingDecisionFrame)
      }
      val proposedAction = readDocking_Access_SupervisorSupervisoryActionType()
      val cause = readDocking_Access_SupervisorDecisionCauseType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val decisionContext = readDocking_Access_SupervisorDecisionContextType()
      return Docking_Access_Supervisor.DockingDecisionFrame(proposedAction, cause, correlation, decisionContext)
    }

    def readDocking_Access_SupervisorDockingDecisionFrame_Payload(): Docking_Access_Supervisor.DockingDecisionFrame_Payload = {
      val r = readDocking_Access_SupervisorDockingDecisionFrame_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingDecisionFrame_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingDecisionFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingDecisionFrame_Payload)
      }
      val value = readDocking_Access_SupervisorDockingDecisionFrame()
      return Docking_Access_Supervisor.DockingDecisionFrame_Payload(value)
    }

    def readDocking_Access_SupervisorDockingAccessResult(): Docking_Access_Supervisor.DockingAccessResult = {
      val r = readDocking_Access_SupervisorDockingAccessResultT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingAccessResultT(typeParsed: B): Docking_Access_Supervisor.DockingAccessResult = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingAccessResult)
      }
      val proposedAction = readDocking_Access_SupervisorSupervisoryActionType()
      val cause = readDocking_Access_SupervisorDecisionCauseType()
      val mode = readDocking_Access_SupervisorPublicModeType()
      val correlation = readDocking_Access_SupervisorCorrelationType()
      val disposition = readDocking_Access_SupervisorRequestDispositionType()
      val status = readDocking_Access_SupervisorAccessStatusType()
      val outcome = readDocking_Access_SupervisorDockingOutcomeType()
      return Docking_Access_Supervisor.DockingAccessResult(proposedAction, cause, mode, correlation, disposition, status, outcome)
    }

    def readDocking_Access_SupervisorDockingAccessResult_Payload(): Docking_Access_Supervisor.DockingAccessResult_Payload = {
      val r = readDocking_Access_SupervisorDockingAccessResult_PayloadT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingAccessResult_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingAccessResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingAccessResult_Payload)
      }
      val value = readDocking_Access_SupervisorDockingAccessResult()
      return Docking_Access_Supervisor.DockingAccessResult_Payload(value)
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

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container.")
          val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P = {
      val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P)
      }
      val api_access_request = readDocking_Access_SupervisorAccessRequestType()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P(api_access_request)
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS)
      }
      val api_access_request = readDocking_Access_SupervisorAccessRequestType()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS(api_access_request)
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container.")
          val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P = {
      val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P)
      }
      val api_request_facts = readDocking_Access_SupervisorRequestFacts()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P(api_request_facts)
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS)
      }
      val api_request_facts = readDocking_Access_SupervisorRequestFacts()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS(api_request_facts)
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container.")
          val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P = {
      val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P)
      }
      val api_vessel_status = readDocking_Access_SupervisorVesselStatusType()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(api_vessel_status)
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS)
      }
      val api_vessel_status = readDocking_Access_SupervisorVesselStatusType()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(api_vessel_status)
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container.")
          val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P = {
      val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P)
      }
      val api_vessel_facts = readDocking_Access_SupervisorVesselFacts()
      val api_vessel_readiness = readDocking_Access_SupervisorVesselFacts()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(api_vessel_facts, api_vessel_readiness)
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS)
      }
      val api_vessel_facts = readDocking_Access_SupervisorVesselFacts()
      val api_vessel_readiness = readDocking_Access_SupervisorVesselFacts()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(api_vessel_facts, api_vessel_readiness)
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container.")
          val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P = {
      val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P)
      }
      val api_station_report = readDocking_Access_SupervisorStationReportType()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(api_station_report)
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS)
      }
      val api_station_report = readDocking_Access_SupervisorStationReportType()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(api_station_report)
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container.")
          val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P = {
      val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P)
      }
      val api_station_facts = readDocking_Access_SupervisorStationFacts()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(api_station_facts)
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS)
      }
      val api_station_facts = readDocking_Access_SupervisorStationFacts()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(api_station_facts)
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container.")
          val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P = {
      val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P)
      }
      val api_service_activity = readDocking_Access_SupervisorServiceActivityType()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(api_service_activity)
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS)
      }
      val api_service_activity = readDocking_Access_SupervisorServiceActivityType()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(api_service_activity)
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container.")
          val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P = {
      val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P)
      }
      val api_service_facts = readDocking_Access_SupervisorServiceFacts()
      val api_service_readiness = readDocking_Access_SupervisorServiceFacts()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(api_service_facts, api_service_readiness)
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS)
      }
      val api_service_facts = readDocking_Access_SupervisorServiceFacts()
      val api_service_readiness = readDocking_Access_SupervisorServiceFacts()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(api_service_facts, api_service_readiness)
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container.")
          val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P = {
      val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P)
      }
      val api_admission_guard = readDocking_Access_SupervisorAdmissionGuard()
      val api_request_facts = readDocking_Access_SupervisorRequestFacts()
      val api_service_readiness = readDocking_Access_SupervisorServiceFacts()
      val api_vessel_readiness = readDocking_Access_SupervisorVesselFacts()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P(api_admission_guard, api_request_facts, api_service_readiness, api_vessel_readiness)
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS)
      }
      val api_admission_guard = readDocking_Access_SupervisorAdmissionGuard()
      val api_request_facts = readDocking_Access_SupervisorRequestFacts()
      val api_service_readiness = readDocking_Access_SupervisorServiceFacts()
      val api_vessel_readiness = readDocking_Access_SupervisorVesselFacts()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS(api_admission_guard, api_request_facts, api_service_readiness, api_vessel_readiness)
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container.")
          val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P = {
      val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P)
      }
      val api_access_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_docking_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_gate_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_lifecycle_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_request_disposition = readDocking_Access_SupervisorRequestDispositionType()
      val api_undocking_admission = readDocking_Access_SupervisorAdmissionDecision()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P(api_access_admission, api_docking_admission, api_gate_admission, api_lifecycle_admission, api_request_disposition, api_undocking_admission)
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS)
      }
      val api_access_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_docking_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_gate_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_lifecycle_admission = readDocking_Access_SupervisorAdmissionDecision()
      val api_request_disposition = readDocking_Access_SupervisorRequestDispositionType()
      val api_undocking_admission = readDocking_Access_SupervisorAdmissionDecision()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS(api_access_admission, api_docking_admission, api_gate_admission, api_lifecycle_admission, api_request_disposition, api_undocking_admission)
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container.")
          val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P = {
      val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P)
      }
      val api_control_event = readDocking_Access_SupervisorControlEventType()
      val api_prior_berth_state = readDocking_Access_SupervisorBerthStateType()
      val api_prior_gate_state = readDocking_Access_SupervisorGateStateType()
      val api_prior_lifecycle_view = readDocking_Access_SupervisorPriorLifecycleView()
      val api_prior_recovery_state = readDocking_Access_SupervisorRecoveryStateType()
      val api_service_facts = readDocking_Access_SupervisorServiceFacts()
      val api_station_facts = readDocking_Access_SupervisorStationFacts()
      val api_vessel_facts = readDocking_Access_SupervisorVesselFacts()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P(api_control_event, api_prior_berth_state, api_prior_gate_state, api_prior_lifecycle_view, api_prior_recovery_state, api_service_facts, api_station_facts, api_vessel_facts)
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS)
      }
      val api_control_event = readDocking_Access_SupervisorControlEventType()
      val api_prior_berth_state = readDocking_Access_SupervisorBerthStateType()
      val api_prior_gate_state = readDocking_Access_SupervisorGateStateType()
      val api_prior_lifecycle_view = readDocking_Access_SupervisorPriorLifecycleView()
      val api_prior_recovery_state = readDocking_Access_SupervisorRecoveryStateType()
      val api_service_facts = readDocking_Access_SupervisorServiceFacts()
      val api_station_facts = readDocking_Access_SupervisorStationFacts()
      val api_vessel_facts = readDocking_Access_SupervisorVesselFacts()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(api_control_event, api_prior_berth_state, api_prior_gate_state, api_prior_lifecycle_view, api_prior_recovery_state, api_service_facts, api_station_facts, api_vessel_facts)
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container.")
          val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P = {
      val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P)
      }
      val api_access_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_admission_guard = readDocking_Access_SupervisorAdmissionGuard()
      val api_berth_transition_evidence = readDocking_Access_SupervisorBerthTransitionEvidence()
      val api_docking_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_gate_safety_frame = readDocking_Access_SupervisorGateSafetyFrame()
      val api_lifecycle_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_priority_directive = readDocking_Access_SupervisorPriorityDirective()
      val api_recovery_transition = readDocking_Access_SupervisorRecoveryTransition()
      val api_undocking_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P(api_access_frame, api_admission_guard, api_berth_transition_evidence, api_docking_frame, api_gate_safety_frame, api_lifecycle_frame, api_priority_directive, api_recovery_transition, api_undocking_frame)
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS)
      }
      val api_access_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_admission_guard = readDocking_Access_SupervisorAdmissionGuard()
      val api_berth_transition_evidence = readDocking_Access_SupervisorBerthTransitionEvidence()
      val api_docking_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_gate_safety_frame = readDocking_Access_SupervisorGateSafetyFrame()
      val api_lifecycle_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_priority_directive = readDocking_Access_SupervisorPriorityDirective()
      val api_recovery_transition = readDocking_Access_SupervisorRecoveryTransition()
      val api_undocking_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(api_access_frame, api_admission_guard, api_berth_transition_evidence, api_docking_frame, api_gate_safety_frame, api_lifecycle_frame, api_priority_directive, api_recovery_transition, api_undocking_frame)
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container.")
          val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P = {
      val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_lifecycle_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(api_admission_decision, api_lifecycle_frame)
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_lifecycle_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(api_admission_decision, api_lifecycle_frame)
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container.")
          val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P = {
      val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P)
      }
      val api_prior_lifecycle_view = readDocking_Access_SupervisorPriorLifecycleView()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(api_prior_lifecycle_view)
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS)
      }
      val api_prior_lifecycle_view = readDocking_Access_SupervisorPriorLifecycleView()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(api_prior_lifecycle_view)
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container.")
          val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P = {
      val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P)
      }
      val api_berth_transition_evidence = readDocking_Access_SupervisorBerthTransitionEvidence()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(api_berth_transition_evidence)
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS)
      }
      val api_berth_transition_evidence = readDocking_Access_SupervisorBerthTransitionEvidence()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(api_berth_transition_evidence)
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container.")
          val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P = {
      val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P)
      }
      val api_prior_berth_state = readDocking_Access_SupervisorBerthStateType()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(api_prior_berth_state)
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS)
      }
      val api_prior_berth_state = readDocking_Access_SupervisorBerthStateType()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(api_prior_berth_state)
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container.")
          val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P = {
      val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_gate_safety_frame = readDocking_Access_SupervisorGateSafetyFrame()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(api_admission_decision, api_gate_safety_frame)
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_gate_safety_frame = readDocking_Access_SupervisorGateSafetyFrame()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(api_admission_decision, api_gate_safety_frame)
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container.")
          val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P = {
      val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P)
      }
      val api_prior_gate_state = readDocking_Access_SupervisorGateStateType()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(api_prior_gate_state)
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS)
      }
      val api_prior_gate_state = readDocking_Access_SupervisorGateStateType()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(api_prior_gate_state)
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container.")
          val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P = {
      val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P)
      }
      val api_recovery_transition = readDocking_Access_SupervisorRecoveryTransition()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(api_recovery_transition)
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS)
      }
      val api_recovery_transition = readDocking_Access_SupervisorRecoveryTransition()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(api_recovery_transition)
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container.")
          val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P = {
      val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P)
      }
      val api_prior_recovery_state = readDocking_Access_SupervisorRecoveryStateType()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(api_prior_recovery_state)
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS)
      }
      val api_prior_recovery_state = readDocking_Access_SupervisorRecoveryStateType()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(api_prior_recovery_state)
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container.")
          val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P = {
      val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_docking_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(api_admission_decision, api_docking_frame)
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_docking_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(api_admission_decision, api_docking_frame)
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container.")
          val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P = {
      val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P)
      }
      val api_docking_proposal = readDocking_Access_SupervisorDockingProposal()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(api_docking_proposal)
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS)
      }
      val api_docking_proposal = readDocking_Access_SupervisorDockingProposal()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(api_docking_proposal)
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container.")
          val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P = {
      val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P)
      }
      val api_access_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(api_access_frame, api_admission_decision)
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS)
      }
      val api_access_frame = readDocking_Access_SupervisorCoordinationFrame()
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(api_access_frame, api_admission_decision)
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container.")
          val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P = {
      val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P)
      }
      val api_access_proposal = readDocking_Access_SupervisorAccessProposal()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(api_access_proposal)
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS)
      }
      val api_access_proposal = readDocking_Access_SupervisorAccessProposal()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(api_access_proposal)
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container.")
          val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P = {
      val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_undocking_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(api_admission_decision, api_undocking_frame)
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS)
      }
      val api_admission_decision = readDocking_Access_SupervisorAdmissionDecision()
      val api_undocking_frame = readDocking_Access_SupervisorCoordinationFrame()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(api_admission_decision, api_undocking_frame)
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container.")
          val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P = {
      val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P)
      }
      val api_undocking_proposal = readDocking_Access_SupervisorUndockingProposal()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(api_undocking_proposal)
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS)
      }
      val api_undocking_proposal = readDocking_Access_SupervisorUndockingProposal()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(api_undocking_proposal)
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container.")
          val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P = {
      val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P)
      }
      val api_access_proposal = readDocking_Access_SupervisorAccessProposal()
      val api_docking_proposal = readDocking_Access_SupervisorDockingProposal()
      val api_priority_directive = readDocking_Access_SupervisorPriorityDirective()
      val api_undocking_proposal = readDocking_Access_SupervisorUndockingProposal()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(api_access_proposal, api_docking_proposal, api_priority_directive, api_undocking_proposal)
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS)
      }
      val api_access_proposal = readDocking_Access_SupervisorAccessProposal()
      val api_docking_proposal = readDocking_Access_SupervisorDockingProposal()
      val api_priority_directive = readDocking_Access_SupervisorPriorityDirective()
      val api_undocking_proposal = readDocking_Access_SupervisorUndockingProposal()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(api_access_proposal, api_docking_proposal, api_priority_directive, api_undocking_proposal)
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container.")
          val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P = {
      val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P)
      }
      val api_docking_decision = readDocking_Access_SupervisorDockingDecisionFrame()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(api_docking_decision)
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS)
      }
      val api_docking_decision = readDocking_Access_SupervisorDockingDecisionFrame()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(api_docking_decision)
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container.")
          val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P = {
      val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P)
      }
      val api_docking_decision = readDocking_Access_SupervisorDockingDecisionFrame()
      val api_request_disposition = readDocking_Access_SupervisorRequestDispositionType()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P(api_docking_decision, api_request_disposition)
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS = {
      val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS)
      }
      val api_docking_decision = readDocking_Access_SupervisorDockingDecisionFrame()
      val api_request_disposition = readDocking_Access_SupervisorRequestDispositionType()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS(api_docking_decision, api_request_disposition)
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container.")
          val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P = {
      val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(F)
      return r
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P)
      }
      val api_docking_access_result = readDocking_Access_SupervisorDockingAccessResult()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P(api_docking_access_result)
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS = {
      val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(F)
      return r
    }

    def readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS)
      }
      val api_docking_access_result = readDocking_Access_SupervisorDockingAccessResult()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS(api_docking_access_result)
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
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T)
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
        case Constants.Docking_Access_SupervisorGateState_Payload => val r = readDocking_Access_SupervisorGateState_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorBerthState_Payload => val r = readDocking_Access_SupervisorBerthState_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorPublicMode_Payload => val r = readDocking_Access_SupervisorPublicMode_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorCorrelation_Payload => val r = readDocking_Access_SupervisorCorrelation_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorVesselClass_Payload => val r = readDocking_Access_SupervisorVesselClass_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorVesselFacts_Payload => val r = readDocking_Access_SupervisorVesselFacts_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorAccessStatus_Payload => val r = readDocking_Access_SupervisorAccessStatus_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorServiceClass_Payload => val r = readDocking_Access_SupervisorServiceClass_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorPriorityKind_Payload => val r = readDocking_Access_SupervisorPriorityKind_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorControlEvent_Payload => val r = readDocking_Access_SupervisorControlEvent_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorVesselStatus_Payload => val r = readDocking_Access_SupervisorVesselStatus_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorServiceFacts_Payload => val r = readDocking_Access_SupervisorServiceFacts_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorRequestFacts_Payload => val r = readDocking_Access_SupervisorRequestFacts_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorStationFacts_Payload => val r = readDocking_Access_SupervisorStationFacts_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorRecoveryState_Payload => val r = readDocking_Access_SupervisorRecoveryState_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorGateDirective_Payload => val r = readDocking_Access_SupervisorGateDirective_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorAccessRequest_Payload => val r = readDocking_Access_SupervisorAccessRequest_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorStationReport_Payload => val r = readDocking_Access_SupervisorStationReport_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorDecisionCause_Payload => val r = readDocking_Access_SupervisorDecisionCause_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorRecoveryIntent_Payload => val r = readDocking_Access_SupervisorRecoveryIntent_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorDockingOutcome_Payload => val r = readDocking_Access_SupervisorDockingOutcome_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorLifecycleState_Payload => val r = readDocking_Access_SupervisorLifecycleState_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorAdmissionGuard_Payload => val r = readDocking_Access_SupervisorAdmissionGuard_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorAccessProposal_Payload => val r = readDocking_Access_SupervisorAccessProposal_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorServiceActivity_Payload => val r = readDocking_Access_SupervisorServiceActivity_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorStationProgress_Payload => val r = readDocking_Access_SupervisorStationProgress_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorDecisionContext_Payload => val r = readDocking_Access_SupervisorDecisionContext_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorGateSafetyFrame_Payload => val r = readDocking_Access_SupervisorGateSafetyFrame_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorDockingProposal_Payload => val r = readDocking_Access_SupervisorDockingProposal_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorRequestOperation_Payload => val r = readDocking_Access_SupervisorRequestOperation_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorSupervisoryAction_Payload => val r = readDocking_Access_SupervisorSupervisoryAction_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorBerthEvidenceKind_Payload => val r = readDocking_Access_SupervisorBerthEvidenceKind_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorPriorityDirective_Payload => val r = readDocking_Access_SupervisorPriorityDirective_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorCoordinationFrame_Payload => val r = readDocking_Access_SupervisorCoordinationFrame_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorAdmissionDecision_Payload => val r = readDocking_Access_SupervisorAdmissionDecision_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorUndockingProposal_Payload => val r = readDocking_Access_SupervisorUndockingProposal_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorRequestDisposition_Payload => val r = readDocking_Access_SupervisorRequestDisposition_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorLifecycleDirective_Payload => val r = readDocking_Access_SupervisorLifecycleDirective_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorPriorLifecycleView_Payload => val r = readDocking_Access_SupervisorPriorLifecycleView_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorRecoveryTransition_Payload => val r = readDocking_Access_SupervisorRecoveryTransition_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorDockingAccessResult_Payload => val r = readDocking_Access_SupervisorDockingAccessResult_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorDockingDecisionFrame_Payload => val r = readDocking_Access_SupervisorDockingDecisionFrame_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorBerthTransitionEvidence_Payload => val r = readDocking_Access_SupervisorBerthTransitionEvidence_PayloadT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => val r = readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => val r = readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS => val r = readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS => val r = readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => val r = readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => val r = readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS => val r = readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => val r = readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => val r = readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T)
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

  def fromDocking_Access_SupervisorAccessRequest_Payload(o: Docking_Access_Supervisor.AccessRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessRequest_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessRequest_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessRequest_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessRequest_Payload(reader: Reader): Docking_Access_Supervisor.AccessRequest_Payload = {
      val r = reader.readDocking_Access_SupervisorAccessRequest_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessRequest_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRequestOperation_Payload(o: Docking_Access_Supervisor.RequestOperation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestOperation_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestOperation_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestOperation_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestOperation_Payload(reader: Reader): Docking_Access_Supervisor.RequestOperation_Payload = {
      val r = reader.readDocking_Access_SupervisorRequestOperation_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestOperation_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorCorrelation_Payload(o: Docking_Access_Supervisor.Correlation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorCorrelation_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorCorrelation_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.Correlation_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorCorrelation_Payload(reader: Reader): Docking_Access_Supervisor.Correlation_Payload = {
      val r = reader.readDocking_Access_SupervisorCorrelation_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorCorrelation_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatus_Payload(o: Docking_Access_Supervisor.VesselStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselStatus_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselStatus_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselStatus_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatus_Payload(reader: Reader): Docking_Access_Supervisor.VesselStatus_Payload = {
      val r = reader.readDocking_Access_SupervisorVesselStatus_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselStatus_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorVesselClass_Payload(o: Docking_Access_Supervisor.VesselClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselClass_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselClass_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselClass_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselClass_Payload(reader: Reader): Docking_Access_Supervisor.VesselClass_Payload = {
      val r = reader.readDocking_Access_SupervisorVesselClass_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselClass_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorStationReport_Payload(o: Docking_Access_Supervisor.StationReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationReport_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationReport_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationReport_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReport_Payload(reader: Reader): Docking_Access_Supervisor.StationReport_Payload = {
      val r = reader.readDocking_Access_SupervisorStationReport_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationReport_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorStationProgress_Payload(o: Docking_Access_Supervisor.StationProgress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationProgress_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationProgress_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationProgress_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationProgress_Payload(reader: Reader): Docking_Access_Supervisor.StationProgress_Payload = {
      val r = reader.readDocking_Access_SupervisorStationProgress_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationProgress_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivity_Payload(o: Docking_Access_Supervisor.ServiceActivity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceActivity_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceActivity_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceActivity_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivity_Payload(reader: Reader): Docking_Access_Supervisor.ServiceActivity_Payload = {
      val r = reader.readDocking_Access_SupervisorServiceActivity_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceActivity_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorServiceClass_Payload(o: Docking_Access_Supervisor.ServiceClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceClass_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceClass_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceClass_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceClass_Payload(reader: Reader): Docking_Access_Supervisor.ServiceClass_Payload = {
      val r = reader.readDocking_Access_SupervisorServiceClass_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceClass_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorLifecycleState_Payload(o: Docking_Access_Supervisor.LifecycleState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorLifecycleState_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorLifecycleState_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.LifecycleState_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorLifecycleState_Payload(reader: Reader): Docking_Access_Supervisor.LifecycleState_Payload = {
      val r = reader.readDocking_Access_SupervisorLifecycleState_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorLifecycleState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRequestDisposition_Payload(o: Docking_Access_Supervisor.RequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestDisposition_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestDisposition_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestDisposition_Payload(reader: Reader): Docking_Access_Supervisor.RequestDisposition_Payload = {
      val r = reader.readDocking_Access_SupervisorRequestDisposition_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestDisposition_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorControlEvent_Payload(o: Docking_Access_Supervisor.ControlEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorControlEvent_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorControlEvent_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.ControlEvent_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorControlEvent_Payload(reader: Reader): Docking_Access_Supervisor.ControlEvent_Payload = {
      val r = reader.readDocking_Access_SupervisorControlEvent_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorControlEvent_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorBerthState_Payload(o: Docking_Access_Supervisor.BerthState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthState_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthState_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthState_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthState_Payload(reader: Reader): Docking_Access_Supervisor.BerthState_Payload = {
      val r = reader.readDocking_Access_SupervisorBerthState_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorGateState_Payload(o: Docking_Access_Supervisor.GateState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorGateState_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorGateState_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.GateState_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorGateState_Payload(reader: Reader): Docking_Access_Supervisor.GateState_Payload = {
      val r = reader.readDocking_Access_SupervisorGateState_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorGateState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryState_Payload(o: Docking_Access_Supervisor.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoveryState_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoveryState_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryState_Payload(reader: Reader): Docking_Access_Supervisor.RecoveryState_Payload = {
      val r = reader.readDocking_Access_SupervisorRecoveryState_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoveryState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryIntent_Payload(o: Docking_Access_Supervisor.RecoveryIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoveryIntent_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoveryIntent_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoveryIntent_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryIntent_Payload(reader: Reader): Docking_Access_Supervisor.RecoveryIntent_Payload = {
      val r = reader.readDocking_Access_SupervisorRecoveryIntent_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoveryIntent_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorLifecycleDirective_Payload(o: Docking_Access_Supervisor.LifecycleDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorLifecycleDirective_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorLifecycleDirective_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.LifecycleDirective_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorLifecycleDirective_Payload(reader: Reader): Docking_Access_Supervisor.LifecycleDirective_Payload = {
      val r = reader.readDocking_Access_SupervisorLifecycleDirective_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorLifecycleDirective_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDecisionContext_Payload(o: Docking_Access_Supervisor.DecisionContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDecisionContext_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorDecisionContext_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.DecisionContext_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDecisionContext_Payload(reader: Reader): Docking_Access_Supervisor.DecisionContext_Payload = {
      val r = reader.readDocking_Access_SupervisorDecisionContext_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDecisionContext_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorBerthEvidenceKind_Payload(o: Docking_Access_Supervisor.BerthEvidenceKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthEvidenceKind_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthEvidenceKind_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthEvidenceKind_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthEvidenceKind_Payload(reader: Reader): Docking_Access_Supervisor.BerthEvidenceKind_Payload = {
      val r = reader.readDocking_Access_SupervisorBerthEvidenceKind_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthEvidenceKind_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorGateDirective_Payload(o: Docking_Access_Supervisor.GateDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorGateDirective_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorGateDirective_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.GateDirective_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorGateDirective_Payload(reader: Reader): Docking_Access_Supervisor.GateDirective_Payload = {
      val r = reader.readDocking_Access_SupervisorGateDirective_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorGateDirective_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPriorityKind_Payload(o: Docking_Access_Supervisor.PriorityKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorPriorityKind_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorPriorityKind_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.PriorityKind_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorityKind_Payload(reader: Reader): Docking_Access_Supervisor.PriorityKind_Payload = {
      val r = reader.readDocking_Access_SupervisorPriorityKind_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorPriorityKind_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorSupervisoryAction_Payload(o: Docking_Access_Supervisor.SupervisoryAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorSupervisoryAction_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorSupervisoryAction_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.SupervisoryAction_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorSupervisoryAction_Payload(reader: Reader): Docking_Access_Supervisor.SupervisoryAction_Payload = {
      val r = reader.readDocking_Access_SupervisorSupervisoryAction_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorSupervisoryAction_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDecisionCause_Payload(o: Docking_Access_Supervisor.DecisionCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDecisionCause_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorDecisionCause_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.DecisionCause_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDecisionCause_Payload(reader: Reader): Docking_Access_Supervisor.DecisionCause_Payload = {
      val r = reader.readDocking_Access_SupervisorDecisionCause_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDecisionCause_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPublicMode_Payload(o: Docking_Access_Supervisor.PublicMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorPublicMode_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorPublicMode_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.PublicMode_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorPublicMode_Payload(reader: Reader): Docking_Access_Supervisor.PublicMode_Payload = {
      val r = reader.readDocking_Access_SupervisorPublicMode_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorPublicMode_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAccessStatus_Payload(o: Docking_Access_Supervisor.AccessStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessStatus_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessStatus_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessStatus_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessStatus_Payload(reader: Reader): Docking_Access_Supervisor.AccessStatus_Payload = {
      val r = reader.readDocking_Access_SupervisorAccessStatus_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessStatus_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingOutcome_Payload(o: Docking_Access_Supervisor.DockingOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingOutcome_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingOutcome_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingOutcome_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingOutcome_Payload(reader: Reader): Docking_Access_Supervisor.DockingOutcome_Payload = {
      val r = reader.readDocking_Access_SupervisorDockingOutcome_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingOutcome_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRequestFacts(o: Docking_Access_Supervisor.RequestFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestFacts(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestFacts(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestFacts, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestFacts(reader: Reader): Docking_Access_Supervisor.RequestFacts = {
      val r = reader.readDocking_Access_SupervisorRequestFacts()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestFacts _)
    return r
  }

  def fromDocking_Access_SupervisorRequestFacts_Payload(o: Docking_Access_Supervisor.RequestFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestFacts_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestFacts_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestFacts_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestFacts_Payload(reader: Reader): Docking_Access_Supervisor.RequestFacts_Payload = {
      val r = reader.readDocking_Access_SupervisorRequestFacts_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorVesselFacts(o: Docking_Access_Supervisor.VesselFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselFacts(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselFacts(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselFacts, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselFacts(reader: Reader): Docking_Access_Supervisor.VesselFacts = {
      val r = reader.readDocking_Access_SupervisorVesselFacts()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselFacts _)
    return r
  }

  def fromDocking_Access_SupervisorVesselFacts_Payload(o: Docking_Access_Supervisor.VesselFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselFacts_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselFacts_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselFacts_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselFacts_Payload(reader: Reader): Docking_Access_Supervisor.VesselFacts_Payload = {
      val r = reader.readDocking_Access_SupervisorVesselFacts_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorStationFacts(o: Docking_Access_Supervisor.StationFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationFacts(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationFacts(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationFacts, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationFacts(reader: Reader): Docking_Access_Supervisor.StationFacts = {
      val r = reader.readDocking_Access_SupervisorStationFacts()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationFacts _)
    return r
  }

  def fromDocking_Access_SupervisorStationFacts_Payload(o: Docking_Access_Supervisor.StationFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationFacts_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationFacts_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationFacts_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationFacts_Payload(reader: Reader): Docking_Access_Supervisor.StationFacts_Payload = {
      val r = reader.readDocking_Access_SupervisorStationFacts_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorServiceFacts(o: Docking_Access_Supervisor.ServiceFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceFacts(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceFacts(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceFacts, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceFacts(reader: Reader): Docking_Access_Supervisor.ServiceFacts = {
      val r = reader.readDocking_Access_SupervisorServiceFacts()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceFacts _)
    return r
  }

  def fromDocking_Access_SupervisorServiceFacts_Payload(o: Docking_Access_Supervisor.ServiceFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceFacts_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceFacts_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceFacts_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceFacts_Payload(reader: Reader): Docking_Access_Supervisor.ServiceFacts_Payload = {
      val r = reader.readDocking_Access_SupervisorServiceFacts_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionGuard(o: Docking_Access_Supervisor.AdmissionGuard, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAdmissionGuard(o)
    return w.result
  }

  def toDocking_Access_SupervisorAdmissionGuard(data: ISZ[U8]): Either[Docking_Access_Supervisor.AdmissionGuard, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionGuard(reader: Reader): Docking_Access_Supervisor.AdmissionGuard = {
      val r = reader.readDocking_Access_SupervisorAdmissionGuard()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAdmissionGuard _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionGuard_Payload(o: Docking_Access_Supervisor.AdmissionGuard_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAdmissionGuard_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorAdmissionGuard_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.AdmissionGuard_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionGuard_Payload(reader: Reader): Docking_Access_Supervisor.AdmissionGuard_Payload = {
      val r = reader.readDocking_Access_SupervisorAdmissionGuard_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAdmissionGuard_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPriorLifecycleView(o: Docking_Access_Supervisor.PriorLifecycleView, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorPriorLifecycleView(o)
    return w.result
  }

  def toDocking_Access_SupervisorPriorLifecycleView(data: ISZ[U8]): Either[Docking_Access_Supervisor.PriorLifecycleView, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorLifecycleView(reader: Reader): Docking_Access_Supervisor.PriorLifecycleView = {
      val r = reader.readDocking_Access_SupervisorPriorLifecycleView()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorPriorLifecycleView _)
    return r
  }

  def fromDocking_Access_SupervisorPriorLifecycleView_Payload(o: Docking_Access_Supervisor.PriorLifecycleView_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorPriorLifecycleView_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorPriorLifecycleView_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.PriorLifecycleView_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorLifecycleView_Payload(reader: Reader): Docking_Access_Supervisor.PriorLifecycleView_Payload = {
      val r = reader.readDocking_Access_SupervisorPriorLifecycleView_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorPriorLifecycleView_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionDecision(o: Docking_Access_Supervisor.AdmissionDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAdmissionDecision(o)
    return w.result
  }

  def toDocking_Access_SupervisorAdmissionDecision(data: ISZ[U8]): Either[Docking_Access_Supervisor.AdmissionDecision, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionDecision(reader: Reader): Docking_Access_Supervisor.AdmissionDecision = {
      val r = reader.readDocking_Access_SupervisorAdmissionDecision()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAdmissionDecision _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionDecision_Payload(o: Docking_Access_Supervisor.AdmissionDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAdmissionDecision_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorAdmissionDecision_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.AdmissionDecision_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionDecision_Payload(reader: Reader): Docking_Access_Supervisor.AdmissionDecision_Payload = {
      val r = reader.readDocking_Access_SupervisorAdmissionDecision_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAdmissionDecision_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryTransition(o: Docking_Access_Supervisor.RecoveryTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoveryTransition(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoveryTransition(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoveryTransition, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryTransition(reader: Reader): Docking_Access_Supervisor.RecoveryTransition = {
      val r = reader.readDocking_Access_SupervisorRecoveryTransition()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoveryTransition _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryTransition_Payload(o: Docking_Access_Supervisor.RecoveryTransition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoveryTransition_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoveryTransition_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoveryTransition_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryTransition_Payload(reader: Reader): Docking_Access_Supervisor.RecoveryTransition_Payload = {
      val r = reader.readDocking_Access_SupervisorRecoveryTransition_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoveryTransition_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorCoordinationFrame(o: Docking_Access_Supervisor.CoordinationFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorCoordinationFrame(o)
    return w.result
  }

  def toDocking_Access_SupervisorCoordinationFrame(data: ISZ[U8]): Either[Docking_Access_Supervisor.CoordinationFrame, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorCoordinationFrame(reader: Reader): Docking_Access_Supervisor.CoordinationFrame = {
      val r = reader.readDocking_Access_SupervisorCoordinationFrame()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorCoordinationFrame _)
    return r
  }

  def fromDocking_Access_SupervisorCoordinationFrame_Payload(o: Docking_Access_Supervisor.CoordinationFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorCoordinationFrame_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorCoordinationFrame_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.CoordinationFrame_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorCoordinationFrame_Payload(reader: Reader): Docking_Access_Supervisor.CoordinationFrame_Payload = {
      val r = reader.readDocking_Access_SupervisorCoordinationFrame_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorCoordinationFrame_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorBerthTransitionEvidence(o: Docking_Access_Supervisor.BerthTransitionEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthTransitionEvidence(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthTransitionEvidence(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthTransitionEvidence, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthTransitionEvidence(reader: Reader): Docking_Access_Supervisor.BerthTransitionEvidence = {
      val r = reader.readDocking_Access_SupervisorBerthTransitionEvidence()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthTransitionEvidence _)
    return r
  }

  def fromDocking_Access_SupervisorBerthTransitionEvidence_Payload(o: Docking_Access_Supervisor.BerthTransitionEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthTransitionEvidence_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthTransitionEvidence_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthTransitionEvidence_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthTransitionEvidence_Payload(reader: Reader): Docking_Access_Supervisor.BerthTransitionEvidence_Payload = {
      val r = reader.readDocking_Access_SupervisorBerthTransitionEvidence_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthTransitionEvidence_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorGateSafetyFrame(o: Docking_Access_Supervisor.GateSafetyFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorGateSafetyFrame(o)
    return w.result
  }

  def toDocking_Access_SupervisorGateSafetyFrame(data: ISZ[U8]): Either[Docking_Access_Supervisor.GateSafetyFrame, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorGateSafetyFrame(reader: Reader): Docking_Access_Supervisor.GateSafetyFrame = {
      val r = reader.readDocking_Access_SupervisorGateSafetyFrame()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorGateSafetyFrame _)
    return r
  }

  def fromDocking_Access_SupervisorGateSafetyFrame_Payload(o: Docking_Access_Supervisor.GateSafetyFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorGateSafetyFrame_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorGateSafetyFrame_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.GateSafetyFrame_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorGateSafetyFrame_Payload(reader: Reader): Docking_Access_Supervisor.GateSafetyFrame_Payload = {
      val r = reader.readDocking_Access_SupervisorGateSafetyFrame_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorGateSafetyFrame_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPriorityDirective(o: Docking_Access_Supervisor.PriorityDirective, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorPriorityDirective(o)
    return w.result
  }

  def toDocking_Access_SupervisorPriorityDirective(data: ISZ[U8]): Either[Docking_Access_Supervisor.PriorityDirective, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorityDirective(reader: Reader): Docking_Access_Supervisor.PriorityDirective = {
      val r = reader.readDocking_Access_SupervisorPriorityDirective()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorPriorityDirective _)
    return r
  }

  def fromDocking_Access_SupervisorPriorityDirective_Payload(o: Docking_Access_Supervisor.PriorityDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorPriorityDirective_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorPriorityDirective_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.PriorityDirective_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorityDirective_Payload(reader: Reader): Docking_Access_Supervisor.PriorityDirective_Payload = {
      val r = reader.readDocking_Access_SupervisorPriorityDirective_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorPriorityDirective_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingProposal(o: Docking_Access_Supervisor.DockingProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingProposal(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingProposal(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingProposal, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingProposal(reader: Reader): Docking_Access_Supervisor.DockingProposal = {
      val r = reader.readDocking_Access_SupervisorDockingProposal()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingProposal _)
    return r
  }

  def fromDocking_Access_SupervisorDockingProposal_Payload(o: Docking_Access_Supervisor.DockingProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingProposal_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingProposal_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingProposal_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingProposal_Payload(reader: Reader): Docking_Access_Supervisor.DockingProposal_Payload = {
      val r = reader.readDocking_Access_SupervisorDockingProposal_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingProposal_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAccessProposal(o: Docking_Access_Supervisor.AccessProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessProposal(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessProposal(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessProposal, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessProposal(reader: Reader): Docking_Access_Supervisor.AccessProposal = {
      val r = reader.readDocking_Access_SupervisorAccessProposal()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessProposal _)
    return r
  }

  def fromDocking_Access_SupervisorAccessProposal_Payload(o: Docking_Access_Supervisor.AccessProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessProposal_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessProposal_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessProposal_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessProposal_Payload(reader: Reader): Docking_Access_Supervisor.AccessProposal_Payload = {
      val r = reader.readDocking_Access_SupervisorAccessProposal_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessProposal_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingProposal(o: Docking_Access_Supervisor.UndockingProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingProposal(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingProposal(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingProposal, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingProposal(reader: Reader): Docking_Access_Supervisor.UndockingProposal = {
      val r = reader.readDocking_Access_SupervisorUndockingProposal()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingProposal _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingProposal_Payload(o: Docking_Access_Supervisor.UndockingProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingProposal_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingProposal_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingProposal_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingProposal_Payload(reader: Reader): Docking_Access_Supervisor.UndockingProposal_Payload = {
      val r = reader.readDocking_Access_SupervisorUndockingProposal_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingProposal_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingDecisionFrame(o: Docking_Access_Supervisor.DockingDecisionFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingDecisionFrame(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingDecisionFrame(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingDecisionFrame, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingDecisionFrame(reader: Reader): Docking_Access_Supervisor.DockingDecisionFrame = {
      val r = reader.readDocking_Access_SupervisorDockingDecisionFrame()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingDecisionFrame _)
    return r
  }

  def fromDocking_Access_SupervisorDockingDecisionFrame_Payload(o: Docking_Access_Supervisor.DockingDecisionFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingDecisionFrame_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingDecisionFrame_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingDecisionFrame_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingDecisionFrame_Payload(reader: Reader): Docking_Access_Supervisor.DockingDecisionFrame_Payload = {
      val r = reader.readDocking_Access_SupervisorDockingDecisionFrame_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingDecisionFrame_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingAccessResult(o: Docking_Access_Supervisor.DockingAccessResult, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingAccessResult(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingAccessResult(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingAccessResult, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingAccessResult(reader: Reader): Docking_Access_Supervisor.DockingAccessResult = {
      val r = reader.readDocking_Access_SupervisorDockingAccessResult()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingAccessResult _)
    return r
  }

  def fromDocking_Access_SupervisorDockingAccessResult_Payload(o: Docking_Access_Supervisor.DockingAccessResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingAccessResult_Payload(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingAccessResult_Payload(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingAccessResult_Payload, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingAccessResult_Payload(reader: Reader): Docking_Access_Supervisor.DockingAccessResult_Payload = {
      val r = reader.readDocking_Access_SupervisorDockingAccessResult_Payload()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingAccessResult_Payload _)
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

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(reader: Reader): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(reader: Reader): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(reader: Reader): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(reader: Reader): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(reader: Reader): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(reader: Reader): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(reader: Reader): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(reader: Reader): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(reader: Reader): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(reader: Reader): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(reader: Reader): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(reader: Reader): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(reader: Reader): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(reader: Reader): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(reader: Reader): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(reader: Reader): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(reader: Reader): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(reader: Reader): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(reader: Reader): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(reader: Reader): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(reader: Reader): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(reader: Reader): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(reader: Reader): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(reader: Reader): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(reader: Reader): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(reader: Reader): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(reader: Reader): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(reader: Reader): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(reader: Reader): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container = {
      val r = reader.readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(reader: Reader): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P = {
      val r = reader.readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(reader: Reader): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(o)
    return w.result
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(data: ISZ[U8]): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(reader: Reader): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container = {
      val r = reader.readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
    return w.result
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(data: ISZ[U8]): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(reader: Reader): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P = {
      val r = reader.readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
    return w.result
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(data: ISZ[U8]): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(reader: Reader): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS = {
      val r = reader.readDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS _)
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