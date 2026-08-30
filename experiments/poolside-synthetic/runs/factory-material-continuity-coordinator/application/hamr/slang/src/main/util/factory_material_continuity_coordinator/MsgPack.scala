// #Sireum
// @formatter:off

// This file is auto-generated from DemandSignal.scala, DemandCode.scala, InventoryBand.scala, InventoryBandCode.scala, MaterialEvent.scala, MaterialEventCode.scala, EventClass.scala, MaterialClass.scala, Availability.scala, DemandState.scala, SupplyState.scala, QualifiedEvent.scala, FaultTrigger.scala, RecoveryGate.scala, DemandStateView.scala, DemandStateCode.scala, DemandUpdate.scala, DemandDisposition.scala, RecoveryEvent.scala, EmergencyState.scala, RecoveryState.scala, ProposalState.scala, MaterialAction.scala, DecisionCause.scala, CoordinationMode.scala, SupplyStateCode.scala, RecoveryStateCode.scala, DemandBoundaryFacts.scala, InventoryBoundaryFacts.scala, MaterialReadinessFacts.scala, EventBoundaryFacts.scala, DemandFacts.scala, DemandTransition.scala, Decision.scala, MaterialCoordinationResult.scala, Base_Types.scala, DemandAcquisition_material_continuity_process_demand_acquisition_Containers.scala, InventoryAcquisition_material_continuity_process_inventory_acquisition_Containers.scala, EventAcquisition_material_continuity_process_event_acquisition_Containers.scala, DemandQualification_material_continuity_process_demand_qualification_Containers.scala, MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_Containers.scala, EventCoherence_material_continuity_process_event_coherence_Containers.scala, DemandRegistry_material_continuity_process_demand_registry_Containers.scala, SupplyLifecycle_material_continuity_process_supply_lifecycle_Containers.scala, RecoverySupervisor_material_continuity_process_recovery_supervisor_Containers.scala, UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_Containers.scala, RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_Containers.scala, ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_Containers.scala, MaterialActionArbitration_material_continuity_process_material_action_arbitration_Containers.scala, ResultComposition_material_continuity_process_result_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package factory_material_continuity_coordinator

import org.sireum._

object MsgPack {

  object Constants {

    val Factory_Material_Continuity_CoordinatorDemandSignal_Payload: Z = -32

    val Factory_Material_Continuity_CoordinatorDemandCode_Payload: Z = -31

    val Factory_Material_Continuity_CoordinatorInventoryBand_Payload: Z = -30

    val Factory_Material_Continuity_CoordinatorInventoryBandCode_Payload: Z = -29

    val Factory_Material_Continuity_CoordinatorMaterialEvent_Payload: Z = -28

    val Factory_Material_Continuity_CoordinatorMaterialEventCode_Payload: Z = -27

    val Factory_Material_Continuity_CoordinatorEventClass_Payload: Z = -26

    val Factory_Material_Continuity_CoordinatorMaterialClass_Payload: Z = -25

    val Factory_Material_Continuity_CoordinatorAvailability_Payload: Z = -24

    val Factory_Material_Continuity_CoordinatorDemandState_Payload: Z = -23

    val Factory_Material_Continuity_CoordinatorSupplyState_Payload: Z = -22

    val Factory_Material_Continuity_CoordinatorQualifiedEvent_Payload: Z = -21

    val Factory_Material_Continuity_CoordinatorFaultTrigger_Payload: Z = -20

    val Factory_Material_Continuity_CoordinatorRecoveryGate_Payload: Z = -19

    val Factory_Material_Continuity_CoordinatorDemandStateView_Payload: Z = -18

    val Factory_Material_Continuity_CoordinatorDemandStateCode_Payload: Z = -17

    val Factory_Material_Continuity_CoordinatorDemandUpdate_Payload: Z = -16

    val Factory_Material_Continuity_CoordinatorDemandDisposition_Payload: Z = -15

    val Factory_Material_Continuity_CoordinatorRecoveryEvent_Payload: Z = -14

    val Factory_Material_Continuity_CoordinatorEmergencyState_Payload: Z = -13

    val Factory_Material_Continuity_CoordinatorRecoveryState_Payload: Z = -12

    val Factory_Material_Continuity_CoordinatorProposalState_Payload: Z = -11

    val Factory_Material_Continuity_CoordinatorMaterialAction_Payload: Z = -10

    val Factory_Material_Continuity_CoordinatorDecisionCause_Payload: Z = -9

    val Factory_Material_Continuity_CoordinatorCoordinationMode_Payload: Z = -8

    val Factory_Material_Continuity_CoordinatorSupplyStateCode_Payload: Z = -7

    val Factory_Material_Continuity_CoordinatorRecoveryStateCode_Payload: Z = -6

    val Factory_Material_Continuity_CoordinatorDemandBoundaryFacts: Z = -5

    val Factory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload: Z = -4

    val Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts: Z = -3

    val Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload: Z = -2

    val Factory_Material_Continuity_CoordinatorMaterialReadinessFacts: Z = -1

    val Factory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload: Z = 0

    val Factory_Material_Continuity_CoordinatorEventBoundaryFacts: Z = 1

    val Factory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload: Z = 2

    val Factory_Material_Continuity_CoordinatorDemandFacts: Z = 3

    val Factory_Material_Continuity_CoordinatorDemandFacts_Payload: Z = 4

    val Factory_Material_Continuity_CoordinatorDemandTransition: Z = 5

    val Factory_Material_Continuity_CoordinatorDemandTransition_Payload: Z = 6

    val Factory_Material_Continuity_CoordinatorDecision: Z = 7

    val Factory_Material_Continuity_CoordinatorDecision_Payload: Z = 8

    val Factory_Material_Continuity_CoordinatorMaterialCoordinationResult: Z = 9

    val Factory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload: Z = 10

    val Base_TypesBoolean_Payload: Z = 11

    val Base_TypesInteger_Payload: Z = 12

    val Base_TypesInteger_8_Payload: Z = 13

    val Base_TypesInteger_16_Payload: Z = 14

    val Base_TypesInteger_32_Payload: Z = 15

    val Base_TypesInteger_64_Payload: Z = 16

    val Base_TypesUnsigned_8_Payload: Z = 17

    val Base_TypesUnsigned_16_Payload: Z = 18

    val Base_TypesUnsigned_32_Payload: Z = 19

    val Base_TypesUnsigned_64_Payload: Z = 20

    val Base_TypesFloat_Payload: Z = 21

    val Base_TypesFloat_32_Payload: Z = 22

    val Base_TypesFloat_64_Payload: Z = 23

    val Base_TypesCharacter_Payload: Z = 24

    val Base_TypesString_Payload: Z = 25

    val Base_TypesBits_Payload: Z = 26

    val Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P: Z = 27

    val Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS: Z = 28

    val Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P: Z = 29

    val Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS: Z = 30

    val Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P: Z = 31

    val Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS: Z = 32

    val Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P: Z = 33

    val Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS: Z = 34

    val Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P: Z = 35

    val Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS: Z = 36

    val Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P: Z = 37

    val Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS: Z = 38

    val Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P: Z = 39

    val Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS: Z = 40

    val Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P: Z = 41

    val Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS: Z = 42

    val Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P: Z = 43

    val Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS: Z = 44

    val Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P: Z = 45

    val Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS: Z = 46

    val Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P: Z = 47

    val Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS: Z = 48

    val Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P: Z = 49

    val Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS: Z = 50

    val Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P: Z = 51

    val Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS: Z = 52

    val Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P: Z = 53

    val Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS: Z = 54

    val Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P: Z = 55

    val Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS: Z = 56

    val Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P: Z = 57

    val Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS: Z = 58

    val Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P: Z = 59

    val Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS: Z = 60

    val Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P: Z = 61

    val Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS: Z = 62

    val Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P: Z = 63

    val Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS: Z = 64

    val Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P: Z = 65

    val Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS: Z = 66

    val Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P: Z = 67

    val Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS: Z = 68

    val Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P: Z = 69

    val Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS: Z = 70

    val Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P: Z = 71

    val Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS: Z = 72

    val Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P: Z = 73

    val Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS: Z = 74

    val Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P: Z = 75

    val Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS: Z = 76

    val Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P: Z = 77

    val Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS: Z = 78

    val Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P: Z = 79

    val Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS: Z = 80

    val Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P: Z = 81

    val Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS: Z = 82

    val utilEmptyContainer: Z = 83

    val _artEmpty: Z = 84

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFactory_Material_Continuity_CoordinatorDemandSignalType(o: Factory_Material_Continuity_Coordinator.DemandSignal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o: Factory_Material_Continuity_Coordinator.DemandSignal_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandSignal_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandSignalType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandCodeType(o: Factory_Material_Continuity_Coordinator.DemandCode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandCode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandCode_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandCodeType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryBandType(o: Factory_Material_Continuity_Coordinator.InventoryBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBand_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBand_Payload)
      writeFactory_Material_Continuity_CoordinatorInventoryBandType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o: Factory_Material_Continuity_Coordinator.InventoryBandCode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBandCode_Payload)
      writeFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialEventType(o: Factory_Material_Continuity_Coordinator.MaterialEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialEvent_Payload)
      writeFactory_Material_Continuity_CoordinatorMaterialEventType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialEventCodeType(o: Factory_Material_Continuity_Coordinator.MaterialEventCode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialEventCode_Payload)
      writeFactory_Material_Continuity_CoordinatorMaterialEventCodeType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorEventClassType(o: Factory_Material_Continuity_Coordinator.EventClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorEventClass_Payload(o: Factory_Material_Continuity_Coordinator.EventClass_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventClass_Payload)
      writeFactory_Material_Continuity_CoordinatorEventClassType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialClassType(o: Factory_Material_Continuity_Coordinator.MaterialClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o: Factory_Material_Continuity_Coordinator.MaterialClass_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialClass_Payload)
      writeFactory_Material_Continuity_CoordinatorMaterialClassType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorAvailabilityType(o: Factory_Material_Continuity_Coordinator.Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorAvailability_Payload(o: Factory_Material_Continuity_Coordinator.Availability_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorAvailability_Payload)
      writeFactory_Material_Continuity_CoordinatorAvailabilityType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandStateType(o: Factory_Material_Continuity_Coordinator.DemandState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandState_Payload(o: Factory_Material_Continuity_Coordinator.DemandState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandState_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandStateType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyStateType(o: Factory_Material_Continuity_Coordinator.SupplyState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyState_Payload(o: Factory_Material_Continuity_Coordinator.SupplyState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorSupplyState_Payload)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o: Factory_Material_Continuity_Coordinator.QualifiedEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorQualifiedEvent_Payload)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorFaultTriggerType(o: Factory_Material_Continuity_Coordinator.FaultTrigger.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorFaultTrigger_Payload)
      writeFactory_Material_Continuity_CoordinatorFaultTriggerType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o: Factory_Material_Continuity_Coordinator.RecoveryGate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryGate_Payload)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o: Factory_Material_Continuity_Coordinator.DemandStateView.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateView_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandStateView_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandStateCodeType(o: Factory_Material_Continuity_Coordinator.DemandStateCode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandStateCode_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandStateCodeType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandUpdateType(o: Factory_Material_Continuity_Coordinator.DemandUpdate.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandUpdate_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandUpdateType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandDispositionType(o: Factory_Material_Continuity_Coordinator.DemandDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandDisposition_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandDispositionType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryEventType(o: Factory_Material_Continuity_Coordinator.RecoveryEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryEvent_Payload)
      writeFactory_Material_Continuity_CoordinatorRecoveryEventType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorEmergencyStateType(o: Factory_Material_Continuity_Coordinator.EmergencyState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o: Factory_Material_Continuity_Coordinator.EmergencyState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEmergencyState_Payload)
      writeFactory_Material_Continuity_CoordinatorEmergencyStateType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryStateType(o: Factory_Material_Continuity_Coordinator.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryState_Payload)
      writeFactory_Material_Continuity_CoordinatorRecoveryStateType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorProposalStateType(o: Factory_Material_Continuity_Coordinator.ProposalState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorProposalState_Payload(o: Factory_Material_Continuity_Coordinator.ProposalState_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorProposalState_Payload)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialActionType(o: Factory_Material_Continuity_Coordinator.MaterialAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o: Factory_Material_Continuity_Coordinator.MaterialAction_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialAction_Payload)
      writeFactory_Material_Continuity_CoordinatorMaterialActionType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDecisionCauseType(o: Factory_Material_Continuity_Coordinator.DecisionCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o: Factory_Material_Continuity_Coordinator.DecisionCause_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDecisionCause_Payload)
      writeFactory_Material_Continuity_CoordinatorDecisionCauseType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorCoordinationModeType(o: Factory_Material_Continuity_Coordinator.CoordinationMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorCoordinationMode_Payload)
      writeFactory_Material_Continuity_CoordinatorCoordinationModeType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyStateCodeType(o: Factory_Material_Continuity_Coordinator.SupplyStateCode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorSupplyStateCode_Payload)
      writeFactory_Material_Continuity_CoordinatorSupplyStateCodeType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(o: Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryStateCode_Payload)
      writeFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandBoundaryFacts)
      writer.writeB(o.present)
      writeFactory_Material_Continuity_CoordinatorDemandCodeType(o.demandValue)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts)
      writeFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o.band)
      writer.writeB(o.usable)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload)
      writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessFacts)
      writeFactory_Material_Continuity_CoordinatorInventoryBandCodeType(o.band)
      writer.writeB(o.usable)
      writer.writeB(o.materialAvailable)
      writer.writeB(o.reserveLow)
      writer.writeB(o.replenishmentNeeded)
      writer.writeB(o.productionEvidenceUsable)
      writer.writeB(o.productionAccepting)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventBoundaryFacts)
      writeFactory_Material_Continuity_CoordinatorMaterialEventCodeType(o.materialEvent)
      writeFactory_Material_Continuity_CoordinatorEventClassType(o.eventClass)
    }

    def writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload)
      writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandFacts(o: Factory_Material_Continuity_Coordinator.DemandFacts): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandFacts)
      writer.writeB(o.present)
      writer.writeB(o.valid)
      writer.writeB(o.urgent)
      writeFactory_Material_Continuity_CoordinatorMaterialClassType(o.materialClass)
      writeFactory_Material_Continuity_CoordinatorDemandCodeType(o.demandValue)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandFacts_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandFacts_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandFacts(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandTransition(o: Factory_Material_Continuity_Coordinator.DemandTransition): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandTransition)
      writeFactory_Material_Continuity_CoordinatorDemandStateCodeType(o.demandPhase)
      writeFactory_Material_Continuity_CoordinatorDemandUpdateType(o.demandUpdate)
      writeFactory_Material_Continuity_CoordinatorDemandDispositionType(o.demandDisposition)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o: Factory_Material_Continuity_Coordinator.DemandTransition_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandTransition_Payload)
      writeFactory_Material_Continuity_CoordinatorDemandTransition(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorDecision(o: Factory_Material_Continuity_Coordinator.Decision): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDecision)
      writeFactory_Material_Continuity_CoordinatorMaterialActionType(o.actionValue)
      writeFactory_Material_Continuity_CoordinatorDecisionCauseType(o.cause)
    }

    def writeFactory_Material_Continuity_CoordinatorDecision_Payload(o: Factory_Material_Continuity_Coordinator.Decision_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDecision_Payload)
      writeFactory_Material_Continuity_CoordinatorDecision(o.value)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialCoordinationResult)
      writeFactory_Material_Continuity_CoordinatorMaterialActionType(o.actionValue)
      writeFactory_Material_Continuity_CoordinatorDecisionCauseType(o.cause)
      writeFactory_Material_Continuity_CoordinatorCoordinationModeType(o.mode)
      writeFactory_Material_Continuity_CoordinatorDemandStateCodeType(o.demandPhase)
      writeFactory_Material_Continuity_CoordinatorSupplyStateCodeType(o.supplyPhase)
      writeFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(o.recoveryPhase)
      writeFactory_Material_Continuity_CoordinatorDemandDispositionType(o.demandDisposition)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload)
      writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o.value)
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

    def writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandSignalType(o.api_demand_signal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandSignalType(o.api_demand_signal)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorInventoryBandType(o.api_inventory_band)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorInventoryBandType(o.api_inventory_band)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorMaterialEventType(o.api_material_event)
    }

    def writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorMaterialEventType(o.api_material_event)
    }

    def writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o.api_demand_boundary_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts)
      writeFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_production_availability)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o.api_inventory_boundary_facts)
      writeFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_production_availability)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_replenishment)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_routine)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_urgent)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_replenishment)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_routine)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_readiness_to_urgent)
    }

    def writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts)
      writeFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o.api_event_boundary_facts)
      writeFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_demand)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_supply)
    }

    def writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_demand)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event_to_supply)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandFacts(o.api_demand_facts)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_routine)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_urgent)
      writeFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)
      writeFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state)
    }

    def writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_routine)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_current_state_to_urgent)
      writeFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)
      writeFactory_Material_Continuity_CoordinatorDemandStateType(o.api_prior_demand_state)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorQualifiedEventType(o.api_qualified_event)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_composition)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_replenishment)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_composition)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_current_state_to_replenishment)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_prior_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)
      writeFactory_Material_Continuity_CoordinatorRecoveryEventType(o.api_recovery_event)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorFaultTriggerType(o.api_fault_trigger)
      writeFactory_Material_Continuity_CoordinatorRecoveryEventType(o.api_recovery_event)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_demand)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_replenishment)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_routine)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_supply)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_urgent)
      writeFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state)
    }

    def writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_demand)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_replenishment)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_routine)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_supply)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_gate_to_urgent)
      writeFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state)
    }

    def writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDemandStateViewType(o.api_demand_state)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
    }

    def writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_supplier_availability)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o.api_material_readiness_facts)
      writeFactory_Material_Continuity_CoordinatorRecoveryGateType(o.api_recovery_gate)
      writeFactory_Material_Continuity_CoordinatorAvailabilityType(o.api_supplier_availability)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_replenishment_proposal)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_routine_proposal)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_urgent_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorEmergencyStateType(o.api_emergency_state)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_replenishment_proposal)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_routine_proposal)
      writeFactory_Material_Continuity_CoordinatorProposalStateType(o.api_urgent_proposal)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDecision(o.api_decision)
    }

    def writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDecision(o.api_decision)
    }

    def writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P)
      writeFactory_Material_Continuity_CoordinatorDecision(o.api_decision)
      writeFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)
      writeFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorDecision(o.api_decision)
      writeFactory_Material_Continuity_CoordinatorDemandTransition(o.api_demand_transition)
      writeFactory_Material_Continuity_CoordinatorRecoveryStateType(o.api_recovery_state)
      writeFactory_Material_Continuity_CoordinatorSupplyStateType(o.api_supply_state)
    }

    def writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container): Unit = {
      o match {
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
      }
    }

    def writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P)
      writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o.api_material_coordination_result)
    }

    def writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS)
      writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o.api_material_coordination_result)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
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
        case o: Factory_Material_Continuity_Coordinator.Decision_Payload => writeFactory_Material_Continuity_CoordinatorDecision_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.EventClass_Payload => writeFactory_Material_Continuity_CoordinatorEventClass_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandCode_Payload => writeFactory_Material_Continuity_CoordinatorDemandCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyState_Payload => writeFactory_Material_Continuity_CoordinatorSupplyState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandState_Payload => writeFactory_Material_Continuity_CoordinatorDemandState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandFacts_Payload => writeFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload => writeFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload => writeFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.Availability_Payload => writeFactory_Material_Continuity_CoordinatorAvailability_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload => writeFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandSignal_Payload => writeFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialClass_Payload => writeFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload => writeFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.ProposalState_Payload => writeFactory_Material_Continuity_CoordinatorProposalState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryState_Payload => writeFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryBand_Payload => writeFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload => writeFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DecisionCause_Payload => writeFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.EmergencyState_Payload => writeFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialAction_Payload => writeFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload => writeFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload => writeFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandStateView_Payload => writeFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload => writeFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload => writeFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandTransition_Payload => writeFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload => writeFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload => writeFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload => writeFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload => writeFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload => writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload => writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload => writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload => writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload => writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
        case o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
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

    def readFactory_Material_Continuity_CoordinatorDemandSignalType(): Factory_Material_Continuity_Coordinator.DemandSignal.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DemandSignal.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDemandSignal_Payload(): Factory_Material_Continuity_Coordinator.DemandSignal_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandSignal_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandSignal_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandSignal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandSignal_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandSignalType()
      return Factory_Material_Continuity_Coordinator.DemandSignal_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandCodeType(): Factory_Material_Continuity_Coordinator.DemandCode.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DemandCode.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDemandCode_Payload(): Factory_Material_Continuity_Coordinator.DemandCode_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandCode_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandCode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandCode_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandCodeType()
      return Factory_Material_Continuity_Coordinator.DemandCode_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBandType(): Factory_Material_Continuity_Coordinator.InventoryBand.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.InventoryBand.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBand_Payload(): Factory_Material_Continuity_Coordinator.InventoryBand_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryBand_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBand_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBand_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorInventoryBandType()
      return Factory_Material_Continuity_Coordinator.InventoryBand_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBandCodeType(): Factory_Material_Continuity_Coordinator.InventoryBandCode.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.InventoryBandCode.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(): Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryBandCode_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBandCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBandCode_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorInventoryBandCodeType()
      return Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialEventType(): Factory_Material_Continuity_Coordinator.MaterialEvent.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.MaterialEvent.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(): Factory_Material_Continuity_Coordinator.MaterialEvent_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialEvent_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialEvent_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialEvent_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorMaterialEventType()
      return Factory_Material_Continuity_Coordinator.MaterialEvent_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialEventCodeType(): Factory_Material_Continuity_Coordinator.MaterialEventCode.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.MaterialEventCode.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(): Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialEventCode_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialEventCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialEventCode_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorMaterialEventCodeType()
      return Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorEventClassType(): Factory_Material_Continuity_Coordinator.EventClass.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.EventClass.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorEventClass_Payload(): Factory_Material_Continuity_Coordinator.EventClass_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorEventClass_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventClass_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventClass_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorEventClassType()
      return Factory_Material_Continuity_Coordinator.EventClass_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialClassType(): Factory_Material_Continuity_Coordinator.MaterialClass.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.MaterialClass.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorMaterialClass_Payload(): Factory_Material_Continuity_Coordinator.MaterialClass_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialClass_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialClass_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialClass_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorMaterialClassType()
      return Factory_Material_Continuity_Coordinator.MaterialClass_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorAvailabilityType(): Factory_Material_Continuity_Coordinator.Availability.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.Availability.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorAvailability_Payload(): Factory_Material_Continuity_Coordinator.Availability_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorAvailability_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorAvailability_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorAvailability_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorAvailabilityType()
      return Factory_Material_Continuity_Coordinator.Availability_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandStateType(): Factory_Material_Continuity_Coordinator.DemandState.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DemandState.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDemandState_Payload(): Factory_Material_Continuity_Coordinator.DemandState_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandState_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandState_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandStateType()
      return Factory_Material_Continuity_Coordinator.DemandState_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorSupplyStateType(): Factory_Material_Continuity_Coordinator.SupplyState.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.SupplyState.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorSupplyState_Payload(): Factory_Material_Continuity_Coordinator.SupplyState_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorSupplyState_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorSupplyState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorSupplyState_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.SupplyState_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorQualifiedEventType(): Factory_Material_Continuity_Coordinator.QualifiedEvent.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.QualifiedEvent.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(): Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorQualifiedEvent_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorQualifiedEvent_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorQualifiedEvent_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      return Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorFaultTriggerType(): Factory_Material_Continuity_Coordinator.FaultTrigger.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.FaultTrigger.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(): Factory_Material_Continuity_Coordinator.FaultTrigger_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorFaultTrigger_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorFaultTrigger_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.FaultTrigger_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorFaultTrigger_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorFaultTriggerType()
      return Factory_Material_Continuity_Coordinator.FaultTrigger_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryGateType(): Factory_Material_Continuity_Coordinator.RecoveryGate.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.RecoveryGate.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(): Factory_Material_Continuity_Coordinator.RecoveryGate_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorRecoveryGate_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryGate_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryGate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryGate_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.RecoveryGate_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandStateViewType(): Factory_Material_Continuity_Coordinator.DemandStateView.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DemandStateView.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDemandStateView_Payload(): Factory_Material_Continuity_Coordinator.DemandStateView_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandStateView_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandStateView_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandStateView_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandStateView_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      return Factory_Material_Continuity_Coordinator.DemandStateView_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandStateCodeType(): Factory_Material_Continuity_Coordinator.DemandStateCode.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DemandStateCode.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(): Factory_Material_Continuity_Coordinator.DemandStateCode_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandStateCode_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandStateCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandStateCode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandStateCode_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandStateCodeType()
      return Factory_Material_Continuity_Coordinator.DemandStateCode_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandUpdateType(): Factory_Material_Continuity_Coordinator.DemandUpdate.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DemandUpdate.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(): Factory_Material_Continuity_Coordinator.DemandUpdate_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandUpdate_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandUpdate_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandUpdate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandUpdate_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandUpdateType()
      return Factory_Material_Continuity_Coordinator.DemandUpdate_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandDispositionType(): Factory_Material_Continuity_Coordinator.DemandDisposition.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DemandDisposition.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(): Factory_Material_Continuity_Coordinator.DemandDisposition_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandDisposition_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandDisposition_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandDisposition_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandDispositionType()
      return Factory_Material_Continuity_Coordinator.DemandDisposition_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryEventType(): Factory_Material_Continuity_Coordinator.RecoveryEvent.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.RecoveryEvent.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(): Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorRecoveryEvent_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryEvent_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryEvent_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorRecoveryEventType()
      return Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorEmergencyStateType(): Factory_Material_Continuity_Coordinator.EmergencyState.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.EmergencyState.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorEmergencyState_Payload(): Factory_Material_Continuity_Coordinator.EmergencyState_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorEmergencyState_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEmergencyState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.EmergencyState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEmergencyState_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorEmergencyStateType()
      return Factory_Material_Continuity_Coordinator.EmergencyState_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryStateType(): Factory_Material_Continuity_Coordinator.RecoveryState.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.RecoveryState.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryState_Payload(): Factory_Material_Continuity_Coordinator.RecoveryState_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryState_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorRecoveryStateType()
      return Factory_Material_Continuity_Coordinator.RecoveryState_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorProposalStateType(): Factory_Material_Continuity_Coordinator.ProposalState.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.ProposalState.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorProposalState_Payload(): Factory_Material_Continuity_Coordinator.ProposalState_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorProposalState_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorProposalState_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.ProposalState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorProposalState_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.ProposalState_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionType(): Factory_Material_Continuity_Coordinator.MaterialAction.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.MaterialAction.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorMaterialAction_Payload(): Factory_Material_Continuity_Coordinator.MaterialAction_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialAction_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialAction_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialAction_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorMaterialActionType()
      return Factory_Material_Continuity_Coordinator.MaterialAction_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDecisionCauseType(): Factory_Material_Continuity_Coordinator.DecisionCause.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.DecisionCause.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorDecisionCause_Payload(): Factory_Material_Continuity_Coordinator.DecisionCause_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDecisionCause_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDecisionCause_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DecisionCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDecisionCause_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDecisionCauseType()
      return Factory_Material_Continuity_Coordinator.DecisionCause_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorCoordinationModeType(): Factory_Material_Continuity_Coordinator.CoordinationMode.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.CoordinationMode.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(): Factory_Material_Continuity_Coordinator.CoordinationMode_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorCoordinationMode_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorCoordinationMode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.CoordinationMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorCoordinationMode_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorCoordinationModeType()
      return Factory_Material_Continuity_Coordinator.CoordinationMode_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorSupplyStateCodeType(): Factory_Material_Continuity_Coordinator.SupplyStateCode.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.SupplyStateCode.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(): Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorSupplyStateCode_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorSupplyStateCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorSupplyStateCode_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorSupplyStateCodeType()
      return Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryStateCodeType(): Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type = {
      val r = reader.readZ()
      return Factory_Material_Continuity_Coordinator.RecoveryStateCode.byOrdinal(r).get
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(): Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorRecoveryStateCode_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoveryStateCode_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoveryStateCode_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorRecoveryStateCodeType()
      return Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts = {
      val r = readFactory_Material_Continuity_CoordinatorDemandBoundaryFactsT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandBoundaryFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandBoundaryFacts)
      }
      val present = reader.readB()
      val demandValue = readFactory_Material_Continuity_CoordinatorDemandCodeType()
      return Factory_Material_Continuity_Coordinator.DemandBoundaryFacts(present, demandValue)
    }

    def readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFactsT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBoundaryFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts)
      }
      val band = readFactory_Material_Continuity_CoordinatorInventoryBandCodeType()
      val usable = reader.readB()
      return Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts(band, usable)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessFactsT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessFacts)
      }
      val band = readFactory_Material_Continuity_CoordinatorInventoryBandCodeType()
      val usable = reader.readB()
      val materialAvailable = reader.readB()
      val reserveLow = reader.readB()
      val replenishmentNeeded = reader.readB()
      val productionEvidenceUsable = reader.readB()
      val productionAccepting = reader.readB()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessFacts(band, usable, materialAvailable, reserveLow, replenishmentNeeded, productionEvidenceUsable, productionAccepting)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorEventBoundaryFacts(): Factory_Material_Continuity_Coordinator.EventBoundaryFacts = {
      val r = readFactory_Material_Continuity_CoordinatorEventBoundaryFactsT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventBoundaryFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventBoundaryFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventBoundaryFacts)
      }
      val materialEvent = readFactory_Material_Continuity_CoordinatorMaterialEventCodeType()
      val eventClass = readFactory_Material_Continuity_CoordinatorEventClassType()
      return Factory_Material_Continuity_Coordinator.EventBoundaryFacts(materialEvent, eventClass)
    }

    def readFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(): Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorEventBoundaryFacts_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventBoundaryFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandFacts(): Factory_Material_Continuity_Coordinator.DemandFacts = {
      val r = readFactory_Material_Continuity_CoordinatorDemandFactsT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandFactsT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandFacts)
      }
      val present = reader.readB()
      val valid = reader.readB()
      val urgent = reader.readB()
      val materialClass = readFactory_Material_Continuity_CoordinatorMaterialClassType()
      val demandValue = readFactory_Material_Continuity_CoordinatorDemandCodeType()
      return Factory_Material_Continuity_Coordinator.DemandFacts(present, valid, urgent, materialClass, demandValue)
    }

    def readFactory_Material_Continuity_CoordinatorDemandFacts_Payload(): Factory_Material_Continuity_Coordinator.DemandFacts_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandFacts_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandFacts_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandFacts_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandFacts()
      return Factory_Material_Continuity_Coordinator.DemandFacts_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDemandTransition(): Factory_Material_Continuity_Coordinator.DemandTransition = {
      val r = readFactory_Material_Continuity_CoordinatorDemandTransitionT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandTransitionT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandTransition)
      }
      val demandPhase = readFactory_Material_Continuity_CoordinatorDemandStateCodeType()
      val demandUpdate = readFactory_Material_Continuity_CoordinatorDemandUpdateType()
      val demandDisposition = readFactory_Material_Continuity_CoordinatorDemandDispositionType()
      return Factory_Material_Continuity_Coordinator.DemandTransition(demandPhase, demandUpdate, demandDisposition)
    }

    def readFactory_Material_Continuity_CoordinatorDemandTransition_Payload(): Factory_Material_Continuity_Coordinator.DemandTransition_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDemandTransition_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandTransition_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandTransition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandTransition_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDemandTransition()
      return Factory_Material_Continuity_Coordinator.DemandTransition_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorDecision(): Factory_Material_Continuity_Coordinator.Decision = {
      val r = readFactory_Material_Continuity_CoordinatorDecisionT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDecisionT(typeParsed: B): Factory_Material_Continuity_Coordinator.Decision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDecision)
      }
      val actionValue = readFactory_Material_Continuity_CoordinatorMaterialActionType()
      val cause = readFactory_Material_Continuity_CoordinatorDecisionCauseType()
      return Factory_Material_Continuity_Coordinator.Decision(actionValue, cause)
    }

    def readFactory_Material_Continuity_CoordinatorDecision_Payload(): Factory_Material_Continuity_Coordinator.Decision_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorDecision_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDecision_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.Decision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDecision_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorDecision()
      return Factory_Material_Continuity_Coordinator.Decision_Payload(value)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialCoordinationResultT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialCoordinationResultT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialCoordinationResult)
      }
      val actionValue = readFactory_Material_Continuity_CoordinatorMaterialActionType()
      val cause = readFactory_Material_Continuity_CoordinatorDecisionCauseType()
      val mode = readFactory_Material_Continuity_CoordinatorCoordinationModeType()
      val demandPhase = readFactory_Material_Continuity_CoordinatorDemandStateCodeType()
      val supplyPhase = readFactory_Material_Continuity_CoordinatorSupplyStateCodeType()
      val recoveryPhase = readFactory_Material_Continuity_CoordinatorRecoveryStateCodeType()
      val demandDisposition = readFactory_Material_Continuity_CoordinatorDemandDispositionType()
      return Factory_Material_Continuity_Coordinator.MaterialCoordinationResult(actionValue, cause, mode, demandPhase, supplyPhase, recoveryPhase, demandDisposition)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_PayloadT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_PayloadT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload)
      }
      val value = readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      return Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload(value)
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

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P)
      }
      val api_demand_signal = readFactory_Material_Continuity_CoordinatorDemandSignalType()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(api_demand_signal)
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS)
      }
      val api_demand_signal = readFactory_Material_Continuity_CoordinatorDemandSignalType()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(api_demand_signal)
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P)
      }
      val api_demand_boundary_facts = readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(api_demand_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS)
      }
      val api_demand_boundary_facts = readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(api_demand_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P)
      }
      val api_inventory_band = readFactory_Material_Continuity_CoordinatorInventoryBandType()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(api_inventory_band)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS)
      }
      val api_inventory_band = readFactory_Material_Continuity_CoordinatorInventoryBandType()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(api_inventory_band)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P)
      }
      val api_inventory_boundary_facts = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(api_inventory_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS)
      }
      val api_inventory_boundary_facts = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(api_inventory_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P)
      }
      val api_material_event = readFactory_Material_Continuity_CoordinatorMaterialEventType()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(api_material_event)
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS)
      }
      val api_material_event = readFactory_Material_Continuity_CoordinatorMaterialEventType()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(api_material_event)
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P)
      }
      val api_event_boundary_facts = readFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(api_event_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS)
      }
      val api_event_boundary_facts = readFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(api_event_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P)
      }
      val api_demand_boundary_facts = readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(api_demand_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS)
      }
      val api_demand_boundary_facts = readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(api_demand_boundary_facts)
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P)
      }
      val api_demand_facts = readFactory_Material_Continuity_CoordinatorDemandFacts()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(api_demand_facts)
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS)
      }
      val api_demand_facts = readFactory_Material_Continuity_CoordinatorDemandFacts()
      return Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(api_demand_facts)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P)
      }
      val api_inventory_boundary_facts = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      val api_production_availability = readFactory_Material_Continuity_CoordinatorAvailabilityType()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(api_inventory_boundary_facts, api_production_availability)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS)
      }
      val api_inventory_boundary_facts = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      val api_production_availability = readFactory_Material_Continuity_CoordinatorAvailabilityType()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(api_inventory_boundary_facts, api_production_availability)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P)
      }
      val api_readiness_to_replenishment = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_readiness_to_routine = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_readiness_to_urgent = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(api_readiness_to_replenishment, api_readiness_to_routine, api_readiness_to_urgent)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS)
      }
      val api_readiness_to_replenishment = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_readiness_to_routine = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_readiness_to_urgent = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      return Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(api_readiness_to_replenishment, api_readiness_to_routine, api_readiness_to_urgent)
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P)
      }
      val api_event_boundary_facts = readFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      val api_prior_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateType()
      val api_prior_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P(api_event_boundary_facts, api_prior_demand_state, api_prior_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS)
      }
      val api_event_boundary_facts = readFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      val api_prior_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateType()
      val api_prior_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(api_event_boundary_facts, api_prior_demand_state, api_prior_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P)
      }
      val api_fault_trigger = readFactory_Material_Continuity_CoordinatorFaultTriggerType()
      val api_qualified_event_to_demand = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      val api_qualified_event_to_supply = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P(api_fault_trigger, api_qualified_event_to_demand, api_qualified_event_to_supply)
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS)
      }
      val api_fault_trigger = readFactory_Material_Continuity_CoordinatorFaultTriggerType()
      val api_qualified_event_to_demand = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      val api_qualified_event_to_supply = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      return Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(api_fault_trigger, api_qualified_event_to_demand, api_qualified_event_to_supply)
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P)
      }
      val api_demand_facts = readFactory_Material_Continuity_CoordinatorDemandFacts()
      val api_qualified_event = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(api_demand_facts, api_qualified_event, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS)
      }
      val api_demand_facts = readFactory_Material_Continuity_CoordinatorDemandFacts()
      val api_qualified_event = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(api_demand_facts, api_qualified_event, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P)
      }
      val api_current_state_to_routine = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_current_state_to_urgent = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_demand_transition = readFactory_Material_Continuity_CoordinatorDemandTransition()
      val api_prior_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateType()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(api_current_state_to_routine, api_current_state_to_urgent, api_demand_transition, api_prior_demand_state)
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS)
      }
      val api_current_state_to_routine = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_current_state_to_urgent = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_demand_transition = readFactory_Material_Continuity_CoordinatorDemandTransition()
      val api_prior_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateType()
      return Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(api_current_state_to_routine, api_current_state_to_urgent, api_demand_transition, api_prior_demand_state)
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P)
      }
      val api_qualified_event = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(api_qualified_event, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS)
      }
      val api_qualified_event = readFactory_Material_Continuity_CoordinatorQualifiedEventType()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(api_qualified_event, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P)
      }
      val api_current_state_to_composition = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      val api_current_state_to_replenishment = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      val api_prior_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(api_current_state_to_composition, api_current_state_to_replenishment, api_prior_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS)
      }
      val api_current_state_to_composition = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      val api_current_state_to_replenishment = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      val api_prior_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(api_current_state_to_composition, api_current_state_to_replenishment, api_prior_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P)
      }
      val api_fault_trigger = readFactory_Material_Continuity_CoordinatorFaultTriggerType()
      val api_recovery_event = readFactory_Material_Continuity_CoordinatorRecoveryEventType()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(api_fault_trigger, api_recovery_event)
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS)
      }
      val api_fault_trigger = readFactory_Material_Continuity_CoordinatorFaultTriggerType()
      val api_recovery_event = readFactory_Material_Continuity_CoordinatorRecoveryEventType()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(api_fault_trigger, api_recovery_event)
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P)
      }
      val api_emergency_state = readFactory_Material_Continuity_CoordinatorEmergencyStateType()
      val api_gate_to_demand = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_replenishment = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_routine = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_supply = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_urgent = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_recovery_state = readFactory_Material_Continuity_CoordinatorRecoveryStateType()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(api_emergency_state, api_gate_to_demand, api_gate_to_replenishment, api_gate_to_routine, api_gate_to_supply, api_gate_to_urgent, api_recovery_state)
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS)
      }
      val api_emergency_state = readFactory_Material_Continuity_CoordinatorEmergencyStateType()
      val api_gate_to_demand = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_replenishment = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_routine = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_supply = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_gate_to_urgent = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_recovery_state = readFactory_Material_Continuity_CoordinatorRecoveryStateType()
      return Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(api_emergency_state, api_gate_to_demand, api_gate_to_replenishment, api_gate_to_routine, api_gate_to_supply, api_gate_to_urgent, api_recovery_state)
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P)
      }
      val api_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_material_readiness_facts = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS)
      }
      val api_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_material_readiness_facts = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P)
      }
      val api_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(api_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS)
      }
      val api_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(api_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P)
      }
      val api_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_material_readiness_facts = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS)
      }
      val api_demand_state = readFactory_Material_Continuity_CoordinatorDemandStateViewType()
      val api_material_readiness_facts = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(api_demand_state, api_material_readiness_facts, api_recovery_gate)
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P)
      }
      val api_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(api_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS)
      }
      val api_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(api_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P)
      }
      val api_material_readiness_facts = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_supplier_availability = readFactory_Material_Continuity_CoordinatorAvailabilityType()
      val api_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(api_material_readiness_facts, api_recovery_gate, api_supplier_availability, api_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS)
      }
      val api_material_readiness_facts = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      val api_recovery_gate = readFactory_Material_Continuity_CoordinatorRecoveryGateType()
      val api_supplier_availability = readFactory_Material_Continuity_CoordinatorAvailabilityType()
      val api_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(api_material_readiness_facts, api_recovery_gate, api_supplier_availability, api_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P)
      }
      val api_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(api_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS)
      }
      val api_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(api_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P)
      }
      val api_emergency_state = readFactory_Material_Continuity_CoordinatorEmergencyStateType()
      val api_replenishment_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      val api_routine_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      val api_urgent_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(api_emergency_state, api_replenishment_proposal, api_routine_proposal, api_urgent_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS)
      }
      val api_emergency_state = readFactory_Material_Continuity_CoordinatorEmergencyStateType()
      val api_replenishment_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      val api_routine_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      val api_urgent_proposal = readFactory_Material_Continuity_CoordinatorProposalStateType()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(api_emergency_state, api_replenishment_proposal, api_routine_proposal, api_urgent_proposal)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P)
      }
      val api_decision = readFactory_Material_Continuity_CoordinatorDecision()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(api_decision)
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS)
      }
      val api_decision = readFactory_Material_Continuity_CoordinatorDecision()
      return Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(api_decision)
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P)
      }
      val api_decision = readFactory_Material_Continuity_CoordinatorDecision()
      val api_demand_transition = readFactory_Material_Continuity_CoordinatorDemandTransition()
      val api_recovery_state = readFactory_Material_Continuity_CoordinatorRecoveryStateType()
      val api_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P(api_decision, api_demand_transition, api_recovery_state, api_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS)
      }
      val api_decision = readFactory_Material_Continuity_CoordinatorDecision()
      val api_demand_transition = readFactory_Material_Continuity_CoordinatorDemandTransition()
      val api_recovery_state = readFactory_Material_Continuity_CoordinatorRecoveryStateType()
      val api_supply_state = readFactory_Material_Continuity_CoordinatorSupplyStateType()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS(api_decision, api_demand_transition, api_recovery_state, api_supply_state)
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container.")
          val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P = {
      val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P)
      }
      val api_material_coordination_result = readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P(api_material_coordination_result)
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS = {
      val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(F)
      return r
    }

    def readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(typeParsed: B): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS)
      }
      val api_material_coordination_result = readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      return Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS(api_material_coordination_result)
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
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T)
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
        case Constants.Factory_Material_Continuity_CoordinatorDecision_Payload => val r = readFactory_Material_Continuity_CoordinatorDecision_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventClass_Payload => val r = readFactory_Material_Continuity_CoordinatorEventClass_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandCode_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandCode_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyState_Payload => val r = readFactory_Material_Continuity_CoordinatorSupplyState_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandState_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandState_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandFacts_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandFacts_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoveryGate_Payload => val r = readFactory_Material_Continuity_CoordinatorRecoveryGate_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorFaultTrigger_Payload => val r = readFactory_Material_Continuity_CoordinatorFaultTrigger_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorAvailability_Payload => val r = readFactory_Material_Continuity_CoordinatorAvailability_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandUpdate_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandUpdate_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandSignal_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandSignal_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialClass_Payload => val r = readFactory_Material_Continuity_CoordinatorMaterialClass_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoveryEvent_Payload => val r = readFactory_Material_Continuity_CoordinatorRecoveryEvent_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorProposalState_Payload => val r = readFactory_Material_Continuity_CoordinatorProposalState_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoveryState_Payload => val r = readFactory_Material_Continuity_CoordinatorRecoveryState_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryBand_Payload => val r = readFactory_Material_Continuity_CoordinatorInventoryBand_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialEvent_Payload => val r = readFactory_Material_Continuity_CoordinatorMaterialEvent_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDecisionCause_Payload => val r = readFactory_Material_Continuity_CoordinatorDecisionCause_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEmergencyState_Payload => val r = readFactory_Material_Continuity_CoordinatorEmergencyState_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialAction_Payload => val r = readFactory_Material_Continuity_CoordinatorMaterialAction_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorQualifiedEvent_Payload => val r = readFactory_Material_Continuity_CoordinatorQualifiedEvent_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyStateCode_Payload => val r = readFactory_Material_Continuity_CoordinatorSupplyStateCode_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandStateView_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandStateView_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandStateCode_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandStateCode_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorCoordinationMode_Payload => val r = readFactory_Material_Continuity_CoordinatorCoordinationMode_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandTransition_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandTransition_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoveryStateCode_Payload => val r = readFactory_Material_Continuity_CoordinatorRecoveryStateCode_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryBandCode_Payload => val r = readFactory_Material_Continuity_CoordinatorInventoryBandCode_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialEventCode_Payload => val r = readFactory_Material_Continuity_CoordinatorMaterialEventCode_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandDisposition_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandDisposition_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload => val r = readFactory_Material_Continuity_CoordinatorEventBoundaryFacts_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload => val r = readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload => val r = readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload => val r = readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_PayloadT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PST(T)
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

  def fromFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o: Factory_Material_Continuity_Coordinator.DemandSignal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandSignal_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandSignal_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandSignal_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandSignal_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandSignal_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandSignal_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandSignal_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandCode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandCode_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandCode_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandCode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandCode_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandCode_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandCode_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryBand_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBand_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryBand_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBand_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryBand_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryBand_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryBand_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialEvent_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialEvent_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialEvent_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialEvent_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialEvent_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventClass_Payload(o: Factory_Material_Continuity_Coordinator.EventClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventClass_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventClass_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventClass_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventClass_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.EventClass_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventClass_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventClass_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o: Factory_Material_Continuity_Coordinator.MaterialClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialClass_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialClass_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialClass_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialClass_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialClass_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialClass_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialClass_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorAvailability_Payload(o: Factory_Material_Continuity_Coordinator.Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorAvailability_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorAvailability_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.Availability_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorAvailability_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.Availability_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorAvailability_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorAvailability_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandState_Payload(o: Factory_Material_Continuity_Coordinator.DemandState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandState_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandState_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandState_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandState_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandState_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyState_Payload(o: Factory_Material_Continuity_Coordinator.SupplyState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyState_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyState_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyState_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyState_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyState_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.FaultTrigger_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorFaultTrigger_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.FaultTrigger_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorFaultTrigger_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorFaultTrigger_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoveryGate_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryGate_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.RecoveryGate_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoveryGate_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoveryGate_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateView_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandStateView_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandStateView_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandStateView_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandStateView_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandStateView_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandStateView_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandStateView_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandStateCode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandStateCode_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandStateCode_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandStateCode_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandStateCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandUpdate_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandUpdate_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandUpdate_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandUpdate_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandUpdate_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandDisposition_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandDisposition_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandDisposition_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandDisposition_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandDisposition_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o: Factory_Material_Continuity_Coordinator.EmergencyState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEmergencyState_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEmergencyState_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EmergencyState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEmergencyState_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.EmergencyState_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEmergencyState_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEmergencyState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoveryState_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryState_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryState_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.RecoveryState_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorProposalState_Payload(o: Factory_Material_Continuity_Coordinator.ProposalState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorProposalState_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorProposalState_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ProposalState_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorProposalState_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.ProposalState_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorProposalState_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorProposalState_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o: Factory_Material_Continuity_Coordinator.MaterialAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialAction_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialAction_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialAction_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialAction_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialAction_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialAction_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialAction_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o: Factory_Material_Continuity_Coordinator.DecisionCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDecisionCause_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDecisionCause_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DecisionCause_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDecisionCause_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DecisionCause_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDecisionCause_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDecisionCause_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.CoordinationMode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorCoordinationMode_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.CoordinationMode_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorCoordinationMode_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorCoordinationMode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandBoundaryFacts, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts(reader: Reader): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessFacts, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventBoundaryFacts(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventBoundaryFacts, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventBoundaryFacts(reader: Reader): Factory_Material_Continuity_Coordinator.EventBoundaryFacts = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventBoundaryFacts()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventBoundaryFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandFacts(o: Factory_Material_Continuity_Coordinator.DemandFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandFacts(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandFacts(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandFacts, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandFacts(reader: Reader): Factory_Material_Continuity_Coordinator.DemandFacts = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandFacts()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandFacts _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o: Factory_Material_Continuity_Coordinator.DemandFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandFacts_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandFacts_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandFacts_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandFacts_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandFacts_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandFacts_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandFacts_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandTransition(o: Factory_Material_Continuity_Coordinator.DemandTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandTransition(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandTransition(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandTransition, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandTransition(reader: Reader): Factory_Material_Continuity_Coordinator.DemandTransition = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandTransition()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandTransition _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o: Factory_Material_Continuity_Coordinator.DemandTransition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandTransition_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandTransition_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandTransition_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandTransition_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.DemandTransition_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandTransition_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandTransition_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDecision(o: Factory_Material_Continuity_Coordinator.Decision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDecision(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDecision(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.Decision, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDecision(reader: Reader): Factory_Material_Continuity_Coordinator.Decision = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDecision()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDecision _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDecision_Payload(o: Factory_Material_Continuity_Coordinator.Decision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDecision_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDecision_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.Decision_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDecision_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.Decision_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDecision_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDecision_Payload _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialCoordinationResult, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload _)
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

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(reader: Reader): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container = {
      val r = reader.readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(reader: Reader): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P = {
      val r = reader.readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P _)
    return r
  }

  def fromFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(reader: Reader): Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS = {
      val r = reader.readFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS _)
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