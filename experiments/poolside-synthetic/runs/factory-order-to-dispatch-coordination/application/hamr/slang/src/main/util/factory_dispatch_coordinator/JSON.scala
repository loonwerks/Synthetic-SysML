// #Sireum
// @formatter:off

// This file is auto-generated from FreshRequest.scala, MaterialBand.scala, ProductBand.scala, ExecutionOutcome.scala, OutcomeEventClass.scala, OrderState.scala, QualifiedOutcome.scala, RecoveryEvent.scala, RecoveryGate.scala, EmergencyState.scala, RecoveryState.scala, ProposalState.scala, DispatchAction.scala, OrderStatusValue.scala, RecoveryStatusValue.scala, Mode.scala, SelectedCause.scala, PublishedOrderState.scala, PublishedRecoveryState.scala, RequestDisposition.scala, PublishedAction.scala, RequestBoundaryFacts.scala, CapabilitySnapshot.scala, RequestFacts.scala, MaterialBoundaryFacts.scala, InventorySnapshot.scala, ProductBoundaryFacts.scala, StockFacts.scala, OutcomeBoundaryFacts.scala, DispatchStatusRecord.scala, DispatchPublicResult.scala, Base_Types.scala, CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_Containers.scala, InventoryAcquisition_coordinator_process_inventory_acquisition_Containers.scala, CapabilityAcquisition_coordinator_process_capability_acquisition_Containers.scala, ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_Containers.scala, RequestQualification_coordinator_process_request_qualification_Containers.scala, StockAssessment_coordinator_process_stock_assessment_Containers.scala, OutcomeQualification_coordinator_process_outcome_qualification_Containers.scala, RecoveryControl_coordinator_process_recovery_control_Containers.scala, OrderLifecycle_coordinator_process_order_lifecycle_Containers.scala, QuotationEligibility_coordinator_process_quotation_eligibility_Containers.scala, ProcurementEligibility_coordinator_process_procurement_eligibility_Containers.scala, ProductionEligibility_coordinator_process_production_eligibility_Containers.scala, DispatchEligibility_coordinator_process_dispatch_eligibility_Containers.scala, ActionArbitration_coordinator_process_action_arbitration_Containers.scala, StatusDerivation_coordinator_process_status_derivation_Containers.scala, PublicComposition_coordinator_process_public_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFactory_Dispatch_CoordinatorFreshRequestType(o: Factory_Dispatch_Coordinator.FreshRequest.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.FreshRequest.NONE => "NONE"
        case Factory_Dispatch_Coordinator.FreshRequest.INVALID => "INVALID"
        case Factory_Dispatch_Coordinator.FreshRequest.VALID_STANDARD => "VALID_STANDARD"
        case Factory_Dispatch_Coordinator.FreshRequest.VALID_EXPEDITE => "VALID_EXPEDITE"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.FreshRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorFreshRequest_Payload(o: Factory_Dispatch_Coordinator.FreshRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.FreshRequest_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorFreshRequestType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorMaterialBandType(o: Factory_Dispatch_Coordinator.MaterialBand.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.MaterialBand.INVALID => "INVALID"
        case Factory_Dispatch_Coordinator.MaterialBand.SHORT => "SHORT"
        case Factory_Dispatch_Coordinator.MaterialBand.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.MaterialBand")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorMaterialBand_Payload(o: Factory_Dispatch_Coordinator.MaterialBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.MaterialBand_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorMaterialBandType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductBandType(o: Factory_Dispatch_Coordinator.ProductBand.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.ProductBand.INVALID => "INVALID"
        case Factory_Dispatch_Coordinator.ProductBand.ABSENT => "ABSENT"
        case Factory_Dispatch_Coordinator.ProductBand.AVAILABLE => "AVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.ProductBand")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductBand_Payload(o: Factory_Dispatch_Coordinator.ProductBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProductBand_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorProductBandType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcomeType(o: Factory_Dispatch_Coordinator.ExecutionOutcome.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.ExecutionOutcome.NONE => "NONE"
        case Factory_Dispatch_Coordinator.ExecutionOutcome.QUOTE_OK => "QUOTE_OK"
        case Factory_Dispatch_Coordinator.ExecutionOutcome.MATERIAL_OK => "MATERIAL_OK"
        case Factory_Dispatch_Coordinator.ExecutionOutcome.PRODUCTION_OK => "PRODUCTION_OK"
        case Factory_Dispatch_Coordinator.ExecutionOutcome.DISPATCH_OK => "DISPATCH_OK"
        case Factory_Dispatch_Coordinator.ExecutionOutcome.FAILED => "FAILED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.ExecutionOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ExecutionOutcome_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorExecutionOutcomeType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeEventClassType(o: Factory_Dispatch_Coordinator.OutcomeEventClass.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.OutcomeEventClass.NO_EVENT => "NO_EVENT"
        case Factory_Dispatch_Coordinator.OutcomeEventClass.FAILURE => "FAILURE"
        case Factory_Dispatch_Coordinator.OutcomeEventClass.SUCCESS => "SUCCESS"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.OutcomeEventClass")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OutcomeEventClass_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorOutcomeEventClassType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderStateType(o: Factory_Dispatch_Coordinator.OrderState.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.OrderState.IDLE => "IDLE"
        case Factory_Dispatch_Coordinator.OrderState.OPEN => "OPEN"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.OrderState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderState_Payload(o: Factory_Dispatch_Coordinator.OrderState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OrderState_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorOrderStateType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o: Factory_Dispatch_Coordinator.QualifiedOutcome.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.QualifiedOutcome.NO_PROGRESS => "NO_PROGRESS"
        case Factory_Dispatch_Coordinator.QualifiedOutcome.QUOTE_ACCEPTED => "QUOTE_ACCEPTED"
        case Factory_Dispatch_Coordinator.QualifiedOutcome.MATERIAL_CONFIRMED => "MATERIAL_CONFIRMED"
        case Factory_Dispatch_Coordinator.QualifiedOutcome.PRODUCTION_COMPLETED => "PRODUCTION_COMPLETED"
        case Factory_Dispatch_Coordinator.QualifiedOutcome.DISPATCH_COMPLETED => "DISPATCH_COMPLETED"
        case Factory_Dispatch_Coordinator.QualifiedOutcome.FAULT => "FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.QualifiedOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.QualifiedOutcome_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryEventType(o: Factory_Dispatch_Coordinator.RecoveryEvent.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.RecoveryEvent.NONE => "NONE"
        case Factory_Dispatch_Coordinator.RecoveryEvent.RESET => "RESET"
        case Factory_Dispatch_Coordinator.RecoveryEvent.VERIFY_OK => "VERIFY_OK"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.RecoveryEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o: Factory_Dispatch_Coordinator.RecoveryEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryEvent_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRecoveryEventType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryGateType(o: Factory_Dispatch_Coordinator.RecoveryGate.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.RecoveryGate.OPEN => "OPEN"
        case Factory_Dispatch_Coordinator.RecoveryGate.CLOSED => "CLOSED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.RecoveryGate")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryGate_Payload(o: Factory_Dispatch_Coordinator.RecoveryGate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryGate_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRecoveryGateType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorEmergencyStateType(o: Factory_Dispatch_Coordinator.EmergencyState.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.EmergencyState.INACTIVE => "INACTIVE"
        case Factory_Dispatch_Coordinator.EmergencyState.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.EmergencyState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorEmergencyState_Payload(o: Factory_Dispatch_Coordinator.EmergencyState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.EmergencyState_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorEmergencyStateType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryStateType(o: Factory_Dispatch_Coordinator.RecoveryState.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.RecoveryState.HEALTHY => "HEALTHY"
        case Factory_Dispatch_Coordinator.RecoveryState.LATCHED => "LATCHED"
        case Factory_Dispatch_Coordinator.RecoveryState.RECOVERING => "RECOVERING"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.RecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryState_Payload(o: Factory_Dispatch_Coordinator.RecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryState_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRecoveryStateType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProposalStateType(o: Factory_Dispatch_Coordinator.ProposalState.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.ProposalState.NOT_PROPOSED => "NOT_PROPOSED"
        case Factory_Dispatch_Coordinator.ProposalState.PROPOSED => "PROPOSED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.ProposalState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProposalState_Payload(o: Factory_Dispatch_Coordinator.ProposalState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProposalState_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorProposalStateType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchActionType(o: Factory_Dispatch_Coordinator.DispatchAction.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.DispatchAction.HOLD => "HOLD"
        case Factory_Dispatch_Coordinator.DispatchAction.ISSUE_QUOTE => "ISSUE_QUOTE"
        case Factory_Dispatch_Coordinator.DispatchAction.ORDER_MATERIAL => "ORDER_MATERIAL"
        case Factory_Dispatch_Coordinator.DispatchAction.RELEASE_PRODUCTION => "RELEASE_PRODUCTION"
        case Factory_Dispatch_Coordinator.DispatchAction.RELEASE_DISPATCH => "RELEASE_DISPATCH"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.DispatchAction")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchAction_Payload(o: Factory_Dispatch_Coordinator.DispatchAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchAction_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatchActionType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderStatusValueType(o: Factory_Dispatch_Coordinator.OrderStatusValue.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.OrderStatusValue.IDLE => "IDLE"
        case Factory_Dispatch_Coordinator.OrderStatusValue.OPEN => "OPEN"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.OrderStatusValue")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o: Factory_Dispatch_Coordinator.OrderStatusValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OrderStatusValue_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorOrderStatusValueType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryStatusValueType(o: Factory_Dispatch_Coordinator.RecoveryStatusValue.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.RecoveryStatusValue.HEALTHY => "HEALTHY"
        case Factory_Dispatch_Coordinator.RecoveryStatusValue.LATCHED => "LATCHED"
        case Factory_Dispatch_Coordinator.RecoveryStatusValue.RECOVERING => "RECOVERING"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.RecoveryStatusValue")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRecoveryStatusValueType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorModeType(o: Factory_Dispatch_Coordinator.Mode.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Mode.HOLDING => "HOLDING"
        case Factory_Dispatch_Coordinator.Mode.QUOTING => "QUOTING"
        case Factory_Dispatch_Coordinator.Mode.PROCURING => "PROCURING"
        case Factory_Dispatch_Coordinator.Mode.PRODUCING => "PRODUCING"
        case Factory_Dispatch_Coordinator.Mode.DISPATCHING => "DISPATCHING"
        case Factory_Dispatch_Coordinator.Mode.FAULT => "FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Mode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorMode_Payload(o: Factory_Dispatch_Coordinator.Mode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Mode_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorModeType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorSelectedCauseType(o: Factory_Dispatch_Coordinator.SelectedCause.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.SelectedCause.FAULT_OR_RECOVERY => "FAULT_OR_RECOVERY"
        case Factory_Dispatch_Coordinator.SelectedCause.DISPATCH_PRIORITY => "DISPATCH_PRIORITY"
        case Factory_Dispatch_Coordinator.SelectedCause.PRODUCTION_PRIORITY => "PRODUCTION_PRIORITY"
        case Factory_Dispatch_Coordinator.SelectedCause.PROCUREMENT_PRIORITY => "PROCUREMENT_PRIORITY"
        case Factory_Dispatch_Coordinator.SelectedCause.QUOTE_AVAILABLE => "QUOTE_AVAILABLE"
        case Factory_Dispatch_Coordinator.SelectedCause.NO_ELIGIBLE_WORK => "NO_ELIGIBLE_WORK"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.SelectedCause")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorSelectedCause_Payload(o: Factory_Dispatch_Coordinator.SelectedCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.SelectedCause_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorSelectedCauseType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublishedOrderStateType(o: Factory_Dispatch_Coordinator.PublishedOrderState.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.PublishedOrderState.IDLE => "IDLE"
        case Factory_Dispatch_Coordinator.PublishedOrderState.OPEN => "OPEN"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.PublishedOrderState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o: Factory_Dispatch_Coordinator.PublishedOrderState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.PublishedOrderState_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorPublishedOrderStateType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublishedRecoveryStateType(o: Factory_Dispatch_Coordinator.PublishedRecoveryState.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.PublishedRecoveryState.HEALTHY => "HEALTHY"
        case Factory_Dispatch_Coordinator.PublishedRecoveryState.LATCHED => "LATCHED"
        case Factory_Dispatch_Coordinator.PublishedRecoveryState.RECOVERING => "RECOVERING"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.PublishedRecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorPublishedRecoveryStateType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestDispositionType(o: Factory_Dispatch_Coordinator.RequestDisposition.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.RequestDisposition.NO_REQUEST => "NO_REQUEST"
        case Factory_Dispatch_Coordinator.RequestDisposition.REJECTED => "REJECTED"
        case Factory_Dispatch_Coordinator.RequestDisposition.QUOTED => "QUOTED"
        case Factory_Dispatch_Coordinator.RequestDisposition.DEFERRED => "DEFERRED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.RequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestDisposition_Payload(o: Factory_Dispatch_Coordinator.RequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestDisposition_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRequestDispositionType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublishedActionType(o: Factory_Dispatch_Coordinator.PublishedAction.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.PublishedAction.HOLD => "HOLD"
        case Factory_Dispatch_Coordinator.PublishedAction.ISSUE_QUOTE => "ISSUE_QUOTE"
        case Factory_Dispatch_Coordinator.PublishedAction.ORDER_MATERIAL => "ORDER_MATERIAL"
        case Factory_Dispatch_Coordinator.PublishedAction.RELEASE_PRODUCTION => "RELEASE_PRODUCTION"
        case Factory_Dispatch_Coordinator.PublishedAction.RELEASE_DISPATCH => "RELEASE_DISPATCH"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.PublishedAction")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublishedAction_Payload(o: Factory_Dispatch_Coordinator.PublishedAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.PublishedAction_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorPublishedActionType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestBoundaryFacts(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestBoundaryFacts""""),
        ("fresh_request", printFactory_Dispatch_CoordinatorFreshRequestType(o.fresh_request)),
        ("request_present", printB(o.request_present))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilitySnapshot(o: Factory_Dispatch_Coordinator.CapabilitySnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CapabilitySnapshot""""),
        ("supplier_available", printB(o.supplier_available)),
        ("production_available", printB(o.production_available)),
        ("dispatch_available", printB(o.dispatch_available))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCapabilitySnapshot(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestFacts(o: Factory_Dispatch_Coordinator.RequestFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestFacts""""),
        ("fresh_request", printFactory_Dispatch_CoordinatorFreshRequestType(o.fresh_request)),
        ("request_present", printB(o.request_present)),
        ("request_valid", printB(o.request_valid)),
        ("request_expedited", printB(o.request_expedited))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestFacts_Payload(o: Factory_Dispatch_Coordinator.RequestFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestFacts_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRequestFacts(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.MaterialBoundaryFacts""""),
        ("material_band", printFactory_Dispatch_CoordinatorMaterialBandType(o.material_band)),
        ("material_usable", printB(o.material_usable))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventorySnapshot(o: Factory_Dispatch_Coordinator.InventorySnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.InventorySnapshot""""),
        ("material_band", printFactory_Dispatch_CoordinatorMaterialBandType(o.material_band)),
        ("product_band", printFactory_Dispatch_CoordinatorProductBandType(o.product_band))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o: Factory_Dispatch_Coordinator.InventorySnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.InventorySnapshot_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorInventorySnapshot(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductBoundaryFacts(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProductBoundaryFacts""""),
        ("product_band", printFactory_Dispatch_CoordinatorProductBandType(o.product_band)),
        ("product_usable", printB(o.product_usable))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorProductBoundaryFacts(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStockFacts(o: Factory_Dispatch_Coordinator.StockFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StockFacts""""),
        ("material_band", printFactory_Dispatch_CoordinatorMaterialBandType(o.material_band)),
        ("material_usable", printB(o.material_usable)),
        ("material_shortage", printB(o.material_shortage)),
        ("material_ready", printB(o.material_ready)),
        ("product_band", printFactory_Dispatch_CoordinatorProductBandType(o.product_band)),
        ("product_usable", printB(o.product_usable)),
        ("product_available", printB(o.product_available))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStockFacts_Payload(o: Factory_Dispatch_Coordinator.StockFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StockFacts_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorStockFacts(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OutcomeBoundaryFacts""""),
        ("execution_outcome", printFactory_Dispatch_CoordinatorExecutionOutcomeType(o.execution_outcome)),
        ("event_class", printFactory_Dispatch_CoordinatorOutcomeEventClassType(o.event_class))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchStatusRecord(o: Factory_Dispatch_Coordinator.DispatchStatusRecord): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchStatusRecord""""),
        ("order_phase", printFactory_Dispatch_CoordinatorOrderStatusValueType(o.order_phase)),
        ("recovery_phase", printFactory_Dispatch_CoordinatorRecoveryStatusValueType(o.recovery_phase)),
        ("mode", printFactory_Dispatch_CoordinatorModeType(o.mode)),
        ("selected_cause", printFactory_Dispatch_CoordinatorSelectedCauseType(o.selected_cause))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatchStatusRecord(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchPublicResult(o: Factory_Dispatch_Coordinator.DispatchPublicResult): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchPublicResult""""),
        ("selected_cause", printFactory_Dispatch_CoordinatorSelectedCauseType(o.selected_cause)),
        ("mode", printFactory_Dispatch_CoordinatorModeType(o.mode)),
        ("published_order", printFactory_Dispatch_CoordinatorPublishedOrderStateType(o.published_order)),
        ("published_recovery", printFactory_Dispatch_CoordinatorPublishedRecoveryStateType(o.published_recovery)),
        ("request_disposition", printFactory_Dispatch_CoordinatorRequestDispositionType(o.request_disposition)),
        ("published_action", printFactory_Dispatch_CoordinatorPublishedActionType(o.published_action))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchPublicResult_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatchPublicResult(o.value))
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

    @pure def printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P""""),
        ("api_fresh_request", printFactory_Dispatch_CoordinatorFreshRequestType(o.api_fresh_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS""""),
        ("api_fresh_request", printFactory_Dispatch_CoordinatorFreshRequestType(o.api_fresh_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P""""),
        ("api_request_boundary_facts", printFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS""""),
        ("api_request_boundary_facts", printFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P""""),
        ("api_inventory_snapshot", printFactory_Dispatch_CoordinatorInventorySnapshot(o.api_inventory_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS""""),
        ("api_inventory_snapshot", printFactory_Dispatch_CoordinatorInventorySnapshot(o.api_inventory_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P""""),
        ("api_material_boundary_facts", printFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)),
        ("api_product_boundary_facts", printFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS""""),
        ("api_material_boundary_facts", printFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)),
        ("api_product_boundary_facts", printFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P""""),
        ("api_capability_snapshot", printFactory_Dispatch_CoordinatorCapabilitySnapshot(o.api_capability_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS""""),
        ("api_capability_snapshot", printFactory_Dispatch_CoordinatorCapabilitySnapshot(o.api_capability_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P""""),
        ("api_dispatch_available", printB(o.api_dispatch_available)),
        ("api_production_available", printB(o.api_production_available)),
        ("api_supplier_available", printB(o.api_supplier_available))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS""""),
        ("api_dispatch_available", printB(o.api_dispatch_available)),
        ("api_production_available", printB(o.api_production_available)),
        ("api_supplier_available", printB(o.api_supplier_available))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P""""),
        ("api_execution_outcome", printFactory_Dispatch_CoordinatorExecutionOutcomeType(o.api_execution_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS""""),
        ("api_execution_outcome", printFactory_Dispatch_CoordinatorExecutionOutcomeType(o.api_execution_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P""""),
        ("api_outcome_boundary_facts", printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS""""),
        ("api_outcome_boundary_facts", printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P""""),
        ("api_request_boundary_facts", printFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS""""),
        ("api_request_boundary_facts", printFactory_Dispatch_CoordinatorRequestBoundaryFacts(o.api_request_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P""""),
        ("api_request_facts", printFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS""""),
        ("api_request_facts", printFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P""""),
        ("api_material_boundary_facts", printFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)),
        ("api_product_boundary_facts", printFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS""""),
        ("api_material_boundary_facts", printFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o.api_material_boundary_facts)),
        ("api_product_boundary_facts", printFactory_Dispatch_CoordinatorProductBoundaryFacts(o.api_product_boundary_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P""""),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS""""),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P""""),
        ("api_outcome_boundary_facts", printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts)),
        ("api_prior_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS""""),
        ("api_outcome_boundary_facts", printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o.api_outcome_boundary_facts)),
        ("api_prior_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)),
        ("api_recovery_event", printFactory_Dispatch_CoordinatorRecoveryEventType(o.api_recovery_event))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)),
        ("api_recovery_event", printFactory_Dispatch_CoordinatorRecoveryEventType(o.api_recovery_event))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P""""),
        ("api_emergency_state", printFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_recovery_state", printFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS""""),
        ("api_emergency_state", printFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_recovery_state", printFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualifiedOutcomeType(o.api_qualified_outcome)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_prior_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_prior_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_prior_order_state))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_request_facts", printFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_request_facts", printFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)),
        ("api_supplier_available", printB(o.api_supplier_available))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts)),
        ("api_supplier_available", printB(o.api_supplier_available))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_production_available", printB(o.api_production_available)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_production_available", printB(o.api_production_available)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P""""),
        ("api_dispatch_available", printB(o.api_dispatch_available)),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS""""),
        ("api_dispatch_available", printB(o.api_dispatch_available)),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_gate", printFactory_Dispatch_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_stock_facts", printFactory_Dispatch_CoordinatorStockFacts(o.api_stock_facts))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS""""),
        ("api_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P""""),
        ("api_dispatch_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_dispatch_proposal)),
        ("api_emergency_state", printFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_procurement_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_procurement_proposal)),
        ("api_production_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_production_proposal)),
        ("api_quotation_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_quotation_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS""""),
        ("api_dispatch_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_dispatch_proposal)),
        ("api_emergency_state", printFactory_Dispatch_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_procurement_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_procurement_proposal)),
        ("api_production_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_production_proposal)),
        ("api_quotation_proposal", printFactory_Dispatch_CoordinatorProposalStateType(o.api_quotation_proposal))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P""""),
        ("api_selected_action", printFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS""""),
        ("api_selected_action", printFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_state", printFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state)),
        ("api_selected_action", printFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS""""),
        ("api_order_state", printFactory_Dispatch_CoordinatorOrderStateType(o.api_order_state)),
        ("api_recovery_state", printFactory_Dispatch_CoordinatorRecoveryStateType(o.api_recovery_state)),
        ("api_selected_action", printFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P""""),
        ("api_status_record", printFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS""""),
        ("api_status_record", printFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P""""),
        ("api_request_facts", printFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)),
        ("api_selected_action", printFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)),
        ("api_status_record", printFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS""""),
        ("api_request_facts", printFactory_Dispatch_CoordinatorRequestFacts(o.api_request_facts)),
        ("api_selected_action", printFactory_Dispatch_CoordinatorDispatchActionType(o.api_selected_action)),
        ("api_status_record", printFactory_Dispatch_CoordinatorDispatchStatusRecord(o.api_status_record))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P""""),
        ("api_public_result", printFactory_Dispatch_CoordinatorDispatchPublicResult(o.api_public_result))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS""""),
        ("api_public_result", printFactory_Dispatch_CoordinatorDispatchPublicResult(o.api_public_result))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_customer_request_acquisition_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_customer_request_acquisition_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_customer_request_acquisition_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_customer_request_acquisition_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_customer_request_acquisition_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_customer_request_acquisition_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_inventory_acquisition_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_inventory_acquisition_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_inventory_acquisition_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_inventory_acquisition_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_inventory_acquisition_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_inventory_acquisition_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_capability_acquisition_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_capability_acquisition_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_capability_acquisition_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_capability_acquisition_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_capability_acquisition_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_capability_acquisition_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_execution_outcome_acquisition_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_execution_outcome_acquisition_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_execution_outcome_acquisition_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_execution_outcome_acquisition_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_execution_outcome_acquisition_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_execution_outcome_acquisition_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_request_qualification_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_request_qualification_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_request_qualification_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_request_qualification_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_request_qualification_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_request_qualification_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_stock_assessment_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_stock_assessment_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_stock_assessment_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_stock_assessment_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_stock_assessment_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_stock_assessment_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_outcome_qualification_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_outcome_qualification_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_outcome_qualification_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_outcome_qualification_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_outcome_qualification_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_outcome_qualification_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_recovery_control_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_recovery_control_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_recovery_control_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_recovery_control_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_recovery_control_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_recovery_control_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_order_lifecycle_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_order_lifecycle_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_order_lifecycle_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_order_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_order_lifecycle_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_order_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_quotation_eligibility_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_quotation_eligibility_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_quotation_eligibility_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_quotation_eligibility_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_quotation_eligibility_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_quotation_eligibility_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_procurement_eligibility_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_procurement_eligibility_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_procurement_eligibility_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_procurement_eligibility_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_procurement_eligibility_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_procurement_eligibility_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_production_eligibility_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_production_eligibility_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_production_eligibility_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_production_eligibility_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_production_eligibility_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_production_eligibility_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_dispatch_eligibility_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_dispatch_eligibility_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_dispatch_eligibility_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_dispatch_eligibility_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_dispatch_eligibility_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_dispatch_eligibility_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_action_arbitration_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_action_arbitration_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_action_arbitration_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_action_arbitration_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_action_arbitration_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_action_arbitration_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_status_derivation_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_status_derivation_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_status_derivation_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_status_derivation_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_status_derivation_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_status_derivation_postCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_public_composition_postInit => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_public_composition_postInit"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_public_composition_preCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_public_composition_preCompute"
        case runtimemonitor.ObservationKind.FactoryDispatchCoordinatorSystem_Instance_coordinator_process_public_composition_postCompute => "FactoryDispatchCoordinatorSystem_Instance_coordinator_process_public_composition_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Mode_Payload => return printFactory_Dispatch_CoordinatorMode_Payload(o)
        case o: Factory_Dispatch_Coordinator.OrderState_Payload => return printFactory_Dispatch_CoordinatorOrderState_Payload(o)
        case o: Factory_Dispatch_Coordinator.StockFacts_Payload => return printFactory_Dispatch_CoordinatorStockFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.ProductBand_Payload => return printFactory_Dispatch_CoordinatorProductBand_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryGate_Payload => return printFactory_Dispatch_CoordinatorRecoveryGate_Payload(o)
        case o: Factory_Dispatch_Coordinator.MaterialBand_Payload => return printFactory_Dispatch_CoordinatorMaterialBand_Payload(o)
        case o: Factory_Dispatch_Coordinator.FreshRequest_Payload => return printFactory_Dispatch_CoordinatorFreshRequest_Payload(o)
        case o: Factory_Dispatch_Coordinator.RequestFacts_Payload => return printFactory_Dispatch_CoordinatorRequestFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryEvent_Payload => return printFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o)
        case o: Factory_Dispatch_Coordinator.ProposalState_Payload => return printFactory_Dispatch_CoordinatorProposalState_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryState_Payload => return printFactory_Dispatch_CoordinatorRecoveryState_Payload(o)
        case o: Factory_Dispatch_Coordinator.SelectedCause_Payload => return printFactory_Dispatch_CoordinatorSelectedCause_Payload(o)
        case o: Factory_Dispatch_Coordinator.EmergencyState_Payload => return printFactory_Dispatch_CoordinatorEmergencyState_Payload(o)
        case o: Factory_Dispatch_Coordinator.DispatchAction_Payload => return printFactory_Dispatch_CoordinatorDispatchAction_Payload(o)
        case o: Factory_Dispatch_Coordinator.PublishedAction_Payload => return printFactory_Dispatch_CoordinatorPublishedAction_Payload(o)
        case o: Factory_Dispatch_Coordinator.OrderStatusValue_Payload => return printFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload => return printFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload => return printFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload => return printFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o)
        case o: Factory_Dispatch_Coordinator.InventorySnapshot_Payload => return printFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.RequestDisposition_Payload => return printFactory_Dispatch_CoordinatorRequestDisposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload => return printFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.PublishedOrderState_Payload => return printFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o)
        case o: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload => return printFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o)
        case o: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload => return printFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload => return printFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload => return printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload => return printFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o)
        case o: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload => return printFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o)
        case o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload => return printFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o)
        case o: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload => return printFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => return printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => return printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => return printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
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

    def parseFactory_Dispatch_CoordinatorFreshRequestType(): Factory_Dispatch_Coordinator.FreshRequest.Type = {
      val r = parseFactory_Dispatch_CoordinatorFreshRequestT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorFreshRequestT(typeParsed: B): Factory_Dispatch_Coordinator.FreshRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.FreshRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.FreshRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.FreshRequest.")
          return Factory_Dispatch_Coordinator.FreshRequest.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorFreshRequest_Payload(): Factory_Dispatch_Coordinator.FreshRequest_Payload = {
      val r = parseFactory_Dispatch_CoordinatorFreshRequest_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorFreshRequest_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.FreshRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.FreshRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorFreshRequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.FreshRequest_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorMaterialBandType(): Factory_Dispatch_Coordinator.MaterialBand.Type = {
      val r = parseFactory_Dispatch_CoordinatorMaterialBandT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorMaterialBandT(typeParsed: B): Factory_Dispatch_Coordinator.MaterialBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.MaterialBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.MaterialBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.MaterialBand.")
          return Factory_Dispatch_Coordinator.MaterialBand.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorMaterialBand_Payload(): Factory_Dispatch_Coordinator.MaterialBand_Payload = {
      val r = parseFactory_Dispatch_CoordinatorMaterialBand_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorMaterialBand_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.MaterialBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.MaterialBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorMaterialBandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.MaterialBand_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorProductBandType(): Factory_Dispatch_Coordinator.ProductBand.Type = {
      val r = parseFactory_Dispatch_CoordinatorProductBandT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductBandT(typeParsed: B): Factory_Dispatch_Coordinator.ProductBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.ProductBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.ProductBand.")
          return Factory_Dispatch_Coordinator.ProductBand.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorProductBand_Payload(): Factory_Dispatch_Coordinator.ProductBand_Payload = {
      val r = parseFactory_Dispatch_CoordinatorProductBand_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductBand_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ProductBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorProductBandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProductBand_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeType(): Factory_Dispatch_Coordinator.ExecutionOutcome.Type = {
      val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeT(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ExecutionOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.ExecutionOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.ExecutionOutcome.")
          return Factory_Dispatch_Coordinator.ExecutionOutcome.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcome_Payload(): Factory_Dispatch_Coordinator.ExecutionOutcome_Payload = {
      val r = parseFactory_Dispatch_CoordinatorExecutionOutcome_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ExecutionOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorExecutionOutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ExecutionOutcome_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorOutcomeEventClassType(): Factory_Dispatch_Coordinator.OutcomeEventClass.Type = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeEventClassT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeEventClassT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeEventClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeEventClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.OutcomeEventClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.OutcomeEventClass.")
          return Factory_Dispatch_Coordinator.OutcomeEventClass.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(): Factory_Dispatch_Coordinator.OutcomeEventClass_Payload = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeEventClass_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeEventClass_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeEventClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeEventClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorOutcomeEventClassType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OutcomeEventClass_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorOrderStateType(): Factory_Dispatch_Coordinator.OrderState.Type = {
      val r = parseFactory_Dispatch_CoordinatorOrderStateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderStateT(typeParsed: B): Factory_Dispatch_Coordinator.OrderState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.OrderState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.OrderState.")
          return Factory_Dispatch_Coordinator.OrderState.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorOrderState_Payload(): Factory_Dispatch_Coordinator.OrderState_Payload = {
      val r = parseFactory_Dispatch_CoordinatorOrderState_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OrderState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OrderState_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorQualifiedOutcomeType(): Factory_Dispatch_Coordinator.QualifiedOutcome.Type = {
      val r = parseFactory_Dispatch_CoordinatorQualifiedOutcomeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualifiedOutcomeT(typeParsed: B): Factory_Dispatch_Coordinator.QualifiedOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.QualifiedOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.QualifiedOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.QualifiedOutcome.")
          return Factory_Dispatch_Coordinator.QualifiedOutcome.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(): Factory_Dispatch_Coordinator.QualifiedOutcome_Payload = {
      val r = parseFactory_Dispatch_CoordinatorQualifiedOutcome_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualifiedOutcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.QualifiedOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.QualifiedOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.QualifiedOutcome_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryEventType(): Factory_Dispatch_Coordinator.RecoveryEvent.Type = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryEventT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryEventT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.RecoveryEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.RecoveryEvent.")
          return Factory_Dispatch_Coordinator.RecoveryEvent.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRecoveryEvent_Payload(): Factory_Dispatch_Coordinator.RecoveryEvent_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryEvent_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryEvent_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryEvent_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryGateType(): Factory_Dispatch_Coordinator.RecoveryGate.Type = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryGateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryGateT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryGate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryGate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.RecoveryGate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.RecoveryGate.")
          return Factory_Dispatch_Coordinator.RecoveryGate.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRecoveryGate_Payload(): Factory_Dispatch_Coordinator.RecoveryGate_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryGate_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryGate_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryGate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryGate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryGate_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorEmergencyStateType(): Factory_Dispatch_Coordinator.EmergencyState.Type = {
      val r = parseFactory_Dispatch_CoordinatorEmergencyStateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorEmergencyStateT(typeParsed: B): Factory_Dispatch_Coordinator.EmergencyState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.EmergencyState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.EmergencyState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.EmergencyState.")
          return Factory_Dispatch_Coordinator.EmergencyState.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorEmergencyState_Payload(): Factory_Dispatch_Coordinator.EmergencyState_Payload = {
      val r = parseFactory_Dispatch_CoordinatorEmergencyState_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorEmergencyState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.EmergencyState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.EmergencyState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.EmergencyState_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryStateType(): Factory_Dispatch_Coordinator.RecoveryState.Type = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryStateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryStateT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.RecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.RecoveryState.")
          return Factory_Dispatch_Coordinator.RecoveryState.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRecoveryState_Payload(): Factory_Dispatch_Coordinator.RecoveryState_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryState_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorProposalStateType(): Factory_Dispatch_Coordinator.ProposalState.Type = {
      val r = parseFactory_Dispatch_CoordinatorProposalStateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProposalStateT(typeParsed: B): Factory_Dispatch_Coordinator.ProposalState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProposalState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.ProposalState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.ProposalState.")
          return Factory_Dispatch_Coordinator.ProposalState.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorProposalState_Payload(): Factory_Dispatch_Coordinator.ProposalState_Payload = {
      val r = parseFactory_Dispatch_CoordinatorProposalState_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProposalState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ProposalState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProposalState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProposalState_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatchActionType(): Factory_Dispatch_Coordinator.DispatchAction.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatchActionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchActionT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.DispatchAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.DispatchAction.")
          return Factory_Dispatch_Coordinator.DispatchAction.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatchAction_Payload(): Factory_Dispatch_Coordinator.DispatchAction_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatchAction_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchAction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatchActionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchAction_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorOrderStatusValueType(): Factory_Dispatch_Coordinator.OrderStatusValue.Type = {
      val r = parseFactory_Dispatch_CoordinatorOrderStatusValueT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderStatusValueT(typeParsed: B): Factory_Dispatch_Coordinator.OrderStatusValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderStatusValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.OrderStatusValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.OrderStatusValue.")
          return Factory_Dispatch_Coordinator.OrderStatusValue.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorOrderStatusValue_Payload(): Factory_Dispatch_Coordinator.OrderStatusValue_Payload = {
      val r = parseFactory_Dispatch_CoordinatorOrderStatusValue_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderStatusValue_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OrderStatusValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderStatusValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorOrderStatusValueType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OrderStatusValue_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryStatusValueType(): Factory_Dispatch_Coordinator.RecoveryStatusValue.Type = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryStatusValueT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryStatusValueT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryStatusValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryStatusValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.RecoveryStatusValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.RecoveryStatusValue.")
          return Factory_Dispatch_Coordinator.RecoveryStatusValue.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(): Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryStatusValue_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryStatusValue_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRecoveryStatusValueType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorModeType(): Factory_Dispatch_Coordinator.Mode.Type = {
      val r = parseFactory_Dispatch_CoordinatorModeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorModeT(typeParsed: B): Factory_Dispatch_Coordinator.Mode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Mode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Mode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Mode.")
          return Factory_Dispatch_Coordinator.Mode.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorMode_Payload(): Factory_Dispatch_Coordinator.Mode_Payload = {
      val r = parseFactory_Dispatch_CoordinatorMode_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorMode_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Mode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Mode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorModeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Mode_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorSelectedCauseType(): Factory_Dispatch_Coordinator.SelectedCause.Type = {
      val r = parseFactory_Dispatch_CoordinatorSelectedCauseT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorSelectedCauseT(typeParsed: B): Factory_Dispatch_Coordinator.SelectedCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.SelectedCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.SelectedCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.SelectedCause.")
          return Factory_Dispatch_Coordinator.SelectedCause.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorSelectedCause_Payload(): Factory_Dispatch_Coordinator.SelectedCause_Payload = {
      val r = parseFactory_Dispatch_CoordinatorSelectedCause_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorSelectedCause_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.SelectedCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.SelectedCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorSelectedCauseType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.SelectedCause_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorPublishedOrderStateType(): Factory_Dispatch_Coordinator.PublishedOrderState.Type = {
      val r = parseFactory_Dispatch_CoordinatorPublishedOrderStateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublishedOrderStateT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedOrderState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublishedOrderState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.PublishedOrderState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.PublishedOrderState.")
          return Factory_Dispatch_Coordinator.PublishedOrderState.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorPublishedOrderState_Payload(): Factory_Dispatch_Coordinator.PublishedOrderState_Payload = {
      val r = parseFactory_Dispatch_CoordinatorPublishedOrderState_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublishedOrderState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedOrderState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublishedOrderState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorPublishedOrderStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.PublishedOrderState_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorPublishedRecoveryStateType(): Factory_Dispatch_Coordinator.PublishedRecoveryState.Type = {
      val r = parseFactory_Dispatch_CoordinatorPublishedRecoveryStateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublishedRecoveryStateT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedRecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublishedRecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.PublishedRecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.PublishedRecoveryState.")
          return Factory_Dispatch_Coordinator.PublishedRecoveryState.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(): Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload = {
      val r = parseFactory_Dispatch_CoordinatorPublishedRecoveryState_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublishedRecoveryState_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorPublishedRecoveryStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRequestDispositionType(): Factory_Dispatch_Coordinator.RequestDisposition.Type = {
      val r = parseFactory_Dispatch_CoordinatorRequestDispositionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestDispositionT(typeParsed: B): Factory_Dispatch_Coordinator.RequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.RequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.RequestDisposition.")
          return Factory_Dispatch_Coordinator.RequestDisposition.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRequestDisposition_Payload(): Factory_Dispatch_Coordinator.RequestDisposition_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRequestDisposition_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestDisposition_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestDisposition_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorPublishedActionType(): Factory_Dispatch_Coordinator.PublishedAction.Type = {
      val r = parseFactory_Dispatch_CoordinatorPublishedActionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublishedActionT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublishedAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.PublishedAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.PublishedAction.")
          return Factory_Dispatch_Coordinator.PublishedAction.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorPublishedAction_Payload(): Factory_Dispatch_Coordinator.PublishedAction_Payload = {
      val r = parseFactory_Dispatch_CoordinatorPublishedAction_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublishedAction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.PublishedAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublishedAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorPublishedActionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.PublishedAction_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRequestBoundaryFacts(): Factory_Dispatch_Coordinator.RequestBoundaryFacts = {
      val r = parseFactory_Dispatch_CoordinatorRequestBoundaryFactsT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.RequestBoundaryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestBoundaryFacts")
      }
      parser.parseObjectKey("fresh_request")
      val fresh_request = parseFactory_Dispatch_CoordinatorFreshRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_present")
      val request_present = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request, request_present)
    }

    def parseFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRequestBoundaryFacts_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCapabilitySnapshot(): Factory_Dispatch_Coordinator.CapabilitySnapshot = {
      val r = parseFactory_Dispatch_CoordinatorCapabilitySnapshotT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapabilitySnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilitySnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CapabilitySnapshot")
      }
      parser.parseObjectKey("supplier_available")
      val supplier_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("production_available")
      val production_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dispatch_available")
      val dispatch_available = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CapabilitySnapshot(supplier_available, production_available, dispatch_available)
    }

    def parseFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(): Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCapabilitySnapshot_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapabilitySnapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCapabilitySnapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRequestFacts(): Factory_Dispatch_Coordinator.RequestFacts = {
      val r = parseFactory_Dispatch_CoordinatorRequestFactsT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestFactsT(typeParsed: B): Factory_Dispatch_Coordinator.RequestFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestFacts")
      }
      parser.parseObjectKey("fresh_request")
      val fresh_request = parseFactory_Dispatch_CoordinatorFreshRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_present")
      val request_present = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("request_valid")
      val request_valid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("request_expedited")
      val request_expedited = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestFacts(fresh_request, request_present, request_valid, request_expedited)
    }

    def parseFactory_Dispatch_CoordinatorRequestFacts_Payload(): Factory_Dispatch_Coordinator.RequestFacts_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRequestFacts_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.RequestFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestFacts_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts(): Factory_Dispatch_Coordinator.MaterialBoundaryFacts = {
      val r = parseFactory_Dispatch_CoordinatorMaterialBoundaryFactsT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorMaterialBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.MaterialBoundaryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.MaterialBoundaryFacts")
      }
      parser.parseObjectKey("material_band")
      val material_band = parseFactory_Dispatch_CoordinatorMaterialBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("material_usable")
      val material_usable = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.MaterialBoundaryFacts(material_band, material_usable)
    }

    def parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload = {
      val r = parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorInventorySnapshot(): Factory_Dispatch_Coordinator.InventorySnapshot = {
      val r = parseFactory_Dispatch_CoordinatorInventorySnapshotT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventorySnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.InventorySnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.InventorySnapshot")
      }
      parser.parseObjectKey("material_band")
      val material_band = parseFactory_Dispatch_CoordinatorMaterialBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("product_band")
      val product_band = parseFactory_Dispatch_CoordinatorProductBandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.InventorySnapshot(material_band, product_band)
    }

    def parseFactory_Dispatch_CoordinatorInventorySnapshot_Payload(): Factory_Dispatch_Coordinator.InventorySnapshot_Payload = {
      val r = parseFactory_Dispatch_CoordinatorInventorySnapshot_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventorySnapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.InventorySnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.InventorySnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorInventorySnapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.InventorySnapshot_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorProductBoundaryFacts(): Factory_Dispatch_Coordinator.ProductBoundaryFacts = {
      val r = parseFactory_Dispatch_CoordinatorProductBoundaryFactsT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.ProductBoundaryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductBoundaryFacts")
      }
      parser.parseObjectKey("product_band")
      val product_band = parseFactory_Dispatch_CoordinatorProductBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("product_usable")
      val product_usable = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProductBoundaryFacts(product_band, product_usable)
    }

    def parseFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload = {
      val r = parseFactory_Dispatch_CoordinatorProductBoundaryFacts_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorProductBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorStockFacts(): Factory_Dispatch_Coordinator.StockFacts = {
      val r = parseFactory_Dispatch_CoordinatorStockFactsT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStockFactsT(typeParsed: B): Factory_Dispatch_Coordinator.StockFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StockFacts")
      }
      parser.parseObjectKey("material_band")
      val material_band = parseFactory_Dispatch_CoordinatorMaterialBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("material_usable")
      val material_usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("material_shortage")
      val material_shortage = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("material_ready")
      val material_ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("product_band")
      val product_band = parseFactory_Dispatch_CoordinatorProductBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("product_usable")
      val product_usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("product_available")
      val product_available = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StockFacts(material_band, material_usable, material_shortage, material_ready, product_band, product_usable, product_available)
    }

    def parseFactory_Dispatch_CoordinatorStockFacts_Payload(): Factory_Dispatch_Coordinator.StockFacts_Payload = {
      val r = parseFactory_Dispatch_CoordinatorStockFacts_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStockFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.StockFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StockFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StockFacts_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFactsT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeBoundaryFactsT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeBoundaryFacts")
      }
      parser.parseObjectKey("execution_outcome")
      val execution_outcome = parseFactory_Dispatch_CoordinatorExecutionOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("event_class")
      val event_class = parseFactory_Dispatch_CoordinatorOutcomeEventClassType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OutcomeBoundaryFacts(execution_outcome, event_class)
    }

    def parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatchStatusRecord(): Factory_Dispatch_Coordinator.DispatchStatusRecord = {
      val r = parseFactory_Dispatch_CoordinatorDispatchStatusRecordT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchStatusRecordT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchStatusRecord = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchStatusRecord")
      }
      parser.parseObjectKey("order_phase")
      val order_phase = parseFactory_Dispatch_CoordinatorOrderStatusValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_phase")
      val recovery_phase = parseFactory_Dispatch_CoordinatorRecoveryStatusValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parseFactory_Dispatch_CoordinatorModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("selected_cause")
      val selected_cause = parseFactory_Dispatch_CoordinatorSelectedCauseType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchStatusRecord(order_phase, recovery_phase, mode, selected_cause)
    }

    def parseFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(): Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatchStatusRecord_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchStatusRecord_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatchStatusRecord()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatchPublicResult(): Factory_Dispatch_Coordinator.DispatchPublicResult = {
      val r = parseFactory_Dispatch_CoordinatorDispatchPublicResultT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchPublicResultT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchPublicResult = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchPublicResult")
      }
      parser.parseObjectKey("selected_cause")
      val selected_cause = parseFactory_Dispatch_CoordinatorSelectedCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parseFactory_Dispatch_CoordinatorModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("published_order")
      val published_order = parseFactory_Dispatch_CoordinatorPublishedOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("published_recovery")
      val published_recovery = parseFactory_Dispatch_CoordinatorPublishedRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_disposition")
      val request_disposition = parseFactory_Dispatch_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("published_action")
      val published_action = parseFactory_Dispatch_CoordinatorPublishedActionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchPublicResult(selected_cause, mode, published_order, published_recovery, request_disposition, published_action)
    }

    def parseFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(): Factory_Dispatch_Coordinator.DispatchPublicResult_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatchPublicResult_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchPublicResult_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchPublicResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchPublicResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatchPublicResult()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchPublicResult_Payload(value)
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

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_fresh_request")
      val api_fresh_request = parseFactory_Dispatch_CoordinatorFreshRequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(api_fresh_request)
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fresh_request")
      val api_fresh_request = parseFactory_Dispatch_CoordinatorFreshRequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(api_fresh_request)
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_boundary_facts")
      val api_request_boundary_facts = parseFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(api_request_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_boundary_facts")
      val api_request_boundary_facts = parseFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(api_request_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_inventory_snapshot")
      val api_inventory_snapshot = parseFactory_Dispatch_CoordinatorInventorySnapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(api_inventory_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_inventory_snapshot")
      val api_inventory_snapshot = parseFactory_Dispatch_CoordinatorInventorySnapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(api_inventory_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_material_boundary_facts")
      val api_material_boundary_facts = parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_product_boundary_facts")
      val api_product_boundary_facts = parseFactory_Dispatch_CoordinatorProductBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(api_material_boundary_facts, api_product_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_material_boundary_facts")
      val api_material_boundary_facts = parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_product_boundary_facts")
      val api_product_boundary_facts = parseFactory_Dispatch_CoordinatorProductBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(api_material_boundary_facts, api_product_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_capability_snapshot")
      val api_capability_snapshot = parseFactory_Dispatch_CoordinatorCapabilitySnapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(api_capability_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_capability_snapshot")
      val api_capability_snapshot = parseFactory_Dispatch_CoordinatorCapabilitySnapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(api_capability_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_available")
      val api_dispatch_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_available")
      val api_production_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supplier_available")
      val api_supplier_available = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(api_dispatch_available, api_production_available, api_supplier_available)
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_available")
      val api_dispatch_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_available")
      val api_production_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supplier_available")
      val api_supplier_available = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(api_dispatch_available, api_production_available, api_supplier_available)
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_execution_outcome")
      val api_execution_outcome = parseFactory_Dispatch_CoordinatorExecutionOutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(api_execution_outcome)
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_execution_outcome")
      val api_execution_outcome = parseFactory_Dispatch_CoordinatorExecutionOutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(api_execution_outcome)
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_outcome_boundary_facts")
      val api_outcome_boundary_facts = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(api_outcome_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_outcome_boundary_facts")
      val api_outcome_boundary_facts = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(api_outcome_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_request_boundary_facts")
      val api_request_boundary_facts = parseFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P(api_request_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_request_boundary_facts")
      val api_request_boundary_facts = parseFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS(api_request_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseFactory_Dispatch_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P(api_request_facts)
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseFactory_Dispatch_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS(api_request_facts)
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_material_boundary_facts")
      val api_material_boundary_facts = parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_product_boundary_facts")
      val api_product_boundary_facts = parseFactory_Dispatch_CoordinatorProductBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P(api_material_boundary_facts, api_product_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_material_boundary_facts")
      val api_material_boundary_facts = parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_product_boundary_facts")
      val api_product_boundary_facts = parseFactory_Dispatch_CoordinatorProductBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(api_material_boundary_facts, api_product_boundary_facts)
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P(api_stock_facts)
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(api_stock_facts)
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_outcome_boundary_facts")
      val api_outcome_boundary_facts = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_order_state")
      val api_prior_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(api_outcome_boundary_facts, api_prior_order_state)
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_outcome_boundary_facts")
      val api_outcome_boundary_facts = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_order_state")
      val api_prior_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(api_outcome_boundary_facts, api_prior_order_state)
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(api_qualified_outcome)
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(api_qualified_outcome)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_event")
      val api_recovery_event = parseFactory_Dispatch_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P(api_qualified_outcome, api_recovery_event)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_event")
      val api_recovery_event = parseFactory_Dispatch_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(api_qualified_outcome, api_recovery_event)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Dispatch_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Dispatch_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P(api_emergency_state, api_recovery_gate, api_recovery_state)
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS")
      }
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Dispatch_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Dispatch_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(api_emergency_state, api_recovery_gate, api_recovery_state)
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(api_qualified_outcome, api_recovery_gate)
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualifiedOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(api_qualified_outcome, api_recovery_gate)
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_order_state")
      val api_prior_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(api_order_state, api_prior_order_state)
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_order_state")
      val api_prior_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(api_order_state, api_prior_order_state)
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseFactory_Dispatch_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(api_order_state, api_recovery_gate, api_request_facts)
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseFactory_Dispatch_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(api_order_state, api_recovery_gate, api_request_facts)
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supplier_available")
      val api_supplier_available = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(api_order_state, api_recovery_gate, api_stock_facts, api_supplier_available)
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supplier_available")
      val api_supplier_available = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(api_order_state, api_recovery_gate, api_stock_facts, api_supplier_available)
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_available")
      val api_production_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(api_order_state, api_production_available, api_recovery_gate, api_stock_facts)
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_available")
      val api_production_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(api_order_state, api_production_available, api_recovery_gate, api_stock_facts)
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_available")
      val api_dispatch_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(api_dispatch_available, api_order_state, api_recovery_gate, api_stock_facts)
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_available")
      val api_dispatch_available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Dispatch_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stock_facts")
      val api_stock_facts = parseFactory_Dispatch_CoordinatorStockFacts()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(api_dispatch_available, api_order_state, api_recovery_gate, api_stock_facts)
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(api_proposal)
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_proposal")
      val api_dispatch_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Dispatch_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_procurement_proposal")
      val api_procurement_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_proposal")
      val api_production_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_quotation_proposal")
      val api_quotation_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(api_dispatch_proposal, api_emergency_state, api_procurement_proposal, api_production_proposal, api_quotation_proposal)
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_proposal")
      val api_dispatch_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Dispatch_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_procurement_proposal")
      val api_procurement_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_proposal")
      val api_production_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_quotation_proposal")
      val api_quotation_proposal = parseFactory_Dispatch_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(api_dispatch_proposal, api_emergency_state, api_procurement_proposal, api_production_proposal, api_quotation_proposal)
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseFactory_Dispatch_CoordinatorDispatchActionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(api_selected_action)
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseFactory_Dispatch_CoordinatorDispatchActionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(api_selected_action)
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Dispatch_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseFactory_Dispatch_CoordinatorDispatchActionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P(api_order_state, api_recovery_state, api_selected_action)
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_order_state")
      val api_order_state = parseFactory_Dispatch_CoordinatorOrderStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Dispatch_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseFactory_Dispatch_CoordinatorDispatchActionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(api_order_state, api_recovery_state, api_selected_action)
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_status_record")
      val api_status_record = parseFactory_Dispatch_CoordinatorDispatchStatusRecord()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P(api_status_record)
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_status_record")
      val api_status_record = parseFactory_Dispatch_CoordinatorDispatchStatusRecord()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(api_status_record)
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseFactory_Dispatch_CoordinatorRequestFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseFactory_Dispatch_CoordinatorDispatchActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_status_record")
      val api_status_record = parseFactory_Dispatch_CoordinatorDispatchStatusRecord()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P(api_request_facts, api_selected_action, api_status_record)
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseFactory_Dispatch_CoordinatorRequestFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_action")
      val api_selected_action = parseFactory_Dispatch_CoordinatorDispatchActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_status_record")
      val api_status_record = parseFactory_Dispatch_CoordinatorDispatchStatusRecord()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS(api_request_facts, api_selected_action, api_status_record)
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_public_result")
      val api_public_result = parseFactory_Dispatch_CoordinatorDispatchPublicResult()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P(api_public_result)
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_public_result")
      val api_public_result = parseFactory_Dispatch_CoordinatorDispatchPublicResult()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS(api_public_result)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Factory_Dispatch_Coordinator.Mode_Payload", "Factory_Dispatch_Coordinator.OrderState_Payload", "Factory_Dispatch_Coordinator.StockFacts_Payload", "Factory_Dispatch_Coordinator.ProductBand_Payload", "Factory_Dispatch_Coordinator.RecoveryGate_Payload", "Factory_Dispatch_Coordinator.MaterialBand_Payload", "Factory_Dispatch_Coordinator.FreshRequest_Payload", "Factory_Dispatch_Coordinator.RequestFacts_Payload", "Factory_Dispatch_Coordinator.RecoveryEvent_Payload", "Factory_Dispatch_Coordinator.ProposalState_Payload", "Factory_Dispatch_Coordinator.RecoveryState_Payload", "Factory_Dispatch_Coordinator.SelectedCause_Payload", "Factory_Dispatch_Coordinator.EmergencyState_Payload", "Factory_Dispatch_Coordinator.DispatchAction_Payload", "Factory_Dispatch_Coordinator.PublishedAction_Payload", "Factory_Dispatch_Coordinator.OrderStatusValue_Payload", "Factory_Dispatch_Coordinator.ExecutionOutcome_Payload", "Factory_Dispatch_Coordinator.QualifiedOutcome_Payload", "Factory_Dispatch_Coordinator.OutcomeEventClass_Payload", "Factory_Dispatch_Coordinator.InventorySnapshot_Payload", "Factory_Dispatch_Coordinator.RequestDisposition_Payload", "Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload", "Factory_Dispatch_Coordinator.PublishedOrderState_Payload", "Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload", "Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload", "Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload", "Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload", "Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload", "Factory_Dispatch_Coordinator.DispatchPublicResult_Payload", "Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload", "Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P", "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P", "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS", "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P", "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P", "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS", "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P", "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P", "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS"))
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
        case "Factory_Dispatch_Coordinator.Mode_Payload" => val r = parseFactory_Dispatch_CoordinatorMode_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.OrderState_Payload" => val r = parseFactory_Dispatch_CoordinatorOrderState_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.StockFacts_Payload" => val r = parseFactory_Dispatch_CoordinatorStockFacts_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.ProductBand_Payload" => val r = parseFactory_Dispatch_CoordinatorProductBand_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryGate_Payload" => val r = parseFactory_Dispatch_CoordinatorRecoveryGate_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.MaterialBand_Payload" => val r = parseFactory_Dispatch_CoordinatorMaterialBand_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.FreshRequest_Payload" => val r = parseFactory_Dispatch_CoordinatorFreshRequest_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.RequestFacts_Payload" => val r = parseFactory_Dispatch_CoordinatorRequestFacts_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryEvent_Payload" => val r = parseFactory_Dispatch_CoordinatorRecoveryEvent_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.ProposalState_Payload" => val r = parseFactory_Dispatch_CoordinatorProposalState_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryState_Payload" => val r = parseFactory_Dispatch_CoordinatorRecoveryState_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.SelectedCause_Payload" => val r = parseFactory_Dispatch_CoordinatorSelectedCause_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.EmergencyState_Payload" => val r = parseFactory_Dispatch_CoordinatorEmergencyState_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchAction_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatchAction_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.PublishedAction_Payload" => val r = parseFactory_Dispatch_CoordinatorPublishedAction_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.OrderStatusValue_Payload" => val r = parseFactory_Dispatch_CoordinatorOrderStatusValue_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcome_Payload" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcome_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.QualifiedOutcome_Payload" => val r = parseFactory_Dispatch_CoordinatorQualifiedOutcome_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeEventClass_Payload" => val r = parseFactory_Dispatch_CoordinatorOutcomeEventClass_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.InventorySnapshot_Payload" => val r = parseFactory_Dispatch_CoordinatorInventorySnapshot_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.RequestDisposition_Payload" => val r = parseFactory_Dispatch_CoordinatorRequestDisposition_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload" => val r = parseFactory_Dispatch_CoordinatorCapabilitySnapshot_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.PublishedOrderState_Payload" => val r = parseFactory_Dispatch_CoordinatorPublishedOrderState_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload" => val r = parseFactory_Dispatch_CoordinatorRecoveryStatusValue_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload" => val r = parseFactory_Dispatch_CoordinatorProductBoundaryFacts_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload" => val r = parseFactory_Dispatch_CoordinatorRequestBoundaryFacts_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload" => val r = parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatchStatusRecord_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchPublicResult_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatchPublicResult_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload" => val r = parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload" => val r = parseFactory_Dispatch_CoordinatorPublishedRecoveryState_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PST(T); return r
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

  def fromFactory_Dispatch_CoordinatorFreshRequest_Payload(o: Factory_Dispatch_Coordinator.FreshRequest_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorFreshRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorFreshRequest_Payload(s: String): Either[Factory_Dispatch_Coordinator.FreshRequest_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorFreshRequest_Payload(parser: Parser): Factory_Dispatch_Coordinator.FreshRequest_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorFreshRequest_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorFreshRequest_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMaterialBand_Payload(o: Factory_Dispatch_Coordinator.MaterialBand_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorMaterialBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorMaterialBand_Payload(s: String): Either[Factory_Dispatch_Coordinator.MaterialBand_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMaterialBand_Payload(parser: Parser): Factory_Dispatch_Coordinator.MaterialBand_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorMaterialBand_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorMaterialBand_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductBand_Payload(o: Factory_Dispatch_Coordinator.ProductBand_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductBand_Payload(s: String): Either[Factory_Dispatch_Coordinator.ProductBand_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductBand_Payload(parser: Parser): Factory_Dispatch_Coordinator.ProductBand_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductBand_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductBand_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecutionOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcome_Payload(s: String): Either[Factory_Dispatch_Coordinator.ExecutionOutcome_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcome_Payload(parser: Parser): Factory_Dispatch_Coordinator.ExecutionOutcome_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecutionOutcome_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecutionOutcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(s: String): Either[Factory_Dispatch_Coordinator.OutcomeEventClass_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeEventClass_Payload(parser: Parser): Factory_Dispatch_Coordinator.OutcomeEventClass_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeEventClass_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeEventClass_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderState_Payload(o: Factory_Dispatch_Coordinator.OrderState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderState_Payload(s: String): Either[Factory_Dispatch_Coordinator.OrderState_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderState_Payload(parser: Parser): Factory_Dispatch_Coordinator.OrderState_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderState_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(s: String): Either[Factory_Dispatch_Coordinator.QualifiedOutcome_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualifiedOutcome_Payload(parser: Parser): Factory_Dispatch_Coordinator.QualifiedOutcome_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorQualifiedOutcome_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQualifiedOutcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o: Factory_Dispatch_Coordinator.RecoveryEvent_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryEvent_Payload(s: String): Either[Factory_Dispatch_Coordinator.RecoveryEvent_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryEvent_Payload(parser: Parser): Factory_Dispatch_Coordinator.RecoveryEvent_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryEvent_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryEvent_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryGate_Payload(o: Factory_Dispatch_Coordinator.RecoveryGate_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryGate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryGate_Payload(s: String): Either[Factory_Dispatch_Coordinator.RecoveryGate_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryGate_Payload(parser: Parser): Factory_Dispatch_Coordinator.RecoveryGate_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryGate_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryGate_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorEmergencyState_Payload(o: Factory_Dispatch_Coordinator.EmergencyState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorEmergencyState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorEmergencyState_Payload(s: String): Either[Factory_Dispatch_Coordinator.EmergencyState_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorEmergencyState_Payload(parser: Parser): Factory_Dispatch_Coordinator.EmergencyState_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorEmergencyState_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorEmergencyState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryState_Payload(o: Factory_Dispatch_Coordinator.RecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryState_Payload(s: String): Either[Factory_Dispatch_Coordinator.RecoveryState_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryState_Payload(parser: Parser): Factory_Dispatch_Coordinator.RecoveryState_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProposalState_Payload(o: Factory_Dispatch_Coordinator.ProposalState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProposalState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProposalState_Payload(s: String): Either[Factory_Dispatch_Coordinator.ProposalState_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProposalState_Payload(parser: Parser): Factory_Dispatch_Coordinator.ProposalState_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorProposalState_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProposalState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchAction_Payload(o: Factory_Dispatch_Coordinator.DispatchAction_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchAction_Payload(s: String): Either[Factory_Dispatch_Coordinator.DispatchAction_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchAction_Payload(parser: Parser): Factory_Dispatch_Coordinator.DispatchAction_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchAction_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchAction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o: Factory_Dispatch_Coordinator.OrderStatusValue_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderStatusValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderStatusValue_Payload(s: String): Either[Factory_Dispatch_Coordinator.OrderStatusValue_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderStatusValue_Payload(parser: Parser): Factory_Dispatch_Coordinator.OrderStatusValue_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderStatusValue_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderStatusValue_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(s: String): Either[Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload(parser: Parser): Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMode_Payload(o: Factory_Dispatch_Coordinator.Mode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorMode_Payload(s: String): Either[Factory_Dispatch_Coordinator.Mode_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMode_Payload(parser: Parser): Factory_Dispatch_Coordinator.Mode_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorMode_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorMode_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorSelectedCause_Payload(o: Factory_Dispatch_Coordinator.SelectedCause_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorSelectedCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorSelectedCause_Payload(s: String): Either[Factory_Dispatch_Coordinator.SelectedCause_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorSelectedCause_Payload(parser: Parser): Factory_Dispatch_Coordinator.SelectedCause_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorSelectedCause_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorSelectedCause_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o: Factory_Dispatch_Coordinator.PublishedOrderState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublishedOrderState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublishedOrderState_Payload(s: String): Either[Factory_Dispatch_Coordinator.PublishedOrderState_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublishedOrderState_Payload(parser: Parser): Factory_Dispatch_Coordinator.PublishedOrderState_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublishedOrderState_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublishedOrderState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(s: String): Either[Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload(parser: Parser): Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestDisposition_Payload(o: Factory_Dispatch_Coordinator.RequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestDisposition_Payload(s: String): Either[Factory_Dispatch_Coordinator.RequestDisposition_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestDisposition_Payload(parser: Parser): Factory_Dispatch_Coordinator.RequestDisposition_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestDisposition_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestDisposition_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublishedAction_Payload(o: Factory_Dispatch_Coordinator.PublishedAction_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublishedAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublishedAction_Payload(s: String): Either[Factory_Dispatch_Coordinator.PublishedAction_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublishedAction_Payload(parser: Parser): Factory_Dispatch_Coordinator.PublishedAction_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublishedAction_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublishedAction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestBoundaryFacts(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestBoundaryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestBoundaryFacts(s: String): Either[Factory_Dispatch_Coordinator.RequestBoundaryFacts, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestBoundaryFacts(parser: Parser): Factory_Dispatch_Coordinator.RequestBoundaryFacts = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestBoundaryFacts()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(s: String): Either[Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(parser: Parser): Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilitySnapshot(o: Factory_Dispatch_Coordinator.CapabilitySnapshot, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilitySnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilitySnapshot(s: String): Either[Factory_Dispatch_Coordinator.CapabilitySnapshot, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilitySnapshot(parser: Parser): Factory_Dispatch_Coordinator.CapabilitySnapshot = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilitySnapshot()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilitySnapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(s: String): Either[Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload(parser: Parser): Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestFacts(o: Factory_Dispatch_Coordinator.RequestFacts, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestFacts(s: String): Either[Factory_Dispatch_Coordinator.RequestFacts, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestFacts(parser: Parser): Factory_Dispatch_Coordinator.RequestFacts = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestFacts()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestFacts_Payload(o: Factory_Dispatch_Coordinator.RequestFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestFacts_Payload(s: String): Either[Factory_Dispatch_Coordinator.RequestFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestFacts_Payload(parser: Parser): Factory_Dispatch_Coordinator.RequestFacts_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorMaterialBoundaryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorMaterialBoundaryFacts(s: String): Either[Factory_Dispatch_Coordinator.MaterialBoundaryFacts, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMaterialBoundaryFacts(parser: Parser): Factory_Dispatch_Coordinator.MaterialBoundaryFacts = {
      val r = parser.parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorMaterialBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(s: String): Either[Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(parser: Parser): Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventorySnapshot(o: Factory_Dispatch_Coordinator.InventorySnapshot, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventorySnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventorySnapshot(s: String): Either[Factory_Dispatch_Coordinator.InventorySnapshot, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventorySnapshot(parser: Parser): Factory_Dispatch_Coordinator.InventorySnapshot = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventorySnapshot()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventorySnapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o: Factory_Dispatch_Coordinator.InventorySnapshot_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventorySnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventorySnapshot_Payload(s: String): Either[Factory_Dispatch_Coordinator.InventorySnapshot_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventorySnapshot_Payload(parser: Parser): Factory_Dispatch_Coordinator.InventorySnapshot_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventorySnapshot_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventorySnapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductBoundaryFacts(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductBoundaryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductBoundaryFacts(s: String): Either[Factory_Dispatch_Coordinator.ProductBoundaryFacts, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductBoundaryFacts(parser: Parser): Factory_Dispatch_Coordinator.ProductBoundaryFacts = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductBoundaryFacts()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(s: String): Either[Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload(parser: Parser): Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockFacts(o: Factory_Dispatch_Coordinator.StockFacts, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockFacts(s: String): Either[Factory_Dispatch_Coordinator.StockFacts, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockFacts(parser: Parser): Factory_Dispatch_Coordinator.StockFacts = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockFacts()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockFacts_Payload(o: Factory_Dispatch_Coordinator.StockFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockFacts_Payload(s: String): Either[Factory_Dispatch_Coordinator.StockFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockFacts_Payload(parser: Parser): Factory_Dispatch_Coordinator.StockFacts_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(s: String): Either[Factory_Dispatch_Coordinator.OutcomeBoundaryFacts, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts(parser: Parser): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(s: String): Either[Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(parser: Parser): Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchStatusRecord(o: Factory_Dispatch_Coordinator.DispatchStatusRecord, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchStatusRecord(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchStatusRecord(s: String): Either[Factory_Dispatch_Coordinator.DispatchStatusRecord, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchStatusRecord(parser: Parser): Factory_Dispatch_Coordinator.DispatchStatusRecord = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchStatusRecord()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchStatusRecord _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(s: String): Either[Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload(parser: Parser): Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchPublicResult(o: Factory_Dispatch_Coordinator.DispatchPublicResult, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchPublicResult(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchPublicResult(s: String): Either[Factory_Dispatch_Coordinator.DispatchPublicResult, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchPublicResult(parser: Parser): Factory_Dispatch_Coordinator.DispatchPublicResult = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchPublicResult()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchPublicResult _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(s: String): Either[Factory_Dispatch_Coordinator.DispatchPublicResult_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchPublicResult_Payload(parser: Parser): Factory_Dispatch_Coordinator.DispatchPublicResult_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchPublicResult_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchPublicResult_Payload _)
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

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS _)
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