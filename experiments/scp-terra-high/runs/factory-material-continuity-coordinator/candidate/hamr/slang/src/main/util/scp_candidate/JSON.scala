// #Sireum
// @formatter:off

// This file is auto-generated from DemandSignal.scala, DemandCode.scala, InventoryBand.scala, InventoryBandCode.scala, MaterialEvent.scala, MaterialEventCode.scala, EventClass.scala, MaterialClass.scala, Availability.scala, DemandState.scala, SupplyState.scala, QualifiedEvent.scala, FaultTrigger.scala, RecoveryGate.scala, DemandStateView.scala, DemandStateCode.scala, DemandUpdate.scala, DemandDisposition.scala, RecoveryEvent.scala, EmergencyState.scala, RecoveryState.scala, ProposalState.scala, MaterialAction.scala, DecisionCause.scala, CoordinationMode.scala, SupplyStateCode.scala, RecoveryStateCode.scala, DemandBoundaryFacts.scala, InventoryBoundaryFacts.scala, MaterialReadinessFacts.scala, EventBoundaryFacts.scala, DemandFacts.scala, DemandTransition.scala, Decision.scala, MaterialCoordinationResult.scala, Base_Types.scala, DemandAcquisition_material_continuity_process_demand_acquisition_Containers.scala, InventoryAcquisition_material_continuity_process_inventory_acquisition_Containers.scala, EventAcquisition_material_continuity_process_event_acquisition_Containers.scala, DemandQualification_material_continuity_process_demand_qualification_Containers.scala, MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_Containers.scala, EventCoherence_material_continuity_process_event_coherence_Containers.scala, DemandRegistry_material_continuity_process_demand_registry_Containers.scala, SupplyLifecycle_material_continuity_process_supply_lifecycle_Containers.scala, RecoverySupervisor_material_continuity_process_recovery_supervisor_Containers.scala, UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_Containers.scala, RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_Containers.scala, ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_Containers.scala, MaterialActionArbitration_material_continuity_process_material_action_arbitration_Containers.scala, ResultComposition_material_continuity_process_result_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFactory_Material_Continuity_CoordinatorDemandSignalType(o: Factory_Material_Continuity_Coordinator.DemandSignal.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DemandSignal.NONE => "NONE"
        case Factory_Material_Continuity_Coordinator.DemandSignal.INVALID => "INVALID"
        case Factory_Material_Continuity_Coordinator.DemandSignal.ARoutine => "ARoutine"
        case Factory_Material_Continuity_Coordinator.DemandSignal.AUrgent => "AUrgent"
        case Factory_Material_Continuity_Coordinator.DemandSignal.BRoutine => "BRoutine"
        case Factory_Material_Continuity_Coordinator.DemandSignal.BUrgent => "BUrgent"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DemandSignal")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o: Factory_Material_Continuity_Coordinator.DemandSignal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandSignal_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandSignalType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandCodeType(o: Factory_Material_Continuity_Coordinator.DemandCode.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DemandCode.NONE => "NONE"
        case Factory_Material_Continuity_Coordinator.DemandCode.INVALID => "INVALID"
        case Factory_Material_Continuity_Coordinator.DemandCode.ARoutine => "ARoutine"
        case Factory_Material_Continuity_Coordinator.DemandCode.AUrgent => "AUrgent"
        case Factory_Material_Continuity_Coordinator.DemandCode.BRoutine => "BRoutine"
        case Factory_Material_Continuity_Coordinator.DemandCode.BUrgent => "BUrgent"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DemandCode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandCode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandCode_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandCodeType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryBandType(o: Factory_Material_Continuity_Coordinator.InventoryBand.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.InventoryBand.INVALID => "INVALID"
        case Factory_Material_Continuity_Coordinator.InventoryBand.EMPTY => "EMPTY"
        case Factory_Material_Continuity_Coordinator.InventoryBand.LOW => "LOW"
        case Factory_Material_Continuity_Coordinator.InventoryBand.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.InventoryBand")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryBand_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorInventoryBandType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o: Factory_Material_Continuity_Coordinator.InventoryBandCode.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.InventoryBandCode.INVALID => "INVALID"
        case Factory_Material_Continuity_Coordinator.InventoryBandCode.EMPTY => "EMPTY"
        case Factory_Material_Continuity_Coordinator.InventoryBandCode.LOW => "LOW"
        case Factory_Material_Continuity_Coordinator.InventoryBandCode.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.InventoryBandCode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialEventType(o: Factory_Material_Continuity_Coordinator.MaterialEvent.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.MaterialEvent.NONE => "NONE"
        case Factory_Material_Continuity_Coordinator.MaterialEvent.OrderAccepted => "OrderAccepted"
        case Factory_Material_Continuity_Coordinator.MaterialEvent.ReceiptOk => "ReceiptOk"
        case Factory_Material_Continuity_Coordinator.MaterialEvent.HandoffOk => "HandoffOk"
        case Factory_Material_Continuity_Coordinator.MaterialEvent.FAILED => "FAILED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.MaterialEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialEvent_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorMaterialEventType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialEventCodeType(o: Factory_Material_Continuity_Coordinator.MaterialEventCode.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.MaterialEventCode.NONE => "NONE"
        case Factory_Material_Continuity_Coordinator.MaterialEventCode.OrderAccepted => "OrderAccepted"
        case Factory_Material_Continuity_Coordinator.MaterialEventCode.ReceiptOk => "ReceiptOk"
        case Factory_Material_Continuity_Coordinator.MaterialEventCode.HandoffOk => "HandoffOk"
        case Factory_Material_Continuity_Coordinator.MaterialEventCode.FAILED => "FAILED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.MaterialEventCode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorMaterialEventCodeType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventClassType(o: Factory_Material_Continuity_Coordinator.EventClass.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.EventClass.NoEvent => "NoEvent"
        case Factory_Material_Continuity_Coordinator.EventClass.FAILURE => "FAILURE"
        case Factory_Material_Continuity_Coordinator.EventClass.SUCCESS => "SUCCESS"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.EventClass")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventClass_Payload(o: Factory_Material_Continuity_Coordinator.EventClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventClass_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorEventClassType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialClassType(o: Factory_Material_Continuity_Coordinator.MaterialClass.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.MaterialClass.NONE => "NONE"
        case Factory_Material_Continuity_Coordinator.MaterialClass.A => "A"
        case Factory_Material_Continuity_Coordinator.MaterialClass.B => "B"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.MaterialClass")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o: Factory_Material_Continuity_Coordinator.MaterialClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialClass_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorMaterialClassType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorAvailabilityType(o: Factory_Material_Continuity_Coordinator.Availability.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.Availability.INVALID => "INVALID"
        case Factory_Material_Continuity_Coordinator.Availability.UNAVAILABLE => "UNAVAILABLE"
        case Factory_Material_Continuity_Coordinator.Availability.AVAILABLE => "AVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorAvailability_Payload(o: Factory_Material_Continuity_Coordinator.Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.Availability_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorAvailabilityType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandStateType(o: Factory_Material_Continuity_Coordinator.DemandState.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DemandState.IDLE => "IDLE"
        case Factory_Material_Continuity_Coordinator.DemandState.ARoutineOpen => "ARoutineOpen"
        case Factory_Material_Continuity_Coordinator.DemandState.AUrgentOpen => "AUrgentOpen"
        case Factory_Material_Continuity_Coordinator.DemandState.BRoutineOpen => "BRoutineOpen"
        case Factory_Material_Continuity_Coordinator.DemandState.BUrgentOpen => "BUrgentOpen"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DemandState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandState_Payload(o: Factory_Material_Continuity_Coordinator.DemandState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandState_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandStateType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyStateType(o: Factory_Material_Continuity_Coordinator.SupplyState.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.SupplyState.CLEAR => "CLEAR"
        case Factory_Material_Continuity_Coordinator.SupplyState.ORDERED => "ORDERED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.SupplyState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyState_Payload(o: Factory_Material_Continuity_Coordinator.SupplyState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.SupplyState_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorQualifiedEventType(o: Factory_Material_Continuity_Coordinator.QualifiedEvent.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.QualifiedEvent.NoProgress => "NoProgress"
        case Factory_Material_Continuity_Coordinator.QualifiedEvent.OrderRegistered => "OrderRegistered"
        case Factory_Material_Continuity_Coordinator.QualifiedEvent.ReceiptConfirmed => "ReceiptConfirmed"
        case Factory_Material_Continuity_Coordinator.QualifiedEvent.HandoffConfirmed => "HandoffConfirmed"
        case Factory_Material_Continuity_Coordinator.QualifiedEvent.FAULT => "FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.QualifiedEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorFaultTriggerType(o: Factory_Material_Continuity_Coordinator.FaultTrigger.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE => "INACTIVE"
        case Factory_Material_Continuity_Coordinator.FaultTrigger.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.FaultTrigger")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.FaultTrigger_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorFaultTriggerType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryGateType(o: Factory_Material_Continuity_Coordinator.RecoveryGate.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN => "OPEN"
        case Factory_Material_Continuity_Coordinator.RecoveryGate.CLOSED => "CLOSED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.RecoveryGate")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoveryGate_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandStateViewType(o: Factory_Material_Continuity_Coordinator.DemandStateView.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DemandStateView.IDLE => "IDLE"
        case Factory_Material_Continuity_Coordinator.DemandStateView.ARoutineOpen => "ARoutineOpen"
        case Factory_Material_Continuity_Coordinator.DemandStateView.AUrgentOpen => "AUrgentOpen"
        case Factory_Material_Continuity_Coordinator.DemandStateView.BRoutineOpen => "BRoutineOpen"
        case Factory_Material_Continuity_Coordinator.DemandStateView.BUrgentOpen => "BUrgentOpen"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DemandStateView")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateView_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandStateView_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandStateCodeType(o: Factory_Material_Continuity_Coordinator.DemandStateCode.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DemandStateCode.IDLE => "IDLE"
        case Factory_Material_Continuity_Coordinator.DemandStateCode.ARoutineOpen => "ARoutineOpen"
        case Factory_Material_Continuity_Coordinator.DemandStateCode.AUrgentOpen => "AUrgentOpen"
        case Factory_Material_Continuity_Coordinator.DemandStateCode.BRoutineOpen => "BRoutineOpen"
        case Factory_Material_Continuity_Coordinator.DemandStateCode.BUrgentOpen => "BUrgentOpen"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DemandStateCode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandStateCode_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandStateCodeType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandUpdateType(o: Factory_Material_Continuity_Coordinator.DemandUpdate.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DemandUpdate.NoChange => "NoChange"
        case Factory_Material_Continuity_Coordinator.DemandUpdate.ACCEPTED => "ACCEPTED"
        case Factory_Material_Continuity_Coordinator.DemandUpdate.CLEARED => "CLEARED"
        case Factory_Material_Continuity_Coordinator.DemandUpdate.DUPLICATE => "DUPLICATE"
        case Factory_Material_Continuity_Coordinator.DemandUpdate.BUSY => "BUSY"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DemandUpdate")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandUpdate_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandUpdateType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandDispositionType(o: Factory_Material_Continuity_Coordinator.DemandDisposition.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DemandDisposition.NoRequest => "NoRequest"
        case Factory_Material_Continuity_Coordinator.DemandDisposition.REJECTED => "REJECTED"
        case Factory_Material_Continuity_Coordinator.DemandDisposition.ACCEPTED => "ACCEPTED"
        case Factory_Material_Continuity_Coordinator.DemandDisposition.RetainedDuplicate => "RetainedDuplicate"
        case Factory_Material_Continuity_Coordinator.DemandDisposition.DEFERRED => "DEFERRED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DemandDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandDisposition_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandDispositionType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryEventType(o: Factory_Material_Continuity_Coordinator.RecoveryEvent.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.RecoveryEvent.NONE => "NONE"
        case Factory_Material_Continuity_Coordinator.RecoveryEvent.RESET => "RESET"
        case Factory_Material_Continuity_Coordinator.RecoveryEvent.VerifyOk => "VerifyOk"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.RecoveryEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorRecoveryEventType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEmergencyStateType(o: Factory_Material_Continuity_Coordinator.EmergencyState.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.EmergencyState.INACTIVE => "INACTIVE"
        case Factory_Material_Continuity_Coordinator.EmergencyState.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.EmergencyState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o: Factory_Material_Continuity_Coordinator.EmergencyState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EmergencyState_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorEmergencyStateType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryStateType(o: Factory_Material_Continuity_Coordinator.RecoveryState.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY => "HEALTHY"
        case Factory_Material_Continuity_Coordinator.RecoveryState.LATCHED => "LATCHED"
        case Factory_Material_Continuity_Coordinator.RecoveryState.RECOVERING => "RECOVERING"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.RecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoveryState_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorRecoveryStateType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorProposalStateType(o: Factory_Material_Continuity_Coordinator.ProposalState.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.ProposalState.NotProposed => "NotProposed"
        case Factory_Material_Continuity_Coordinator.ProposalState.PROPOSED => "PROPOSED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.ProposalState")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorProposalState_Payload(o: Factory_Material_Continuity_Coordinator.ProposalState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ProposalState_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorProposalStateType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialActionType(o: Factory_Material_Continuity_Coordinator.MaterialAction.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.MaterialAction.HOLD => "HOLD"
        case Factory_Material_Continuity_Coordinator.MaterialAction.ReleaseUrgentMaterial => "ReleaseUrgentMaterial"
        case Factory_Material_Continuity_Coordinator.MaterialAction.IssueMaterialOrder => "IssueMaterialOrder"
        case Factory_Material_Continuity_Coordinator.MaterialAction.ReleaseRoutineMaterial => "ReleaseRoutineMaterial"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.MaterialAction")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o: Factory_Material_Continuity_Coordinator.MaterialAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialAction_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorMaterialActionType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDecisionCauseType(o: Factory_Material_Continuity_Coordinator.DecisionCause.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.DecisionCause.FaultOrRecovery => "FaultOrRecovery"
        case Factory_Material_Continuity_Coordinator.DecisionCause.UrgentDemand => "UrgentDemand"
        case Factory_Material_Continuity_Coordinator.DecisionCause.ReserveReplenishment => "ReserveReplenishment"
        case Factory_Material_Continuity_Coordinator.DecisionCause.RoutineDemand => "RoutineDemand"
        case Factory_Material_Continuity_Coordinator.DecisionCause.NoEligibleWork => "NoEligibleWork"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.DecisionCause")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o: Factory_Material_Continuity_Coordinator.DecisionCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DecisionCause_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDecisionCauseType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorCoordinationModeType(o: Factory_Material_Continuity_Coordinator.CoordinationMode.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.CoordinationMode.HOLDING => "HOLDING"
        case Factory_Material_Continuity_Coordinator.CoordinationMode.RELEASING => "RELEASING"
        case Factory_Material_Continuity_Coordinator.CoordinationMode.ORDERING => "ORDERING"
        case Factory_Material_Continuity_Coordinator.CoordinationMode.FAULT => "FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.CoordinationMode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.CoordinationMode_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorCoordinationModeType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyStateCodeType(o: Factory_Material_Continuity_Coordinator.SupplyStateCode.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.SupplyStateCode.CLEAR => "CLEAR"
        case Factory_Material_Continuity_Coordinator.SupplyStateCode.ORDERED => "ORDERED"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.SupplyStateCode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorSupplyStateCodeType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(o: Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type): ST = {
      val value: String = o match {
        case Factory_Material_Continuity_Coordinator.RecoveryStateCode.HEALTHY => "HEALTHY"
        case Factory_Material_Continuity_Coordinator.RecoveryStateCode.LATCHED => "LATCHED"
        case Factory_Material_Continuity_Coordinator.RecoveryStateCode.RECOVERING => "RECOVERING"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Material_Continuity_Coordinator.RecoveryStateCode")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandBoundaryFacts""""),
        ("present", printB(o.present)),
        ("demandValue", printFactory_Material_Continuity_CoordinatorDemandCodeType(o.demandValue))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts""""),
        ("band", printFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o.band)),
        ("usable", printB(o.usable))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialReadinessFacts""""),
        ("band", printFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o.band)),
        ("usable", printB(o.usable)),
        ("materialAvailable", printB(o.materialAvailable)),
        ("reserveLow", printB(o.reserveLow)),
        ("replenishmentNeeded", printB(o.replenishmentNeeded)),
        ("productionEvidenceUsable", printB(o.productionEvidenceUsable)),
        ("productionAccepting", printB(o.productionAccepting))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventBoundaryFacts""""),
        ("materialEvent", printFactory_Material_Continuity_CoordinatorMaterialEventCodeType(o.materialEvent)),
        ("eventClass", printFactory_Material_Continuity_CoordinatorEventClassType(o.eventClass))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandFacts(o: Factory_Material_Continuity_Coordinator.DemandFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandFacts""""),
        ("present", printB(o.present)),
        ("valid", printB(o.valid)),
        ("urgent", printB(o.urgent)),
        ("materialClass", printFactory_Material_Continuity_CoordinatorMaterialClassType(o.materialClass)),
        ("demandValue", printFactory_Material_Continuity_CoordinatorDemandCodeType(o.demandValue))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandFacts_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandFacts(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandTransition(o: Factory_Material_Continuity_Coordinator.DemandTransition): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandTransition""""),
        ("demandPhase", printFactory_Material_Continuity_CoordinatorDemandStateCodeType(o.demandPhase)),
        ("demandUpdate", printFactory_Material_Continuity_CoordinatorDemandUpdateType(o.demandUpdate)),
        ("demandDisposition", printFactory_Material_Continuity_CoordinatorDemandDispositionType(o.demandDisposition))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o: Factory_Material_Continuity_Coordinator.DemandTransition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandTransition_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDemandTransition(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDecision(o: Factory_Material_Continuity_Coordinator.Decision): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.Decision""""),
        ("actionValue", printFactory_Material_Continuity_CoordinatorMaterialActionType(o.actionValue)),
        ("cause", printFactory_Material_Continuity_CoordinatorDecisionCauseType(o.cause))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDecision_Payload(o: Factory_Material_Continuity_Coordinator.Decision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.Decision_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorDecision(o.value))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialCoordinationResult""""),
        ("actionValue", printFactory_Material_Continuity_CoordinatorMaterialActionType(o.actionValue)),
        ("cause", printFactory_Material_Continuity_CoordinatorDecisionCauseType(o.cause)),
        ("mode", printFactory_Material_Continuity_CoordinatorCoordinationModeType(o.mode)),
        ("demandPhase", printFactory_Material_Continuity_CoordinatorDemandStateCodeType(o.demandPhase)),
        ("supplyPhase", printFactory_Material_Continuity_CoordinatorSupplyStateCodeType(o.supplyPhase)),
        ("recoveryPhase", printFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(o.recoveryPhase)),
        ("demandDisposition", printFactory_Material_Continuity_CoordinatorDemandDispositionType(o.demandDisposition))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload""""),
        ("value", printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o.value))
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

    @pure def printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P""""),
        ("api_demand_signal", printFactory_Material_Continuity_CoordinatorDemandSignalType(o.api_demand_signal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS""""),
        ("api_demand_signal", printFactory_Material_Continuity_CoordinatorDemandSignalType(o.api_demand_signal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P""""),
        ("api_demand_boundary_facts", printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS""""),
        ("api_demand_boundary_facts", printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P""""),
        ("api_inventory_band", printFactory_Material_Continuity_CoordinatorInventoryBandType(o.api_inventory_band))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS""""),
        ("api_inventory_band", printFactory_Material_Continuity_CoordinatorInventoryBandType(o.api_inventory_band))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P""""),
        ("api_inventory_boundary_facts", printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS""""),
        ("api_inventory_boundary_facts", printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P""""),
        ("api_material_event", printFactory_Material_Continuity_CoordinatorMaterialEventType(o.api_material_event))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS""""),
        ("api_material_event", printFactory_Material_Continuity_CoordinatorMaterialEventType(o.api_material_event))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P""""),
        ("api_event_boundary_facts", printFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS""""),
        ("api_event_boundary_facts", printFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P""""),
        ("api_demand_boundary_facts", printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS""""),
        ("api_demand_boundary_facts", printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P""""),
        ("api_demand_facts", printFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS""""),
        ("api_demand_facts", printFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P""""),
        ("api_inventory_boundary_facts", printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts)),
        ("api_production_availability", printFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_production_availability))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS""""),
        ("api_inventory_boundary_facts", printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts)),
        ("api_production_availability", printFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_production_availability))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P""""),
        ("api_readiness_to_replenishment", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_replenishment)),
        ("api_readiness_to_routine", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_routine)),
        ("api_readiness_to_urgent", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_urgent))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS""""),
        ("api_readiness_to_replenishment", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_replenishment)),
        ("api_readiness_to_routine", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_routine)),
        ("api_readiness_to_urgent", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_urgent))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P""""),
        ("api_event_boundary_facts", printFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts)),
        ("api_prior_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state)),
        ("api_prior_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS""""),
        ("api_event_boundary_facts", printFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts)),
        ("api_prior_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state)),
        ("api_prior_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P""""),
        ("api_fault_trigger", printFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)),
        ("api_qualified_event_to_demand", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_demand)),
        ("api_qualified_event_to_supply", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_supply))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS""""),
        ("api_fault_trigger", printFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)),
        ("api_qualified_event_to_demand", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_demand)),
        ("api_qualified_event_to_supply", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_supply))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P""""),
        ("api_demand_facts", printFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts)),
        ("api_qualified_event", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS""""),
        ("api_demand_facts", printFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts)),
        ("api_qualified_event", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P""""),
        ("api_current_state_to_routine", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_routine)),
        ("api_current_state_to_urgent", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_urgent)),
        ("api_demand_transition", printFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)),
        ("api_prior_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS""""),
        ("api_current_state_to_routine", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_routine)),
        ("api_current_state_to_urgent", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_urgent)),
        ("api_demand_transition", printFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)),
        ("api_prior_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P""""),
        ("api_qualified_event", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS""""),
        ("api_qualified_event", printFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P""""),
        ("api_current_state_to_composition", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_composition)),
        ("api_current_state_to_replenishment", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_replenishment)),
        ("api_prior_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS""""),
        ("api_current_state_to_composition", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_composition)),
        ("api_current_state_to_replenishment", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_replenishment)),
        ("api_prior_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P""""),
        ("api_fault_trigger", printFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)),
        ("api_recovery_event", printFactory_Material_Continuity_CoordinatorRecoveryEventType(o.api_recovery_event))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS""""),
        ("api_fault_trigger", printFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)),
        ("api_recovery_event", printFactory_Material_Continuity_CoordinatorRecoveryEventType(o.api_recovery_event))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P""""),
        ("api_emergency_state", printFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_gate_to_demand", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_demand)),
        ("api_gate_to_replenishment", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_replenishment)),
        ("api_gate_to_routine", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_routine)),
        ("api_gate_to_supply", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_supply)),
        ("api_gate_to_urgent", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_urgent)),
        ("api_recovery_state", printFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS""""),
        ("api_emergency_state", printFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_gate_to_demand", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_demand)),
        ("api_gate_to_replenishment", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_replenishment)),
        ("api_gate_to_routine", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_routine)),
        ("api_gate_to_supply", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_supply)),
        ("api_gate_to_urgent", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_urgent)),
        ("api_recovery_state", printFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P""""),
        ("api_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)),
        ("api_material_readiness_facts", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS""""),
        ("api_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)),
        ("api_material_readiness_facts", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P""""),
        ("api_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS""""),
        ("api_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P""""),
        ("api_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)),
        ("api_material_readiness_facts", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS""""),
        ("api_demand_state", printFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)),
        ("api_material_readiness_facts", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P""""),
        ("api_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS""""),
        ("api_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P""""),
        ("api_material_readiness_facts", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_supplier_availability", printFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_supplier_availability)),
        ("api_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS""""),
        ("api_material_readiness_facts", printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)),
        ("api_recovery_gate", printFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)),
        ("api_supplier_availability", printFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_supplier_availability)),
        ("api_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P""""),
        ("api_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS""""),
        ("api_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P""""),
        ("api_emergency_state", printFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_replenishment_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_replenishment_proposal)),
        ("api_routine_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_routine_proposal)),
        ("api_urgent_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_urgent_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS""""),
        ("api_emergency_state", printFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)),
        ("api_replenishment_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_replenishment_proposal)),
        ("api_routine_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_routine_proposal)),
        ("api_urgent_proposal", printFactory_Material_Continuity_CoordinatorProposalStateType(o.api_urgent_proposal))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P""""),
        ("api_decision", printFactory_Material_Continuity_CoordinatorDecision(o.api_decision))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS""""),
        ("api_decision", printFactory_Material_Continuity_CoordinatorDecision(o.api_decision))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P""""),
        ("api_decision", printFactory_Material_Continuity_CoordinatorDecision(o.api_decision)),
        ("api_demand_transition", printFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)),
        ("api_recovery_state", printFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state)),
        ("api_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS""""),
        ("api_decision", printFactory_Material_Continuity_CoordinatorDecision(o.api_decision)),
        ("api_demand_transition", printFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)),
        ("api_recovery_state", printFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state)),
        ("api_supply_state", printFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container): ST = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P""""),
        ("api_material_coordination_result", printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o.api_material_coordination_result))
      ))
    }

    @pure def printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS""""),
        ("api_material_coordination_result", printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o.api_material_coordination_result))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_acquisition_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_acquisition_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_acquisition_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_acquisition_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_acquisition_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_acquisition_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_inventory_acquisition_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_inventory_acquisition_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_inventory_acquisition_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_inventory_acquisition_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_inventory_acquisition_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_inventory_acquisition_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_acquisition_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_acquisition_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_acquisition_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_acquisition_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_acquisition_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_acquisition_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_qualification_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_qualification_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_qualification_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_qualification_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_qualification_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_qualification_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_readiness_assessment_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_readiness_assessment_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_readiness_assessment_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_readiness_assessment_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_readiness_assessment_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_readiness_assessment_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_coherence_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_coherence_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_coherence_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_coherence_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_coherence_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_event_coherence_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_registry_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_registry_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_registry_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_registry_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_registry_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_demand_registry_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_supply_lifecycle_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_supply_lifecycle_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_supply_lifecycle_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_supply_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_supply_lifecycle_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_supply_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_recovery_supervisor_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_recovery_supervisor_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_recovery_supervisor_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_recovery_supervisor_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_recovery_supervisor_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_recovery_supervisor_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_urgent_release_eligibility_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_urgent_release_eligibility_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_urgent_release_eligibility_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_urgent_release_eligibility_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_urgent_release_eligibility_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_urgent_release_eligibility_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_routine_release_eligibility_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_routine_release_eligibility_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_routine_release_eligibility_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_routine_release_eligibility_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_routine_release_eligibility_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_routine_release_eligibility_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_replenishment_eligibility_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_replenishment_eligibility_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_replenishment_eligibility_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_replenishment_eligibility_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_replenishment_eligibility_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_replenishment_eligibility_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_action_arbitration_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_action_arbitration_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_action_arbitration_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_action_arbitration_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_action_arbitration_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_material_action_arbitration_postCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_result_composition_postInit => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_result_composition_postInit"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_result_composition_preCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_result_composition_preCompute"
        case runtimemonitor.ObservationKind.FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_result_composition_postCompute => "FactoryMaterialContinuityCoordinatorSystem_Instance_material_continuity_process_result_composition_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
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
        case o: Factory_Material_Continuity_Coordinator.Decision_Payload => return printFactory_Material_Continuity_CoordinatorDecision_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.EventClass_Payload => return printFactory_Material_Continuity_CoordinatorEventClass_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandCode_Payload => return printFactory_Material_Continuity_CoordinatorDemandCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyState_Payload => return printFactory_Material_Continuity_CoordinatorSupplyState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandState_Payload => return printFactory_Material_Continuity_CoordinatorDemandState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandFacts_Payload => return printFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload => return printFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload => return printFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.Availability_Payload => return printFactory_Material_Continuity_CoordinatorAvailability_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload => return printFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandSignal_Payload => return printFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialClass_Payload => return printFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload => return printFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.ProposalState_Payload => return printFactory_Material_Continuity_CoordinatorProposalState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryState_Payload => return printFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryBand_Payload => return printFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload => return printFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DecisionCause_Payload => return printFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.EmergencyState_Payload => return printFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialAction_Payload => return printFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload => return printFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload => return printFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandStateView_Payload => return printFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload => return printFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload => return printFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandTransition_Payload => return printFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload => return printFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload => return printFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload => return printFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload => return printFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload => return printFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload => return printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload => return printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload => return printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload => return printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => return printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
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

    def parseFactory_Material_Continuity_CoordinatorDemandSignalType(): Factory_Material_Continuity_Coordinator.DemandSignal.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandSignalT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandSignalT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandSignal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandSignal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DemandSignal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DemandSignal.")
          return Factory_Material_Continuity_Coordinator.DemandSignal.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandSignal_Payload(): Factory_Material_Continuity_Coordinator.DemandSignal_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandSignal_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandSignal_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandSignal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandSignal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandSignalType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandSignal_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandCodeType(): Factory_Material_Continuity_Coordinator.DemandCode.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandCodeT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandCodeT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandCode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandCode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DemandCode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DemandCode.")
          return Factory_Material_Continuity_Coordinator.DemandCode.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandCode_Payload(): Factory_Material_Continuity_Coordinator.DemandCode_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandCode_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandCode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandCode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandCode_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBandType(): Factory_Material_Continuity_Coordinator.InventoryBand.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryBandT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBandT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.InventoryBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.InventoryBand.")
          return Factory_Material_Continuity_Coordinator.InventoryBand.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBand_Payload(): Factory_Material_Continuity_Coordinator.InventoryBand_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryBand_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBand_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorInventoryBandType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryBand_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBandCodeType(): Factory_Material_Continuity_Coordinator.InventoryBandCode.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryBandCodeT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBandCodeT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBandCode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryBandCode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.InventoryBandCode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.InventoryBandCode.")
          return Factory_Material_Continuity_Coordinator.InventoryBandCode.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(): Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryBandCode_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBandCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorInventoryBandCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEventType(): Factory_Material_Continuity_Coordinator.MaterialEvent.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialEventT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEventT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.MaterialEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.MaterialEvent.")
          return Factory_Material_Continuity_Coordinator.MaterialEvent.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(): Factory_Material_Continuity_Coordinator.MaterialEvent_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialEvent_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEvent_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorMaterialEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialEvent_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEventCodeType(): Factory_Material_Continuity_Coordinator.MaterialEventCode.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialEventCodeT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEventCodeT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialEventCode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialEventCode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.MaterialEventCode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.MaterialEventCode.")
          return Factory_Material_Continuity_Coordinator.MaterialEventCode.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(): Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialEventCode_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialEventCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorMaterialEventCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorEventClassType(): Factory_Material_Continuity_Coordinator.EventClass.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorEventClassT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventClassT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.EventClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.EventClass.")
          return Factory_Material_Continuity_Coordinator.EventClass.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorEventClass_Payload(): Factory_Material_Continuity_Coordinator.EventClass_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorEventClass_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventClass_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorEventClassType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventClass_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialClassType(): Factory_Material_Continuity_Coordinator.MaterialClass.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialClassT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialClassT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.MaterialClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.MaterialClass.")
          return Factory_Material_Continuity_Coordinator.MaterialClass.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialClass_Payload(): Factory_Material_Continuity_Coordinator.MaterialClass_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialClass_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialClass_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorMaterialClassType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialClass_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorAvailabilityType(): Factory_Material_Continuity_Coordinator.Availability.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorAvailabilityT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorAvailabilityT(typeParsed: B): Factory_Material_Continuity_Coordinator.Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.Availability.")
          return Factory_Material_Continuity_Coordinator.Availability.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorAvailability_Payload(): Factory_Material_Continuity_Coordinator.Availability_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorAvailability_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorAvailability_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorAvailabilityType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.Availability_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateType(): Factory_Material_Continuity_Coordinator.DemandState.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandStateT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DemandState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DemandState.")
          return Factory_Material_Continuity_Coordinator.DemandState.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandState_Payload(): Factory_Material_Continuity_Coordinator.DemandState_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandState_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandState_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyStateType(): Factory_Material_Continuity_Coordinator.SupplyState.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyStateT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyStateT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.SupplyState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.SupplyState.")
          return Factory_Material_Continuity_Coordinator.SupplyState.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyState_Payload(): Factory_Material_Continuity_Coordinator.SupplyState_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyState_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.SupplyState_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorQualifiedEventType(): Factory_Material_Continuity_Coordinator.QualifiedEvent.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorQualifiedEventT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorQualifiedEventT(typeParsed: B): Factory_Material_Continuity_Coordinator.QualifiedEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.QualifiedEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.QualifiedEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.QualifiedEvent.")
          return Factory_Material_Continuity_Coordinator.QualifiedEvent.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(): Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorQualifiedEvent_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorQualifiedEvent_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorFaultTriggerType(): Factory_Material_Continuity_Coordinator.FaultTrigger.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorFaultTriggerT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorFaultTriggerT(typeParsed: B): Factory_Material_Continuity_Coordinator.FaultTrigger.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.FaultTrigger")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.FaultTrigger.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.FaultTrigger.")
          return Factory_Material_Continuity_Coordinator.FaultTrigger.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(): Factory_Material_Continuity_Coordinator.FaultTrigger_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorFaultTrigger_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorFaultTrigger_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.FaultTrigger_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.FaultTrigger_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.FaultTrigger_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryGateType(): Factory_Material_Continuity_Coordinator.RecoveryGate.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryGateT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryGateT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryGate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryGate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.RecoveryGate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.RecoveryGate.")
          return Factory_Material_Continuity_Coordinator.RecoveryGate.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(): Factory_Material_Continuity_Coordinator.RecoveryGate_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryGate_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryGate_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryGate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryGate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoveryGate_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateViewType(): Factory_Material_Continuity_Coordinator.DemandStateView.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandStateViewT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateViewT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandStateView.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandStateView")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DemandStateView.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DemandStateView.")
          return Factory_Material_Continuity_Coordinator.DemandStateView.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateView_Payload(): Factory_Material_Continuity_Coordinator.DemandStateView_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandStateView_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateView_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandStateView_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandStateView_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandStateView_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateCodeType(): Factory_Material_Continuity_Coordinator.DemandStateCode.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandStateCodeT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateCodeT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandStateCode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandStateCode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DemandStateCode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DemandStateCode.")
          return Factory_Material_Continuity_Coordinator.DemandStateCode.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(): Factory_Material_Continuity_Coordinator.DemandStateCode_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandStateCode_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandStateCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandStateCode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandStateCode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandStateCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandStateCode_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandUpdateType(): Factory_Material_Continuity_Coordinator.DemandUpdate.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandUpdateT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandUpdateT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandUpdate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandUpdate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DemandUpdate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DemandUpdate.")
          return Factory_Material_Continuity_Coordinator.DemandUpdate.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(): Factory_Material_Continuity_Coordinator.DemandUpdate_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandUpdate_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandUpdate_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandUpdate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandUpdate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandUpdateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandUpdate_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandDispositionType(): Factory_Material_Continuity_Coordinator.DemandDisposition.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandDispositionT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandDispositionT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DemandDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DemandDisposition.")
          return Factory_Material_Continuity_Coordinator.DemandDisposition.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(): Factory_Material_Continuity_Coordinator.DemandDisposition_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandDisposition_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandDisposition_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandDispositionType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandDisposition_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryEventType(): Factory_Material_Continuity_Coordinator.RecoveryEvent.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryEventT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryEventT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.RecoveryEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.RecoveryEvent.")
          return Factory_Material_Continuity_Coordinator.RecoveryEvent.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(): Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryEvent_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryEvent_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorEmergencyStateType(): Factory_Material_Continuity_Coordinator.EmergencyState.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorEmergencyStateT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEmergencyStateT(typeParsed: B): Factory_Material_Continuity_Coordinator.EmergencyState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EmergencyState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.EmergencyState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.EmergencyState.")
          return Factory_Material_Continuity_Coordinator.EmergencyState.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorEmergencyState_Payload(): Factory_Material_Continuity_Coordinator.EmergencyState_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorEmergencyState_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEmergencyState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.EmergencyState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EmergencyState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EmergencyState_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryStateType(): Factory_Material_Continuity_Coordinator.RecoveryState.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryStateT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryStateT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.RecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.RecoveryState.")
          return Factory_Material_Continuity_Coordinator.RecoveryState.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryState_Payload(): Factory_Material_Continuity_Coordinator.RecoveryState_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoveryState_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorProposalStateType(): Factory_Material_Continuity_Coordinator.ProposalState.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorProposalStateT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorProposalStateT(typeParsed: B): Factory_Material_Continuity_Coordinator.ProposalState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ProposalState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.ProposalState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.ProposalState.")
          return Factory_Material_Continuity_Coordinator.ProposalState.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorProposalState_Payload(): Factory_Material_Continuity_Coordinator.ProposalState_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorProposalState_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorProposalState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.ProposalState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ProposalState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ProposalState_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionType(): Factory_Material_Continuity_Coordinator.MaterialAction.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialActionT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.MaterialAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.MaterialAction.")
          return Factory_Material_Continuity_Coordinator.MaterialAction.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialAction_Payload(): Factory_Material_Continuity_Coordinator.MaterialAction_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialAction_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialAction_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorMaterialActionType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialAction_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDecisionCauseType(): Factory_Material_Continuity_Coordinator.DecisionCause.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorDecisionCauseT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDecisionCauseT(typeParsed: B): Factory_Material_Continuity_Coordinator.DecisionCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DecisionCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.DecisionCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.DecisionCause.")
          return Factory_Material_Continuity_Coordinator.DecisionCause.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDecisionCause_Payload(): Factory_Material_Continuity_Coordinator.DecisionCause_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDecisionCause_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDecisionCause_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DecisionCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DecisionCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDecisionCauseType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DecisionCause_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorCoordinationModeType(): Factory_Material_Continuity_Coordinator.CoordinationMode.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorCoordinationModeT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorCoordinationModeT(typeParsed: B): Factory_Material_Continuity_Coordinator.CoordinationMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.CoordinationMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.CoordinationMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.CoordinationMode.")
          return Factory_Material_Continuity_Coordinator.CoordinationMode.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(): Factory_Material_Continuity_Coordinator.CoordinationMode_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorCoordinationMode_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorCoordinationMode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.CoordinationMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.CoordinationMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorCoordinationModeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.CoordinationMode_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyStateCodeType(): Factory_Material_Continuity_Coordinator.SupplyStateCode.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyStateCodeT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyStateCodeT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyStateCode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyStateCode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.SupplyStateCode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.SupplyStateCode.")
          return Factory_Material_Continuity_Coordinator.SupplyStateCode.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(): Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyStateCode_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyStateCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorSupplyStateCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(): Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryStateCodeT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryStateCodeT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryStateCode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Material_Continuity_Coordinator.RecoveryStateCode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Material_Continuity_Coordinator.RecoveryStateCode.")
          return Factory_Material_Continuity_Coordinator.RecoveryStateCode.byOrdinal(0).get
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(): Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoveryStateCode_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoveryStateCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorRecoveryStateCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFactsT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandBoundaryFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandBoundaryFacts")
      }
      parser.parseObjectKey("present")
      val present = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("demandValue")
      val demandValue = parseFactory_Material_Continuity_CoordinatorDemandCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandBoundaryFacts(present, demandValue)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFactsT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts")
      }
      parser.parseObjectKey("band")
      val band = parseFactory_Material_Continuity_CoordinatorInventoryBandCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts(band, usable)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFactsT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialReadinessFacts")
      }
      parser.parseObjectKey("band")
      val band = parseFactory_Material_Continuity_CoordinatorInventoryBandCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("materialAvailable")
      val materialAvailable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("reserveLow")
      val reserveLow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("replenishmentNeeded")
      val replenishmentNeeded = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("productionEvidenceUsable")
      val productionEvidenceUsable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("productionAccepting")
      val productionAccepting = parser.parseB()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessFacts(band, usable, materialAvailable, reserveLow, replenishmentNeeded, productionEvidenceUsable, productionAccepting)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts(): Factory_Material_Continuity_Coordinator.EventBoundaryFacts = {
      val r = parseFactory_Material_Continuity_CoordinatorEventBoundaryFactsT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventBoundaryFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventBoundaryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventBoundaryFacts")
      }
      parser.parseObjectKey("materialEvent")
      val materialEvent = parseFactory_Material_Continuity_CoordinatorMaterialEventCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("eventClass")
      val eventClass = parseFactory_Material_Continuity_CoordinatorEventClassType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventBoundaryFacts(materialEvent, eventClass)
    }

    def parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(): Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandFacts(): Factory_Material_Continuity_Coordinator.DemandFacts = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandFactsT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandFacts")
      }
      parser.parseObjectKey("present")
      val present = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("valid")
      val valid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("urgent")
      val urgent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("materialClass")
      val materialClass = parseFactory_Material_Continuity_CoordinatorMaterialClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("demandValue")
      val demandValue = parseFactory_Material_Continuity_CoordinatorDemandCodeType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandFacts(present, valid, urgent, materialClass, demandValue)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandFacts_Payload(): Factory_Material_Continuity_Coordinator.DemandFacts_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandFacts_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandFacts_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandTransition(): Factory_Material_Continuity_Coordinator.DemandTransition = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandTransitionT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandTransitionT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandTransition = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandTransition")
      }
      parser.parseObjectKey("demandPhase")
      val demandPhase = parseFactory_Material_Continuity_CoordinatorDemandStateCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("demandUpdate")
      val demandUpdate = parseFactory_Material_Continuity_CoordinatorDemandUpdateType()
      parser.parseObjectNext()
      parser.parseObjectKey("demandDisposition")
      val demandDisposition = parseFactory_Material_Continuity_CoordinatorDemandDispositionType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandTransition(demandPhase, demandUpdate, demandDisposition)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandTransition_Payload(): Factory_Material_Continuity_Coordinator.DemandTransition_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandTransition_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandTransition_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandTransition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandTransition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDemandTransition()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandTransition_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorDecision(): Factory_Material_Continuity_Coordinator.Decision = {
      val r = parseFactory_Material_Continuity_CoordinatorDecisionT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDecisionT(typeParsed: B): Factory_Material_Continuity_Coordinator.Decision = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.Decision")
      }
      parser.parseObjectKey("actionValue")
      val actionValue = parseFactory_Material_Continuity_CoordinatorMaterialActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseFactory_Material_Continuity_CoordinatorDecisionCauseType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.Decision(actionValue, cause)
    }

    def parseFactory_Material_Continuity_CoordinatorDecision_Payload(): Factory_Material_Continuity_Coordinator.Decision_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorDecision_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDecision_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.Decision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.Decision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorDecision()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.Decision_Payload(value)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResultT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResultT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialCoordinationResult")
      }
      parser.parseObjectKey("actionValue")
      val actionValue = parseFactory_Material_Continuity_CoordinatorMaterialActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseFactory_Material_Continuity_CoordinatorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parseFactory_Material_Continuity_CoordinatorCoordinationModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("demandPhase")
      val demandPhase = parseFactory_Material_Continuity_CoordinatorDemandStateCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("supplyPhase")
      val supplyPhase = parseFactory_Material_Continuity_CoordinatorSupplyStateCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryPhase")
      val recoveryPhase = parseFactory_Material_Continuity_CoordinatorRecoveryStateCodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("demandDisposition")
      val demandDisposition = parseFactory_Material_Continuity_CoordinatorDemandDispositionType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialCoordinationResult(actionValue, cause, mode, demandPhase, supplyPhase, recoveryPhase, demandDisposition)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_PayloadT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload(value)
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

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_demand_signal")
      val api_demand_signal = parseFactory_Material_Continuity_CoordinatorDemandSignalType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(api_demand_signal)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_demand_signal")
      val api_demand_signal = parseFactory_Material_Continuity_CoordinatorDemandSignalType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(api_demand_signal)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_demand_boundary_facts")
      val api_demand_boundary_facts = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(api_demand_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_demand_boundary_facts")
      val api_demand_boundary_facts = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(api_demand_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_inventory_band")
      val api_inventory_band = parseFactory_Material_Continuity_CoordinatorInventoryBandType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(api_inventory_band)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_inventory_band")
      val api_inventory_band = parseFactory_Material_Continuity_CoordinatorInventoryBandType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(api_inventory_band)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_inventory_boundary_facts")
      val api_inventory_boundary_facts = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(api_inventory_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_inventory_boundary_facts")
      val api_inventory_boundary_facts = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(api_inventory_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_material_event")
      val api_material_event = parseFactory_Material_Continuity_CoordinatorMaterialEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(api_material_event)
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_material_event")
      val api_material_event = parseFactory_Material_Continuity_CoordinatorMaterialEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(api_material_event)
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_event_boundary_facts")
      val api_event_boundary_facts = parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(api_event_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_event_boundary_facts")
      val api_event_boundary_facts = parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(api_event_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_demand_boundary_facts")
      val api_demand_boundary_facts = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(api_demand_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_demand_boundary_facts")
      val api_demand_boundary_facts = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(api_demand_boundary_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_demand_facts")
      val api_demand_facts = parseFactory_Material_Continuity_CoordinatorDemandFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(api_demand_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_demand_facts")
      val api_demand_facts = parseFactory_Material_Continuity_CoordinatorDemandFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(api_demand_facts)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_inventory_boundary_facts")
      val api_inventory_boundary_facts = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_availability")
      val api_production_availability = parseFactory_Material_Continuity_CoordinatorAvailabilityType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(api_inventory_boundary_facts, api_production_availability)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_inventory_boundary_facts")
      val api_inventory_boundary_facts = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_production_availability")
      val api_production_availability = parseFactory_Material_Continuity_CoordinatorAvailabilityType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(api_inventory_boundary_facts, api_production_availability)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_readiness_to_replenishment")
      val api_readiness_to_replenishment = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_to_routine")
      val api_readiness_to_routine = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_to_urgent")
      val api_readiness_to_urgent = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(api_readiness_to_replenishment, api_readiness_to_routine, api_readiness_to_urgent)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_readiness_to_replenishment")
      val api_readiness_to_replenishment = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_to_routine")
      val api_readiness_to_routine = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_to_urgent")
      val api_readiness_to_urgent = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(api_readiness_to_replenishment, api_readiness_to_routine, api_readiness_to_urgent)
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P")
      }
      parser.parseObjectKey("api_event_boundary_facts")
      val api_event_boundary_facts = parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_demand_state")
      val api_prior_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_supply_state")
      val api_prior_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P(api_event_boundary_facts, api_prior_demand_state, api_prior_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS")
      }
      parser.parseObjectKey("api_event_boundary_facts")
      val api_event_boundary_facts = parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_demand_state")
      val api_prior_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_supply_state")
      val api_prior_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(api_event_boundary_facts, api_prior_demand_state, api_prior_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P")
      }
      parser.parseObjectKey("api_fault_trigger")
      val api_fault_trigger = parseFactory_Material_Continuity_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_event_to_demand")
      val api_qualified_event_to_demand = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_event_to_supply")
      val api_qualified_event_to_supply = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P(api_fault_trigger, api_qualified_event_to_demand, api_qualified_event_to_supply)
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fault_trigger")
      val api_fault_trigger = parseFactory_Material_Continuity_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_event_to_demand")
      val api_qualified_event_to_demand = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_event_to_supply")
      val api_qualified_event_to_supply = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(api_fault_trigger, api_qualified_event_to_demand, api_qualified_event_to_supply)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P")
      }
      parser.parseObjectKey("api_demand_facts")
      val api_demand_facts = parseFactory_Material_Continuity_CoordinatorDemandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_event")
      val api_qualified_event = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(api_demand_facts, api_qualified_event, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS")
      }
      parser.parseObjectKey("api_demand_facts")
      val api_demand_facts = parseFactory_Material_Continuity_CoordinatorDemandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_event")
      val api_qualified_event = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(api_demand_facts, api_qualified_event, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P")
      }
      parser.parseObjectKey("api_current_state_to_routine")
      val api_current_state_to_routine = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_state_to_urgent")
      val api_current_state_to_urgent = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_transition")
      val api_demand_transition = parseFactory_Material_Continuity_CoordinatorDemandTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_demand_state")
      val api_prior_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(api_current_state_to_routine, api_current_state_to_urgent, api_demand_transition, api_prior_demand_state)
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS")
      }
      parser.parseObjectKey("api_current_state_to_routine")
      val api_current_state_to_routine = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_state_to_urgent")
      val api_current_state_to_urgent = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_transition")
      val api_demand_transition = parseFactory_Material_Continuity_CoordinatorDemandTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_demand_state")
      val api_prior_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(api_current_state_to_routine, api_current_state_to_urgent, api_demand_transition, api_prior_demand_state)
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_event")
      val api_qualified_event = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(api_qualified_event, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_event")
      val api_qualified_event = parseFactory_Material_Continuity_CoordinatorQualifiedEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(api_qualified_event, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_current_state_to_composition")
      val api_current_state_to_composition = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_state_to_replenishment")
      val api_current_state_to_replenishment = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_supply_state")
      val api_prior_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(api_current_state_to_composition, api_current_state_to_replenishment, api_prior_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_current_state_to_composition")
      val api_current_state_to_composition = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_current_state_to_replenishment")
      val api_current_state_to_replenishment = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_supply_state")
      val api_prior_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(api_current_state_to_composition, api_current_state_to_replenishment, api_prior_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P")
      }
      parser.parseObjectKey("api_fault_trigger")
      val api_fault_trigger = parseFactory_Material_Continuity_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_event")
      val api_recovery_event = parseFactory_Material_Continuity_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(api_fault_trigger, api_recovery_event)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fault_trigger")
      val api_fault_trigger = parseFactory_Material_Continuity_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_event")
      val api_recovery_event = parseFactory_Material_Continuity_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(api_fault_trigger, api_recovery_event)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P")
      }
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Material_Continuity_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_demand")
      val api_gate_to_demand = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_replenishment")
      val api_gate_to_replenishment = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_routine")
      val api_gate_to_routine = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_supply")
      val api_gate_to_supply = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_urgent")
      val api_gate_to_urgent = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Material_Continuity_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(api_emergency_state, api_gate_to_demand, api_gate_to_replenishment, api_gate_to_routine, api_gate_to_supply, api_gate_to_urgent, api_recovery_state)
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Material_Continuity_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_demand")
      val api_gate_to_demand = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_replenishment")
      val api_gate_to_replenishment = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_routine")
      val api_gate_to_routine = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_supply")
      val api_gate_to_supply = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_to_urgent")
      val api_gate_to_urgent = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Material_Continuity_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(api_emergency_state, api_gate_to_demand, api_gate_to_replenishment, api_gate_to_routine, api_gate_to_supply, api_gate_to_urgent, api_recovery_state)
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_demand_state")
      val api_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_material_readiness_facts")
      val api_material_readiness_facts = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_demand_state")
      val api_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_material_readiness_facts")
      val api_material_readiness_facts = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(api_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(api_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_demand_state")
      val api_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_material_readiness_facts")
      val api_material_readiness_facts = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_demand_state")
      val api_demand_state = parseFactory_Material_Continuity_CoordinatorDemandStateViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_material_readiness_facts")
      val api_material_readiness_facts = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(api_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(api_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_material_readiness_facts")
      val api_material_readiness_facts = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supplier_availability")
      val api_supplier_availability = parseFactory_Material_Continuity_CoordinatorAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_state")
      val api_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(api_material_readiness_facts, api_recovery_gate, api_supplier_availability, api_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_material_readiness_facts")
      val api_material_readiness_facts = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_gate")
      val api_recovery_gate = parseFactory_Material_Continuity_CoordinatorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supplier_availability")
      val api_supplier_availability = parseFactory_Material_Continuity_CoordinatorAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_state")
      val api_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(api_material_readiness_facts, api_recovery_gate, api_supplier_availability, api_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(api_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposal")
      val api_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(api_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Material_Continuity_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_replenishment_proposal")
      val api_replenishment_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_routine_proposal")
      val api_routine_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_urgent_proposal")
      val api_urgent_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(api_emergency_state, api_replenishment_proposal, api_routine_proposal, api_urgent_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_emergency_state")
      val api_emergency_state = parseFactory_Material_Continuity_CoordinatorEmergencyStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_replenishment_proposal")
      val api_replenishment_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_routine_proposal")
      val api_routine_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_urgent_proposal")
      val api_urgent_proposal = parseFactory_Material_Continuity_CoordinatorProposalStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(api_emergency_state, api_replenishment_proposal, api_routine_proposal, api_urgent_proposal)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_decision")
      val api_decision = parseFactory_Material_Continuity_CoordinatorDecision()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(api_decision)
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_decision")
      val api_decision = parseFactory_Material_Continuity_CoordinatorDecision()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(api_decision)
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_decision")
      val api_decision = parseFactory_Material_Continuity_CoordinatorDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_transition")
      val api_demand_transition = parseFactory_Material_Continuity_CoordinatorDemandTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Material_Continuity_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_state")
      val api_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P(api_decision, api_demand_transition, api_recovery_state, api_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_decision")
      val api_decision = parseFactory_Material_Continuity_CoordinatorDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_demand_transition")
      val api_demand_transition = parseFactory_Material_Continuity_CoordinatorDemandTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_state")
      val api_recovery_state = parseFactory_Material_Continuity_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_state")
      val api_supply_state = parseFactory_Material_Continuity_CoordinatorSupplyStateType()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS(api_decision, api_demand_transition, api_recovery_state, api_supply_state)
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS"))
      t.native match {
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P = {
      val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_material_coordination_result")
      val api_material_coordination_result = parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P(api_material_coordination_result)
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS = {
      val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_material_coordination_result")
      val api_material_coordination_result = parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      parser.parseObjectNext()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS(api_material_coordination_result)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Factory_Material_Continuity_Coordinator.Decision_Payload", "Factory_Material_Continuity_Coordinator.EventClass_Payload", "Factory_Material_Continuity_Coordinator.DemandCode_Payload", "Factory_Material_Continuity_Coordinator.SupplyState_Payload", "Factory_Material_Continuity_Coordinator.DemandState_Payload", "Factory_Material_Continuity_Coordinator.DemandFacts_Payload", "Factory_Material_Continuity_Coordinator.RecoveryGate_Payload", "Factory_Material_Continuity_Coordinator.FaultTrigger_Payload", "Factory_Material_Continuity_Coordinator.Availability_Payload", "Factory_Material_Continuity_Coordinator.DemandUpdate_Payload", "Factory_Material_Continuity_Coordinator.DemandSignal_Payload", "Factory_Material_Continuity_Coordinator.MaterialClass_Payload", "Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload", "Factory_Material_Continuity_Coordinator.ProposalState_Payload", "Factory_Material_Continuity_Coordinator.RecoveryState_Payload", "Factory_Material_Continuity_Coordinator.InventoryBand_Payload", "Factory_Material_Continuity_Coordinator.MaterialEvent_Payload", "Factory_Material_Continuity_Coordinator.DecisionCause_Payload", "Factory_Material_Continuity_Coordinator.EmergencyState_Payload", "Factory_Material_Continuity_Coordinator.MaterialAction_Payload", "Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload", "Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload", "Factory_Material_Continuity_Coordinator.DemandStateView_Payload", "Factory_Material_Continuity_Coordinator.DemandStateCode_Payload", "Factory_Material_Continuity_Coordinator.CoordinationMode_Payload", "Factory_Material_Continuity_Coordinator.DemandTransition_Payload", "Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload", "Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload", "Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload", "Factory_Material_Continuity_Coordinator.DemandDisposition_Payload", "Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload", "Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload", "Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload", "Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload", "Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P", "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P", "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P", "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P", "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P", "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P", "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P", "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS"))
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
        case "Factory_Material_Continuity_Coordinator.Decision_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDecision_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventClass_Payload" => val r = parseFactory_Material_Continuity_CoordinatorEventClass_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandCode_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandCode_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyState_Payload" => val r = parseFactory_Material_Continuity_CoordinatorSupplyState_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandState_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandState_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandFacts_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandFacts_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoveryGate_Payload" => val r = parseFactory_Material_Continuity_CoordinatorRecoveryGate_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.FaultTrigger_Payload" => val r = parseFactory_Material_Continuity_CoordinatorFaultTrigger_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.Availability_Payload" => val r = parseFactory_Material_Continuity_CoordinatorAvailability_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandUpdate_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandUpdate_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandSignal_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandSignal_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialClass_Payload" => val r = parseFactory_Material_Continuity_CoordinatorMaterialClass_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload" => val r = parseFactory_Material_Continuity_CoordinatorRecoveryEvent_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.ProposalState_Payload" => val r = parseFactory_Material_Continuity_CoordinatorProposalState_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoveryState_Payload" => val r = parseFactory_Material_Continuity_CoordinatorRecoveryState_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryBand_Payload" => val r = parseFactory_Material_Continuity_CoordinatorInventoryBand_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialEvent_Payload" => val r = parseFactory_Material_Continuity_CoordinatorMaterialEvent_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DecisionCause_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDecisionCause_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.EmergencyState_Payload" => val r = parseFactory_Material_Continuity_CoordinatorEmergencyState_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialAction_Payload" => val r = parseFactory_Material_Continuity_CoordinatorMaterialAction_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload" => val r = parseFactory_Material_Continuity_CoordinatorQualifiedEvent_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload" => val r = parseFactory_Material_Continuity_CoordinatorSupplyStateCode_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandStateView_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandStateView_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandStateCode_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandStateCode_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.CoordinationMode_Payload" => val r = parseFactory_Material_Continuity_CoordinatorCoordinationMode_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandTransition_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandTransition_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload" => val r = parseFactory_Material_Continuity_CoordinatorRecoveryStateCode_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload" => val r = parseFactory_Material_Continuity_CoordinatorInventoryBandCode_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload" => val r = parseFactory_Material_Continuity_CoordinatorMaterialEventCode_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandDisposition_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandDisposition_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload" => val r = parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload" => val r = parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload" => val r = parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload" => val r = parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_PayloadT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(T); return r
        case "Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS" => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
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

  def fromFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o: Factory_Material_Continuity_Coordinator.DemandSignal_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandSignal_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandSignal_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandSignal_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandSignal_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandSignal_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandSignal_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandCode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandCode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandCode_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandCode_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandCode_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandCode_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandCode_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBand_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBand_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryBand_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBand_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryBand_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryBand_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryBand_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialEvent_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialEvent_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialEvent_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialEvent_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventClass_Payload(o: Factory_Material_Continuity_Coordinator.EventClass_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventClass_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.EventClass_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventClass_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.EventClass_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventClass_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventClass_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o: Factory_Material_Continuity_Coordinator.MaterialClass_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialClass_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialClass_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialClass_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialClass_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialClass_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialClass_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorAvailability_Payload(o: Factory_Material_Continuity_Coordinator.Availability_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorAvailability_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.Availability_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorAvailability_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.Availability_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorAvailability_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorAvailability_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandState_Payload(o: Factory_Material_Continuity_Coordinator.DemandState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandState_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandState_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandState_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandState_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandState_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyState_Payload(o: Factory_Material_Continuity_Coordinator.SupplyState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyState_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyState_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyState_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyState_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyState_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.FaultTrigger_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.FaultTrigger_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorFaultTrigger_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorFaultTrigger_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.RecoveryGate_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.RecoveryGate_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoveryGate_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoveryGate_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateView_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandStateView_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandStateView_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandStateView_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandStateView_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandStateView_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandStateView_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandStateCode_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandStateCode_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandStateCode_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandStateCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandUpdate_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandUpdate_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandUpdate_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandUpdate_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandDisposition_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandDisposition_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandDisposition_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandDisposition_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o: Factory_Material_Continuity_Coordinator.EmergencyState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEmergencyState_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.EmergencyState_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEmergencyState_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.EmergencyState_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEmergencyState_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEmergencyState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryState_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.RecoveryState_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryState_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.RecoveryState_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorProposalState_Payload(o: Factory_Material_Continuity_Coordinator.ProposalState_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorProposalState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorProposalState_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.ProposalState_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorProposalState_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.ProposalState_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorProposalState_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorProposalState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o: Factory_Material_Continuity_Coordinator.MaterialAction_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialAction_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialAction_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialAction_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialAction_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialAction_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialAction_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o: Factory_Material_Continuity_Coordinator.DecisionCause_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDecisionCause_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DecisionCause_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDecisionCause_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DecisionCause_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDecisionCause_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDecisionCause_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.CoordinationMode_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.CoordinationMode_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorCoordinationMode_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorCoordinationMode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(s: String): Either[Factory_Material_Continuity_Coordinator.DemandBoundaryFacts, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(parser: Parser): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessFacts, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventBoundaryFacts(s: String): Either[Factory_Material_Continuity_Coordinator.EventBoundaryFacts, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventBoundaryFacts(parser: Parser): Factory_Material_Continuity_Coordinator.EventBoundaryFacts = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventBoundaryFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandFacts(o: Factory_Material_Continuity_Coordinator.DemandFacts, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandFacts(s: String): Either[Factory_Material_Continuity_Coordinator.DemandFacts, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandFacts(parser: Parser): Factory_Material_Continuity_Coordinator.DemandFacts = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandFacts()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandFacts_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandFacts_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandFacts_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandFacts_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandFacts_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandFacts_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandTransition(o: Factory_Material_Continuity_Coordinator.DemandTransition, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandTransition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandTransition(s: String): Either[Factory_Material_Continuity_Coordinator.DemandTransition, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandTransition(parser: Parser): Factory_Material_Continuity_Coordinator.DemandTransition = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandTransition()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandTransition _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o: Factory_Material_Continuity_Coordinator.DemandTransition_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandTransition_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.DemandTransition_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandTransition_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.DemandTransition_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandTransition_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandTransition_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDecision(o: Factory_Material_Continuity_Coordinator.Decision, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDecision(s: String): Either[Factory_Material_Continuity_Coordinator.Decision, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDecision(parser: Parser): Factory_Material_Continuity_Coordinator.Decision = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDecision()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDecision _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDecision_Payload(o: Factory_Material_Continuity_Coordinator.Decision_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDecision_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.Decision_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDecision_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.Decision_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDecision_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDecision_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialCoordinationResult, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload _)
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

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(s: String): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(parser: Parser): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(s: String): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(parser: Parser): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(s: String): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(parser: Parser): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS = {
      val r = parser.parseFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS _)
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