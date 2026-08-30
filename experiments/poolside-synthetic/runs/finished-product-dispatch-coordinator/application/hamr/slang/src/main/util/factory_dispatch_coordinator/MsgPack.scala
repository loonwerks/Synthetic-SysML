// #Sireum
// @formatter:off

// This file is auto-generated from Request_Id.scala, Product_Id.scala, Dispatch_Amount.scala, Request_Freshness.scala, Admission_Assessment.scala, Inventory_Amount.scala, Observation_Validity.scala, Inventory_Product_Id.scala, Dispatch_Lifecycle.scala, Capacity_Request_Id.scala, Capacity_Product_Id.scala, Capacity_Amount.scala, Fresh_Inventory_Assessment.scala, Recovery_Inventory_Assessment.scala, Candidate_Request_Id.scala, Candidate_Product_Id.scala, Candidate_Amount.scala, Candidate_Lifecycle.scala, Dock_Disposition.scala, Dock_Assessment.scala, Dispatch_Attempt.scala, Outcome_Result.scala, Context_Request_Id.scala, Context_Attempt.scala, Outcome_Plan.scala, Confirmation_Outcome_Class.scala, Confirmation_Request_Id.scala, Selected_Intent.scala, Dispatch_Decision_Kind.scala, Decision_Reason.scala, Instruction_Kind.scala, Confirmation_Kind.scala, Dispatch_Status.scala, Raw_Dispatch_Request.scala, Qualified_Request_Fact.scala, Dispatch_Inventory_Snapshot.scala, Recovery_Qualification_Context.scala, Candidate_Inventory_Readiness.scala, Dock_Snapshot.scala, Execution_Outcome.scala, Active_Execution_Context.scala, Confirmation_Context.scala, Dispatch_Decision.scala, Shipment_Instruction.scala, Shipping_Confirmation.scala, Base_Types.scala, Request_Qualifier_dispatch_coordinator_process_request_qualifier_Containers.scala, Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_Containers.scala, Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_Containers.scala, Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_Containers.scala, Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_Containers.scala, Release_Arbiter_dispatch_coordinator_process_release_arbiter_Containers.scala, Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_Containers.scala, Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_Containers.scala, Status_Determiner_dispatch_coordinator_process_status_determiner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package factory_dispatch_coordinator

import org.sireum._

object MsgPack {

  object Constants {

    val Factory_Dispatch_CoordinatorRequest_Id_Payload: Z = -32

    val Factory_Dispatch_CoordinatorProduct_Id_Payload: Z = -31

    val Factory_Dispatch_CoordinatorDispatch_Amount_Payload: Z = -30

    val Factory_Dispatch_CoordinatorRequest_Freshness_Payload: Z = -29

    val Factory_Dispatch_CoordinatorAdmission_Assessment_Payload: Z = -28

    val Factory_Dispatch_CoordinatorInventory_Amount_Payload: Z = -27

    val Factory_Dispatch_CoordinatorObservation_Validity_Payload: Z = -26

    val Factory_Dispatch_CoordinatorInventory_Product_Id_Payload: Z = -25

    val Factory_Dispatch_CoordinatorDispatch_Lifecycle_Payload: Z = -24

    val Factory_Dispatch_CoordinatorCapacity_Request_Id_Payload: Z = -23

    val Factory_Dispatch_CoordinatorCapacity_Product_Id_Payload: Z = -22

    val Factory_Dispatch_CoordinatorCapacity_Amount_Payload: Z = -21

    val Factory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload: Z = -20

    val Factory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload: Z = -19

    val Factory_Dispatch_CoordinatorCandidate_Request_Id_Payload: Z = -18

    val Factory_Dispatch_CoordinatorCandidate_Product_Id_Payload: Z = -17

    val Factory_Dispatch_CoordinatorCandidate_Amount_Payload: Z = -16

    val Factory_Dispatch_CoordinatorCandidate_Lifecycle_Payload: Z = -15

    val Factory_Dispatch_CoordinatorDock_Disposition_Payload: Z = -14

    val Factory_Dispatch_CoordinatorDock_Assessment_Payload: Z = -13

    val Factory_Dispatch_CoordinatorDispatch_Attempt_Payload: Z = -12

    val Factory_Dispatch_CoordinatorOutcome_Result_Payload: Z = -11

    val Factory_Dispatch_CoordinatorContext_Request_Id_Payload: Z = -10

    val Factory_Dispatch_CoordinatorContext_Attempt_Payload: Z = -9

    val Factory_Dispatch_CoordinatorOutcome_Plan_Payload: Z = -8

    val Factory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload: Z = -7

    val Factory_Dispatch_CoordinatorConfirmation_Request_Id_Payload: Z = -6

    val Factory_Dispatch_CoordinatorSelected_Intent_Payload: Z = -5

    val Factory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload: Z = -4

    val Factory_Dispatch_CoordinatorDecision_Reason_Payload: Z = -3

    val Factory_Dispatch_CoordinatorInstruction_Kind_Payload: Z = -2

    val Factory_Dispatch_CoordinatorConfirmation_Kind_Payload: Z = -1

    val Factory_Dispatch_CoordinatorDispatch_Status_Payload: Z = 0

    val Factory_Dispatch_CoordinatorRaw_Dispatch_Request: Z = 1

    val Factory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload: Z = 2

    val Factory_Dispatch_CoordinatorQualified_Request_Fact: Z = 3

    val Factory_Dispatch_CoordinatorQualified_Request_Fact_Payload: Z = 4

    val Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot: Z = 5

    val Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload: Z = 6

    val Factory_Dispatch_CoordinatorRecovery_Qualification_Context: Z = 7

    val Factory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload: Z = 8

    val Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness: Z = 9

    val Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload: Z = 10

    val Factory_Dispatch_CoordinatorDock_Snapshot: Z = 11

    val Factory_Dispatch_CoordinatorDock_Snapshot_Payload: Z = 12

    val Factory_Dispatch_CoordinatorExecution_Outcome: Z = 13

    val Factory_Dispatch_CoordinatorExecution_Outcome_Payload: Z = 14

    val Factory_Dispatch_CoordinatorActive_Execution_Context: Z = 15

    val Factory_Dispatch_CoordinatorActive_Execution_Context_Payload: Z = 16

    val Factory_Dispatch_CoordinatorConfirmation_Context: Z = 17

    val Factory_Dispatch_CoordinatorConfirmation_Context_Payload: Z = 18

    val Factory_Dispatch_CoordinatorDispatch_Decision: Z = 19

    val Factory_Dispatch_CoordinatorDispatch_Decision_Payload: Z = 20

    val Factory_Dispatch_CoordinatorShipment_Instruction: Z = 21

    val Factory_Dispatch_CoordinatorShipment_Instruction_Payload: Z = 22

    val Factory_Dispatch_CoordinatorShipping_Confirmation: Z = 23

    val Factory_Dispatch_CoordinatorShipping_Confirmation_Payload: Z = 24

    val Base_TypesBoolean_Payload: Z = 25

    val Base_TypesInteger_Payload: Z = 26

    val Base_TypesInteger_8_Payload: Z = 27

    val Base_TypesInteger_16_Payload: Z = 28

    val Base_TypesInteger_32_Payload: Z = 29

    val Base_TypesInteger_64_Payload: Z = 30

    val Base_TypesUnsigned_8_Payload: Z = 31

    val Base_TypesUnsigned_16_Payload: Z = 32

    val Base_TypesUnsigned_32_Payload: Z = 33

    val Base_TypesUnsigned_64_Payload: Z = 34

    val Base_TypesFloat_Payload: Z = 35

    val Base_TypesFloat_32_Payload: Z = 36

    val Base_TypesFloat_64_Payload: Z = 37

    val Base_TypesCharacter_Payload: Z = 38

    val Base_TypesString_Payload: Z = 39

    val Base_TypesBits_Payload: Z = 40

    val Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P: Z = 41

    val Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS: Z = 42

    val Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P: Z = 43

    val Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS: Z = 44

    val Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P: Z = 45

    val Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS: Z = 46

    val Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P: Z = 47

    val Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS: Z = 48

    val Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P: Z = 49

    val Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS: Z = 50

    val Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P: Z = 51

    val Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS: Z = 52

    val Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P: Z = 53

    val Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS: Z = 54

    val Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P: Z = 55

    val Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS: Z = 56

    val Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P: Z = 57

    val Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS: Z = 58

    val Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P: Z = 59

    val Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS: Z = 60

    val Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P: Z = 61

    val Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS: Z = 62

    val Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P: Z = 63

    val Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS: Z = 64

    val Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P: Z = 65

    val Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS: Z = 66

    val Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P: Z = 67

    val Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS: Z = 68

    val Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P: Z = 69

    val Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS: Z = 70

    val Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P: Z = 71

    val Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS: Z = 72

    val Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P: Z = 73

    val Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS: Z = 74

    val Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P: Z = 75

    val Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS: Z = 76

    val utilEmptyContainer: Z = 77

    val _artEmpty: Z = 78

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFactory_Dispatch_CoordinatorRequest_IdType(o: Factory_Dispatch_Coordinator.Request_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Id_Payload(o: Factory_Dispatch_Coordinator.Request_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Id_Payload)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorProduct_IdType(o: Factory_Dispatch_Coordinator.Product_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorProduct_Id_Payload(o: Factory_Dispatch_Coordinator.Product_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProduct_Id_Payload)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_AmountType(o: Factory_Dispatch_Coordinator.Dispatch_Amount.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Amount_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRequest_FreshnessType(o: Factory_Dispatch_Coordinator.Request_Freshness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o: Factory_Dispatch_Coordinator.Request_Freshness_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Freshness_Payload)
      writeFactory_Dispatch_CoordinatorRequest_FreshnessType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorAdmission_AssessmentType(o: Factory_Dispatch_Coordinator.Admission_Assessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o: Factory_Dispatch_Coordinator.Admission_Assessment_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAdmission_Assessment_Payload)
      writeFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInventory_AmountType(o: Factory_Dispatch_Coordinator.Inventory_Amount.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Amount_Payload(o: Factory_Dispatch_Coordinator.Inventory_Amount_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Amount_Payload)
      writeFactory_Dispatch_CoordinatorInventory_AmountType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorObservation_ValidityType(o: Factory_Dispatch_Coordinator.Observation_Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorObservation_Validity_Payload(o: Factory_Dispatch_Coordinator.Observation_Validity_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorObservation_Validity_Payload)
      writeFactory_Dispatch_CoordinatorObservation_ValidityType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Product_IdType(o: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Product_Id_Payload)
      writeFactory_Dispatch_CoordinatorInventory_Product_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Lifecycle_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCapacity_Request_IdType(o: Factory_Dispatch_Coordinator.Capacity_Request_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapacity_Request_Id_Payload)
      writeFactory_Dispatch_CoordinatorCapacity_Request_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCapacity_Product_IdType(o: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapacity_Product_Id_Payload)
      writeFactory_Dispatch_CoordinatorCapacity_Product_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCapacity_AmountType(o: Factory_Dispatch_Coordinator.Capacity_Amount.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o: Factory_Dispatch_Coordinator.Capacity_Amount_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCapacity_Amount_Payload)
      writeFactory_Dispatch_CoordinatorCapacity_AmountType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload)
      writeFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload)
      writeFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Request_IdType(o: Factory_Dispatch_Coordinator.Candidate_Request_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCandidate_Request_Id_Payload)
      writeFactory_Dispatch_CoordinatorCandidate_Request_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Product_IdType(o: Factory_Dispatch_Coordinator.Candidate_Product_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCandidate_Product_Id_Payload)
      writeFactory_Dispatch_CoordinatorCandidate_Product_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_AmountType(o: Factory_Dispatch_Coordinator.Candidate_Amount.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o: Factory_Dispatch_Coordinator.Candidate_Amount_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCandidate_Amount_Payload)
      writeFactory_Dispatch_CoordinatorCandidate_AmountType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_LifecycleType(o: Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCandidate_Lifecycle_Payload)
      writeFactory_Dispatch_CoordinatorCandidate_LifecycleType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDock_DispositionType(o: Factory_Dispatch_Coordinator.Dock_Disposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDock_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dock_Disposition_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Disposition_Payload)
      writeFactory_Dispatch_CoordinatorDock_DispositionType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDock_AssessmentType(o: Factory_Dispatch_Coordinator.Dock_Assessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDock_Assessment_Payload(o: Factory_Dispatch_Coordinator.Dock_Assessment_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Assessment_Payload)
      writeFactory_Dispatch_CoordinatorDock_AssessmentType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_AttemptType(o: Factory_Dispatch_Coordinator.Dispatch_Attempt.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Attempt_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_AttemptType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_ResultType(o: Factory_Dispatch_Coordinator.Outcome_Result.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Result_Payload(o: Factory_Dispatch_Coordinator.Outcome_Result_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Result_Payload)
      writeFactory_Dispatch_CoordinatorOutcome_ResultType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorContext_Request_IdType(o: Factory_Dispatch_Coordinator.Context_Request_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Context_Request_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorContext_Request_Id_Payload)
      writeFactory_Dispatch_CoordinatorContext_Request_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorContext_AttemptType(o: Factory_Dispatch_Coordinator.Context_Attempt.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorContext_Attempt_Payload(o: Factory_Dispatch_Coordinator.Context_Attempt_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorContext_Attempt_Payload)
      writeFactory_Dispatch_CoordinatorContext_AttemptType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_PlanType(o: Factory_Dispatch_Coordinator.Outcome_Plan.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o: Factory_Dispatch_Coordinator.Outcome_Plan_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Plan_Payload)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload)
      writeFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Request_IdType(o: Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Request_Id_Payload)
      writeFactory_Dispatch_CoordinatorConfirmation_Request_IdType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorSelected_IntentType(o: Factory_Dispatch_Coordinator.Selected_Intent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorSelected_Intent_Payload(o: Factory_Dispatch_Coordinator.Selected_Intent_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorSelected_Intent_Payload)
      writeFactory_Dispatch_CoordinatorSelected_IntentType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_KindType(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Decision_KindType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDecision_ReasonType(o: Factory_Dispatch_Coordinator.Decision_Reason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDecision_Reason_Payload(o: Factory_Dispatch_Coordinator.Decision_Reason_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDecision_Reason_Payload)
      writeFactory_Dispatch_CoordinatorDecision_ReasonType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInstruction_KindType(o: Factory_Dispatch_Coordinator.Instruction_Kind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o: Factory_Dispatch_Coordinator.Instruction_Kind_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInstruction_Kind_Payload)
      writeFactory_Dispatch_CoordinatorInstruction_KindType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_KindType(o: Factory_Dispatch_Coordinator.Confirmation_Kind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Kind_Payload)
      writeFactory_Dispatch_CoordinatorConfirmation_KindType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_StatusType(o: Factory_Dispatch_Coordinator.Dispatch_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Status_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Status_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_StatusType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRaw_Dispatch_Request)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount)
      writeFactory_Dispatch_CoordinatorRequest_FreshnessType(o.freshness)
    }

    def writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload)
      writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o.value)
    }

    def writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQualified_Request_Fact)
      writeFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.assessment)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount)
      writeFactory_Dispatch_CoordinatorRequest_FreshnessType(o.freshness)
    }

    def writeFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQualified_Request_Fact_Payload)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot)
      writeFactory_Dispatch_CoordinatorInventory_AmountType(o.qty)
      writeFactory_Dispatch_CoordinatorObservation_ValidityType(o.validity)
      writeFactory_Dispatch_CoordinatorInventory_Product_IdType(o.pid)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecovery_Qualification_Context)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.lifecycle)
      writeFactory_Dispatch_CoordinatorCapacity_Request_IdType(o.stored_request_id)
      writeFactory_Dispatch_CoordinatorCapacity_Product_IdType(o.stored_product_id)
      writeFactory_Dispatch_CoordinatorCapacity_AmountType(o.stored_amount)
    }

    def writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload)
      writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness)
      writeFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(o.fresh_assessment)
      writeFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(o.recovery_assessment)
      writeFactory_Dispatch_CoordinatorCandidate_Request_IdType(o.recovery_request_id)
      writeFactory_Dispatch_CoordinatorCandidate_Product_IdType(o.recovery_product_id)
      writeFactory_Dispatch_CoordinatorCandidate_AmountType(o.recovery_amount)
      writeFactory_Dispatch_CoordinatorCandidate_LifecycleType(o.lifecycle_capacity)
    }

    def writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload)
      writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDock_Snapshot(o: Factory_Dispatch_Coordinator.Dock_Snapshot): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Snapshot)
      writeFactory_Dispatch_CoordinatorObservation_ValidityType(o.validity)
      writeFactory_Dispatch_CoordinatorDock_DispositionType(o.disposition)
    }

    def writeFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Snapshot_Payload)
      writeFactory_Dispatch_CoordinatorDock_Snapshot(o.value)
    }

    def writeFactory_Dispatch_CoordinatorExecution_Outcome(o: Factory_Dispatch_Coordinator.Execution_Outcome): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorExecution_Outcome)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)
      writeFactory_Dispatch_CoordinatorDispatch_AttemptType(o.attempt)
      writeFactory_Dispatch_CoordinatorOutcome_ResultType(o.result)
    }

    def writeFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o: Factory_Dispatch_Coordinator.Execution_Outcome_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorExecution_Outcome_Payload)
      writeFactory_Dispatch_CoordinatorExecution_Outcome(o.value)
    }

    def writeFactory_Dispatch_CoordinatorActive_Execution_Context(o: Factory_Dispatch_Coordinator.Active_Execution_Context): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorActive_Execution_Context)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.lifecycle)
      writeFactory_Dispatch_CoordinatorContext_Request_IdType(o.active_request_id)
      writeFactory_Dispatch_CoordinatorContext_AttemptType(o.active_attempt)
    }

    def writeFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorActive_Execution_Context_Payload)
      writeFactory_Dispatch_CoordinatorActive_Execution_Context(o.value)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Context(o: Factory_Dispatch_Coordinator.Confirmation_Context): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Context)
      writeFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(o.classification)
      writeFactory_Dispatch_CoordinatorConfirmation_Request_IdType(o.confirmation_request_id)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Context_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Context_Payload)
      writeFactory_Dispatch_CoordinatorConfirmation_Context(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision(o: Factory_Dispatch_Coordinator.Dispatch_Decision): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision)
      writeFactory_Dispatch_CoordinatorDispatch_Decision_KindType(o.kind)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Decision(o.value)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Instruction(o: Factory_Dispatch_Coordinator.Shipment_Instruction): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipment_Instruction)
      writeFactory_Dispatch_CoordinatorInstruction_KindType(o.kind)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipment_Instruction_Payload)
      writeFactory_Dispatch_CoordinatorShipment_Instruction(o.value)
    }

    def writeFactory_Dispatch_CoordinatorShipping_Confirmation(o: Factory_Dispatch_Coordinator.Shipping_Confirmation): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipping_Confirmation)
      writeFactory_Dispatch_CoordinatorConfirmation_KindType(o.kind)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)
    }

    def writeFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipping_Confirmation_Payload)
      writeFactory_Dispatch_CoordinatorShipping_Confirmation(o.value)
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

    def writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o.api_request)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o.api_request)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_arbiter_request_fact)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_inventory_request_fact)
      writeFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_priority_admission)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_arbiter_request_fact)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_inventory_request_fact)
      writeFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_priority_admission)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o.api_inventory_snapshot)
      writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o.api_inventory_snapshot)
      writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness)
    }

    def writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDock_Snapshot(o.api_dock_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDock_Snapshot(o.api_dock_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_assessment)
    }

    def writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_assessment)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)
      writeFactory_Dispatch_CoordinatorExecution_Outcome(o.api_execution_outcome)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.In_stored_transition_plan)
      writeFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)
      writeFactory_Dispatch_CoordinatorExecution_Outcome(o.api_execution_outcome)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_transition_plan)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.stored_transition_plan)
      writeFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_transition_plan)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_admission)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_admission)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness)
      writeFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_dock_assessment)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact)
      writeFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness)
      writeFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_dock_assessment)
      writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact)
      writeFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)
      writeFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)
      writeFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision)
    }

    def writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_outcome_plan)
    }

    def writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.In_active_amount)
      writeFactory_Dispatch_CoordinatorDispatch_AttemptType(o.In_active_attempt)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.In_active_product_id)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.In_active_request_id)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.In_lifecycle)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.In_shipment_instruction_amount)
      writeFactory_Dispatch_CoordinatorInstruction_KindType(o.In_shipment_instruction_kind)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.In_shipment_instruction_product_id)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.In_shipment_instruction_request_id)
      writeFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision)
      writeFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_outcome_plan)
    }

    def writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot)
      writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)
      writeFactory_Dispatch_CoordinatorShipment_Instruction(o.api_shipment_instruction)
    }

    def writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.active_amount)
      writeFactory_Dispatch_CoordinatorDispatch_AttemptType(o.active_attempt)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.active_product_id)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.active_request_id)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.lifecycle)
      writeFactory_Dispatch_CoordinatorDispatch_AmountType(o.shipment_instruction_amount)
      writeFactory_Dispatch_CoordinatorInstruction_KindType(o.shipment_instruction_kind)
      writeFactory_Dispatch_CoordinatorProduct_IdType(o.shipment_instruction_product_id)
      writeFactory_Dispatch_CoordinatorRequest_IdType(o.shipment_instruction_request_id)
      writeFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot)
      writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)
      writeFactory_Dispatch_CoordinatorShipment_Instruction(o.api_shipment_instruction)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorShipping_Confirmation(o.api_shipping_confirmation)
    }

    def writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorShipping_Confirmation(o.api_shipping_confirmation)
    }

    def writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)
      writeFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot)
    }

    def writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status)
    }

    def writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Product_Id_Payload => writeFactory_Dispatch_CoordinatorProduct_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Id_Payload => writeFactory_Dispatch_CoordinatorRequest_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Plan_Payload => writeFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload => writeFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Result_Payload => writeFactory_Dispatch_CoordinatorOutcome_Result_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload => writeFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Capacity_Amount_Payload => writeFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Assessment_Payload => writeFactory_Dispatch_CoordinatorDock_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Context_Attempt_Payload => writeFactory_Dispatch_CoordinatorContext_Attempt_Payload(o)
        case o: Factory_Dispatch_Coordinator.Selected_Intent_Payload => writeFactory_Dispatch_CoordinatorSelected_Intent_Payload(o)
        case o: Factory_Dispatch_Coordinator.Decision_Reason_Payload => writeFactory_Dispatch_CoordinatorDecision_Reason_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload => writeFactory_Dispatch_CoordinatorDispatch_Status_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Amount_Payload => writeFactory_Dispatch_CoordinatorInventory_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Amount_Payload => writeFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Disposition_Payload => writeFactory_Dispatch_CoordinatorDock_Disposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload => writeFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o)
        case o: Factory_Dispatch_Coordinator.Instruction_Kind_Payload => writeFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Freshness_Payload => writeFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload => writeFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o)
        case o: Factory_Dispatch_Coordinator.Execution_Outcome_Payload => writeFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload => writeFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o)
        case o: Factory_Dispatch_Coordinator.Context_Request_Id_Payload => writeFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload => writeFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o)
        case o: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload => writeFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload => writeFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload => writeFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o)
        case o: Factory_Dispatch_Coordinator.Observation_Validity_Payload => writeFactory_Dispatch_CoordinatorObservation_Validity_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload => writeFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload => writeFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload => writeFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Admission_Assessment_Payload => writeFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Context_Payload => writeFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload => writeFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o)
        case o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload => writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload => writeFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload => writeFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o)
        case o: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload => writeFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload => writeFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload => writeFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload => writeFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o)
        case o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload => writeFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload => writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload => writeFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload => writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o)
        case o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload => writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
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

    def readFactory_Dispatch_CoordinatorRequest_IdType(): Factory_Dispatch_Coordinator.Request_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Request_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRequest_Id_Payload(): Factory_Dispatch_Coordinator.Request_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorRequest_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRequest_IdType()
      return Factory_Dispatch_Coordinator.Request_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorProduct_IdType(): Factory_Dispatch_Coordinator.Product_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Product_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorProduct_Id_Payload(): Factory_Dispatch_Coordinator.Product_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorProduct_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProduct_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProduct_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorProduct_IdType()
      return Factory_Dispatch_Coordinator.Product_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_AmountType(): Factory_Dispatch_Coordinator.Dispatch_Amount.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Amount.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Amount_Payload(): Factory_Dispatch_Coordinator.Dispatch_Amount_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Amount_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Amount_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Amount_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      return Factory_Dispatch_Coordinator.Dispatch_Amount_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRequest_FreshnessType(): Factory_Dispatch_Coordinator.Request_Freshness.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Request_Freshness.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRequest_Freshness_Payload(): Factory_Dispatch_Coordinator.Request_Freshness_Payload = {
      val r = readFactory_Dispatch_CoordinatorRequest_Freshness_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Freshness_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Freshness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Freshness_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRequest_FreshnessType()
      return Factory_Dispatch_Coordinator.Request_Freshness_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorAdmission_AssessmentType(): Factory_Dispatch_Coordinator.Admission_Assessment.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Admission_Assessment.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(): Factory_Dispatch_Coordinator.Admission_Assessment_Payload = {
      val r = readFactory_Dispatch_CoordinatorAdmission_Assessment_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAdmission_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Admission_Assessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAdmission_Assessment_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      return Factory_Dispatch_Coordinator.Admission_Assessment_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorInventory_AmountType(): Factory_Dispatch_Coordinator.Inventory_Amount.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Inventory_Amount.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorInventory_Amount_Payload(): Factory_Dispatch_Coordinator.Inventory_Amount_Payload = {
      val r = readFactory_Dispatch_CoordinatorInventory_Amount_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Amount_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Amount_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorInventory_AmountType()
      return Factory_Dispatch_Coordinator.Inventory_Amount_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorObservation_ValidityType(): Factory_Dispatch_Coordinator.Observation_Validity.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Observation_Validity.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorObservation_Validity_Payload(): Factory_Dispatch_Coordinator.Observation_Validity_Payload = {
      val r = readFactory_Dispatch_CoordinatorObservation_Validity_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorObservation_Validity_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Observation_Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorObservation_Validity_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorObservation_ValidityType()
      return Factory_Dispatch_Coordinator.Observation_Validity_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorInventory_Product_IdType(): Factory_Dispatch_Coordinator.Inventory_Product_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Inventory_Product_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(): Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorInventory_Product_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Product_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Product_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorInventory_Product_IdType()
      return Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_LifecycleType(): Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Lifecycle.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(): Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Lifecycle_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Lifecycle_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Lifecycle_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      return Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCapacity_Request_IdType(): Factory_Dispatch_Coordinator.Capacity_Request_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Capacity_Request_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(): Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorCapacity_Request_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapacity_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapacity_Request_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCapacity_Request_IdType()
      return Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCapacity_Product_IdType(): Factory_Dispatch_Coordinator.Capacity_Product_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Capacity_Product_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(): Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorCapacity_Product_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapacity_Product_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapacity_Product_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCapacity_Product_IdType()
      return Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCapacity_AmountType(): Factory_Dispatch_Coordinator.Capacity_Amount.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Capacity_Amount.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCapacity_Amount_Payload(): Factory_Dispatch_Coordinator.Capacity_Amount_Payload = {
      val r = readFactory_Dispatch_CoordinatorCapacity_Amount_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCapacity_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Amount_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCapacity_Amount_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCapacity_AmountType()
      return Factory_Dispatch_Coordinator.Capacity_Amount_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload = {
      val r = readFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType()
      return Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload = {
      val r = readFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType()
      return Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCandidate_Request_IdType(): Factory_Dispatch_Coordinator.Candidate_Request_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Candidate_Request_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(): Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorCandidate_Request_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCandidate_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCandidate_Request_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCandidate_Request_IdType()
      return Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCandidate_Product_IdType(): Factory_Dispatch_Coordinator.Candidate_Product_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Candidate_Product_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(): Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorCandidate_Product_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCandidate_Product_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCandidate_Product_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCandidate_Product_IdType()
      return Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCandidate_AmountType(): Factory_Dispatch_Coordinator.Candidate_Amount.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Candidate_Amount.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCandidate_Amount_Payload(): Factory_Dispatch_Coordinator.Candidate_Amount_Payload = {
      val r = readFactory_Dispatch_CoordinatorCandidate_Amount_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCandidate_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Amount_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCandidate_Amount_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCandidate_AmountType()
      return Factory_Dispatch_Coordinator.Candidate_Amount_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCandidate_LifecycleType(): Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Candidate_Lifecycle.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(): Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload = {
      val r = readFactory_Dispatch_CoordinatorCandidate_Lifecycle_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCandidate_Lifecycle_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCandidate_Lifecycle_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCandidate_LifecycleType()
      return Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDock_DispositionType(): Factory_Dispatch_Coordinator.Dock_Disposition.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dock_Disposition.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDock_Disposition_Payload(): Factory_Dispatch_Coordinator.Dock_Disposition_Payload = {
      val r = readFactory_Dispatch_CoordinatorDock_Disposition_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_Disposition_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Disposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Disposition_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDock_DispositionType()
      return Factory_Dispatch_Coordinator.Dock_Disposition_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDock_AssessmentType(): Factory_Dispatch_Coordinator.Dock_Assessment.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dock_Assessment.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDock_Assessment_Payload(): Factory_Dispatch_Coordinator.Dock_Assessment_Payload = {
      val r = readFactory_Dispatch_CoordinatorDock_Assessment_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Assessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Assessment_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDock_AssessmentType()
      return Factory_Dispatch_Coordinator.Dock_Assessment_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_AttemptType(): Factory_Dispatch_Coordinator.Dispatch_Attempt.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Attempt.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(): Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Attempt_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Attempt_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Attempt_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_AttemptType()
      return Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorOutcome_ResultType(): Factory_Dispatch_Coordinator.Outcome_Result.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Outcome_Result.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorOutcome_Result_Payload(): Factory_Dispatch_Coordinator.Outcome_Result_Payload = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Result_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Result_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Result_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Result_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorOutcome_ResultType()
      return Factory_Dispatch_Coordinator.Outcome_Result_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorContext_Request_IdType(): Factory_Dispatch_Coordinator.Context_Request_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Context_Request_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorContext_Request_Id_Payload(): Factory_Dispatch_Coordinator.Context_Request_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorContext_Request_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorContext_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Context_Request_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorContext_Request_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorContext_Request_IdType()
      return Factory_Dispatch_Coordinator.Context_Request_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorContext_AttemptType(): Factory_Dispatch_Coordinator.Context_Attempt.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Context_Attempt.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorContext_Attempt_Payload(): Factory_Dispatch_Coordinator.Context_Attempt_Payload = {
      val r = readFactory_Dispatch_CoordinatorContext_Attempt_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorContext_Attempt_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Context_Attempt_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorContext_Attempt_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorContext_AttemptType()
      return Factory_Dispatch_Coordinator.Context_Attempt_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorOutcome_PlanType(): Factory_Dispatch_Coordinator.Outcome_Plan.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Outcome_Plan.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorOutcome_Plan_Payload(): Factory_Dispatch_Coordinator.Outcome_Plan_Payload = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Plan_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Plan_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Plan_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Plan_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      return Factory_Dispatch_Coordinator.Outcome_Plan_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType()
      return Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Request_IdType(): Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Confirmation_Request_Id.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(): Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Request_Id_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Request_Id_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorConfirmation_Request_IdType()
      return Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorSelected_IntentType(): Factory_Dispatch_Coordinator.Selected_Intent.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Selected_Intent.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorSelected_Intent_Payload(): Factory_Dispatch_Coordinator.Selected_Intent_Payload = {
      val r = readFactory_Dispatch_CoordinatorSelected_Intent_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorSelected_Intent_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Selected_Intent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorSelected_Intent_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorSelected_IntentType()
      return Factory_Dispatch_Coordinator.Selected_Intent_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_KindType(): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Kind_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Kind_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Decision_KindType()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDecision_ReasonType(): Factory_Dispatch_Coordinator.Decision_Reason.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Decision_Reason.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDecision_Reason_Payload(): Factory_Dispatch_Coordinator.Decision_Reason_Payload = {
      val r = readFactory_Dispatch_CoordinatorDecision_Reason_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDecision_Reason_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Decision_Reason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDecision_Reason_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDecision_ReasonType()
      return Factory_Dispatch_Coordinator.Decision_Reason_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorInstruction_KindType(): Factory_Dispatch_Coordinator.Instruction_Kind.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Instruction_Kind.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorInstruction_Kind_Payload(): Factory_Dispatch_Coordinator.Instruction_Kind_Payload = {
      val r = readFactory_Dispatch_CoordinatorInstruction_Kind_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInstruction_Kind_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Instruction_Kind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInstruction_Kind_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorInstruction_KindType()
      return Factory_Dispatch_Coordinator.Instruction_Kind_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_KindType(): Factory_Dispatch_Coordinator.Confirmation_Kind.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Confirmation_Kind.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(): Factory_Dispatch_Coordinator.Confirmation_Kind_Payload = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Kind_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Kind_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Kind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Kind_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorConfirmation_KindType()
      return Factory_Dispatch_Coordinator.Confirmation_Kind_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_StatusType(): Factory_Dispatch_Coordinator.Dispatch_Status.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Status.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Status_Payload(): Factory_Dispatch_Coordinator.Dispatch_Status_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Status_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_StatusType()
      return Factory_Dispatch_Coordinator.Dispatch_Status_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRaw_Dispatch_Request(): Factory_Dispatch_Coordinator.Raw_Dispatch_Request = {
      val r = readFactory_Dispatch_CoordinatorRaw_Dispatch_RequestT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRaw_Dispatch_RequestT(typeParsed: B): Factory_Dispatch_Coordinator.Raw_Dispatch_Request = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRaw_Dispatch_Request)
      }
      val request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      val freshness = readFactory_Dispatch_CoordinatorRequest_FreshnessType()
      return Factory_Dispatch_Coordinator.Raw_Dispatch_Request(request_id, product_id, amount, freshness)
    }

    def readFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(): Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload = {
      val r = readFactory_Dispatch_CoordinatorRaw_Dispatch_Request_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRaw_Dispatch_Request_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      return Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorQualified_Request_Fact(): Factory_Dispatch_Coordinator.Qualified_Request_Fact = {
      val r = readFactory_Dispatch_CoordinatorQualified_Request_FactT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQualified_Request_FactT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Request_Fact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQualified_Request_Fact)
      }
      val assessment = readFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      val request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      val freshness = readFactory_Dispatch_CoordinatorRequest_FreshnessType()
      return Factory_Dispatch_Coordinator.Qualified_Request_Fact(assessment, request_id, product_id, amount, freshness)
    }

    def readFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(): Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload = {
      val r = readFactory_Dispatch_CoordinatorQualified_Request_Fact_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQualified_Request_Fact_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQualified_Request_Fact_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      return Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Inventory_SnapshotT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Inventory_SnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot)
      }
      val qty = readFactory_Dispatch_CoordinatorInventory_AmountType()
      val validity = readFactory_Dispatch_CoordinatorObservation_ValidityType()
      val pid = readFactory_Dispatch_CoordinatorInventory_Product_IdType()
      return Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot(qty, validity, pid)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      return Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRecovery_Qualification_Context(): Factory_Dispatch_Coordinator.Recovery_Qualification_Context = {
      val r = readFactory_Dispatch_CoordinatorRecovery_Qualification_ContextT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecovery_Qualification_ContextT(typeParsed: B): Factory_Dispatch_Coordinator.Recovery_Qualification_Context = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecovery_Qualification_Context)
      }
      val lifecycle = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      val stored_request_id = readFactory_Dispatch_CoordinatorCapacity_Request_IdType()
      val stored_product_id = readFactory_Dispatch_CoordinatorCapacity_Product_IdType()
      val stored_amount = readFactory_Dispatch_CoordinatorCapacity_AmountType()
      return Factory_Dispatch_Coordinator.Recovery_Qualification_Context(lifecycle, stored_request_id, stored_product_id, stored_amount)
    }

    def readFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(): Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload = {
      val r = readFactory_Dispatch_CoordinatorRecovery_Qualification_Context_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRecovery_Qualification_Context_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      return Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness = {
      val r = readFactory_Dispatch_CoordinatorCandidate_Inventory_ReadinessT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCandidate_Inventory_ReadinessT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness)
      }
      val fresh_assessment = readFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType()
      val recovery_assessment = readFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType()
      val recovery_request_id = readFactory_Dispatch_CoordinatorCandidate_Request_IdType()
      val recovery_product_id = readFactory_Dispatch_CoordinatorCandidate_Product_IdType()
      val recovery_amount = readFactory_Dispatch_CoordinatorCandidate_AmountType()
      val lifecycle_capacity = readFactory_Dispatch_CoordinatorCandidate_LifecycleType()
      return Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness(fresh_assessment, recovery_assessment, recovery_request_id, recovery_product_id, recovery_amount, lifecycle_capacity)
    }

    def readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload = {
      val r = readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      return Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDock_Snapshot(): Factory_Dispatch_Coordinator.Dock_Snapshot = {
      val r = readFactory_Dispatch_CoordinatorDock_SnapshotT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_SnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Snapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Snapshot)
      }
      val validity = readFactory_Dispatch_CoordinatorObservation_ValidityType()
      val disposition = readFactory_Dispatch_CoordinatorDock_DispositionType()
      return Factory_Dispatch_Coordinator.Dock_Snapshot(validity, disposition)
    }

    def readFactory_Dispatch_CoordinatorDock_Snapshot_Payload(): Factory_Dispatch_Coordinator.Dock_Snapshot_Payload = {
      val r = readFactory_Dispatch_CoordinatorDock_Snapshot_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_Snapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Snapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Snapshot_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDock_Snapshot()
      return Factory_Dispatch_Coordinator.Dock_Snapshot_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorExecution_Outcome(): Factory_Dispatch_Coordinator.Execution_Outcome = {
      val r = readFactory_Dispatch_CoordinatorExecution_OutcomeT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorExecution_OutcomeT(typeParsed: B): Factory_Dispatch_Coordinator.Execution_Outcome = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorExecution_Outcome)
      }
      val request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val attempt = readFactory_Dispatch_CoordinatorDispatch_AttemptType()
      val result = readFactory_Dispatch_CoordinatorOutcome_ResultType()
      return Factory_Dispatch_Coordinator.Execution_Outcome(request_id, attempt, result)
    }

    def readFactory_Dispatch_CoordinatorExecution_Outcome_Payload(): Factory_Dispatch_Coordinator.Execution_Outcome_Payload = {
      val r = readFactory_Dispatch_CoordinatorExecution_Outcome_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorExecution_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Execution_Outcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorExecution_Outcome_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorExecution_Outcome()
      return Factory_Dispatch_Coordinator.Execution_Outcome_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorActive_Execution_Context(): Factory_Dispatch_Coordinator.Active_Execution_Context = {
      val r = readFactory_Dispatch_CoordinatorActive_Execution_ContextT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorActive_Execution_ContextT(typeParsed: B): Factory_Dispatch_Coordinator.Active_Execution_Context = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorActive_Execution_Context)
      }
      val lifecycle = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      val active_request_id = readFactory_Dispatch_CoordinatorContext_Request_IdType()
      val active_attempt = readFactory_Dispatch_CoordinatorContext_AttemptType()
      return Factory_Dispatch_Coordinator.Active_Execution_Context(lifecycle, active_request_id, active_attempt)
    }

    def readFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(): Factory_Dispatch_Coordinator.Active_Execution_Context_Payload = {
      val r = readFactory_Dispatch_CoordinatorActive_Execution_Context_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorActive_Execution_Context_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Active_Execution_Context_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorActive_Execution_Context_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorActive_Execution_Context()
      return Factory_Dispatch_Coordinator.Active_Execution_Context_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Context(): Factory_Dispatch_Coordinator.Confirmation_Context = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_ContextT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_ContextT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Context = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Context)
      }
      val classification = readFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType()
      val confirmation_request_id = readFactory_Dispatch_CoordinatorConfirmation_Request_IdType()
      return Factory_Dispatch_Coordinator.Confirmation_Context(classification, confirmation_request_id)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Context_Payload(): Factory_Dispatch_Coordinator.Confirmation_Context_Payload = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Context_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Context_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Context_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Context_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorConfirmation_Context()
      return Factory_Dispatch_Coordinator.Confirmation_Context_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision(): Factory_Dispatch_Coordinator.Dispatch_Decision = {
      val r = readFactory_Dispatch_CoordinatorDispatch_DecisionT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_DecisionT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision)
      }
      val kind = readFactory_Dispatch_CoordinatorDispatch_Decision_KindType()
      val request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      return Factory_Dispatch_Coordinator.Dispatch_Decision(kind, request_id, product_id, amount)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Payload(): Factory_Dispatch_Coordinator.Dispatch_Decision_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Decision_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Decision()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorShipment_Instruction(): Factory_Dispatch_Coordinator.Shipment_Instruction = {
      val r = readFactory_Dispatch_CoordinatorShipment_InstructionT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipment_InstructionT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Instruction = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipment_Instruction)
      }
      val kind = readFactory_Dispatch_CoordinatorInstruction_KindType()
      val request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      return Factory_Dispatch_Coordinator.Shipment_Instruction(kind, request_id, product_id, amount)
    }

    def readFactory_Dispatch_CoordinatorShipment_Instruction_Payload(): Factory_Dispatch_Coordinator.Shipment_Instruction_Payload = {
      val r = readFactory_Dispatch_CoordinatorShipment_Instruction_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipment_Instruction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Instruction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipment_Instruction_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorShipment_Instruction()
      return Factory_Dispatch_Coordinator.Shipment_Instruction_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorShipping_Confirmation(): Factory_Dispatch_Coordinator.Shipping_Confirmation = {
      val r = readFactory_Dispatch_CoordinatorShipping_ConfirmationT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipping_ConfirmationT(typeParsed: B): Factory_Dispatch_Coordinator.Shipping_Confirmation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipping_Confirmation)
      }
      val kind = readFactory_Dispatch_CoordinatorConfirmation_KindType()
      val request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      return Factory_Dispatch_Coordinator.Shipping_Confirmation(kind, request_id)
    }

    def readFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      val r = readFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipping_Confirmation_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorShipping_Confirmation()
      return Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload(value)
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

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P)
      }
      val api_request = readFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(api_request)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS)
      }
      val api_request = readFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(api_request)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P)
      }
      val api_arbiter_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      val api_inventory_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      val api_priority_admission = readFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(api_arbiter_request_fact, api_inventory_request_fact, api_priority_admission)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS)
      }
      val api_arbiter_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      val api_inventory_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      val api_priority_admission = readFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(api_arbiter_request_fact, api_inventory_request_fact, api_priority_admission)
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P)
      }
      val api_inventory_snapshot = readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      val api_recovery_context = readFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      val api_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(api_inventory_snapshot, api_recovery_context, api_request_fact)
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS)
      }
      val api_inventory_snapshot = readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      val api_recovery_context = readFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      val api_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(api_inventory_snapshot, api_recovery_context, api_request_fact)
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P)
      }
      val api_candidate_readiness = readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(api_candidate_readiness)
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS)
      }
      val api_candidate_readiness = readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(api_candidate_readiness)
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P)
      }
      val api_dock_snapshot = readFactory_Dispatch_CoordinatorDock_Snapshot()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(api_dock_snapshot)
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS)
      }
      val api_dock_snapshot = readFactory_Dispatch_CoordinatorDock_Snapshot()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(api_dock_snapshot)
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P)
      }
      val api_assessment = readFactory_Dispatch_CoordinatorDock_AssessmentType()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(api_assessment)
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS)
      }
      val api_assessment = readFactory_Dispatch_CoordinatorDock_AssessmentType()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(api_assessment)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P)
      }
      val api_execution_context = readFactory_Dispatch_CoordinatorActive_Execution_Context()
      val api_execution_outcome = readFactory_Dispatch_CoordinatorExecution_Outcome()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(api_execution_context, api_execution_outcome)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS)
      }
      val In_stored_transition_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      val api_execution_context = readFactory_Dispatch_CoordinatorActive_Execution_Context()
      val api_execution_outcome = readFactory_Dispatch_CoordinatorExecution_Outcome()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(In_stored_transition_plan, api_execution_context, api_execution_outcome)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P)
      }
      val api_confirmation_context = readFactory_Dispatch_CoordinatorConfirmation_Context()
      val api_recovery_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      val api_transition_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(api_confirmation_context, api_recovery_plan, api_transition_plan)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS)
      }
      val stored_transition_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      val api_confirmation_context = readFactory_Dispatch_CoordinatorConfirmation_Context()
      val api_recovery_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      val api_transition_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(stored_transition_plan, api_confirmation_context, api_recovery_plan, api_transition_plan)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P)
      }
      val api_admission = readFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      val api_recovery_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(api_admission, api_recovery_plan)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS)
      }
      val api_admission = readFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      val api_recovery_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(api_admission, api_recovery_plan)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P)
      }
      val api_selected_intent = readFactory_Dispatch_CoordinatorSelected_IntentType()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(api_selected_intent)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS)
      }
      val api_selected_intent = readFactory_Dispatch_CoordinatorSelected_IntentType()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(api_selected_intent)
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P)
      }
      val api_candidate_readiness = readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      val api_dock_assessment = readFactory_Dispatch_CoordinatorDock_AssessmentType()
      val api_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      val api_selected_intent = readFactory_Dispatch_CoordinatorSelected_IntentType()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(api_candidate_readiness, api_dock_assessment, api_request_fact, api_selected_intent)
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS)
      }
      val api_candidate_readiness = readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      val api_dock_assessment = readFactory_Dispatch_CoordinatorDock_AssessmentType()
      val api_request_fact = readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      val api_selected_intent = readFactory_Dispatch_CoordinatorSelected_IntentType()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(api_candidate_readiness, api_dock_assessment, api_request_fact, api_selected_intent)
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P)
      }
      val api_decision_reason = readFactory_Dispatch_CoordinatorDecision_ReasonType()
      val api_dispatch_decision = readFactory_Dispatch_CoordinatorDispatch_Decision()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(api_decision_reason, api_dispatch_decision)
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS)
      }
      val api_decision_reason = readFactory_Dispatch_CoordinatorDecision_ReasonType()
      val api_dispatch_decision = readFactory_Dispatch_CoordinatorDispatch_Decision()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(api_decision_reason, api_dispatch_decision)
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P)
      }
      val api_dispatch_decision = readFactory_Dispatch_CoordinatorDispatch_Decision()
      val api_outcome_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(api_dispatch_decision, api_outcome_plan)
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS)
      }
      val In_active_amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      val In_active_attempt = readFactory_Dispatch_CoordinatorDispatch_AttemptType()
      val In_active_product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val In_active_request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val In_lifecycle = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      val In_shipment_instruction_amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      val In_shipment_instruction_kind = readFactory_Dispatch_CoordinatorInstruction_KindType()
      val In_shipment_instruction_product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val In_shipment_instruction_request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val api_dispatch_decision = readFactory_Dispatch_CoordinatorDispatch_Decision()
      val api_outcome_plan = readFactory_Dispatch_CoordinatorOutcome_PlanType()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(In_active_amount, In_active_attempt, In_active_product_id, In_active_request_id, In_lifecycle, In_shipment_instruction_amount, In_shipment_instruction_kind, In_shipment_instruction_product_id, In_shipment_instruction_request_id, api_dispatch_decision, api_outcome_plan)
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P)
      }
      val api_execution_context = readFactory_Dispatch_CoordinatorActive_Execution_Context()
      val api_lifecycle_snapshot = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      val api_recovery_context = readFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      val api_shipment_instruction = readFactory_Dispatch_CoordinatorShipment_Instruction()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(api_execution_context, api_lifecycle_snapshot, api_recovery_context, api_shipment_instruction)
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS)
      }
      val active_amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      val active_attempt = readFactory_Dispatch_CoordinatorDispatch_AttemptType()
      val active_product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val active_request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val lifecycle = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      val shipment_instruction_amount = readFactory_Dispatch_CoordinatorDispatch_AmountType()
      val shipment_instruction_kind = readFactory_Dispatch_CoordinatorInstruction_KindType()
      val shipment_instruction_product_id = readFactory_Dispatch_CoordinatorProduct_IdType()
      val shipment_instruction_request_id = readFactory_Dispatch_CoordinatorRequest_IdType()
      val api_execution_context = readFactory_Dispatch_CoordinatorActive_Execution_Context()
      val api_lifecycle_snapshot = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      val api_recovery_context = readFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      val api_shipment_instruction = readFactory_Dispatch_CoordinatorShipment_Instruction()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(active_amount, active_attempt, active_product_id, active_request_id, lifecycle, shipment_instruction_amount, shipment_instruction_kind, shipment_instruction_product_id, shipment_instruction_request_id, api_execution_context, api_lifecycle_snapshot, api_recovery_context, api_shipment_instruction)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P)
      }
      val api_confirmation_context = readFactory_Dispatch_CoordinatorConfirmation_Context()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(api_confirmation_context)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS)
      }
      val api_confirmation_context = readFactory_Dispatch_CoordinatorConfirmation_Context()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(api_confirmation_context)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P)
      }
      val api_shipping_confirmation = readFactory_Dispatch_CoordinatorShipping_Confirmation()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(api_shipping_confirmation)
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS)
      }
      val api_shipping_confirmation = readFactory_Dispatch_CoordinatorShipping_Confirmation()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(api_shipping_confirmation)
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P)
      }
      val api_decision_reason = readFactory_Dispatch_CoordinatorDecision_ReasonType()
      val api_lifecycle_snapshot = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(api_decision_reason, api_lifecycle_snapshot)
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS)
      }
      val api_decision_reason = readFactory_Dispatch_CoordinatorDecision_ReasonType()
      val api_lifecycle_snapshot = readFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(api_decision_reason, api_lifecycle_snapshot)
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P)
      }
      val api_dispatch_status = readFactory_Dispatch_CoordinatorDispatch_StatusType()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(api_dispatch_status)
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS)
      }
      val api_dispatch_status = readFactory_Dispatch_CoordinatorDispatch_StatusType()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(api_dispatch_status)
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
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T)
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
        case Constants.Factory_Dispatch_CoordinatorProduct_Id_Payload => val r = readFactory_Dispatch_CoordinatorProduct_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Id_Payload => val r = readFactory_Dispatch_CoordinatorRequest_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Plan_Payload => val r = readFactory_Dispatch_CoordinatorOutcome_Plan_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Snapshot_Payload => val r = readFactory_Dispatch_CoordinatorDock_Snapshot_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Result_Payload => val r = readFactory_Dispatch_CoordinatorOutcome_Result_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Amount_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Amount_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapacity_Amount_Payload => val r = readFactory_Dispatch_CoordinatorCapacity_Amount_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Assessment_Payload => val r = readFactory_Dispatch_CoordinatorDock_Assessment_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorContext_Attempt_Payload => val r = readFactory_Dispatch_CoordinatorContext_Attempt_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorSelected_Intent_Payload => val r = readFactory_Dispatch_CoordinatorSelected_Intent_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDecision_Reason_Payload => val r = readFactory_Dispatch_CoordinatorDecision_Reason_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Status_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Amount_Payload => val r = readFactory_Dispatch_CoordinatorInventory_Amount_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCandidate_Amount_Payload => val r = readFactory_Dispatch_CoordinatorCandidate_Amount_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Disposition_Payload => val r = readFactory_Dispatch_CoordinatorDock_Disposition_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Attempt_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Attempt_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInstruction_Kind_Payload => val r = readFactory_Dispatch_CoordinatorInstruction_Kind_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Freshness_Payload => val r = readFactory_Dispatch_CoordinatorRequest_Freshness_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Kind_Payload => val r = readFactory_Dispatch_CoordinatorConfirmation_Kind_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorExecution_Outcome_Payload => val r = readFactory_Dispatch_CoordinatorExecution_Outcome_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorContext_Request_Id_Payload => val r = readFactory_Dispatch_CoordinatorContext_Request_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Lifecycle_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Lifecycle_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapacity_Product_Id_Payload => val r = readFactory_Dispatch_CoordinatorCapacity_Product_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCapacity_Request_Id_Payload => val r = readFactory_Dispatch_CoordinatorCapacity_Request_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCandidate_Lifecycle_Payload => val r = readFactory_Dispatch_CoordinatorCandidate_Lifecycle_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorObservation_Validity_Payload => val r = readFactory_Dispatch_CoordinatorObservation_Validity_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Product_Id_Payload => val r = readFactory_Dispatch_CoordinatorInventory_Product_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCandidate_Product_Id_Payload => val r = readFactory_Dispatch_CoordinatorCandidate_Product_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCandidate_Request_Id_Payload => val r = readFactory_Dispatch_CoordinatorCandidate_Request_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAdmission_Assessment_Payload => val r = readFactory_Dispatch_CoordinatorAdmission_Assessment_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Context_Payload => val r = readFactory_Dispatch_CoordinatorConfirmation_Context_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorShipment_Instruction_Payload => val r = readFactory_Dispatch_CoordinatorShipment_Instruction_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload => val r = readFactory_Dispatch_CoordinatorRaw_Dispatch_Request_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorShipping_Confirmation_Payload => val r = readFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Kind_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQualified_Request_Fact_Payload => val r = readFactory_Dispatch_CoordinatorQualified_Request_Fact_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Request_Id_Payload => val r = readFactory_Dispatch_CoordinatorConfirmation_Request_Id_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorActive_Execution_Context_Payload => val r = readFactory_Dispatch_CoordinatorActive_Execution_Context_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload => val r = readFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload => val r = readFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload => val r = readFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload => val r = readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload => val r = readFactory_Dispatch_CoordinatorRecovery_Qualification_Context_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T)
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

  def fromFactory_Dispatch_CoordinatorRequest_Id_Payload(o: Factory_Dispatch_Coordinator.Request_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Request_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Id_Payload(o: Factory_Dispatch_Coordinator.Product_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProduct_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProduct_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Product_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Product_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorProduct_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProduct_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Amount_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Amount_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Amount_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Amount_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Amount_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o: Factory_Dispatch_Coordinator.Request_Freshness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Freshness_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Freshness_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Freshness_Payload(reader: Reader): Factory_Dispatch_Coordinator.Request_Freshness_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Freshness_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Freshness_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o: Factory_Dispatch_Coordinator.Admission_Assessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Admission_Assessment_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(reader: Reader): Factory_Dispatch_Coordinator.Admission_Assessment_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorAdmission_Assessment_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAdmission_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Amount_Payload(o: Factory_Dispatch_Coordinator.Inventory_Amount_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Amount_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Amount_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Amount_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Amount_Payload(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Amount_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Amount_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorObservation_Validity_Payload(o: Factory_Dispatch_Coordinator.Observation_Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorObservation_Validity_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorObservation_Validity_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Observation_Validity_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorObservation_Validity_Payload(reader: Reader): Factory_Dispatch_Coordinator.Observation_Validity_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorObservation_Validity_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorObservation_Validity_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Product_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Product_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o: Factory_Dispatch_Coordinator.Capacity_Amount_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCapacity_Amount_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Capacity_Amount_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapacity_Amount_Payload(reader: Reader): Factory_Dispatch_Coordinator.Capacity_Amount_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCapacity_Amount_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCapacity_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(reader: Reader): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(reader: Reader): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o: Factory_Dispatch_Coordinator.Candidate_Amount_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCandidate_Amount_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Candidate_Amount_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Amount_Payload(reader: Reader): Factory_Dispatch_Coordinator.Candidate_Amount_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCandidate_Amount_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCandidate_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(reader: Reader): Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dock_Disposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Disposition_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Disposition_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Disposition_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Disposition_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dock_Disposition_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Disposition_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Disposition_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Assessment_Payload(o: Factory_Dispatch_Coordinator.Dock_Assessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Assessment_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Assessment_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Assessment_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Assessment_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dock_Assessment_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Assessment_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Attempt_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Attempt_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Result_Payload(o: Factory_Dispatch_Coordinator.Outcome_Result_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Result_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Result_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Result_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Result_Payload(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Result_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Result_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Result_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Context_Request_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorContext_Request_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Context_Request_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorContext_Request_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Context_Request_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorContext_Request_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorContext_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorContext_Attempt_Payload(o: Factory_Dispatch_Coordinator.Context_Attempt_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorContext_Attempt_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorContext_Attempt_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Context_Attempt_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorContext_Attempt_Payload(reader: Reader): Factory_Dispatch_Coordinator.Context_Attempt_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorContext_Attempt_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorContext_Attempt_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o: Factory_Dispatch_Coordinator.Outcome_Plan_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Plan_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Plan_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Plan_Payload(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Plan_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Plan_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Plan_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorSelected_Intent_Payload(o: Factory_Dispatch_Coordinator.Selected_Intent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorSelected_Intent_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorSelected_Intent_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Selected_Intent_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorSelected_Intent_Payload(reader: Reader): Factory_Dispatch_Coordinator.Selected_Intent_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorSelected_Intent_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorSelected_Intent_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDecision_Reason_Payload(o: Factory_Dispatch_Coordinator.Decision_Reason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDecision_Reason_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDecision_Reason_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Decision_Reason_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDecision_Reason_Payload(reader: Reader): Factory_Dispatch_Coordinator.Decision_Reason_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDecision_Reason_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDecision_Reason_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o: Factory_Dispatch_Coordinator.Instruction_Kind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInstruction_Kind_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Instruction_Kind_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInstruction_Kind_Payload(reader: Reader): Factory_Dispatch_Coordinator.Instruction_Kind_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorInstruction_Kind_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInstruction_Kind_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Kind_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Kind_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Kind_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Kind_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Status_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Status_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Status_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Status_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Status_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Status_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Status_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Status_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRaw_Dispatch_Request(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Raw_Dispatch_Request, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRaw_Dispatch_Request(reader: Reader): Factory_Dispatch_Coordinator.Raw_Dispatch_Request = {
      val r = reader.readFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRaw_Dispatch_Request _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(reader: Reader): Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualified_Request_Fact(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQualified_Request_Fact(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQualified_Request_Fact(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Qualified_Request_Fact, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Request_Fact(reader: Reader): Factory_Dispatch_Coordinator.Qualified_Request_Fact = {
      val r = reader.readFactory_Dispatch_CoordinatorQualified_Request_Fact()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQualified_Request_Fact _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(reader: Reader): Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecovery_Qualification_Context(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Recovery_Qualification_Context, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecovery_Qualification_Context(reader: Reader): Factory_Dispatch_Coordinator.Recovery_Qualification_Context = {
      val r = reader.readFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecovery_Qualification_Context _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(reader: Reader): Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(reader: Reader): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness = {
      val r = reader.readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(reader: Reader): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Snapshot(o: Factory_Dispatch_Coordinator.Dock_Snapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Snapshot(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Snapshot(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Snapshot, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Snapshot(reader: Reader): Factory_Dispatch_Coordinator.Dock_Snapshot = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Snapshot()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Snapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Snapshot_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Snapshot_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Snapshot_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dock_Snapshot_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Snapshot_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Snapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecution_Outcome(o: Factory_Dispatch_Coordinator.Execution_Outcome, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecution_Outcome(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecution_Outcome(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Execution_Outcome, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecution_Outcome(reader: Reader): Factory_Dispatch_Coordinator.Execution_Outcome = {
      val r = reader.readFactory_Dispatch_CoordinatorExecution_Outcome()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecution_Outcome _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o: Factory_Dispatch_Coordinator.Execution_Outcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorExecution_Outcome_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Execution_Outcome_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecution_Outcome_Payload(reader: Reader): Factory_Dispatch_Coordinator.Execution_Outcome_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorExecution_Outcome_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorExecution_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActive_Execution_Context(o: Factory_Dispatch_Coordinator.Active_Execution_Context, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActive_Execution_Context(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActive_Execution_Context(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Active_Execution_Context, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActive_Execution_Context(reader: Reader): Factory_Dispatch_Coordinator.Active_Execution_Context = {
      val r = reader.readFactory_Dispatch_CoordinatorActive_Execution_Context()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActive_Execution_Context _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Active_Execution_Context_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(reader: Reader): Factory_Dispatch_Coordinator.Active_Execution_Context_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorActive_Execution_Context_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorActive_Execution_Context_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Context(o: Factory_Dispatch_Coordinator.Confirmation_Context, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Context(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Context(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Context, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Context(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Context = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Context()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Context _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Context_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Context_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Context_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Context_Payload(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Context_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Context_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Context_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision(o: Factory_Dispatch_Coordinator.Dispatch_Decision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Instruction(o: Factory_Dispatch_Coordinator.Shipment_Instruction, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorShipment_Instruction(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorShipment_Instruction(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Shipment_Instruction, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Instruction(reader: Reader): Factory_Dispatch_Coordinator.Shipment_Instruction = {
      val r = reader.readFactory_Dispatch_CoordinatorShipment_Instruction()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorShipment_Instruction _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorShipment_Instruction_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Shipment_Instruction_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Instruction_Payload(reader: Reader): Factory_Dispatch_Coordinator.Shipment_Instruction_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorShipment_Instruction_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorShipment_Instruction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipping_Confirmation(o: Factory_Dispatch_Coordinator.Shipping_Confirmation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorShipping_Confirmation(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorShipping_Confirmation(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Shipping_Confirmation, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipping_Confirmation(reader: Reader): Factory_Dispatch_Coordinator.Shipping_Confirmation = {
      val r = reader.readFactory_Dispatch_CoordinatorShipping_Confirmation()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorShipping_Confirmation _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(reader: Reader): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorShipping_Confirmation_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorShipping_Confirmation_Payload _)
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

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS _)
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