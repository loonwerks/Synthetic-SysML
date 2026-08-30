// #Sireum
// @formatter:off

// This file is auto-generated from FreshRequest.scala, MaterialBand.scala, ProductBand.scala, ExecutionOutcome.scala, OutcomeEventClass.scala, OrderState.scala, QualifiedOutcome.scala, RecoveryEvent.scala, RecoveryGate.scala, EmergencyState.scala, RecoveryState.scala, ProposalState.scala, DispatchAction.scala, OrderStatusValue.scala, RecoveryStatusValue.scala, Mode.scala, SelectedCause.scala, PublishedOrderState.scala, PublishedRecoveryState.scala, RequestDisposition.scala, PublishedAction.scala, RequestBoundaryFacts.scala, CapabilitySnapshot.scala, RequestFacts.scala, MaterialBoundaryFacts.scala, InventorySnapshot.scala, ProductBoundaryFacts.scala, StockFacts.scala, OutcomeBoundaryFacts.scala, DispatchStatusRecord.scala, DispatchPublicResult.scala, Base_Types.scala, CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_Containers.scala, InventoryAcquisition_coordinator_process_inventory_acquisition_Containers.scala, CapabilityAcquisition_coordinator_process_capability_acquisition_Containers.scala, ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_Containers.scala, RequestQualification_coordinator_process_request_qualification_Containers.scala, StockAssessment_coordinator_process_stock_assessment_Containers.scala, OutcomeQualification_coordinator_process_outcome_qualification_Containers.scala, RecoveryControl_coordinator_process_recovery_control_Containers.scala, OrderLifecycle_coordinator_process_order_lifecycle_Containers.scala, QuotationEligibility_coordinator_process_quotation_eligibility_Containers.scala, ProcurementEligibility_coordinator_process_procurement_eligibility_Containers.scala, ProductionEligibility_coordinator_process_production_eligibility_Containers.scala, DispatchEligibility_coordinator_process_dispatch_eligibility_Containers.scala, ActionArbitration_coordinator_process_action_arbitration_Containers.scala, StatusDerivation_coordinator_process_status_derivation_Containers.scala, PublicComposition_coordinator_process_public_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Factory_Dispatch_CoordinatorFreshRequest_Payload: Z = -32

    val Factory_Dispatch_CoordinatorMaterialBand_Payload: Z = -31

    val Factory_Dispatch_CoordinatorProductBand_Payload: Z = -30

    val Factory_Dispatch_CoordinatorExecutionOutcome_Payload: Z = -29

    val Factory_Dispatch_CoordinatorOutcomeEventClass_Payload: Z = -28

    val Factory_Dispatch_CoordinatorOrderState_Payload: Z = -27

    val Factory_Dispatch_CoordinatorQualifiedOutcome_Payload: Z = -26

    val Factory_Dispatch_CoordinatorRecoveryEvent_Payload: Z = -25

    val Factory_Dispatch_CoordinatorRecoveryGate_Payload: Z = -24

    val Factory_Dispatch_CoordinatorEmergencyState_Payload: Z = -23

    val Factory_Dispatch_CoordinatorRecoveryState_Payload: Z = -22

    val Factory_Dispatch_CoordinatorProposalState_Payload: Z = -21

    val Factory_Dispatch_CoordinatorDispatchAction_Payload: Z = -20

    val Factory_Dispatch_CoordinatorOrderStatusValue_Payload: Z = -19

    val Factory_Dispatch_CoordinatorRecoveryStatusValue_Payload: Z = -18

    val Factory_Dispatch_CoordinatorMode_Payload: Z = -17

    val Factory_Dispatch_CoordinatorSelectedCause_Payload: Z = -16

    val Factory_Dispatch_CoordinatorPublishedOrderState_Payload: Z = -15

    val Factory_Dispatch_CoordinatorPublishedRecoveryState_Payload: Z = -14

    val Factory_Dispatch_CoordinatorRequestDisposition_Payload: Z = -13

    val Factory_Dispatch_CoordinatorPublishedAction_Payload: Z = -12

    val Factory_Dispatch_CoordinatorRequestBoundaryFacts: Z = -11

    val Factory_Dispatch_CoordinatorRequestBoundaryFacts_Payload: Z = -10

    val Factory_Dispatch_CoordinatorCapabilitySnapshot: Z = -9

    val Factory_Dispatch_CoordinatorCapabilitySnapshot_Payload: Z = -8

    val Factory_Dispatch_CoordinatorRequestFacts: Z = -7

    val Factory_Dispatch_CoordinatorRequestFacts_Payload: Z = -6

    val Factory_Dispatch_CoordinatorMaterialBoundaryFacts: Z = -5

    val Factory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload: Z = -4

    val Factory_Dispatch_CoordinatorInventorySnapshot: Z = -3

    val Factory_Dispatch_CoordinatorInventorySnapshot_Payload: Z = -2

    val Factory_Dispatch_CoordinatorProductBoundaryFacts: Z = -1

    val Factory_Dispatch_CoordinatorProductBoundaryFacts_Payload: Z = 0

    val Factory_Dispatch_CoordinatorStockFacts: Z = 1

    val Factory_Dispatch_CoordinatorStockFacts_Payload: Z = 2

    val Factory_Dispatch_CoordinatorOutcomeBoundaryFacts: Z = 3

    val Factory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload: Z = 4

    val Factory_Dispatch_CoordinatorDispatchStatusRecord: Z = 5

    val Factory_Dispatch_CoordinatorDispatchStatusRecord_Payload: Z = 6

    val Factory_Dispatch_CoordinatorDispatchPublicResult: Z = 7

    val Factory_Dispatch_CoordinatorDispatchPublicResult_Payload: Z = 8

    val Base_TypesBoolean_Payload: Z = 9

    val Base_TypesInteger_Payload: Z = 10

    val Base_TypesInteger_8_Payload: Z = 11

    val Base_TypesInteger_16_Payload: Z = 12

    val Base_TypesInteger_32_Payload: Z = 13

    val Base_TypesInteger_64_Payload: Z = 14

    val Base_TypesUnsigned_8_Payload: Z = 15

    val Base_TypesUnsigned_16_Payload: Z = 16

    val Base_TypesUnsigned_32_Payload: Z = 17

    val Base_TypesUnsigned_64_Payload: Z = 18

    val Base_TypesFloat_Payload: Z = 19

    val Base_TypesFloat_32_Payload: Z = 20

    val Base_TypesFloat_64_Payload: Z = 21

    val Base_TypesCharacter_Payload: Z = 22

    val Base_TypesString_Payload: Z = 23

    val Base_TypesBits_Payload: Z = 24

    val Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P: Z = 25

    val Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS: Z = 26

    val Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P: Z = 27

    val Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS: Z = 28

    val Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P: Z = 29

    val Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS: Z = 30

    val Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P: Z = 31

    val Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS: Z = 32

    val Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P: Z = 33

    val Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS: Z = 34

    val Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P: Z = 35

    val Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS: Z = 36

    val Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P: Z = 37

    val Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS: Z = 38

    val Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P: Z = 39

    val Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS: Z = 40

    val Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P: Z = 41

    val Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS: Z = 42

    val Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P: Z = 43

    val Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS: Z = 44

    val Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P: Z = 45

    val Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS: Z = 46

    val Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P: Z = 47

    val Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS: Z = 48

    val Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P: Z = 49

    val Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS: Z = 50

    val Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P: Z = 51

    val Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS: Z = 52

    val Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P: Z = 53

    val Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS: Z = 54

    val Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P: Z = 55

    val Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS: Z = 56

    val Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P: Z = 57

    val Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS: Z = 58

    val Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P: Z = 59

    val Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS: Z = 60

    val Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P: Z = 61

    val Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS: Z = 62

    val Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P: Z = 63

    val Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS: Z = 64

    val Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P: Z = 65

    val Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS: Z = 66

    val Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P: Z = 67

    val Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS: Z = 68

    val Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P: Z = 69

    val Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS: Z = 70

    val Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P: Z = 71

    val Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS: Z = 72

    val Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P: Z = 73

    val Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS: Z = 74

    val Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P: Z = 75

    val Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS: Z = 76

    val Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P: Z = 77

    val Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS: Z = 78

    val Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P: Z = 79

    val Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS: Z = 80

    val Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P: Z = 81

    val Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS: Z = 82

    val Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P: Z = 83

    val Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS: Z = 84

    val Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P: Z = 85

    val Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS: Z = 86

    val Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P: Z = 87

    val Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS: Z = 88

    val utilEmptyContainer: Z = 89

    val _artEmpty: Z = 90

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFactory_Dispatch_CoordinatorFreshRequestType(o: Factory_Dispatch_Coordinator.FreshRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorFreshRequest_Payload(o: Factory_Dispatch_Coordinator.FreshRequest_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorFreshRequest_Payload)
      writeFactory_Dispatch_CoordinatorFreshRequestType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorMaterialBandType(o: Factory_Dispatch_Coordinator.MaterialBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorMaterialBand_Payload(o: Factory_Dispatch_Coordinator.MaterialBand_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorMaterialBand_Payload)
      writeFactory_Dispatch_CoordinatorMaterialBandType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorProductBandType(o: Factory_Dispatch_Coordinator.ProductBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorProductBand_Payload(o: Factory_Dispatch_Coordinator.ProductBand_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProductBand_Payload)
      writeFactory_Dispatch_CoordinatorProductBandType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcomeType(o: Factory_Dispatch_Coordinator.ExecutionOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcome_Payload)
      writeFactory_Dispatch_CoordinatorExecutionOutcomeType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeEventClassType(o: Factory_Dispatch_Coordinator.OutcomeEventClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcomeEventClass_Payload)
      writeFactory_Dispatch_CoordinatorOutcomeEventClassType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorOrderStateType(o: Factory_Dispatch_Coordinator.OrderState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorOrderState_Payload(o: Factory_Dispatch_Coordinator.OrderState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOrderState_Payload)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o: Factory_Dispatch_Coordinator.QualifiedOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQualifiedOutcome_Payload)
      writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryEventType(o: Factory_Dispatch_Coordinator.RecoveryEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o: Factory_Dispatch_Coordinator.RecoveryEvent_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryEvent_Payload)
      writeFactory_Dispatch_CoordinatorRecoveryEventType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryGateType(o: Factory_Dispatch_Coordinator.RecoveryGate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryGate_Payload(o: Factory_Dispatch_Coordinator.RecoveryGate_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryGate_Payload)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorEmergencyStateType(o: Factory_Dispatch_Coordinator.EmergencyState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorEmergencyState_Payload(o: Factory_Dispatch_Coordinator.EmergencyState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorEmergencyState_Payload)
      writeFactory_Dispatch_CoordinatorEmergencyStateType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryStateType(o: Factory_Dispatch_Coordinator.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryState_Payload(o: Factory_Dispatch_Coordinator.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryState_Payload)
      writeFactory_Dispatch_CoordinatorRecoveryStateType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorProposalStateType(o: Factory_Dispatch_Coordinator.ProposalState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorProposalState_Payload(o: Factory_Dispatch_Coordinator.ProposalState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProposalState_Payload)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatchActionType(o: Factory_Dispatch_Coordinator.DispatchAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatchAction_Payload(o: Factory_Dispatch_Coordinator.DispatchAction_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchAction_Payload)
      writeFactory_Dispatch_CoordinatorDispatchActionType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorOrderStatusValueType(o: Factory_Dispatch_Coordinator.OrderStatusValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o: Factory_Dispatch_Coordinator.OrderStatusValue_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOrderStatusValue_Payload)
      writeFactory_Dispatch_CoordinatorOrderStatusValueType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryStatusValueType(o: Factory_Dispatch_Coordinator.RecoveryStatusValue.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryStatusValue_Payload)
      writeFactory_Dispatch_CoordinatorRecoveryStatusValueType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorModeType(o: Factory_Dispatch_Coordinator.Mode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorMode_Payload(o: Factory_Dispatch_Coordinator.Mode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorMode_Payload)
      writeFactory_Dispatch_CoordinatorModeType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorSelectedCauseType(o: Factory_Dispatch_Coordinator.SelectedCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorSelectedCause_Payload(o: Factory_Dispatch_Coordinator.SelectedCause_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorSelectedCause_Payload)
      writeFactory_Dispatch_CoordinatorSelectedCauseType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorPublishedOrderStateType(o: Factory_Dispatch_Coordinator.PublishedOrderState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o: Factory_Dispatch_Coordinator.PublishedOrderState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPublishedOrderState_Payload)
      writeFactory_Dispatch_CoordinatorPublishedOrderStateType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorPublishedRecoveryStateType(o: Factory_Dispatch_Coordinator.PublishedRecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPublishedRecoveryState_Payload)
      writeFactory_Dispatch_CoordinatorPublishedRecoveryStateType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRequestDispositionType(o: Factory_Dispatch_Coordinator.RequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRequestDisposition_Payload(o: Factory_Dispatch_Coordinator.RequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestDisposition_Payload)
      writeFactory_Dispatch_CoordinatorRequestDispositionType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorPublishedActionType(o: Factory_Dispatch_Coordinator.PublishedAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorPublishedAction_Payload(o: Factory_Dispatch_Coordinator.PublishedAction_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPublishedAction_Payload)
      writeFactory_Dispatch_CoordinatorPublishedActionType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRequestBoundaryFacts(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestBoundaryFacts)
      writeFactory_Dispatch_CoordinatorFreshRequestType(o.fresh_request)
      writer.writeB(o.request_present)
    }

    def writeFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestBoundaryFacts_Payload)
      writeFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCapabilitySnapshot(o: Factory_Dispatch_Coordinator.CapabilitySnapshot): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapabilitySnapshot)
      writer.writeB(o.supplier_available)
      writer.writeB(o.production_available)
      writer.writeB(o.dispatch_available)
    }

    def writeFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapabilitySnapshot_Payload)
      writeFactory_Dispatch_CoordinatorCapabilitySnapshot(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRequestFacts(o: Factory_Dispatch_Coordinator.RequestFacts): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestFacts)
      writeFactory_Dispatch_CoordinatorFreshRequestType(o.fresh_request)
      writer.writeB(o.request_present)
      writer.writeB(o.request_valid)
      writer.writeB(o.request_expedited)
    }

    def writeFactory_Dispatch_CoordinatorRequestFacts_Payload(o: Factory_Dispatch_Coordinator.RequestFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestFacts_Payload)
      writeFactory_Dispatch_CoordinatorRequestFacts(o.value)
    }

    def writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorMaterialBoundaryFacts)
      writeFactory_Dispatch_CoordinatorMaterialBandType(o.material_band)
      writer.writeB(o.material_usable)
    }

    def writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload)
      writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInventorySnapshot(o: Factory_Dispatch_Coordinator.InventorySnapshot): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventorySnapshot)
      writeFactory_Dispatch_CoordinatorMaterialBandType(o.material_band)
      writeFactory_Dispatch_CoordinatorProductBandType(o.product_band)
    }

    def writeFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o: Factory_Dispatch_Coordinator.InventorySnapshot_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventorySnapshot_Payload)
      writeFactory_Dispatch_CoordinatorInventorySnapshot(o.value)
    }

    def writeFactory_Dispatch_CoordinatorProductBoundaryFacts(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProductBoundaryFacts)
      writeFactory_Dispatch_CoordinatorProductBandType(o.product_band)
      writer.writeB(o.product_usable)
    }

    def writeFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProductBoundaryFacts_Payload)
      writeFactory_Dispatch_CoordinatorProductBoundaryFacts(o.value)
    }

    def writeFactory_Dispatch_CoordinatorStockFacts(o: Factory_Dispatch_Coordinator.StockFacts): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStockFacts)
      writeFactory_Dispatch_CoordinatorMaterialBandType(o.material_band)
      writer.writeB(o.material_usable)
      writer.writeB(o.material_shortage)
      writer.writeB(o.material_ready)
      writeFactory_Dispatch_CoordinatorProductBandType(o.product_band)
      writer.writeB(o.product_usable)
      writer.writeB(o.product_available)
    }

    def writeFactory_Dispatch_CoordinatorStockFacts_Payload(o: Factory_Dispatch_Coordinator.StockFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStockFacts_Payload)
      writeFactory_Dispatch_CoordinatorStockFacts(o.value)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcomeBoundaryFacts)
      writeFactory_Dispatch_CoordinatorExecutionOutcomeType(o.execution_outcome)
      writeFactory_Dispatch_CoordinatorOutcomeEventClassType(o.event_class)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload)
      writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatchStatusRecord(o: Factory_Dispatch_Coordinator.DispatchStatusRecord): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchStatusRecord)
      writeFactory_Dispatch_CoordinatorOrderStatusValueType(o.order_phase)
      writeFactory_Dispatch_CoordinatorRecoveryStatusValueType(o.recovery_phase)
      writeFactory_Dispatch_CoordinatorModeType(o.mode)
      writeFactory_Dispatch_CoordinatorSelectedCauseType(o.selected_cause)
    }

    def writeFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchStatusRecord_Payload)
      writeFactory_Dispatch_CoordinatorDispatchStatusRecord(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatchPublicResult(o: Factory_Dispatch_Coordinator.DispatchPublicResult): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchPublicResult)
      writeFactory_Dispatch_CoordinatorSelectedCauseType(o.selected_cause)
      writeFactory_Dispatch_CoordinatorModeType(o.mode)
      writeFactory_Dispatch_CoordinatorPublishedOrderStateType(o.published_order)
      writeFactory_Dispatch_CoordinatorPublishedRecoveryStateType(o.published_recovery)
      writeFactory_Dispatch_CoordinatorRequestDispositionType(o.request_disposition)
      writeFactory_Dispatch_CoordinatorPublishedActionType(o.published_action)
    }

    def writeFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchPublicResult_Payload)
      writeFactory_Dispatch_CoordinatorDispatchPublicResult(o.value)
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

    def writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorFreshRequestType(o.api_fresh_request)
    }

    def writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorFreshRequestType(o.api_fresh_request)
    }

    def writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorInventorySnapshot(o.api_inventory_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorInventorySnapshot(o.api_inventory_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)
      writeFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)
      writeFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorCapabilitySnapshot(o.api_capability_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorCapabilitySnapshot(o.api_capability_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P)
      writer.writeB(o.api_dispatch_available)
      writer.writeB(o.api_production_available)
      writer.writeB(o.api_supplier_available)
    }

    def writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS)
      writer.writeB(o.api_dispatch_available)
      writer.writeB(o.api_production_available)
      writer.writeB(o.api_supplier_available)
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorExecutionOutcomeType(o.api_execution_outcome)
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorExecutionOutcomeType(o.api_execution_outcome)
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)
      writeFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)
      writeFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts)
    }

    def writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
    }

    def writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)
    }

    def writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)
      writeFactory_Dispatch_CoordinatorRecoveryEventType(o.api_recovery_event)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorRecoveryStateType(o.In_retained_recovery)
      writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)
      writeFactory_Dispatch_CoordinatorRecoveryEventType(o.api_recovery_event)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state)
    }

    def writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorRecoveryStateType(o.retained_recovery)
      writeFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state)
    }

    def writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.In_retained_order)
      writeFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state)
    }

    def writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.retained_order)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state)
    }

    def writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)
    }

    def writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
      writer.writeB(o.api_supplier_available)
    }

    def writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
      writer.writeB(o.api_supplier_available)
    }

    def writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writer.writeB(o.api_production_available)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
    }

    def writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writer.writeB(o.api_production_available)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
    }

    def writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P)
      writer.writeB(o.api_dispatch_available)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
    }

    def writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS)
      writer.writeB(o.api_dispatch_available)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)
    }

    def writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_dispatch_proposal)
      writeFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_procurement_proposal)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_production_proposal)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_quotation_proposal)
    }

    def writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_dispatch_proposal)
      writeFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_procurement_proposal)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_production_proposal)
      writeFactory_Dispatch_CoordinatorProposalStateType(o.api_quotation_proposal)
    }

    def writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)
    }

    def writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)
    }

    def writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state)
      writeFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)
    }

    def writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)
      writeFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state)
      writeFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)
    }

    def writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record)
    }

    def writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record)
    }

    def writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)
      writeFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)
      writeFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record)
    }

    def writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)
      writeFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)
      writeFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record)
    }

    def writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatchPublicResult(o.api_public_result)
    }

    def writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatchPublicResult(o.api_public_result)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Mode_Payload => writeFactory_Dispatch_CoordinatorMode_Payload(o)
        case o: Factory_Dispatch_Coordinator.OrderState_Payload => writeFactory_Dispatch_CoordinatorOrderState_Payload(o)
        case o: Factory_Dispatch_Coordinator.StockFacts_Payload => writeFactory_Dispatch_CoordinatorStockFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.ProductBand_Payload => writeFactory_Dispatch_CoordinatorProductBand_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryGate_Payload => writeFactory_Dispatch_CoordinatorRecoveryGate_Payload(o)
        case o: Factory_Dispatch_Coordinator.MaterialBand_Payload => writeFactory_Dispatch_CoordinatorMaterialBand_Payload(o)
        case o: Factory_Dispatch_Coordinator.FreshRequest_Payload => writeFactory_Dispatch_CoordinatorFreshRequest_Payload(o)
        case o: Factory_Dispatch_Coordinator.RequestFacts_Payload => writeFactory_Dispatch_CoordinatorRequestFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryEvent_Payload => writeFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o)
        case o: Factory_Dispatch_Coordinator.ProposalState_Payload => writeFactory_Dispatch_CoordinatorProposalState_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryState_Payload => writeFactory_Dispatch_CoordinatorRecoveryState_Payload(o)
        case o: Factory_Dispatch_Coordinator.SelectedCause_Payload => writeFactory_Dispatch_CoordinatorSelectedCause_Payload(o)
        case o: Factory_Dispatch_Coordinator.EmergencyState_Payload => writeFactory_Dispatch_CoordinatorEmergencyState_Payload(o)
        case o: Factory_Dispatch_Coordinator.DispatchAction_Payload => writeFactory_Dispatch_CoordinatorDispatchAction_Payload(o)
        case o: Factory_Dispatch_Coordinator.PublishedAction_Payload => writeFactory_Dispatch_CoordinatorPublishedAction_Payload(o)
        case o: Factory_Dispatch_Coordinator.OrderStatusValue_Payload => writeFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload => writeFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload => writeFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload => writeFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o)
        case o: Factory_Dispatch_Coordinator.InventorySnapshot_Payload => writeFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.RequestDisposition_Payload => writeFactory_Dispatch_CoordinatorRequestDisposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload => writeFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.PublishedOrderState_Payload => writeFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload => writeFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o)
        case o: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload => writeFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload => writeFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload => writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload => writeFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o)
        case o: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload => writeFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o)
        case o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload => writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload => writeFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
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

    def readFactory_Dispatch_CoordinatorFreshRequestType(): Factory_Dispatch_Coordinator.FreshRequest.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.FreshRequest.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorFreshRequest_Payload(): Factory_Dispatch_Coordinator.FreshRequest_Payload = {
      val r = readFactory_Dispatch_CoordinatorFreshRequest_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorFreshRequest_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.FreshRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorFreshRequest_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorFreshRequestType()
      return Factory_Dispatch_Coordinator.FreshRequest_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorMaterialBandType(): Factory_Dispatch_Coordinator.MaterialBand.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.MaterialBand.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorMaterialBand_Payload(): Factory_Dispatch_Coordinator.MaterialBand_Payload = {
      val r = readFactory_Dispatch_CoordinatorMaterialBand_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorMaterialBand_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.MaterialBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorMaterialBand_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorMaterialBandType()
      return Factory_Dispatch_Coordinator.MaterialBand_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorProductBandType(): Factory_Dispatch_Coordinator.ProductBand.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.ProductBand.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorProductBand_Payload(): Factory_Dispatch_Coordinator.ProductBand_Payload = {
      val r = readFactory_Dispatch_CoordinatorProductBand_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProductBand_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ProductBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProductBand_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorProductBandType()
      return Factory_Dispatch_Coordinator.ProductBand_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeType(): Factory_Dispatch_Coordinator.ExecutionOutcome.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.ExecutionOutcome.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcome_Payload(): Factory_Dispatch_Coordinator.ExecutionOutcome_Payload = {
      val r = readFactory_Dispatch_CoordinatorExecutionOutcome_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcome_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorExecutionOutcomeType()
      return Factory_Dispatch_Coordinator.ExecutionOutcome_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorOutcomeEventClassType(): Factory_Dispatch_Coordinator.OutcomeEventClass.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.OutcomeEventClass.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(): Factory_Dispatch_Coordinator.OutcomeEventClass_Payload = {
      val r = readFactory_Dispatch_CoordinatorOutcomeEventClass_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcomeEventClass_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeEventClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcomeEventClass_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorOutcomeEventClassType()
      return Factory_Dispatch_Coordinator.OutcomeEventClass_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorOrderStateType(): Factory_Dispatch_Coordinator.OrderState.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.OrderState.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorOrderState_Payload(): Factory_Dispatch_Coordinator.OrderState_Payload = {
      val r = readFactory_Dispatch_CoordinatorOrderState_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOrderState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OrderState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOrderState_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorOrderStateType()
      return Factory_Dispatch_Coordinator.OrderState_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorQualifiedOutcomeType(): Factory_Dispatch_Coordinator.QualifiedOutcome.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.QualifiedOutcome.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(): Factory_Dispatch_Coordinator.QualifiedOutcome_Payload = {
      val r = readFactory_Dispatch_CoordinatorQualifiedOutcome_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQualifiedOutcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.QualifiedOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQualifiedOutcome_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      return Factory_Dispatch_Coordinator.QualifiedOutcome_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRecoveryEventType(): Factory_Dispatch_Coordinator.RecoveryEvent.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.RecoveryEvent.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRecoveryEvent_Payload(): Factory_Dispatch_Coordinator.RecoveryEvent_Payload = {
      val r = readFactory_Dispatch_CoordinatorRecoveryEvent_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryEvent_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryEvent_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRecoveryEventType()
      return Factory_Dispatch_Coordinator.RecoveryEvent_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRecoveryGateType(): Factory_Dispatch_Coordinator.RecoveryGate.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.RecoveryGate.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRecoveryGate_Payload(): Factory_Dispatch_Coordinator.RecoveryGate_Payload = {
      val r = readFactory_Dispatch_CoordinatorRecoveryGate_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryGate_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryGate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryGate_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRecoveryGateType()
      return Factory_Dispatch_Coordinator.RecoveryGate_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorEmergencyStateType(): Factory_Dispatch_Coordinator.EmergencyState.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.EmergencyState.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorEmergencyState_Payload(): Factory_Dispatch_Coordinator.EmergencyState_Payload = {
      val r = readFactory_Dispatch_CoordinatorEmergencyState_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorEmergencyState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.EmergencyState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorEmergencyState_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorEmergencyStateType()
      return Factory_Dispatch_Coordinator.EmergencyState_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRecoveryStateType(): Factory_Dispatch_Coordinator.RecoveryState.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.RecoveryState.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRecoveryState_Payload(): Factory_Dispatch_Coordinator.RecoveryState_Payload = {
      val r = readFactory_Dispatch_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryState_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRecoveryStateType()
      return Factory_Dispatch_Coordinator.RecoveryState_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorProposalStateType(): Factory_Dispatch_Coordinator.ProposalState.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.ProposalState.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorProposalState_Payload(): Factory_Dispatch_Coordinator.ProposalState_Payload = {
      val r = readFactory_Dispatch_CoordinatorProposalState_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProposalState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ProposalState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProposalState_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.ProposalState_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatchActionType(): Factory_Dispatch_Coordinator.DispatchAction.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.DispatchAction.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatchAction_Payload(): Factory_Dispatch_Coordinator.DispatchAction_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatchAction_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchAction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchAction_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatchActionType()
      return Factory_Dispatch_Coordinator.DispatchAction_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorOrderStatusValueType(): Factory_Dispatch_Coordinator.OrderStatusValue.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.OrderStatusValue.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorOrderStatusValue_Payload(): Factory_Dispatch_Coordinator.OrderStatusValue_Payload = {
      val r = readFactory_Dispatch_CoordinatorOrderStatusValue_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOrderStatusValue_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OrderStatusValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOrderStatusValue_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorOrderStatusValueType()
      return Factory_Dispatch_Coordinator.OrderStatusValue_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRecoveryStatusValueType(): Factory_Dispatch_Coordinator.RecoveryStatusValue.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.RecoveryStatusValue.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(): Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload = {
      val r = readFactory_Dispatch_CoordinatorRecoveryStatusValue_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryStatusValue_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryStatusValue_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRecoveryStatusValueType()
      return Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorModeType(): Factory_Dispatch_Coordinator.Mode.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Mode.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorMode_Payload(): Factory_Dispatch_Coordinator.Mode_Payload = {
      val r = readFactory_Dispatch_CoordinatorMode_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorMode_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Mode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorMode_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorModeType()
      return Factory_Dispatch_Coordinator.Mode_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorSelectedCauseType(): Factory_Dispatch_Coordinator.SelectedCause.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.SelectedCause.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorSelectedCause_Payload(): Factory_Dispatch_Coordinator.SelectedCause_Payload = {
      val r = readFactory_Dispatch_CoordinatorSelectedCause_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorSelectedCause_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.SelectedCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorSelectedCause_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorSelectedCauseType()
      return Factory_Dispatch_Coordinator.SelectedCause_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorPublishedOrderStateType(): Factory_Dispatch_Coordinator.PublishedOrderState.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.PublishedOrderState.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorPublishedOrderState_Payload(): Factory_Dispatch_Coordinator.PublishedOrderState_Payload = {
      val r = readFactory_Dispatch_CoordinatorPublishedOrderState_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPublishedOrderState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedOrderState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPublishedOrderState_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorPublishedOrderStateType()
      return Factory_Dispatch_Coordinator.PublishedOrderState_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorPublishedRecoveryStateType(): Factory_Dispatch_Coordinator.PublishedRecoveryState.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.PublishedRecoveryState.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(): Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload = {
      val r = readFactory_Dispatch_CoordinatorPublishedRecoveryState_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPublishedRecoveryState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPublishedRecoveryState_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorPublishedRecoveryStateType()
      return Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRequestDispositionType(): Factory_Dispatch_Coordinator.RequestDisposition.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.RequestDisposition.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRequestDisposition_Payload(): Factory_Dispatch_Coordinator.RequestDisposition_Payload = {
      val r = readFactory_Dispatch_CoordinatorRequestDisposition_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestDisposition_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestDisposition_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRequestDispositionType()
      return Factory_Dispatch_Coordinator.RequestDisposition_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorPublishedActionType(): Factory_Dispatch_Coordinator.PublishedAction.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.PublishedAction.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorPublishedAction_Payload(): Factory_Dispatch_Coordinator.PublishedAction_Payload = {
      val r = readFactory_Dispatch_CoordinatorPublishedAction_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPublishedAction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPublishedAction_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorPublishedActionType()
      return Factory_Dispatch_Coordinator.PublishedAction_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRequestBoundaryFacts(): Factory_Dispatch_Coordinator.RequestBoundaryFacts = {
      val r = readFactory_Dispatch_CoordinatorRequestBoundaryFactsT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.RequestBoundaryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestBoundaryFacts)
      }
      val fresh_request = readFactory_Dispatch_CoordinatorFreshRequestType()
      val request_present = reader.readB()
      return Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request, request_present)
    }

    def readFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload = {
      val r = readFactory_Dispatch_CoordinatorRequestBoundaryFacts_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestBoundaryFacts_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      return Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCapabilitySnapshot(): Factory_Dispatch_Coordinator.CapabilitySnapshot = {
      val r = readFactory_Dispatch_CoordinatorCapabilitySnapshotT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapabilitySnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilitySnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapabilitySnapshot)
      }
      val supplier_available = reader.readB()
      val production_available = reader.readB()
      val dispatch_available = reader.readB()
      return Factory_Dispatch_Coordinator.CapabilitySnapshot(supplier_available, production_available, dispatch_available)
    }

    def readFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(): Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload = {
      val r = readFactory_Dispatch_CoordinatorCapabilitySnapshot_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapabilitySnapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapabilitySnapshot_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCapabilitySnapshot()
      return Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRequestFacts(): Factory_Dispatch_Coordinator.RequestFacts = {
      val r = readFactory_Dispatch_CoordinatorRequestFactsT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestFactsT(typeParsed: B): Factory_Dispatch_Coordinator.RequestFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestFacts)
      }
      val fresh_request = readFactory_Dispatch_CoordinatorFreshRequestType()
      val request_present = reader.readB()
      val request_valid = reader.readB()
      val request_expedited = reader.readB()
      return Factory_Dispatch_Coordinator.RequestFacts(fresh_request, request_present, request_valid, request_expedited)
    }

    def readFactory_Dispatch_CoordinatorRequestFacts_Payload(): Factory_Dispatch_Coordinator.RequestFacts_Payload = {
      val r = readFactory_Dispatch_CoordinatorRequestFacts_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RequestFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestFacts_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRequestFacts()
      return Factory_Dispatch_Coordinator.RequestFacts_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorMaterialBoundaryFacts(): Factory_Dispatch_Coordinator.MaterialBoundaryFacts = {
      val r = readFactory_Dispatch_CoordinatorMaterialBoundaryFactsT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorMaterialBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.MaterialBoundaryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorMaterialBoundaryFacts)
      }
      val material_band = readFactory_Dispatch_CoordinatorMaterialBandType()
      val material_usable = reader.readB()
      return Factory_Dispatch_Coordinator.MaterialBoundaryFacts(material_band, material_usable)
    }

    def readFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload = {
      val r = readFactory_Dispatch_CoordinatorMaterialBoundaryFacts_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorMaterialBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      return Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorInventorySnapshot(): Factory_Dispatch_Coordinator.InventorySnapshot = {
      val r = readFactory_Dispatch_CoordinatorInventorySnapshotT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventorySnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.InventorySnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventorySnapshot)
      }
      val material_band = readFactory_Dispatch_CoordinatorMaterialBandType()
      val product_band = readFactory_Dispatch_CoordinatorProductBandType()
      return Factory_Dispatch_Coordinator.InventorySnapshot(material_band, product_band)
    }

    def readFactory_Dispatch_CoordinatorInventorySnapshot_Payload(): Factory_Dispatch_Coordinator.InventorySnapshot_Payload = {
      val r = readFactory_Dispatch_CoordinatorInventorySnapshot_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventorySnapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.InventorySnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventorySnapshot_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorInventorySnapshot()
      return Factory_Dispatch_Coordinator.InventorySnapshot_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorProductBoundaryFacts(): Factory_Dispatch_Coordinator.ProductBoundaryFacts = {
      val r = readFactory_Dispatch_CoordinatorProductBoundaryFactsT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProductBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.ProductBoundaryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProductBoundaryFacts)
      }
      val product_band = readFactory_Dispatch_CoordinatorProductBandType()
      val product_usable = reader.readB()
      return Factory_Dispatch_Coordinator.ProductBoundaryFacts(product_band, product_usable)
    }

    def readFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload = {
      val r = readFactory_Dispatch_CoordinatorProductBoundaryFacts_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProductBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProductBoundaryFacts_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorProductBoundaryFacts()
      return Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorStockFacts(): Factory_Dispatch_Coordinator.StockFacts = {
      val r = readFactory_Dispatch_CoordinatorStockFactsT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStockFactsT(typeParsed: B): Factory_Dispatch_Coordinator.StockFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStockFacts)
      }
      val material_band = readFactory_Dispatch_CoordinatorMaterialBandType()
      val material_usable = reader.readB()
      val material_shortage = reader.readB()
      val material_ready = reader.readB()
      val product_band = readFactory_Dispatch_CoordinatorProductBandType()
      val product_usable = reader.readB()
      val product_available = reader.readB()
      return Factory_Dispatch_Coordinator.StockFacts(material_band, material_usable, material_shortage, material_ready, product_band, product_usable, product_available)
    }

    def readFactory_Dispatch_CoordinatorStockFacts_Payload(): Factory_Dispatch_Coordinator.StockFacts_Payload = {
      val r = readFactory_Dispatch_CoordinatorStockFacts_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStockFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.StockFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStockFacts_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorStockFacts()
      return Factory_Dispatch_Coordinator.StockFacts_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts = {
      val r = readFactory_Dispatch_CoordinatorOutcomeBoundaryFactsT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcomeBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcomeBoundaryFacts)
      }
      val execution_outcome = readFactory_Dispatch_CoordinatorExecutionOutcomeType()
      val event_class = readFactory_Dispatch_CoordinatorOutcomeEventClassType()
      return Factory_Dispatch_Coordinator.OutcomeBoundaryFacts(execution_outcome, event_class)
    }

    def readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload = {
      val r = readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      return Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatchStatusRecord(): Factory_Dispatch_Coordinator.DispatchStatusRecord = {
      val r = readFactory_Dispatch_CoordinatorDispatchStatusRecordT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchStatusRecordT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchStatusRecord = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchStatusRecord)
      }
      val order_phase = readFactory_Dispatch_CoordinatorOrderStatusValueType()
      val recovery_phase = readFactory_Dispatch_CoordinatorRecoveryStatusValueType()
      val mode = readFactory_Dispatch_CoordinatorModeType()
      val selected_cause = readFactory_Dispatch_CoordinatorSelectedCauseType()
      return Factory_Dispatch_Coordinator.DispatchStatusRecord(order_phase, recovery_phase, mode, selected_cause)
    }

    def readFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(): Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatchStatusRecord_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchStatusRecord_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchStatusRecord_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatchStatusRecord()
      return Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatchPublicResult(): Factory_Dispatch_Coordinator.DispatchPublicResult = {
      val r = readFactory_Dispatch_CoordinatorDispatchPublicResultT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchPublicResultT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchPublicResult = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchPublicResult)
      }
      val selected_cause = readFactory_Dispatch_CoordinatorSelectedCauseType()
      val mode = readFactory_Dispatch_CoordinatorModeType()
      val published_order = readFactory_Dispatch_CoordinatorPublishedOrderStateType()
      val published_recovery = readFactory_Dispatch_CoordinatorPublishedRecoveryStateType()
      val request_disposition = readFactory_Dispatch_CoordinatorRequestDispositionType()
      val published_action = readFactory_Dispatch_CoordinatorPublishedActionType()
      return Factory_Dispatch_Coordinator.DispatchPublicResult(selected_cause, mode, published_order, published_recovery, request_disposition, published_action)
    }

    def readFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(): Factory_Dispatch_Coordinator.DispatchPublicResult_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatchPublicResult_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchPublicResult_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchPublicResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchPublicResult_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatchPublicResult()
      return Factory_Dispatch_Coordinator.DispatchPublicResult_Payload(value)
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

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P)
      }
      val api_fresh_request = readFactory_Dispatch_CoordinatorFreshRequestType()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(api_fresh_request)
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS)
      }
      val api_fresh_request = readFactory_Dispatch_CoordinatorFreshRequestType()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(api_fresh_request)
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P)
      }
      val api_request_boundary_facts = readFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(api_request_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS)
      }
      val api_request_boundary_facts = readFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(api_request_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P)
      }
      val api_inventory_snapshot = readFactory_Dispatch_CoordinatorInventorySnapshot()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(api_inventory_snapshot)
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS)
      }
      val api_inventory_snapshot = readFactory_Dispatch_CoordinatorInventorySnapshot()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(api_inventory_snapshot)
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P)
      }
      val api_material_boundary_facts = readFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      val api_product_boundary_facts = readFactory_Dispatch_CoordinatorProductBoundaryFacts()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(api_material_boundary_facts, api_product_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS)
      }
      val api_material_boundary_facts = readFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      val api_product_boundary_facts = readFactory_Dispatch_CoordinatorProductBoundaryFacts()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(api_material_boundary_facts, api_product_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P)
      }
      val api_capability_snapshot = readFactory_Dispatch_CoordinatorCapabilitySnapshot()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(api_capability_snapshot)
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS)
      }
      val api_capability_snapshot = readFactory_Dispatch_CoordinatorCapabilitySnapshot()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(api_capability_snapshot)
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P)
      }
      val api_dispatch_available = reader.readB()
      val api_production_available = reader.readB()
      val api_supplier_available = reader.readB()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(api_dispatch_available, api_production_available, api_supplier_available)
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS)
      }
      val api_dispatch_available = reader.readB()
      val api_production_available = reader.readB()
      val api_supplier_available = reader.readB()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(api_dispatch_available, api_production_available, api_supplier_available)
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P)
      }
      val api_execution_outcome = readFactory_Dispatch_CoordinatorExecutionOutcomeType()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(api_execution_outcome)
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS)
      }
      val api_execution_outcome = readFactory_Dispatch_CoordinatorExecutionOutcomeType()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(api_execution_outcome)
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P)
      }
      val api_outcome_boundary_facts = readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(api_outcome_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS)
      }
      val api_outcome_boundary_facts = readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(api_outcome_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P)
      }
      val api_request_boundary_facts = readFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P(api_request_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS)
      }
      val api_request_boundary_facts = readFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS(api_request_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P)
      }
      val api_request_facts = readFactory_Dispatch_CoordinatorRequestFacts()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P(api_request_facts)
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS)
      }
      val api_request_facts = readFactory_Dispatch_CoordinatorRequestFacts()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS(api_request_facts)
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P)
      }
      val api_material_boundary_facts = readFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      val api_product_boundary_facts = readFactory_Dispatch_CoordinatorProductBoundaryFacts()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P(api_material_boundary_facts, api_product_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS)
      }
      val api_material_boundary_facts = readFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      val api_product_boundary_facts = readFactory_Dispatch_CoordinatorProductBoundaryFacts()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(api_material_boundary_facts, api_product_boundary_facts)
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P)
      }
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P(api_stock_facts)
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS)
      }
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(api_stock_facts)
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P)
      }
      val api_outcome_boundary_facts = readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      val api_prior_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(api_outcome_boundary_facts, api_prior_order_state)
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS)
      }
      val api_outcome_boundary_facts = readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      val api_prior_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(api_outcome_boundary_facts, api_prior_order_state)
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P)
      }
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(api_qualified_outcome)
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS)
      }
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(api_qualified_outcome)
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P)
      }
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      val api_recovery_event = readFactory_Dispatch_CoordinatorRecoveryEventType()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P(api_qualified_outcome, api_recovery_event)
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS)
      }
      val In_retained_recovery = readFactory_Dispatch_CoordinatorRecoveryStateType()
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      val api_recovery_event = readFactory_Dispatch_CoordinatorRecoveryEventType()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(In_retained_recovery, api_qualified_outcome, api_recovery_event)
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P)
      }
      val api_emergency_state = readFactory_Dispatch_CoordinatorEmergencyStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_recovery_state = readFactory_Dispatch_CoordinatorRecoveryStateType()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P(api_emergency_state, api_recovery_gate, api_recovery_state)
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS)
      }
      val retained_recovery = readFactory_Dispatch_CoordinatorRecoveryStateType()
      val api_emergency_state = readFactory_Dispatch_CoordinatorEmergencyStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_recovery_state = readFactory_Dispatch_CoordinatorRecoveryStateType()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(retained_recovery, api_emergency_state, api_recovery_gate, api_recovery_state)
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P)
      }
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(api_qualified_outcome, api_recovery_gate)
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS)
      }
      val In_retained_order = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(In_retained_order, api_qualified_outcome, api_recovery_gate)
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_prior_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(api_order_state, api_prior_order_state)
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS)
      }
      val retained_order = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_prior_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(retained_order, api_order_state, api_prior_order_state)
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_request_facts = readFactory_Dispatch_CoordinatorRequestFacts()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(api_order_state, api_recovery_gate, api_request_facts)
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_request_facts = readFactory_Dispatch_CoordinatorRequestFacts()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(api_order_state, api_recovery_gate, api_request_facts)
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      val api_supplier_available = reader.readB()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(api_order_state, api_recovery_gate, api_stock_facts, api_supplier_available)
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      val api_supplier_available = reader.readB()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(api_order_state, api_recovery_gate, api_stock_facts, api_supplier_available)
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_production_available = reader.readB()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(api_order_state, api_production_available, api_recovery_gate, api_stock_facts)
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_production_available = reader.readB()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(api_order_state, api_production_available, api_recovery_gate, api_stock_facts)
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P)
      }
      val api_dispatch_available = reader.readB()
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(api_dispatch_available, api_order_state, api_recovery_gate, api_stock_facts)
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS)
      }
      val api_dispatch_available = reader.readB()
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_gate = readFactory_Dispatch_CoordinatorRecoveryGateType()
      val api_stock_facts = readFactory_Dispatch_CoordinatorStockFacts()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(api_dispatch_available, api_order_state, api_recovery_gate, api_stock_facts)
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS)
      }
      val api_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(api_proposal)
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P)
      }
      val api_dispatch_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      val api_emergency_state = readFactory_Dispatch_CoordinatorEmergencyStateType()
      val api_procurement_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      val api_production_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      val api_quotation_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(api_dispatch_proposal, api_emergency_state, api_procurement_proposal, api_production_proposal, api_quotation_proposal)
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS)
      }
      val api_dispatch_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      val api_emergency_state = readFactory_Dispatch_CoordinatorEmergencyStateType()
      val api_procurement_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      val api_production_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      val api_quotation_proposal = readFactory_Dispatch_CoordinatorProposalStateType()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(api_dispatch_proposal, api_emergency_state, api_procurement_proposal, api_production_proposal, api_quotation_proposal)
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P)
      }
      val api_selected_action = readFactory_Dispatch_CoordinatorDispatchActionType()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(api_selected_action)
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS)
      }
      val api_selected_action = readFactory_Dispatch_CoordinatorDispatchActionType()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(api_selected_action)
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_state = readFactory_Dispatch_CoordinatorRecoveryStateType()
      val api_selected_action = readFactory_Dispatch_CoordinatorDispatchActionType()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P(api_order_state, api_recovery_state, api_selected_action)
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS)
      }
      val api_order_state = readFactory_Dispatch_CoordinatorOrderStateType()
      val api_recovery_state = readFactory_Dispatch_CoordinatorRecoveryStateType()
      val api_selected_action = readFactory_Dispatch_CoordinatorDispatchActionType()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(api_order_state, api_recovery_state, api_selected_action)
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P)
      }
      val api_status_record = readFactory_Dispatch_CoordinatorDispatchStatusRecord()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P(api_status_record)
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS)
      }
      val api_status_record = readFactory_Dispatch_CoordinatorDispatchStatusRecord()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(api_status_record)
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P)
      }
      val api_request_facts = readFactory_Dispatch_CoordinatorRequestFacts()
      val api_selected_action = readFactory_Dispatch_CoordinatorDispatchActionType()
      val api_status_record = readFactory_Dispatch_CoordinatorDispatchStatusRecord()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P(api_request_facts, api_selected_action, api_status_record)
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS)
      }
      val api_request_facts = readFactory_Dispatch_CoordinatorRequestFacts()
      val api_selected_action = readFactory_Dispatch_CoordinatorDispatchActionType()
      val api_status_record = readFactory_Dispatch_CoordinatorDispatchStatusRecord()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS(api_request_facts, api_selected_action, api_status_record)
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P)
      }
      val api_public_result = readFactory_Dispatch_CoordinatorDispatchPublicResult()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P(api_public_result)
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS)
      }
      val api_public_result = readFactory_Dispatch_CoordinatorDispatchPublicResult()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS(api_public_result)
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
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T)
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
        case Constants.Factory_Dispatch_CoordinatorMode_Payload => val r = readFactory_Dispatch_CoordinatorMode_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderState_Payload => val r = readFactory_Dispatch_CoordinatorOrderState_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockFacts_Payload => val r = readFactory_Dispatch_CoordinatorStockFacts_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductBand_Payload => val r = readFactory_Dispatch_CoordinatorProductBand_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryGate_Payload => val r = readFactory_Dispatch_CoordinatorRecoveryGate_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorMaterialBand_Payload => val r = readFactory_Dispatch_CoordinatorMaterialBand_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorFreshRequest_Payload => val r = readFactory_Dispatch_CoordinatorFreshRequest_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestFacts_Payload => val r = readFactory_Dispatch_CoordinatorRequestFacts_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryEvent_Payload => val r = readFactory_Dispatch_CoordinatorRecoveryEvent_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProposalState_Payload => val r = readFactory_Dispatch_CoordinatorProposalState_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryState_Payload => val r = readFactory_Dispatch_CoordinatorRecoveryState_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorSelectedCause_Payload => val r = readFactory_Dispatch_CoordinatorSelectedCause_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorEmergencyState_Payload => val r = readFactory_Dispatch_CoordinatorEmergencyState_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchAction_Payload => val r = readFactory_Dispatch_CoordinatorDispatchAction_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublishedAction_Payload => val r = readFactory_Dispatch_CoordinatorPublishedAction_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderStatusValue_Payload => val r = readFactory_Dispatch_CoordinatorOrderStatusValue_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcome_Payload => val r = readFactory_Dispatch_CoordinatorExecutionOutcome_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQualifiedOutcome_Payload => val r = readFactory_Dispatch_CoordinatorQualifiedOutcome_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeEventClass_Payload => val r = readFactory_Dispatch_CoordinatorOutcomeEventClass_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventorySnapshot_Payload => val r = readFactory_Dispatch_CoordinatorInventorySnapshot_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestDisposition_Payload => val r = readFactory_Dispatch_CoordinatorRequestDisposition_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilitySnapshot_Payload => val r = readFactory_Dispatch_CoordinatorCapabilitySnapshot_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublishedOrderState_Payload => val r = readFactory_Dispatch_CoordinatorPublishedOrderState_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryStatusValue_Payload => val r = readFactory_Dispatch_CoordinatorRecoveryStatusValue_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductBoundaryFacts_Payload => val r = readFactory_Dispatch_CoordinatorProductBoundaryFacts_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestBoundaryFacts_Payload => val r = readFactory_Dispatch_CoordinatorRequestBoundaryFacts_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload => val r = readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchStatusRecord_Payload => val r = readFactory_Dispatch_CoordinatorDispatchStatusRecord_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchPublicResult_Payload => val r = readFactory_Dispatch_CoordinatorDispatchPublicResult_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload => val r = readFactory_Dispatch_CoordinatorMaterialBoundaryFacts_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublishedRecoveryState_Payload => val r = readFactory_Dispatch_CoordinatorPublishedRecoveryState_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T)
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

  def fromFactory_Dispatch_CoordinatorFreshRequest_Payload(o: Factory_Dispatch_Coordinator.FreshRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorFreshRequest_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorFreshRequest_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.FreshRequest_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorFreshRequest_Payload(reader: Reader): Factory_Dispatch_Coordinator.FreshRequest_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorFreshRequest_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorFreshRequest_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMaterialBand_Payload(o: Factory_Dispatch_Coordinator.MaterialBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorMaterialBand_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorMaterialBand_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.MaterialBand_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMaterialBand_Payload(reader: Reader): Factory_Dispatch_Coordinator.MaterialBand_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorMaterialBand_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorMaterialBand_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductBand_Payload(o: Factory_Dispatch_Coordinator.ProductBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductBand_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductBand_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductBand_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductBand_Payload(reader: Reader): Factory_Dispatch_Coordinator.ProductBand_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorProductBand_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductBand_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcome_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ExecutionOutcome_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcome_Payload(reader: Reader): Factory_Dispatch_Coordinator.ExecutionOutcome_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorExecutionOutcome_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecutionOutcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeEventClass_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(reader: Reader): Factory_Dispatch_Coordinator.OutcomeEventClass_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeEventClass_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeEventClass_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderState_Payload(o: Factory_Dispatch_Coordinator.OrderState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderState_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderState_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderState_Payload(reader: Reader): Factory_Dispatch_Coordinator.OrderState_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderState_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.QualifiedOutcome_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(reader: Reader): Factory_Dispatch_Coordinator.QualifiedOutcome_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorQualifiedOutcome_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQualifiedOutcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o: Factory_Dispatch_Coordinator.RecoveryEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryEvent_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryEvent_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryEvent_Payload(reader: Reader): Factory_Dispatch_Coordinator.RecoveryEvent_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryEvent_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryEvent_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryGate_Payload(o: Factory_Dispatch_Coordinator.RecoveryGate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryGate_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryGate_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryGate_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryGate_Payload(reader: Reader): Factory_Dispatch_Coordinator.RecoveryGate_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryGate_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryGate_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorEmergencyState_Payload(o: Factory_Dispatch_Coordinator.EmergencyState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorEmergencyState_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorEmergencyState_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.EmergencyState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorEmergencyState_Payload(reader: Reader): Factory_Dispatch_Coordinator.EmergencyState_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorEmergencyState_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorEmergencyState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryState_Payload(o: Factory_Dispatch_Coordinator.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryState_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryState_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryState_Payload(reader: Reader): Factory_Dispatch_Coordinator.RecoveryState_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProposalState_Payload(o: Factory_Dispatch_Coordinator.ProposalState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProposalState_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProposalState_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProposalState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProposalState_Payload(reader: Reader): Factory_Dispatch_Coordinator.ProposalState_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorProposalState_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProposalState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchAction_Payload(o: Factory_Dispatch_Coordinator.DispatchAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchAction_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchAction_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchAction_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchAction_Payload(reader: Reader): Factory_Dispatch_Coordinator.DispatchAction_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchAction_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchAction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o: Factory_Dispatch_Coordinator.OrderStatusValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderStatusValue_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderStatusValue_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderStatusValue_Payload(reader: Reader): Factory_Dispatch_Coordinator.OrderStatusValue_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderStatusValue_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderStatusValue_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(reader: Reader): Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMode_Payload(o: Factory_Dispatch_Coordinator.Mode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorMode_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorMode_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Mode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMode_Payload(reader: Reader): Factory_Dispatch_Coordinator.Mode_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorMode_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorMode_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorSelectedCause_Payload(o: Factory_Dispatch_Coordinator.SelectedCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorSelectedCause_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorSelectedCause_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.SelectedCause_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorSelectedCause_Payload(reader: Reader): Factory_Dispatch_Coordinator.SelectedCause_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorSelectedCause_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorSelectedCause_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o: Factory_Dispatch_Coordinator.PublishedOrderState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublishedOrderState_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublishedOrderState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublishedOrderState_Payload(reader: Reader): Factory_Dispatch_Coordinator.PublishedOrderState_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorPublishedOrderState_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublishedOrderState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(reader: Reader): Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestDisposition_Payload(o: Factory_Dispatch_Coordinator.RequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestDisposition_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestDisposition_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestDisposition_Payload(reader: Reader): Factory_Dispatch_Coordinator.RequestDisposition_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestDisposition_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestDisposition_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublishedAction_Payload(o: Factory_Dispatch_Coordinator.PublishedAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublishedAction_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublishedAction_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublishedAction_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublishedAction_Payload(reader: Reader): Factory_Dispatch_Coordinator.PublishedAction_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorPublishedAction_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublishedAction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestBoundaryFacts(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestBoundaryFacts(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestBoundaryFacts(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestBoundaryFacts, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestBoundaryFacts(reader: Reader): Factory_Dispatch_Coordinator.RequestBoundaryFacts = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(reader: Reader): Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilitySnapshot(o: Factory_Dispatch_Coordinator.CapabilitySnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilitySnapshot(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilitySnapshot(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilitySnapshot, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilitySnapshot(reader: Reader): Factory_Dispatch_Coordinator.CapabilitySnapshot = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilitySnapshot()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilitySnapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(reader: Reader): Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestFacts(o: Factory_Dispatch_Coordinator.RequestFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestFacts(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestFacts(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestFacts, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestFacts(reader: Reader): Factory_Dispatch_Coordinator.RequestFacts = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestFacts()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestFacts_Payload(o: Factory_Dispatch_Coordinator.RequestFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestFacts_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestFacts_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestFacts_Payload(reader: Reader): Factory_Dispatch_Coordinator.RequestFacts_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorMaterialBoundaryFacts(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.MaterialBoundaryFacts, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMaterialBoundaryFacts(reader: Reader): Factory_Dispatch_Coordinator.MaterialBoundaryFacts = {
      val r = reader.readFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorMaterialBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(reader: Reader): Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventorySnapshot(o: Factory_Dispatch_Coordinator.InventorySnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventorySnapshot(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventorySnapshot(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventorySnapshot, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventorySnapshot(reader: Reader): Factory_Dispatch_Coordinator.InventorySnapshot = {
      val r = reader.readFactory_Dispatch_CoordinatorInventorySnapshot()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventorySnapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o: Factory_Dispatch_Coordinator.InventorySnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventorySnapshot_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventorySnapshot_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventorySnapshot_Payload(reader: Reader): Factory_Dispatch_Coordinator.InventorySnapshot_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorInventorySnapshot_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventorySnapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductBoundaryFacts(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductBoundaryFacts(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductBoundaryFacts(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductBoundaryFacts, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductBoundaryFacts(reader: Reader): Factory_Dispatch_Coordinator.ProductBoundaryFacts = {
      val r = reader.readFactory_Dispatch_CoordinatorProductBoundaryFacts()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(reader: Reader): Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockFacts(o: Factory_Dispatch_Coordinator.StockFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockFacts(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockFacts(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockFacts, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockFacts(reader: Reader): Factory_Dispatch_Coordinator.StockFacts = {
      val r = reader.readFactory_Dispatch_CoordinatorStockFacts()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockFacts_Payload(o: Factory_Dispatch_Coordinator.StockFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockFacts_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockFacts_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockFacts_Payload(reader: Reader): Factory_Dispatch_Coordinator.StockFacts_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorStockFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeBoundaryFacts, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(reader: Reader): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(reader: Reader): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchStatusRecord(o: Factory_Dispatch_Coordinator.DispatchStatusRecord, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchStatusRecord(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchStatusRecord(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchStatusRecord, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchStatusRecord(reader: Reader): Factory_Dispatch_Coordinator.DispatchStatusRecord = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchStatusRecord()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchStatusRecord _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(reader: Reader): Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchPublicResult(o: Factory_Dispatch_Coordinator.DispatchPublicResult, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchPublicResult(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchPublicResult(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchPublicResult, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchPublicResult(reader: Reader): Factory_Dispatch_Coordinator.DispatchPublicResult = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchPublicResult()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchPublicResult _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchPublicResult_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(reader: Reader): Factory_Dispatch_Coordinator.DispatchPublicResult_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchPublicResult_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchPublicResult_Payload _)
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

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS _)
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