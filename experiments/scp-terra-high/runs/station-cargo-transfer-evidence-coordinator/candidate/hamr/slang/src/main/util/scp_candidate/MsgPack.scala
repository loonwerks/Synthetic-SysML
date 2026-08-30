// #Sireum
// @formatter:off

// This file is auto-generated from TransferRequest.scala, RequestKind.scala, Correlation.scala, DockContext.scala, DockReason.scala, ShipReport.scala, ShipReportClass.scala, ShipReportValue.scala, WarehouseReport.scala, WarehouseReportClass.scala, WarehouseReportValue.scala, SessionState.scala, FaultTrigger.scala, OrdinaryInhibition.scala, RequestDisposition.scala, RequestLedger.scala, ControlEvent.scala, RecoveryState.scala, ShipEvidenceState.scala, WarehouseEvidenceState.scala, RecoveryIntent.scala, ProgressClass.scala, TransferOutcome.scala, ShipUpdate.scala, WarehouseUpdate.scala, PriorityKind.scala, ProposalKind.scala, TransferAction.scala, DecisionCause.scala, DecisionOutcomeValue.scala, CoordinationMode.scala, PublicRequestDisposition.scala, PublicTransferOutcome.scala, RequestFacts.scala, DockFacts.scala, ShipReportFacts.scala, WarehouseReportFacts.scala, SessionView.scala, CoordinationGuard.scala, AdmissionDecision.scala, RecoveryTransition.scala, CoordinationFrame.scala, PriorityDirective.scala, ActionProposal.scala, TransferDecision.scala, TransferCoordinationResult.scala, Base_Types.scala, RequestAcquisition_cargo_coordination_process_request_acquisition_Containers.scala, DockContextAssessment_cargo_coordination_process_dock_context_assessment_Containers.scala, ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_Containers.scala, WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_Containers.scala, RequestAdmission_cargo_coordination_process_request_admission_Containers.scala, EvidenceCoherence_cargo_coordination_process_evidence_coherence_Containers.scala, TransferSession_cargo_coordination_process_transfer_session_Containers.scala, ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_Containers.scala, WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_Containers.scala, RecoverySupervisor_cargo_coordination_process_recovery_supervisor_Containers.scala, RequestActionEligibility_cargo_coordination_process_request_action_eligibility_Containers.scala, ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_Containers.scala, WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_Containers.scala, TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_Containers.scala, ResultComposition_cargo_coordination_process_result_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload: Z = -32

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload: Z = -31

    val Mining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload: Z = -30

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload: Z = -29

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload: Z = -28

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload: Z = -27

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload: Z = -26

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload: Z = -25

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload: Z = -24

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload: Z = -23

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload: Z = -22

    val Mining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload: Z = -21

    val Mining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload: Z = -20

    val Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload: Z = -19

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload: Z = -18

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload: Z = -17

    val Mining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload: Z = -16

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload: Z = -15

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload: Z = -14

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload: Z = -13

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload: Z = -12

    val Mining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload: Z = -11

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload: Z = -10

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload: Z = -9

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload: Z = -8

    val Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload: Z = -7

    val Mining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload: Z = -6

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload: Z = -5

    val Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload: Z = -4

    val Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload: Z = -3

    val Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload: Z = -2

    val Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload: Z = -1

    val Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload: Z = 0

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts: Z = 1

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload: Z = 2

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts: Z = 3

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload: Z = 4

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts: Z = 5

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload: Z = 6

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts: Z = 7

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload: Z = 8

    val Mining_Cargo_Transfer_Evidence_CoordinatorSessionView: Z = 9

    val Mining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload: Z = 10

    val Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard: Z = 11

    val Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload: Z = 12

    val Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision: Z = 13

    val Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload: Z = 14

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition: Z = 15

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload: Z = 16

    val Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame: Z = 17

    val Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload: Z = 18

    val Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective: Z = 19

    val Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload: Z = 20

    val Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal: Z = 21

    val Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload: Z = 22

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision: Z = 23

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload: Z = 24

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult: Z = 25

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload: Z = 26

    val Base_TypesBoolean_Payload: Z = 27

    val Base_TypesInteger_Payload: Z = 28

    val Base_TypesInteger_8_Payload: Z = 29

    val Base_TypesInteger_16_Payload: Z = 30

    val Base_TypesInteger_32_Payload: Z = 31

    val Base_TypesInteger_64_Payload: Z = 32

    val Base_TypesUnsigned_8_Payload: Z = 33

    val Base_TypesUnsigned_16_Payload: Z = 34

    val Base_TypesUnsigned_32_Payload: Z = 35

    val Base_TypesUnsigned_64_Payload: Z = 36

    val Base_TypesFloat_Payload: Z = 37

    val Base_TypesFloat_32_Payload: Z = 38

    val Base_TypesFloat_64_Payload: Z = 39

    val Base_TypesCharacter_Payload: Z = 40

    val Base_TypesString_Payload: Z = 41

    val Base_TypesBits_Payload: Z = 42

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P: Z = 43

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS: Z = 44

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P: Z = 45

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS: Z = 46

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P: Z = 47

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS: Z = 48

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P: Z = 49

    val Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS: Z = 50

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P: Z = 51

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS: Z = 52

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P: Z = 53

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS: Z = 54

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P: Z = 55

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS: Z = 56

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P: Z = 57

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS: Z = 58

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P: Z = 59

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS: Z = 60

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P: Z = 61

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS: Z = 62

    val Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P: Z = 63

    val Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS: Z = 64

    val Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P: Z = 65

    val Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS: Z = 66

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P: Z = 67

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS: Z = 68

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P: Z = 69

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS: Z = 70

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P: Z = 71

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS: Z = 72

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P: Z = 73

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS: Z = 74

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P: Z = 75

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS: Z = 76

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P: Z = 77

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS: Z = 78

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P: Z = 79

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS: Z = 80

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P: Z = 81

    val Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS: Z = 82

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P: Z = 83

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS: Z = 84

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P: Z = 85

    val Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS: Z = 86

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P: Z = 87

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS: Z = 88

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P: Z = 89

    val Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS: Z = 90

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P: Z = 91

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS: Z = 92

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P: Z = 93

    val Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS: Z = 94

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P: Z = 95

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS: Z = 96

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P: Z = 97

    val Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS: Z = 98

    val Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P: Z = 99

    val Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS: Z = 100

    val Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P: Z = 101

    val Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS: Z = 102

    val utilEmptyContainer: Z = 103

    val _artEmpty: Z = 104

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o.kind)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
      writer.writeB(o.requestValidity)
      writer.writeB(o.present)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts)
      writer.writeB(o.usable)
      writer.writeB(o.docked)
      writer.writeB(o.permissionGranted)
      writer.writeB(o.startReady)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(o.reason)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(o.reportClass)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
      writer.writeB(o.usable)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(o.shipValue)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(o.reportClass)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
      writer.writeB(o.usable)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(o.warehouseValue)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionView)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(o.session)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard)
      writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.faultTrigger)
      writeMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o.inhibitOrdinary)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o.kind)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.disposition)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(o.updateLedger)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition)
      writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.faultTrigger)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o.recoveryIntent)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame)
      writeMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(o.progress)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
      writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.faultTrigger)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o.recoveryIntent)
      writeMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o.inhibitOrdinary)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(o.outcomePulse)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(o.kind)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal)
      writeMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(o.kind)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.actionValue)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.actionValue)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o.cause)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(o.outcomeValue)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.value)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.actionValue)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o.cause)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(o.mode)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(o.requestDisposition)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(o.outcomeValue)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o.value)
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

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o.api_transfer_request)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o.api_transfer_request)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o.api_dock_context)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o.api_dock_context)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o.api_ship_report)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o.api_ship_report)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o.api_warehouse_report)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o.api_warehouse_report)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)
      writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o.api_control_event)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o.api_control_event)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)
      writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)
      writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal)
      writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o.api_transfer_result)
    }

    def writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS)
      writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o.api_transfer_result)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
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
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
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

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContext_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContext_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockReason_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockReason_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReport_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReport_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorSessionState_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorSessionState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorControlEventType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFactsT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts)
      }
      val kind = readMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      val requestValidity = reader.readB()
      val present = reader.readB()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts(kind, correlation, requestValidity, present)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockFactsT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts)
      }
      val usable = reader.readB()
      val docked = reader.readB()
      val permissionGranted = reader.readB()
      val startReady = reader.readB()
      val reason = readMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts(usable, docked, permissionGranted, startReady, reason)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFactsT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts)
      }
      val reportClass = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      val usable = reader.readB()
      val shipValue = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts(reportClass, correlation, usable, shipValue)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFactsT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts)
      }
      val reportClass = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      val usable = reader.readB()
      val warehouseValue = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts(reportClass, correlation, usable, warehouseValue)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorSessionView(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorSessionViewT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorSessionViewT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionView)
      }
      val session = readMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.SessionView(session, correlation)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorSessionView_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      return Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuardT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuardT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard)
      }
      val faultTrigger = readMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      val inhibitOrdinary = readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard(faultTrigger, inhibitOrdinary)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecisionT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecisionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision)
      }
      val kind = readMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      val disposition = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      val updateLedger = readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision(kind, correlation, disposition, updateLedger)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransitionT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransitionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition)
      }
      val faultTrigger = readMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      val recoveryIntent = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition(faultTrigger, recoveryIntent)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrameT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrameT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame)
      }
      val progress = readMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      val faultTrigger = readMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      val recoveryIntent = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType()
      val inhibitOrdinary = readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType()
      val outcomePulse = readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame(progress, correlation, faultTrigger, recoveryIntent, inhibitOrdinary, outcomePulse)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirectiveT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirectiveT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective)
      }
      val kind = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective(kind, correlation)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposalT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorActionProposalT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal)
      }
      val kind = readMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType()
      val actionValue = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal(kind, actionValue, correlation)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecisionT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecisionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision)
      }
      val actionValue = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      val cause = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      val outcomeValue = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision(actionValue, cause, correlation, outcomeValue)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload(value)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResultT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResultT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult)
      }
      val actionValue = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      val cause = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType()
      val mode = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType()
      val correlation = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      val requestDisposition = readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType()
      val outcomeValue = readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult(actionValue, cause, mode, correlation, requestDisposition, outcomeValue)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload)
      }
      val value = readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload(value)
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

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P)
      }
      val api_transfer_request = readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(api_transfer_request)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS)
      }
      val api_transfer_request = readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(api_transfer_request)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P)
      }
      val api_request_facts = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(api_request_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS)
      }
      val api_request_facts = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(api_request_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P)
      }
      val api_dock_context = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(api_dock_context)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS)
      }
      val api_dock_context = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(api_dock_context)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P)
      }
      val api_dock_facts = readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(api_dock_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS)
      }
      val api_dock_facts = readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(api_dock_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P)
      }
      val api_ship_report = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(api_ship_report)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS)
      }
      val api_ship_report = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(api_ship_report)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P)
      }
      val api_ship_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(api_ship_report_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS)
      }
      val api_ship_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(api_ship_report_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P)
      }
      val api_warehouse_report = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(api_warehouse_report)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS)
      }
      val api_warehouse_report = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(api_warehouse_report)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P)
      }
      val api_warehouse_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(api_warehouse_report_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS)
      }
      val api_warehouse_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(api_warehouse_report_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P)
      }
      val api_coordination_guard = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      val api_dock_facts = readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_request_facts = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(api_coordination_guard, api_dock_facts, api_prior_session_view, api_request_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS)
      }
      val api_coordination_guard = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      val api_dock_facts = readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_request_facts = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(api_coordination_guard, api_dock_facts, api_prior_session_view, api_request_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_request_disposition = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(api_admission_decision, api_request_disposition)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_request_disposition = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(api_admission_decision, api_request_disposition)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P)
      }
      val api_control_event = readMining_Cargo_Transfer_Evidence_CoordinatorControlEventType()
      val api_prior_recovery_state = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      val api_prior_warehouse_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      val api_ship_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      val api_warehouse_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(api_control_event, api_prior_recovery_state, api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence, api_ship_report_facts, api_warehouse_report_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS)
      }
      val api_control_event = readMining_Cargo_Transfer_Evidence_CoordinatorControlEventType()
      val api_prior_recovery_state = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      val api_prior_warehouse_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      val api_ship_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      val api_warehouse_report_facts = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(api_control_event, api_prior_recovery_state, api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence, api_ship_report_facts, api_warehouse_report_facts)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P)
      }
      val api_coordination_frame = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      val api_coordination_guard = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      val api_priority_directive = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      val api_recovery_transition = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      val api_ship_update = readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      val api_warehouse_update = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(api_coordination_frame, api_coordination_guard, api_priority_directive, api_recovery_transition, api_ship_update, api_warehouse_update)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS)
      }
      val api_coordination_frame = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      val api_coordination_guard = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      val api_priority_directive = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      val api_recovery_transition = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      val api_ship_update = readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      val api_warehouse_update = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(api_coordination_frame, api_coordination_guard, api_priority_directive, api_recovery_transition, api_ship_update, api_warehouse_update)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_coordination_frame = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(api_admission_decision, api_coordination_frame)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_coordination_frame = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(api_admission_decision, api_coordination_frame)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P)
      }
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(api_prior_session_view)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS)
      }
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(api_prior_session_view)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_ship_update = readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(api_admission_decision, api_ship_update)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_ship_update = readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(api_admission_decision, api_ship_update)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P)
      }
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(api_prior_ship_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS)
      }
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(api_prior_ship_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_warehouse_update = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(api_admission_decision, api_warehouse_update)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      val api_warehouse_update = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(api_admission_decision, api_warehouse_update)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P)
      }
      val api_prior_warehouse_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(api_prior_warehouse_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS)
      }
      val api_prior_warehouse_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(api_prior_warehouse_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P)
      }
      val api_recovery_transition = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(api_recovery_transition)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS)
      }
      val api_recovery_transition = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(api_recovery_transition)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P)
      }
      val api_prior_recovery_state = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(api_prior_recovery_state)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS)
      }
      val api_prior_recovery_state = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(api_prior_recovery_state)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(api_admission_decision)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS)
      }
      val api_admission_decision = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(api_admission_decision)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P)
      }
      val api_request_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(api_request_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS)
      }
      val api_request_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(api_request_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P)
      }
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(api_prior_session_view, api_prior_ship_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS)
      }
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(api_prior_session_view, api_prior_ship_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P)
      }
      val api_ship_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(api_ship_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS)
      }
      val api_ship_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(api_ship_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P)
      }
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      val api_prior_warehouse_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS)
      }
      val api_prior_session_view = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      val api_prior_ship_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      val api_prior_warehouse_evidence = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P)
      }
      val api_warehouse_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(api_warehouse_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS)
      }
      val api_warehouse_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(api_warehouse_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P)
      }
      val api_priority_directive = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      val api_request_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      val api_ship_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      val api_warehouse_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(api_priority_directive, api_request_proposal, api_ship_proposal, api_warehouse_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS)
      }
      val api_priority_directive = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      val api_request_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      val api_ship_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      val api_warehouse_proposal = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(api_priority_directive, api_request_proposal, api_ship_proposal, api_warehouse_proposal)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P)
      }
      val api_transfer_decision = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(api_transfer_decision)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS)
      }
      val api_transfer_decision = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(api_transfer_decision)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P)
      }
      val api_request_disposition = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      val api_transfer_decision = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(api_request_disposition, api_transfer_decision)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS)
      }
      val api_request_disposition = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      val api_transfer_decision = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(api_request_disposition, api_transfer_decision)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P)
      }
      val api_transfer_result = readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(api_transfer_result)
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS)
      }
      val api_transfer_result = readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(api_transfer_result)
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
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T)
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
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockReason_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReport_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContext_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorSessionView_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorSessionState_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T)
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

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorSessionView(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorSessionView(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorSessionView _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload _)
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

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS _)
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