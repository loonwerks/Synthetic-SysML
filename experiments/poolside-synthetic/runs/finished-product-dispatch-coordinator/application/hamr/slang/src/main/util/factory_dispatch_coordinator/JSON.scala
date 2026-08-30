// #Sireum
// @formatter:off

// This file is auto-generated from Request_Id.scala, Product_Id.scala, Dispatch_Amount.scala, Request_Freshness.scala, Admission_Assessment.scala, Inventory_Amount.scala, Observation_Validity.scala, Inventory_Product_Id.scala, Dispatch_Lifecycle.scala, Capacity_Request_Id.scala, Capacity_Product_Id.scala, Capacity_Amount.scala, Fresh_Inventory_Assessment.scala, Recovery_Inventory_Assessment.scala, Candidate_Request_Id.scala, Candidate_Product_Id.scala, Candidate_Amount.scala, Candidate_Lifecycle.scala, Dock_Disposition.scala, Dock_Assessment.scala, Dispatch_Attempt.scala, Outcome_Result.scala, Context_Request_Id.scala, Context_Attempt.scala, Outcome_Plan.scala, Confirmation_Outcome_Class.scala, Confirmation_Request_Id.scala, Selected_Intent.scala, Dispatch_Decision_Kind.scala, Decision_Reason.scala, Instruction_Kind.scala, Confirmation_Kind.scala, Dispatch_Status.scala, Raw_Dispatch_Request.scala, Qualified_Request_Fact.scala, Dispatch_Inventory_Snapshot.scala, Recovery_Qualification_Context.scala, Candidate_Inventory_Readiness.scala, Dock_Snapshot.scala, Execution_Outcome.scala, Active_Execution_Context.scala, Confirmation_Context.scala, Dispatch_Decision.scala, Shipment_Instruction.scala, Shipping_Confirmation.scala, Base_Types.scala, Request_Qualifier_dispatch_coordinator_process_request_qualifier_Containers.scala, Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_Containers.scala, Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_Containers.scala, Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_Containers.scala, Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_Containers.scala, Release_Arbiter_dispatch_coordinator_process_release_arbiter_Containers.scala, Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_Containers.scala, Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_Containers.scala, Status_Determiner_dispatch_coordinator_process_status_determiner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFactory_Dispatch_CoordinatorRequest_IdType(o: Factory_Dispatch_Coordinator.Request_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Request_Id.None => "None"
        case Factory_Dispatch_Coordinator.Request_Id.R1 => "R1"
        case Factory_Dispatch_Coordinator.Request_Id.R2 => "R2"
        case Factory_Dispatch_Coordinator.Request_Id.R3 => "R3"
        case Factory_Dispatch_Coordinator.Request_Id.R4 => "R4"
        case Factory_Dispatch_Coordinator.Request_Id.R5 => "R5"
        case Factory_Dispatch_Coordinator.Request_Id.R6 => "R6"
        case Factory_Dispatch_Coordinator.Request_Id.R7 => "R7"
        case Factory_Dispatch_Coordinator.Request_Id.R8 => "R8"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Request_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Id_Payload(o: Factory_Dispatch_Coordinator.Request_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRequest_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProduct_IdType(o: Factory_Dispatch_Coordinator.Product_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Product_Id.None => "None"
        case Factory_Dispatch_Coordinator.Product_Id.P1 => "P1"
        case Factory_Dispatch_Coordinator.Product_Id.P2 => "P2"
        case Factory_Dispatch_Coordinator.Product_Id.P3 => "P3"
        case Factory_Dispatch_Coordinator.Product_Id.P4 => "P4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Product_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProduct_Id_Payload(o: Factory_Dispatch_Coordinator.Product_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Product_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorProduct_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_AmountType(o: Factory_Dispatch_Coordinator.Dispatch_Amount.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Amount.A0 => "A0"
        case Factory_Dispatch_Coordinator.Dispatch_Amount.A1 => "A1"
        case Factory_Dispatch_Coordinator.Dispatch_Amount.A2 => "A2"
        case Factory_Dispatch_Coordinator.Dispatch_Amount.A3 => "A3"
        case Factory_Dispatch_Coordinator.Dispatch_Amount.A4 => "A4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Amount")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Amount_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_FreshnessType(o: Factory_Dispatch_Coordinator.Request_Freshness.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Request_Freshness.Fresh => "Fresh"
        case Factory_Dispatch_Coordinator.Request_Freshness.Repeated => "Repeated"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Request_Freshness")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o: Factory_Dispatch_Coordinator.Request_Freshness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Freshness_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRequest_FreshnessType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAdmission_AssessmentType(o: Factory_Dispatch_Coordinator.Admission_Assessment.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Admission_Assessment.NoRequest => "NoRequest"
        case Factory_Dispatch_Coordinator.Admission_Assessment.Malformed => "Malformed"
        case Factory_Dispatch_Coordinator.Admission_Assessment.Repeated => "Repeated"
        case Factory_Dispatch_Coordinator.Admission_Assessment.AdmissibleFresh => "AdmissibleFresh"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Admission_Assessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o: Factory_Dispatch_Coordinator.Admission_Assessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Admission_Assessment_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_AmountType(o: Factory_Dispatch_Coordinator.Inventory_Amount.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Inventory_Amount.A0 => "A0"
        case Factory_Dispatch_Coordinator.Inventory_Amount.A1 => "A1"
        case Factory_Dispatch_Coordinator.Inventory_Amount.A2 => "A2"
        case Factory_Dispatch_Coordinator.Inventory_Amount.A3 => "A3"
        case Factory_Dispatch_Coordinator.Inventory_Amount.A4 => "A4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Inventory_Amount")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Amount_Payload(o: Factory_Dispatch_Coordinator.Inventory_Amount_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Amount_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorInventory_AmountType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorObservation_ValidityType(o: Factory_Dispatch_Coordinator.Observation_Validity.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Observation_Validity.Valid => "Valid"
        case Factory_Dispatch_Coordinator.Observation_Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Observation_Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorObservation_Validity_Payload(o: Factory_Dispatch_Coordinator.Observation_Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Observation_Validity_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorObservation_ValidityType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Product_IdType(o: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Inventory_Product_Id.None => "None"
        case Factory_Dispatch_Coordinator.Inventory_Product_Id.P1 => "P1"
        case Factory_Dispatch_Coordinator.Inventory_Product_Id.P2 => "P2"
        case Factory_Dispatch_Coordinator.Inventory_Product_Id.P3 => "P3"
        case Factory_Dispatch_Coordinator.Inventory_Product_Id.P4 => "P4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Inventory_Product_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorInventory_Product_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Idle => "Idle"
        case Factory_Dispatch_Coordinator.Dispatch_Lifecycle.ActiveFresh => "ActiveFresh"
        case Factory_Dispatch_Coordinator.Dispatch_Lifecycle.RecoveryPending => "RecoveryPending"
        case Factory_Dispatch_Coordinator.Dispatch_Lifecycle.ActiveRetry => "ActiveRetry"
        case Factory_Dispatch_Coordinator.Dispatch_Lifecycle.TerminalCompleted => "TerminalCompleted"
        case Factory_Dispatch_Coordinator.Dispatch_Lifecycle.TerminalFailed => "TerminalFailed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Lifecycle")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapacity_Request_IdType(o: Factory_Dispatch_Coordinator.Capacity_Request_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.None => "None"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R1 => "R1"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R2 => "R2"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R3 => "R3"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R4 => "R4"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R5 => "R5"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R6 => "R6"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R7 => "R7"
        case Factory_Dispatch_Coordinator.Capacity_Request_Id.R8 => "R8"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Capacity_Request_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCapacity_Request_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapacity_Product_IdType(o: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Capacity_Product_Id.None => "None"
        case Factory_Dispatch_Coordinator.Capacity_Product_Id.P1 => "P1"
        case Factory_Dispatch_Coordinator.Capacity_Product_Id.P2 => "P2"
        case Factory_Dispatch_Coordinator.Capacity_Product_Id.P3 => "P3"
        case Factory_Dispatch_Coordinator.Capacity_Product_Id.P4 => "P4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Capacity_Product_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCapacity_Product_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapacity_AmountType(o: Factory_Dispatch_Coordinator.Capacity_Amount.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Capacity_Amount.A0 => "A0"
        case Factory_Dispatch_Coordinator.Capacity_Amount.A1 => "A1"
        case Factory_Dispatch_Coordinator.Capacity_Amount.A2 => "A2"
        case Factory_Dispatch_Coordinator.Capacity_Amount.A3 => "A3"
        case Factory_Dispatch_Coordinator.Capacity_Amount.A4 => "A4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Capacity_Amount")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o: Factory_Dispatch_Coordinator.Capacity_Amount_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Capacity_Amount_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCapacity_AmountType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.NotApplicable => "NotApplicable"
        case Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Sufficient => "Sufficient"
        case Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Insufficient => "Insufficient"
        case Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.NotApplicable => "NotApplicable"
        case Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Sufficient => "Sufficient"
        case Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Insufficient => "Insufficient"
        case Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Request_IdType(o: Factory_Dispatch_Coordinator.Candidate_Request_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.None => "None"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R1 => "R1"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R2 => "R2"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R3 => "R3"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R4 => "R4"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R5 => "R5"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R6 => "R6"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R7 => "R7"
        case Factory_Dispatch_Coordinator.Candidate_Request_Id.R8 => "R8"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Candidate_Request_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCandidate_Request_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Product_IdType(o: Factory_Dispatch_Coordinator.Candidate_Product_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Candidate_Product_Id.None => "None"
        case Factory_Dispatch_Coordinator.Candidate_Product_Id.P1 => "P1"
        case Factory_Dispatch_Coordinator.Candidate_Product_Id.P2 => "P2"
        case Factory_Dispatch_Coordinator.Candidate_Product_Id.P3 => "P3"
        case Factory_Dispatch_Coordinator.Candidate_Product_Id.P4 => "P4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Candidate_Product_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCandidate_Product_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_AmountType(o: Factory_Dispatch_Coordinator.Candidate_Amount.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Candidate_Amount.A0 => "A0"
        case Factory_Dispatch_Coordinator.Candidate_Amount.A1 => "A1"
        case Factory_Dispatch_Coordinator.Candidate_Amount.A2 => "A2"
        case Factory_Dispatch_Coordinator.Candidate_Amount.A3 => "A3"
        case Factory_Dispatch_Coordinator.Candidate_Amount.A4 => "A4"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Candidate_Amount")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o: Factory_Dispatch_Coordinator.Candidate_Amount_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Candidate_Amount_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCandidate_AmountType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_LifecycleType(o: Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Candidate_Lifecycle.Idle => "Idle"
        case Factory_Dispatch_Coordinator.Candidate_Lifecycle.ActiveFresh => "ActiveFresh"
        case Factory_Dispatch_Coordinator.Candidate_Lifecycle.RecoveryPending => "RecoveryPending"
        case Factory_Dispatch_Coordinator.Candidate_Lifecycle.ActiveRetry => "ActiveRetry"
        case Factory_Dispatch_Coordinator.Candidate_Lifecycle.TerminalCompleted => "TerminalCompleted"
        case Factory_Dispatch_Coordinator.Candidate_Lifecycle.TerminalFailed => "TerminalFailed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Candidate_Lifecycle")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCandidate_LifecycleType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_DispositionType(o: Factory_Dispatch_Coordinator.Dock_Disposition.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dock_Disposition.Ready => "Ready"
        case Factory_Dispatch_Coordinator.Dock_Disposition.Occupied => "Occupied"
        case Factory_Dispatch_Coordinator.Dock_Disposition.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dock_Disposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dock_Disposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Disposition_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDock_DispositionType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_AssessmentType(o: Factory_Dispatch_Coordinator.Dock_Assessment.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dock_Assessment.Ready => "Ready"
        case Factory_Dispatch_Coordinator.Dock_Assessment.Blocked => "Blocked"
        case Factory_Dispatch_Coordinator.Dock_Assessment.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dock_Assessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Assessment_Payload(o: Factory_Dispatch_Coordinator.Dock_Assessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Assessment_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDock_AssessmentType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_AttemptType(o: Factory_Dispatch_Coordinator.Dispatch_Attempt.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Attempt.FreshAttempt => "FreshAttempt"
        case Factory_Dispatch_Coordinator.Dispatch_Attempt.RetryAttempt => "RetryAttempt"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Attempt")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_AttemptType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_ResultType(o: Factory_Dispatch_Coordinator.Outcome_Result.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Outcome_Result.NoReport => "NoReport"
        case Factory_Dispatch_Coordinator.Outcome_Result.InProgress => "InProgress"
        case Factory_Dispatch_Coordinator.Outcome_Result.Completed => "Completed"
        case Factory_Dispatch_Coordinator.Outcome_Result.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Outcome_Result")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Result_Payload(o: Factory_Dispatch_Coordinator.Outcome_Result_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Result_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorOutcome_ResultType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorContext_Request_IdType(o: Factory_Dispatch_Coordinator.Context_Request_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Context_Request_Id.None => "None"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R1 => "R1"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R2 => "R2"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R3 => "R3"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R4 => "R4"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R5 => "R5"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R6 => "R6"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R7 => "R7"
        case Factory_Dispatch_Coordinator.Context_Request_Id.R8 => "R8"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Context_Request_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Context_Request_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Context_Request_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorContext_Request_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorContext_AttemptType(o: Factory_Dispatch_Coordinator.Context_Attempt.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Context_Attempt.FreshAttempt => "FreshAttempt"
        case Factory_Dispatch_Coordinator.Context_Attempt.RetryAttempt => "RetryAttempt"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Context_Attempt")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorContext_Attempt_Payload(o: Factory_Dispatch_Coordinator.Context_Attempt_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Context_Attempt_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorContext_AttemptType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_PlanType(o: Factory_Dispatch_Coordinator.Outcome_Plan.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Outcome_Plan.Preserve => "Preserve"
        case Factory_Dispatch_Coordinator.Outcome_Plan.Completed => "Completed"
        case Factory_Dispatch_Coordinator.Outcome_Plan.RetryEligible => "RetryEligible"
        case Factory_Dispatch_Coordinator.Outcome_Plan.Abort => "Abort"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Outcome_Plan")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o: Factory_Dispatch_Coordinator.Outcome_Plan_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Plan_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Preserve => "Preserve"
        case Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Completed => "Completed"
        case Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.RetryEligible => "RetryEligible"
        case Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Abort => "Abort"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Confirmation_Outcome_Class")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Request_IdType(o: Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.None => "None"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R1 => "R1"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R2 => "R2"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R3 => "R3"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R4 => "R4"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R5 => "R5"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R6 => "R6"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R7 => "R7"
        case Factory_Dispatch_Coordinator.Confirmation_Request_Id.R8 => "R8"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Confirmation_Request_Id")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorConfirmation_Request_IdType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorSelected_IntentType(o: Factory_Dispatch_Coordinator.Selected_Intent.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Selected_Intent.None => "None"
        case Factory_Dispatch_Coordinator.Selected_Intent.FreshIntent => "FreshIntent"
        case Factory_Dispatch_Coordinator.Selected_Intent.RecoveryIntent => "RecoveryIntent"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Selected_Intent")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorSelected_Intent_Payload(o: Factory_Dispatch_Coordinator.Selected_Intent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Selected_Intent_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorSelected_IntentType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_KindType(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.None => "None"
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Reject => "Reject"
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.WaitInventory => "WaitInventory"
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.WaitDock => "WaitDock"
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Busy => "Busy"
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.ReleaseFresh => "ReleaseFresh"
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.ReleaseRetry => "ReleaseRetry"
        case Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.ResetIdle => "ResetIdle"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Decision_Kind")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Decision_KindType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDecision_ReasonType(o: Factory_Dispatch_Coordinator.Decision_Reason.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Decision_Reason.Idle => "Idle"
        case Factory_Dispatch_Coordinator.Decision_Reason.Rejected => "Rejected"
        case Factory_Dispatch_Coordinator.Decision_Reason.WaitingInventory => "WaitingInventory"
        case Factory_Dispatch_Coordinator.Decision_Reason.WaitingDock => "WaitingDock"
        case Factory_Dispatch_Coordinator.Decision_Reason.Busy => "Busy"
        case Factory_Dispatch_Coordinator.Decision_Reason.Released => "Released"
        case Factory_Dispatch_Coordinator.Decision_Reason.TerminalReset => "TerminalReset"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Decision_Reason")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDecision_Reason_Payload(o: Factory_Dispatch_Coordinator.Decision_Reason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Decision_Reason_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDecision_ReasonType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInstruction_KindType(o: Factory_Dispatch_Coordinator.Instruction_Kind.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Instruction_Kind.NoInstruction => "NoInstruction"
        case Factory_Dispatch_Coordinator.Instruction_Kind.ReleaseFresh => "ReleaseFresh"
        case Factory_Dispatch_Coordinator.Instruction_Kind.ReleaseRetry => "ReleaseRetry"
        case Factory_Dispatch_Coordinator.Instruction_Kind.Cancel => "Cancel"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Instruction_Kind")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o: Factory_Dispatch_Coordinator.Instruction_Kind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Instruction_Kind_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorInstruction_KindType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_KindType(o: Factory_Dispatch_Coordinator.Confirmation_Kind.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Confirmation_Kind.None => "None"
        case Factory_Dispatch_Coordinator.Confirmation_Kind.Shipped => "Shipped"
        case Factory_Dispatch_Coordinator.Confirmation_Kind.DispatchFailed => "DispatchFailed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Confirmation_Kind")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Kind_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorConfirmation_KindType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_StatusType(o: Factory_Dispatch_Coordinator.Dispatch_Status.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Status.Idle => "Idle"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Rejected => "Rejected"
        case Factory_Dispatch_Coordinator.Dispatch_Status.WaitingInventory => "WaitingInventory"
        case Factory_Dispatch_Coordinator.Dispatch_Status.WaitingDock => "WaitingDock"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Busy => "Busy"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Released => "Released"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Recovering => "Recovering"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Completed => "Completed"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Status_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Status_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_StatusType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Raw_Dispatch_Request""""),
        ("request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)),
        ("product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)),
        ("amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount)),
        ("freshness", printFactory_Dispatch_CoordinatorRequest_FreshnessType(o.freshness))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQualified_Request_Fact(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Qualified_Request_Fact""""),
        ("assessment", printFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.assessment)),
        ("request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)),
        ("product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)),
        ("amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount)),
        ("freshness", printFactory_Dispatch_CoordinatorRequest_FreshnessType(o.freshness))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot""""),
        ("qty", printFactory_Dispatch_CoordinatorInventory_AmountType(o.qty)),
        ("validity", printFactory_Dispatch_CoordinatorObservation_ValidityType(o.validity)),
        ("pid", printFactory_Dispatch_CoordinatorInventory_Product_IdType(o.pid))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Recovery_Qualification_Context""""),
        ("lifecycle", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.lifecycle)),
        ("stored_request_id", printFactory_Dispatch_CoordinatorCapacity_Request_IdType(o.stored_request_id)),
        ("stored_product_id", printFactory_Dispatch_CoordinatorCapacity_Product_IdType(o.stored_product_id)),
        ("stored_amount", printFactory_Dispatch_CoordinatorCapacity_AmountType(o.stored_amount))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness""""),
        ("fresh_assessment", printFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(o.fresh_assessment)),
        ("recovery_assessment", printFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(o.recovery_assessment)),
        ("recovery_request_id", printFactory_Dispatch_CoordinatorCandidate_Request_IdType(o.recovery_request_id)),
        ("recovery_product_id", printFactory_Dispatch_CoordinatorCandidate_Product_IdType(o.recovery_product_id)),
        ("recovery_amount", printFactory_Dispatch_CoordinatorCandidate_AmountType(o.recovery_amount)),
        ("lifecycle_capacity", printFactory_Dispatch_CoordinatorCandidate_LifecycleType(o.lifecycle_capacity))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Snapshot(o: Factory_Dispatch_Coordinator.Dock_Snapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Snapshot""""),
        ("validity", printFactory_Dispatch_CoordinatorObservation_ValidityType(o.validity)),
        ("disposition", printFactory_Dispatch_CoordinatorDock_DispositionType(o.disposition))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Snapshot_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDock_Snapshot(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecution_Outcome(o: Factory_Dispatch_Coordinator.Execution_Outcome): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Execution_Outcome""""),
        ("request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)),
        ("attempt", printFactory_Dispatch_CoordinatorDispatch_AttemptType(o.attempt)),
        ("result", printFactory_Dispatch_CoordinatorOutcome_ResultType(o.result))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o: Factory_Dispatch_Coordinator.Execution_Outcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Execution_Outcome_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorExecution_Outcome(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorActive_Execution_Context(o: Factory_Dispatch_Coordinator.Active_Execution_Context): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Active_Execution_Context""""),
        ("lifecycle", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.lifecycle)),
        ("active_request_id", printFactory_Dispatch_CoordinatorContext_Request_IdType(o.active_request_id)),
        ("active_attempt", printFactory_Dispatch_CoordinatorContext_AttemptType(o.active_attempt))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Active_Execution_Context_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorActive_Execution_Context(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Context(o: Factory_Dispatch_Coordinator.Confirmation_Context): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Context""""),
        ("classification", printFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(o.classification)),
        ("confirmation_request_id", printFactory_Dispatch_CoordinatorConfirmation_Request_IdType(o.confirmation_request_id))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Context_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Context_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorConfirmation_Context(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision(o: Factory_Dispatch_Coordinator.Dispatch_Decision): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Decision""""),
        ("kind", printFactory_Dispatch_CoordinatorDispatch_Decision_KindType(o.kind)),
        ("request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)),
        ("product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)),
        ("amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Decision_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Decision(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipment_Instruction(o: Factory_Dispatch_Coordinator.Shipment_Instruction): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipment_Instruction""""),
        ("kind", printFactory_Dispatch_CoordinatorInstruction_KindType(o.kind)),
        ("request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.request_id)),
        ("product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.product_id)),
        ("amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.amount))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipment_Instruction_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorShipment_Instruction(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipping_Confirmation(o: Factory_Dispatch_Coordinator.Shipping_Confirmation): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipping_Confirmation""""),
        ("kind", printFactory_Dispatch_CoordinatorConfirmation_KindType(o.kind)),
        ("request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.request_id))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorShipping_Confirmation(o.value))
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

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P""""),
        ("api_request", printFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o.api_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS""""),
        ("api_request", printFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o.api_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P""""),
        ("api_arbiter_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_arbiter_request_fact)),
        ("api_inventory_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_inventory_request_fact)),
        ("api_priority_admission", printFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_priority_admission))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS""""),
        ("api_arbiter_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_arbiter_request_fact)),
        ("api_inventory_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_inventory_request_fact)),
        ("api_priority_admission", printFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_priority_admission))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P""""),
        ("api_inventory_snapshot", printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o.api_inventory_snapshot)),
        ("api_recovery_context", printFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)),
        ("api_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS""""),
        ("api_inventory_snapshot", printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o.api_inventory_snapshot)),
        ("api_recovery_context", printFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)),
        ("api_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P""""),
        ("api_candidate_readiness", printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS""""),
        ("api_candidate_readiness", printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P""""),
        ("api_dock_snapshot", printFactory_Dispatch_CoordinatorDock_Snapshot(o.api_dock_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS""""),
        ("api_dock_snapshot", printFactory_Dispatch_CoordinatorDock_Snapshot(o.api_dock_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P""""),
        ("api_assessment", printFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_assessment))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS""""),
        ("api_assessment", printFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_assessment))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P""""),
        ("api_execution_context", printFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)),
        ("api_execution_outcome", printFactory_Dispatch_CoordinatorExecution_Outcome(o.api_execution_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS""""),
        ("In_stored_transition_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.In_stored_transition_plan)),
        ("api_execution_context", printFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)),
        ("api_execution_outcome", printFactory_Dispatch_CoordinatorExecution_Outcome(o.api_execution_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P""""),
        ("api_confirmation_context", printFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context)),
        ("api_recovery_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan)),
        ("api_transition_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_transition_plan))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS""""),
        ("stored_transition_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.stored_transition_plan)),
        ("api_confirmation_context", printFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context)),
        ("api_recovery_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan)),
        ("api_transition_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_transition_plan))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P""""),
        ("api_admission", printFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_admission)),
        ("api_recovery_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS""""),
        ("api_admission", printFactory_Dispatch_CoordinatorAdmission_AssessmentType(o.api_admission)),
        ("api_recovery_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_recovery_plan))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P""""),
        ("api_selected_intent", printFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS""""),
        ("api_selected_intent", printFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P""""),
        ("api_candidate_readiness", printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness)),
        ("api_dock_assessment", printFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_dock_assessment)),
        ("api_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact)),
        ("api_selected_intent", printFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS""""),
        ("api_candidate_readiness", printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o.api_candidate_readiness)),
        ("api_dock_assessment", printFactory_Dispatch_CoordinatorDock_AssessmentType(o.api_dock_assessment)),
        ("api_request_fact", printFactory_Dispatch_CoordinatorQualified_Request_Fact(o.api_request_fact)),
        ("api_selected_intent", printFactory_Dispatch_CoordinatorSelected_IntentType(o.api_selected_intent))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P""""),
        ("api_decision_reason", printFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)),
        ("api_dispatch_decision", printFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS""""),
        ("api_decision_reason", printFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)),
        ("api_dispatch_decision", printFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P""""),
        ("api_dispatch_decision", printFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision)),
        ("api_outcome_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_outcome_plan))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS""""),
        ("In_active_amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.In_active_amount)),
        ("In_active_attempt", printFactory_Dispatch_CoordinatorDispatch_AttemptType(o.In_active_attempt)),
        ("In_active_product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.In_active_product_id)),
        ("In_active_request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.In_active_request_id)),
        ("In_lifecycle", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.In_lifecycle)),
        ("In_shipment_instruction_amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.In_shipment_instruction_amount)),
        ("In_shipment_instruction_kind", printFactory_Dispatch_CoordinatorInstruction_KindType(o.In_shipment_instruction_kind)),
        ("In_shipment_instruction_product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.In_shipment_instruction_product_id)),
        ("In_shipment_instruction_request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.In_shipment_instruction_request_id)),
        ("api_dispatch_decision", printFactory_Dispatch_CoordinatorDispatch_Decision(o.api_dispatch_decision)),
        ("api_outcome_plan", printFactory_Dispatch_CoordinatorOutcome_PlanType(o.api_outcome_plan))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P""""),
        ("api_execution_context", printFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)),
        ("api_lifecycle_snapshot", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot)),
        ("api_recovery_context", printFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)),
        ("api_shipment_instruction", printFactory_Dispatch_CoordinatorShipment_Instruction(o.api_shipment_instruction))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS""""),
        ("active_amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.active_amount)),
        ("active_attempt", printFactory_Dispatch_CoordinatorDispatch_AttemptType(o.active_attempt)),
        ("active_product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.active_product_id)),
        ("active_request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.active_request_id)),
        ("lifecycle", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.lifecycle)),
        ("shipment_instruction_amount", printFactory_Dispatch_CoordinatorDispatch_AmountType(o.shipment_instruction_amount)),
        ("shipment_instruction_kind", printFactory_Dispatch_CoordinatorInstruction_KindType(o.shipment_instruction_kind)),
        ("shipment_instruction_product_id", printFactory_Dispatch_CoordinatorProduct_IdType(o.shipment_instruction_product_id)),
        ("shipment_instruction_request_id", printFactory_Dispatch_CoordinatorRequest_IdType(o.shipment_instruction_request_id)),
        ("api_execution_context", printFactory_Dispatch_CoordinatorActive_Execution_Context(o.api_execution_context)),
        ("api_lifecycle_snapshot", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot)),
        ("api_recovery_context", printFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o.api_recovery_context)),
        ("api_shipment_instruction", printFactory_Dispatch_CoordinatorShipment_Instruction(o.api_shipment_instruction))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P""""),
        ("api_confirmation_context", printFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS""""),
        ("api_confirmation_context", printFactory_Dispatch_CoordinatorConfirmation_Context(o.api_confirmation_context))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P""""),
        ("api_shipping_confirmation", printFactory_Dispatch_CoordinatorShipping_Confirmation(o.api_shipping_confirmation))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS""""),
        ("api_shipping_confirmation", printFactory_Dispatch_CoordinatorShipping_Confirmation(o.api_shipping_confirmation))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P""""),
        ("api_decision_reason", printFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)),
        ("api_lifecycle_snapshot", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS""""),
        ("api_decision_reason", printFactory_Dispatch_CoordinatorDecision_ReasonType(o.api_decision_reason)),
        ("api_lifecycle_snapshot", printFactory_Dispatch_CoordinatorDispatch_LifecycleType(o.api_lifecycle_snapshot))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P""""),
        ("api_dispatch_status", printFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS""""),
        ("api_dispatch_status", printFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_request_qualifier_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_request_qualifier_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_request_qualifier_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_request_qualifier_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_request_qualifier_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_request_qualifier_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_inventory_qualifier_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_inventory_qualifier_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_inventory_qualifier_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_inventory_qualifier_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_inventory_qualifier_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_inventory_qualifier_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dock_qualifier_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dock_qualifier_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dock_qualifier_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dock_qualifier_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dock_qualifier_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dock_qualifier_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_outcome_recovery_classifier_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_outcome_recovery_classifier_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_outcome_recovery_classifier_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_outcome_recovery_classifier_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_outcome_recovery_classifier_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_outcome_recovery_classifier_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dispatch_priority_resolver_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dispatch_priority_resolver_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dispatch_priority_resolver_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dispatch_priority_resolver_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dispatch_priority_resolver_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_dispatch_priority_resolver_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_release_arbiter_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_release_arbiter_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_release_arbiter_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_release_arbiter_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_release_arbiter_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_release_arbiter_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_commitment_tracker_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_commitment_tracker_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_commitment_tracker_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_commitment_tracker_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_commitment_tracker_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_commitment_tracker_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_confirmation_determiner_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_confirmation_determiner_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_confirmation_determiner_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_confirmation_determiner_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_confirmation_determiner_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_confirmation_determiner_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_status_determiner_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_status_determiner_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_status_determiner_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_status_determiner_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_status_determiner_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordinator_process_status_determiner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Product_Id_Payload => return printFactory_Dispatch_CoordinatorProduct_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Id_Payload => return printFactory_Dispatch_CoordinatorRequest_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Plan_Payload => return printFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload => return printFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Result_Payload => return printFactory_Dispatch_CoordinatorOutcome_Result_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload => return printFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Capacity_Amount_Payload => return printFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Assessment_Payload => return printFactory_Dispatch_CoordinatorDock_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Context_Attempt_Payload => return printFactory_Dispatch_CoordinatorContext_Attempt_Payload(o)
        case o: Factory_Dispatch_Coordinator.Selected_Intent_Payload => return printFactory_Dispatch_CoordinatorSelected_Intent_Payload(o)
        case o: Factory_Dispatch_Coordinator.Decision_Reason_Payload => return printFactory_Dispatch_CoordinatorDecision_Reason_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload => return printFactory_Dispatch_CoordinatorDispatch_Status_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Amount_Payload => return printFactory_Dispatch_CoordinatorInventory_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Amount_Payload => return printFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Disposition_Payload => return printFactory_Dispatch_CoordinatorDock_Disposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload => return printFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o)
        case o: Factory_Dispatch_Coordinator.Instruction_Kind_Payload => return printFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Freshness_Payload => return printFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload => return printFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o)
        case o: Factory_Dispatch_Coordinator.Execution_Outcome_Payload => return printFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload => return printFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o)
        case o: Factory_Dispatch_Coordinator.Context_Request_Id_Payload => return printFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload => return printFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o)
        case o: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload => return printFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload => return printFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload => return printFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o)
        case o: Factory_Dispatch_Coordinator.Observation_Validity_Payload => return printFactory_Dispatch_CoordinatorObservation_Validity_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload => return printFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload => return printFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload => return printFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Admission_Assessment_Payload => return printFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Context_Payload => return printFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload => return printFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o)
        case o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload => return printFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload => return printFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload => return printFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o)
        case o: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload => return printFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload => return printFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o)
        case o: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload => return printFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload => return printFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o)
        case o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload => return printFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload => return printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o)
        case o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload => return printFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o)
        case o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload => return printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o)
        case o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload => return printFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
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

    def parseFactory_Dispatch_CoordinatorRequest_IdType(): Factory_Dispatch_Coordinator.Request_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorRequest_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Request_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Request_Id.")
          return Factory_Dispatch_Coordinator.Request_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Id_Payload(): Factory_Dispatch_Coordinator.Request_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorProduct_IdType(): Factory_Dispatch_Coordinator.Product_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorProduct_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProduct_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Product_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Product_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Product_Id.")
          return Factory_Dispatch_Coordinator.Product_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorProduct_Id_Payload(): Factory_Dispatch_Coordinator.Product_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorProduct_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProduct_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Product_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Product_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_AmountType(): Factory_Dispatch_Coordinator.Dispatch_Amount.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_AmountT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_AmountT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Amount.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Amount")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Amount.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Amount.")
          return Factory_Dispatch_Coordinator.Dispatch_Amount.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Amount_Payload(): Factory_Dispatch_Coordinator.Dispatch_Amount_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Amount_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Amount_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Amount_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Amount_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRequest_FreshnessType(): Factory_Dispatch_Coordinator.Request_Freshness.Type = {
      val r = parseFactory_Dispatch_CoordinatorRequest_FreshnessT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_FreshnessT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Freshness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Freshness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Request_Freshness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Request_Freshness.")
          return Factory_Dispatch_Coordinator.Request_Freshness.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Freshness_Payload(): Factory_Dispatch_Coordinator.Request_Freshness_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Freshness_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Freshness_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Freshness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Freshness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRequest_FreshnessType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Freshness_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorAdmission_AssessmentType(): Factory_Dispatch_Coordinator.Admission_Assessment.Type = {
      val r = parseFactory_Dispatch_CoordinatorAdmission_AssessmentT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAdmission_AssessmentT(typeParsed: B): Factory_Dispatch_Coordinator.Admission_Assessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Admission_Assessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Admission_Assessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Admission_Assessment.")
          return Factory_Dispatch_Coordinator.Admission_Assessment.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(): Factory_Dispatch_Coordinator.Admission_Assessment_Payload = {
      val r = parseFactory_Dispatch_CoordinatorAdmission_Assessment_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAdmission_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Admission_Assessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Admission_Assessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Admission_Assessment_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorInventory_AmountType(): Factory_Dispatch_Coordinator.Inventory_Amount.Type = {
      val r = parseFactory_Dispatch_CoordinatorInventory_AmountT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_AmountT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Amount.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Amount")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Inventory_Amount.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Inventory_Amount.")
          return Factory_Dispatch_Coordinator.Inventory_Amount.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorInventory_Amount_Payload(): Factory_Dispatch_Coordinator.Inventory_Amount_Payload = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Amount_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Amount_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Amount_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorInventory_AmountType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Amount_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorObservation_ValidityType(): Factory_Dispatch_Coordinator.Observation_Validity.Type = {
      val r = parseFactory_Dispatch_CoordinatorObservation_ValidityT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorObservation_ValidityT(typeParsed: B): Factory_Dispatch_Coordinator.Observation_Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Observation_Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Observation_Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Observation_Validity.")
          return Factory_Dispatch_Coordinator.Observation_Validity.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorObservation_Validity_Payload(): Factory_Dispatch_Coordinator.Observation_Validity_Payload = {
      val r = parseFactory_Dispatch_CoordinatorObservation_Validity_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorObservation_Validity_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Observation_Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Observation_Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorObservation_ValidityType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Observation_Validity_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Product_IdType(): Factory_Dispatch_Coordinator.Inventory_Product_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Product_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Product_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Product_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Product_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Inventory_Product_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Inventory_Product_Id.")
          return Factory_Dispatch_Coordinator.Inventory_Product_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(): Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Product_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Product_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorInventory_Product_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_LifecycleType(): Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_LifecycleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_LifecycleT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Lifecycle")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Lifecycle.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Lifecycle.")
          return Factory_Dispatch_Coordinator.Dispatch_Lifecycle.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(): Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Lifecycle_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Lifecycle_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Request_IdType(): Factory_Dispatch_Coordinator.Capacity_Request_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorCapacity_Request_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Request_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Request_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Capacity_Request_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Capacity_Request_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Capacity_Request_Id.")
          return Factory_Dispatch_Coordinator.Capacity_Request_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(): Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCapacity_Request_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCapacity_Request_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Product_IdType(): Factory_Dispatch_Coordinator.Capacity_Product_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorCapacity_Product_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Product_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Product_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Capacity_Product_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Capacity_Product_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Capacity_Product_Id.")
          return Factory_Dispatch_Coordinator.Capacity_Product_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(): Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCapacity_Product_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Product_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCapacity_Product_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCapacity_AmountType(): Factory_Dispatch_Coordinator.Capacity_Amount.Type = {
      val r = parseFactory_Dispatch_CoordinatorCapacity_AmountT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapacity_AmountT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Amount.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Capacity_Amount")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Capacity_Amount.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Capacity_Amount.")
          return Factory_Dispatch_Coordinator.Capacity_Amount.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Amount_Payload(): Factory_Dispatch_Coordinator.Capacity_Amount_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCapacity_Amount_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCapacity_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Capacity_Amount_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Capacity_Amount_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCapacity_AmountType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Capacity_Amount_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type = {
      val r = parseFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentT(typeParsed: B): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.")
          return Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload = {
      val r = parseFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type = {
      val r = parseFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentT(typeParsed: B): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.")
          return Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Request_IdType(): Factory_Dispatch_Coordinator.Candidate_Request_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Request_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Request_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Request_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Request_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Candidate_Request_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Candidate_Request_Id.")
          return Factory_Dispatch_Coordinator.Candidate_Request_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(): Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Request_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCandidate_Request_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Product_IdType(): Factory_Dispatch_Coordinator.Candidate_Product_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Product_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Product_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Product_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Product_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Candidate_Product_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Candidate_Product_Id.")
          return Factory_Dispatch_Coordinator.Candidate_Product_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(): Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Product_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Product_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCandidate_Product_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCandidate_AmountType(): Factory_Dispatch_Coordinator.Candidate_Amount.Type = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_AmountT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_AmountT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Amount.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Amount")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Candidate_Amount.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Candidate_Amount.")
          return Factory_Dispatch_Coordinator.Candidate_Amount.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Amount_Payload(): Factory_Dispatch_Coordinator.Candidate_Amount_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Amount_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Amount_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Amount_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Amount_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCandidate_AmountType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Candidate_Amount_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCandidate_LifecycleType(): Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_LifecycleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_LifecycleT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Lifecycle")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Candidate_Lifecycle.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Candidate_Lifecycle.")
          return Factory_Dispatch_Coordinator.Candidate_Lifecycle.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(): Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Lifecycle_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Lifecycle_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCandidate_LifecycleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDock_DispositionType(): Factory_Dispatch_Coordinator.Dock_Disposition.Type = {
      val r = parseFactory_Dispatch_CoordinatorDock_DispositionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_DispositionT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Disposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Disposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dock_Disposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dock_Disposition.")
          return Factory_Dispatch_Coordinator.Dock_Disposition.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDock_Disposition_Payload(): Factory_Dispatch_Coordinator.Dock_Disposition_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDock_Disposition_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_Disposition_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Disposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Disposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDock_DispositionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Disposition_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDock_AssessmentType(): Factory_Dispatch_Coordinator.Dock_Assessment.Type = {
      val r = parseFactory_Dispatch_CoordinatorDock_AssessmentT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_AssessmentT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Assessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Assessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dock_Assessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dock_Assessment.")
          return Factory_Dispatch_Coordinator.Dock_Assessment.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDock_Assessment_Payload(): Factory_Dispatch_Coordinator.Dock_Assessment_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDock_Assessment_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_Assessment_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Assessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Assessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDock_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Assessment_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_AttemptType(): Factory_Dispatch_Coordinator.Dispatch_Attempt.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_AttemptT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_AttemptT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Attempt.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Attempt")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Attempt.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Attempt.")
          return Factory_Dispatch_Coordinator.Dispatch_Attempt.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(): Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Attempt_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Attempt_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_AttemptType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_ResultType(): Factory_Dispatch_Coordinator.Outcome_Result.Type = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_ResultT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_ResultT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Result.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Result")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Outcome_Result.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Outcome_Result.")
          return Factory_Dispatch_Coordinator.Outcome_Result.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Result_Payload(): Factory_Dispatch_Coordinator.Outcome_Result_Payload = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Result_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Result_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Result_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Result_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorOutcome_ResultType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Result_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorContext_Request_IdType(): Factory_Dispatch_Coordinator.Context_Request_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorContext_Request_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorContext_Request_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Context_Request_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Context_Request_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Context_Request_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Context_Request_Id.")
          return Factory_Dispatch_Coordinator.Context_Request_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorContext_Request_Id_Payload(): Factory_Dispatch_Coordinator.Context_Request_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorContext_Request_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorContext_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Context_Request_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Context_Request_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorContext_Request_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Context_Request_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorContext_AttemptType(): Factory_Dispatch_Coordinator.Context_Attempt.Type = {
      val r = parseFactory_Dispatch_CoordinatorContext_AttemptT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorContext_AttemptT(typeParsed: B): Factory_Dispatch_Coordinator.Context_Attempt.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Context_Attempt")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Context_Attempt.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Context_Attempt.")
          return Factory_Dispatch_Coordinator.Context_Attempt.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorContext_Attempt_Payload(): Factory_Dispatch_Coordinator.Context_Attempt_Payload = {
      val r = parseFactory_Dispatch_CoordinatorContext_Attempt_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorContext_Attempt_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Context_Attempt_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Context_Attempt_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorContext_AttemptType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Context_Attempt_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_PlanType(): Factory_Dispatch_Coordinator.Outcome_Plan.Type = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_PlanT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_PlanT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Plan.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Plan")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Outcome_Plan.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Outcome_Plan.")
          return Factory_Dispatch_Coordinator.Outcome_Plan.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Plan_Payload(): Factory_Dispatch_Coordinator.Outcome_Plan_Payload = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Plan_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Plan_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Plan_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Plan_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Plan_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Outcome_Class")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.")
          return Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Request_IdType(): Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Request_IdT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Request_IdT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Request_Id")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Confirmation_Request_Id.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Confirmation_Request_Id.")
          return Factory_Dispatch_Coordinator.Confirmation_Request_Id.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(): Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Request_Id_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Request_Id_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorConfirmation_Request_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorSelected_IntentType(): Factory_Dispatch_Coordinator.Selected_Intent.Type = {
      val r = parseFactory_Dispatch_CoordinatorSelected_IntentT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorSelected_IntentT(typeParsed: B): Factory_Dispatch_Coordinator.Selected_Intent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Selected_Intent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Selected_Intent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Selected_Intent.")
          return Factory_Dispatch_Coordinator.Selected_Intent.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorSelected_Intent_Payload(): Factory_Dispatch_Coordinator.Selected_Intent_Payload = {
      val r = parseFactory_Dispatch_CoordinatorSelected_Intent_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorSelected_Intent_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Selected_Intent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Selected_Intent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorSelected_IntentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Selected_Intent_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_KindType(): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_KindT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_KindT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision_Kind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.")
          return Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Kind_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Kind_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Decision_KindType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDecision_ReasonType(): Factory_Dispatch_Coordinator.Decision_Reason.Type = {
      val r = parseFactory_Dispatch_CoordinatorDecision_ReasonT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDecision_ReasonT(typeParsed: B): Factory_Dispatch_Coordinator.Decision_Reason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Decision_Reason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Decision_Reason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Decision_Reason.")
          return Factory_Dispatch_Coordinator.Decision_Reason.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDecision_Reason_Payload(): Factory_Dispatch_Coordinator.Decision_Reason_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDecision_Reason_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDecision_Reason_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Decision_Reason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Decision_Reason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDecision_ReasonType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Decision_Reason_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorInstruction_KindType(): Factory_Dispatch_Coordinator.Instruction_Kind.Type = {
      val r = parseFactory_Dispatch_CoordinatorInstruction_KindT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInstruction_KindT(typeParsed: B): Factory_Dispatch_Coordinator.Instruction_Kind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Instruction_Kind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Instruction_Kind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Instruction_Kind.")
          return Factory_Dispatch_Coordinator.Instruction_Kind.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorInstruction_Kind_Payload(): Factory_Dispatch_Coordinator.Instruction_Kind_Payload = {
      val r = parseFactory_Dispatch_CoordinatorInstruction_Kind_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInstruction_Kind_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Instruction_Kind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Instruction_Kind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorInstruction_KindType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Instruction_Kind_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_KindType(): Factory_Dispatch_Coordinator.Confirmation_Kind.Type = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_KindT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_KindT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Kind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Kind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Confirmation_Kind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Confirmation_Kind.")
          return Factory_Dispatch_Coordinator.Confirmation_Kind.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(): Factory_Dispatch_Coordinator.Confirmation_Kind_Payload = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Kind_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Kind_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Kind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Kind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorConfirmation_KindType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Kind_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_StatusType(): Factory_Dispatch_Coordinator.Dispatch_Status.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_StatusT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_StatusT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Status.")
          return Factory_Dispatch_Coordinator.Dispatch_Status.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Status_Payload(): Factory_Dispatch_Coordinator.Dispatch_Status_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Status_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request(): Factory_Dispatch_Coordinator.Raw_Dispatch_Request = {
      val r = parseFactory_Dispatch_CoordinatorRaw_Dispatch_RequestT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRaw_Dispatch_RequestT(typeParsed: B): Factory_Dispatch_Coordinator.Raw_Dispatch_Request = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Raw_Dispatch_Request")
      }
      parser.parseObjectKey("request_id")
      val request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("product_id")
      val product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("amount")
      val amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parseFactory_Dispatch_CoordinatorRequest_FreshnessType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Raw_Dispatch_Request(request_id, product_id, amount, freshness)
    }

    def parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(): Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorQualified_Request_Fact(): Factory_Dispatch_Coordinator.Qualified_Request_Fact = {
      val r = parseFactory_Dispatch_CoordinatorQualified_Request_FactT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualified_Request_FactT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Request_Fact = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Qualified_Request_Fact")
      }
      parser.parseObjectKey("assessment")
      val assessment = parseFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_id")
      val request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("product_id")
      val product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("amount")
      val amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parseFactory_Dispatch_CoordinatorRequest_FreshnessType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Qualified_Request_Fact(assessment, request_id, product_id, amount, freshness)
    }

    def parseFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(): Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload = {
      val r = parseFactory_Dispatch_CoordinatorQualified_Request_Fact_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualified_Request_Fact_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Inventory_SnapshotT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Inventory_SnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot")
      }
      parser.parseObjectKey("qty")
      val qty = parseFactory_Dispatch_CoordinatorInventory_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseFactory_Dispatch_CoordinatorObservation_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("pid")
      val pid = parseFactory_Dispatch_CoordinatorInventory_Product_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot(qty, validity, pid)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context(): Factory_Dispatch_Coordinator.Recovery_Qualification_Context = {
      val r = parseFactory_Dispatch_CoordinatorRecovery_Qualification_ContextT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Qualification_ContextT(typeParsed: B): Factory_Dispatch_Coordinator.Recovery_Qualification_Context = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Recovery_Qualification_Context")
      }
      parser.parseObjectKey("lifecycle")
      val lifecycle = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("stored_request_id")
      val stored_request_id = parseFactory_Dispatch_CoordinatorCapacity_Request_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("stored_product_id")
      val stored_product_id = parseFactory_Dispatch_CoordinatorCapacity_Product_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("stored_amount")
      val stored_amount = parseFactory_Dispatch_CoordinatorCapacity_AmountType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Recovery_Qualification_Context(lifecycle, stored_request_id, stored_product_id, stored_amount)
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(): Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Inventory_ReadinessT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Inventory_ReadinessT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness")
      }
      parser.parseObjectKey("fresh_assessment")
      val fresh_assessment = parseFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_assessment")
      val recovery_assessment = parseFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_request_id")
      val recovery_request_id = parseFactory_Dispatch_CoordinatorCandidate_Request_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_product_id")
      val recovery_product_id = parseFactory_Dispatch_CoordinatorCandidate_Product_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_amount")
      val recovery_amount = parseFactory_Dispatch_CoordinatorCandidate_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("lifecycle_capacity")
      val lifecycle_capacity = parseFactory_Dispatch_CoordinatorCandidate_LifecycleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness(fresh_assessment, recovery_assessment, recovery_request_id, recovery_product_id, recovery_amount, lifecycle_capacity)
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDock_Snapshot(): Factory_Dispatch_Coordinator.Dock_Snapshot = {
      val r = parseFactory_Dispatch_CoordinatorDock_SnapshotT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_SnapshotT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Snapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Snapshot")
      }
      parser.parseObjectKey("validity")
      val validity = parseFactory_Dispatch_CoordinatorObservation_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseFactory_Dispatch_CoordinatorDock_DispositionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Snapshot(validity, disposition)
    }

    def parseFactory_Dispatch_CoordinatorDock_Snapshot_Payload(): Factory_Dispatch_Coordinator.Dock_Snapshot_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDock_Snapshot_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_Snapshot_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Snapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Snapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDock_Snapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Snapshot_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorExecution_Outcome(): Factory_Dispatch_Coordinator.Execution_Outcome = {
      val r = parseFactory_Dispatch_CoordinatorExecution_OutcomeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecution_OutcomeT(typeParsed: B): Factory_Dispatch_Coordinator.Execution_Outcome = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Execution_Outcome")
      }
      parser.parseObjectKey("request_id")
      val request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("attempt")
      val attempt = parseFactory_Dispatch_CoordinatorDispatch_AttemptType()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parseFactory_Dispatch_CoordinatorOutcome_ResultType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Execution_Outcome(request_id, attempt, result)
    }

    def parseFactory_Dispatch_CoordinatorExecution_Outcome_Payload(): Factory_Dispatch_Coordinator.Execution_Outcome_Payload = {
      val r = parseFactory_Dispatch_CoordinatorExecution_Outcome_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorExecution_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Execution_Outcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Execution_Outcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorExecution_Outcome()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Execution_Outcome_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorActive_Execution_Context(): Factory_Dispatch_Coordinator.Active_Execution_Context = {
      val r = parseFactory_Dispatch_CoordinatorActive_Execution_ContextT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorActive_Execution_ContextT(typeParsed: B): Factory_Dispatch_Coordinator.Active_Execution_Context = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Active_Execution_Context")
      }
      parser.parseObjectKey("lifecycle")
      val lifecycle = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("active_request_id")
      val active_request_id = parseFactory_Dispatch_CoordinatorContext_Request_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("active_attempt")
      val active_attempt = parseFactory_Dispatch_CoordinatorContext_AttemptType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Active_Execution_Context(lifecycle, active_request_id, active_attempt)
    }

    def parseFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(): Factory_Dispatch_Coordinator.Active_Execution_Context_Payload = {
      val r = parseFactory_Dispatch_CoordinatorActive_Execution_Context_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorActive_Execution_Context_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Active_Execution_Context_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Active_Execution_Context_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorActive_Execution_Context()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Active_Execution_Context_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Context(): Factory_Dispatch_Coordinator.Confirmation_Context = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_ContextT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_ContextT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Context = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Context")
      }
      parser.parseObjectKey("classification")
      val classification = parseFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("confirmation_request_id")
      val confirmation_request_id = parseFactory_Dispatch_CoordinatorConfirmation_Request_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Context(classification, confirmation_request_id)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Context_Payload(): Factory_Dispatch_Coordinator.Confirmation_Context_Payload = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Context_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Context_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Context_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Context_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorConfirmation_Context()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Context_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision(): Factory_Dispatch_Coordinator.Dispatch_Decision = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_DecisionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_DecisionT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision")
      }
      parser.parseObjectKey("kind")
      val kind = parseFactory_Dispatch_CoordinatorDispatch_Decision_KindType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_id")
      val request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("product_id")
      val product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("amount")
      val amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Decision(kind, request_id, product_id, amount)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Payload(): Factory_Dispatch_Coordinator.Dispatch_Decision_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Decision()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorShipment_Instruction(): Factory_Dispatch_Coordinator.Shipment_Instruction = {
      val r = parseFactory_Dispatch_CoordinatorShipment_InstructionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_InstructionT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Instruction = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Instruction")
      }
      parser.parseObjectKey("kind")
      val kind = parseFactory_Dispatch_CoordinatorInstruction_KindType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_id")
      val request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("product_id")
      val product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("amount")
      val amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipment_Instruction(kind, request_id, product_id, amount)
    }

    def parseFactory_Dispatch_CoordinatorShipment_Instruction_Payload(): Factory_Dispatch_Coordinator.Shipment_Instruction_Payload = {
      val r = parseFactory_Dispatch_CoordinatorShipment_Instruction_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_Instruction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Instruction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Instruction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorShipment_Instruction()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipment_Instruction_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorShipping_Confirmation(): Factory_Dispatch_Coordinator.Shipping_Confirmation = {
      val r = parseFactory_Dispatch_CoordinatorShipping_ConfirmationT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipping_ConfirmationT(typeParsed: B): Factory_Dispatch_Coordinator.Shipping_Confirmation = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipping_Confirmation")
      }
      parser.parseObjectKey("kind")
      val kind = parseFactory_Dispatch_CoordinatorConfirmation_KindType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_id")
      val request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipping_Confirmation(kind, request_id)
    }

    def parseFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      val r = parseFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorShipping_Confirmation()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload(value)
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

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_request")
      val api_request = parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(api_request)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_request")
      val api_request = parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(api_request)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_arbiter_request_fact")
      val api_arbiter_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_inventory_request_fact")
      val api_inventory_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_admission")
      val api_priority_admission = parseFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(api_arbiter_request_fact, api_inventory_request_fact, api_priority_admission)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_arbiter_request_fact")
      val api_arbiter_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_inventory_request_fact")
      val api_inventory_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_admission")
      val api_priority_admission = parseFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(api_arbiter_request_fact, api_inventory_request_fact, api_priority_admission)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_inventory_snapshot")
      val api_inventory_snapshot = parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_context")
      val api_recovery_context = parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_fact")
      val api_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(api_inventory_snapshot, api_recovery_context, api_request_fact)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_inventory_snapshot")
      val api_inventory_snapshot = parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_context")
      val api_recovery_context = parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_fact")
      val api_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(api_inventory_snapshot, api_recovery_context, api_request_fact)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_candidate_readiness")
      val api_candidate_readiness = parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(api_candidate_readiness)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_candidate_readiness")
      val api_candidate_readiness = parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(api_candidate_readiness)
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_dock_snapshot")
      val api_dock_snapshot = parseFactory_Dispatch_CoordinatorDock_Snapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(api_dock_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dock_snapshot")
      val api_dock_snapshot = parseFactory_Dispatch_CoordinatorDock_Snapshot()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(api_dock_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseFactory_Dispatch_CoordinatorDock_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(api_assessment)
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_assessment")
      val api_assessment = parseFactory_Dispatch_CoordinatorDock_AssessmentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(api_assessment)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_execution_context")
      val api_execution_context = parseFactory_Dispatch_CoordinatorActive_Execution_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_execution_outcome")
      val api_execution_outcome = parseFactory_Dispatch_CoordinatorExecution_Outcome()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(api_execution_context, api_execution_outcome)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS")
      }
      parser.parseObjectKey("In_stored_transition_plan")
      val In_stored_transition_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_execution_context")
      val api_execution_context = parseFactory_Dispatch_CoordinatorActive_Execution_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_execution_outcome")
      val api_execution_outcome = parseFactory_Dispatch_CoordinatorExecution_Outcome()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(In_stored_transition_plan, api_execution_context, api_execution_outcome)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_confirmation_context")
      val api_confirmation_context = parseFactory_Dispatch_CoordinatorConfirmation_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_plan")
      val api_recovery_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transition_plan")
      val api_transition_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(api_confirmation_context, api_recovery_plan, api_transition_plan)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS")
      }
      parser.parseObjectKey("stored_transition_plan")
      val stored_transition_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_confirmation_context")
      val api_confirmation_context = parseFactory_Dispatch_CoordinatorConfirmation_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_plan")
      val api_recovery_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transition_plan")
      val api_transition_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(stored_transition_plan, api_confirmation_context, api_recovery_plan, api_transition_plan)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission")
      val api_admission = parseFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_plan")
      val api_recovery_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(api_admission, api_recovery_plan)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission")
      val api_admission = parseFactory_Dispatch_CoordinatorAdmission_AssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_plan")
      val api_recovery_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(api_admission, api_recovery_plan)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P")
      }
      parser.parseObjectKey("api_selected_intent")
      val api_selected_intent = parseFactory_Dispatch_CoordinatorSelected_IntentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(api_selected_intent)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS")
      }
      parser.parseObjectKey("api_selected_intent")
      val api_selected_intent = parseFactory_Dispatch_CoordinatorSelected_IntentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(api_selected_intent)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_candidate_readiness")
      val api_candidate_readiness = parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dock_assessment")
      val api_dock_assessment = parseFactory_Dispatch_CoordinatorDock_AssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_fact")
      val api_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_intent")
      val api_selected_intent = parseFactory_Dispatch_CoordinatorSelected_IntentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(api_candidate_readiness, api_dock_assessment, api_request_fact, api_selected_intent)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_candidate_readiness")
      val api_candidate_readiness = parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dock_assessment")
      val api_dock_assessment = parseFactory_Dispatch_CoordinatorDock_AssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_fact")
      val api_request_fact = parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_intent")
      val api_selected_intent = parseFactory_Dispatch_CoordinatorSelected_IntentType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(api_candidate_readiness, api_dock_assessment, api_request_fact, api_selected_intent)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_decision_reason")
      val api_decision_reason = parseFactory_Dispatch_CoordinatorDecision_ReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dispatch_decision")
      val api_dispatch_decision = parseFactory_Dispatch_CoordinatorDispatch_Decision()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(api_decision_reason, api_dispatch_decision)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_decision_reason")
      val api_decision_reason = parseFactory_Dispatch_CoordinatorDecision_ReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dispatch_decision")
      val api_dispatch_decision = parseFactory_Dispatch_CoordinatorDispatch_Decision()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(api_decision_reason, api_dispatch_decision)
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_decision")
      val api_dispatch_decision = parseFactory_Dispatch_CoordinatorDispatch_Decision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcome_plan")
      val api_outcome_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(api_dispatch_decision, api_outcome_plan)
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS")
      }
      parser.parseObjectKey("In_active_amount")
      val In_active_amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_active_attempt")
      val In_active_attempt = parseFactory_Dispatch_CoordinatorDispatch_AttemptType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_active_product_id")
      val In_active_product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_active_request_id")
      val In_active_request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_lifecycle")
      val In_lifecycle = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_shipment_instruction_amount")
      val In_shipment_instruction_amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_shipment_instruction_kind")
      val In_shipment_instruction_kind = parseFactory_Dispatch_CoordinatorInstruction_KindType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_shipment_instruction_product_id")
      val In_shipment_instruction_product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_shipment_instruction_request_id")
      val In_shipment_instruction_request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dispatch_decision")
      val api_dispatch_decision = parseFactory_Dispatch_CoordinatorDispatch_Decision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcome_plan")
      val api_outcome_plan = parseFactory_Dispatch_CoordinatorOutcome_PlanType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(In_active_amount, In_active_attempt, In_active_product_id, In_active_request_id, In_lifecycle, In_shipment_instruction_amount, In_shipment_instruction_kind, In_shipment_instruction_product_id, In_shipment_instruction_request_id, api_dispatch_decision, api_outcome_plan)
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P")
      }
      parser.parseObjectKey("api_execution_context")
      val api_execution_context = parseFactory_Dispatch_CoordinatorActive_Execution_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_snapshot")
      val api_lifecycle_snapshot = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_context")
      val api_recovery_context = parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipment_instruction")
      val api_shipment_instruction = parseFactory_Dispatch_CoordinatorShipment_Instruction()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(api_execution_context, api_lifecycle_snapshot, api_recovery_context, api_shipment_instruction)
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS")
      }
      parser.parseObjectKey("active_amount")
      val active_amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("active_attempt")
      val active_attempt = parseFactory_Dispatch_CoordinatorDispatch_AttemptType()
      parser.parseObjectNext()
      parser.parseObjectKey("active_product_id")
      val active_product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("active_request_id")
      val active_request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("lifecycle")
      val lifecycle = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("shipment_instruction_amount")
      val shipment_instruction_amount = parseFactory_Dispatch_CoordinatorDispatch_AmountType()
      parser.parseObjectNext()
      parser.parseObjectKey("shipment_instruction_kind")
      val shipment_instruction_kind = parseFactory_Dispatch_CoordinatorInstruction_KindType()
      parser.parseObjectNext()
      parser.parseObjectKey("shipment_instruction_product_id")
      val shipment_instruction_product_id = parseFactory_Dispatch_CoordinatorProduct_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("shipment_instruction_request_id")
      val shipment_instruction_request_id = parseFactory_Dispatch_CoordinatorRequest_IdType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_execution_context")
      val api_execution_context = parseFactory_Dispatch_CoordinatorActive_Execution_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_snapshot")
      val api_lifecycle_snapshot = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_context")
      val api_recovery_context = parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipment_instruction")
      val api_shipment_instruction = parseFactory_Dispatch_CoordinatorShipment_Instruction()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(active_amount, active_attempt, active_product_id, active_request_id, lifecycle, shipment_instruction_amount, shipment_instruction_kind, shipment_instruction_product_id, shipment_instruction_request_id, api_execution_context, api_lifecycle_snapshot, api_recovery_context, api_shipment_instruction)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P")
      }
      parser.parseObjectKey("api_confirmation_context")
      val api_confirmation_context = parseFactory_Dispatch_CoordinatorConfirmation_Context()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(api_confirmation_context)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_confirmation_context")
      val api_confirmation_context = parseFactory_Dispatch_CoordinatorConfirmation_Context()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(api_confirmation_context)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P")
      }
      parser.parseObjectKey("api_shipping_confirmation")
      val api_shipping_confirmation = parseFactory_Dispatch_CoordinatorShipping_Confirmation()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(api_shipping_confirmation)
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_shipping_confirmation")
      val api_shipping_confirmation = parseFactory_Dispatch_CoordinatorShipping_Confirmation()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(api_shipping_confirmation)
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P")
      }
      parser.parseObjectKey("api_decision_reason")
      val api_decision_reason = parseFactory_Dispatch_CoordinatorDecision_ReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_snapshot")
      val api_lifecycle_snapshot = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(api_decision_reason, api_lifecycle_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_decision_reason")
      val api_decision_reason = parseFactory_Dispatch_CoordinatorDecision_ReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_snapshot")
      val api_lifecycle_snapshot = parseFactory_Dispatch_CoordinatorDispatch_LifecycleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(api_decision_reason, api_lifecycle_snapshot)
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_status")
      val api_dispatch_status = parseFactory_Dispatch_CoordinatorDispatch_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(api_dispatch_status)
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_status")
      val api_dispatch_status = parseFactory_Dispatch_CoordinatorDispatch_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(api_dispatch_status)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Factory_Dispatch_Coordinator.Product_Id_Payload", "Factory_Dispatch_Coordinator.Request_Id_Payload", "Factory_Dispatch_Coordinator.Outcome_Plan_Payload", "Factory_Dispatch_Coordinator.Dock_Snapshot_Payload", "Factory_Dispatch_Coordinator.Outcome_Result_Payload", "Factory_Dispatch_Coordinator.Dispatch_Amount_Payload", "Factory_Dispatch_Coordinator.Capacity_Amount_Payload", "Factory_Dispatch_Coordinator.Dock_Assessment_Payload", "Factory_Dispatch_Coordinator.Context_Attempt_Payload", "Factory_Dispatch_Coordinator.Selected_Intent_Payload", "Factory_Dispatch_Coordinator.Decision_Reason_Payload", "Factory_Dispatch_Coordinator.Dispatch_Status_Payload", "Factory_Dispatch_Coordinator.Inventory_Amount_Payload", "Factory_Dispatch_Coordinator.Candidate_Amount_Payload", "Factory_Dispatch_Coordinator.Dock_Disposition_Payload", "Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload", "Factory_Dispatch_Coordinator.Instruction_Kind_Payload", "Factory_Dispatch_Coordinator.Request_Freshness_Payload", "Factory_Dispatch_Coordinator.Confirmation_Kind_Payload", "Factory_Dispatch_Coordinator.Execution_Outcome_Payload", "Factory_Dispatch_Coordinator.Dispatch_Decision_Payload", "Factory_Dispatch_Coordinator.Context_Request_Id_Payload", "Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload", "Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload", "Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload", "Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload", "Factory_Dispatch_Coordinator.Observation_Validity_Payload", "Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload", "Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload", "Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload", "Factory_Dispatch_Coordinator.Admission_Assessment_Payload", "Factory_Dispatch_Coordinator.Confirmation_Context_Payload", "Factory_Dispatch_Coordinator.Shipment_Instruction_Payload", "Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload", "Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload", "Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload", "Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload", "Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload", "Factory_Dispatch_Coordinator.Active_Execution_Context_Payload", "Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload", "Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload", "Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload", "Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload", "Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload", "Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P", "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P", "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P", "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P", "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS"))
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
        case "Factory_Dispatch_Coordinator.Product_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorProduct_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorRequest_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Plan_Payload" => val r = parseFactory_Dispatch_CoordinatorOutcome_Plan_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Snapshot_Payload" => val r = parseFactory_Dispatch_CoordinatorDock_Snapshot_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Result_Payload" => val r = parseFactory_Dispatch_CoordinatorOutcome_Result_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Amount_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Amount_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Capacity_Amount_Payload" => val r = parseFactory_Dispatch_CoordinatorCapacity_Amount_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Assessment_Payload" => val r = parseFactory_Dispatch_CoordinatorDock_Assessment_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Context_Attempt_Payload" => val r = parseFactory_Dispatch_CoordinatorContext_Attempt_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Selected_Intent_Payload" => val r = parseFactory_Dispatch_CoordinatorSelected_Intent_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Decision_Reason_Payload" => val r = parseFactory_Dispatch_CoordinatorDecision_Reason_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Status_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Amount_Payload" => val r = parseFactory_Dispatch_CoordinatorInventory_Amount_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Candidate_Amount_Payload" => val r = parseFactory_Dispatch_CoordinatorCandidate_Amount_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Disposition_Payload" => val r = parseFactory_Dispatch_CoordinatorDock_Disposition_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Attempt_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Instruction_Kind_Payload" => val r = parseFactory_Dispatch_CoordinatorInstruction_Kind_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Freshness_Payload" => val r = parseFactory_Dispatch_CoordinatorRequest_Freshness_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Kind_Payload" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Kind_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Execution_Outcome_Payload" => val r = parseFactory_Dispatch_CoordinatorExecution_Outcome_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Context_Request_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorContext_Request_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Lifecycle_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorCapacity_Product_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorCapacity_Request_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload" => val r = parseFactory_Dispatch_CoordinatorCandidate_Lifecycle_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Observation_Validity_Payload" => val r = parseFactory_Dispatch_CoordinatorObservation_Validity_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorInventory_Product_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorCandidate_Product_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorCandidate_Request_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Admission_Assessment_Payload" => val r = parseFactory_Dispatch_CoordinatorAdmission_Assessment_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Context_Payload" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Context_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Shipment_Instruction_Payload" => val r = parseFactory_Dispatch_CoordinatorShipment_Instruction_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload" => val r = parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload" => val r = parseFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Kind_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload" => val r = parseFactory_Dispatch_CoordinatorQualified_Request_Fact_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Request_Id_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Active_Execution_Context_Payload" => val r = parseFactory_Dispatch_CoordinatorActive_Execution_Context_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload" => val r = parseFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload" => val r = parseFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload" => val r = parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload" => val r = parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PST(T); return r
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

  def fromFactory_Dispatch_CoordinatorRequest_Id_Payload(o: Factory_Dispatch_Coordinator.Request_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Request_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Request_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Id_Payload(o: Factory_Dispatch_Coordinator.Product_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProduct_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProduct_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Product_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Product_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorProduct_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProduct_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Amount_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Amount_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Amount_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Amount_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Amount_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Amount_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o: Factory_Dispatch_Coordinator.Request_Freshness_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Freshness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Freshness_Payload(s: String): Either[Factory_Dispatch_Coordinator.Request_Freshness_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Freshness_Payload(parser: Parser): Factory_Dispatch_Coordinator.Request_Freshness_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Freshness_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Freshness_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o: Factory_Dispatch_Coordinator.Admission_Assessment_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(s: String): Either[Factory_Dispatch_Coordinator.Admission_Assessment_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAdmission_Assessment_Payload(parser: Parser): Factory_Dispatch_Coordinator.Admission_Assessment_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorAdmission_Assessment_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAdmission_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Amount_Payload(o: Factory_Dispatch_Coordinator.Inventory_Amount_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Amount_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Amount_Payload(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Amount_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Amount_Payload(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Amount_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Amount_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorObservation_Validity_Payload(o: Factory_Dispatch_Coordinator.Observation_Validity_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorObservation_Validity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorObservation_Validity_Payload(s: String): Either[Factory_Dispatch_Coordinator.Observation_Validity_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorObservation_Validity_Payload(parser: Parser): Factory_Dispatch_Coordinator.Observation_Validity_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorObservation_Validity_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorObservation_Validity_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Product_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Product_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Product_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o: Factory_Dispatch_Coordinator.Capacity_Amount_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCapacity_Amount_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCapacity_Amount_Payload(s: String): Either[Factory_Dispatch_Coordinator.Capacity_Amount_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCapacity_Amount_Payload(parser: Parser): Factory_Dispatch_Coordinator.Capacity_Amount_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCapacity_Amount_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCapacity_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(s: String): Either[Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(parser: Parser): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(s: String): Either[Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(parser: Parser): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o: Factory_Dispatch_Coordinator.Candidate_Amount_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCandidate_Amount_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCandidate_Amount_Payload(s: String): Either[Factory_Dispatch_Coordinator.Candidate_Amount_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Amount_Payload(parser: Parser): Factory_Dispatch_Coordinator.Candidate_Amount_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCandidate_Amount_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCandidate_Amount_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(s: String): Either[Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(parser: Parser): Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dock_Disposition_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Disposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Disposition_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dock_Disposition_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Disposition_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dock_Disposition_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Disposition_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Disposition_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Assessment_Payload(o: Factory_Dispatch_Coordinator.Dock_Assessment_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Assessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Assessment_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dock_Assessment_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Assessment_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dock_Assessment_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Assessment_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Assessment_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Attempt_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Attempt_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Attempt_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Result_Payload(o: Factory_Dispatch_Coordinator.Outcome_Result_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Result_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Result_Payload(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Result_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Result_Payload(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Result_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Result_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Result_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Context_Request_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorContext_Request_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorContext_Request_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Context_Request_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorContext_Request_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Context_Request_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorContext_Request_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorContext_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorContext_Attempt_Payload(o: Factory_Dispatch_Coordinator.Context_Attempt_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorContext_Attempt_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorContext_Attempt_Payload(s: String): Either[Factory_Dispatch_Coordinator.Context_Attempt_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorContext_Attempt_Payload(parser: Parser): Factory_Dispatch_Coordinator.Context_Attempt_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorContext_Attempt_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorContext_Attempt_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o: Factory_Dispatch_Coordinator.Outcome_Plan_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Plan_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Plan_Payload(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Plan_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Plan_Payload(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Plan_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Plan_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Plan_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorSelected_Intent_Payload(o: Factory_Dispatch_Coordinator.Selected_Intent_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorSelected_Intent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorSelected_Intent_Payload(s: String): Either[Factory_Dispatch_Coordinator.Selected_Intent_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorSelected_Intent_Payload(parser: Parser): Factory_Dispatch_Coordinator.Selected_Intent_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorSelected_Intent_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorSelected_Intent_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDecision_Reason_Payload(o: Factory_Dispatch_Coordinator.Decision_Reason_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDecision_Reason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDecision_Reason_Payload(s: String): Either[Factory_Dispatch_Coordinator.Decision_Reason_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDecision_Reason_Payload(parser: Parser): Factory_Dispatch_Coordinator.Decision_Reason_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDecision_Reason_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDecision_Reason_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o: Factory_Dispatch_Coordinator.Instruction_Kind_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInstruction_Kind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInstruction_Kind_Payload(s: String): Either[Factory_Dispatch_Coordinator.Instruction_Kind_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInstruction_Kind_Payload(parser: Parser): Factory_Dispatch_Coordinator.Instruction_Kind_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorInstruction_Kind_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInstruction_Kind_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Kind_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Kind_Payload(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Kind_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Kind_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Kind_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Status_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Status_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Status_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Status_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Status_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Status_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Status_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRaw_Dispatch_Request(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRaw_Dispatch_Request(s: String): Either[Factory_Dispatch_Coordinator.Raw_Dispatch_Request, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRaw_Dispatch_Request(parser: Parser): Factory_Dispatch_Coordinator.Raw_Dispatch_Request = {
      val r = parser.parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRaw_Dispatch_Request _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(s: String): Either[Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(parser: Parser): Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualified_Request_Fact(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQualified_Request_Fact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQualified_Request_Fact(s: String): Either[Factory_Dispatch_Coordinator.Qualified_Request_Fact, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Request_Fact(parser: Parser): Factory_Dispatch_Coordinator.Qualified_Request_Fact = {
      val r = parser.parseFactory_Dispatch_CoordinatorQualified_Request_Fact()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQualified_Request_Fact _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(s: String): Either[Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload(parser: Parser): Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecovery_Qualification_Context(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecovery_Qualification_Context(s: String): Either[Factory_Dispatch_Coordinator.Recovery_Qualification_Context, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecovery_Qualification_Context(parser: Parser): Factory_Dispatch_Coordinator.Recovery_Qualification_Context = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecovery_Qualification_Context _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(s: String): Either[Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(parser: Parser): Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(s: String): Either[Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness(parser: Parser): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness = {
      val r = parser.parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(s: String): Either[Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(parser: Parser): Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Snapshot(o: Factory_Dispatch_Coordinator.Dock_Snapshot, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Snapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Snapshot(s: String): Either[Factory_Dispatch_Coordinator.Dock_Snapshot, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Snapshot(parser: Parser): Factory_Dispatch_Coordinator.Dock_Snapshot = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Snapshot()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Snapshot _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Snapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Snapshot_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dock_Snapshot_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Snapshot_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dock_Snapshot_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Snapshot_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Snapshot_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecution_Outcome(o: Factory_Dispatch_Coordinator.Execution_Outcome, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecution_Outcome(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecution_Outcome(s: String): Either[Factory_Dispatch_Coordinator.Execution_Outcome, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecution_Outcome(parser: Parser): Factory_Dispatch_Coordinator.Execution_Outcome = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecution_Outcome()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecution_Outcome _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o: Factory_Dispatch_Coordinator.Execution_Outcome_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorExecution_Outcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorExecution_Outcome_Payload(s: String): Either[Factory_Dispatch_Coordinator.Execution_Outcome_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorExecution_Outcome_Payload(parser: Parser): Factory_Dispatch_Coordinator.Execution_Outcome_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorExecution_Outcome_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorExecution_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActive_Execution_Context(o: Factory_Dispatch_Coordinator.Active_Execution_Context, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActive_Execution_Context(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActive_Execution_Context(s: String): Either[Factory_Dispatch_Coordinator.Active_Execution_Context, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActive_Execution_Context(parser: Parser): Factory_Dispatch_Coordinator.Active_Execution_Context = {
      val r = parser.parseFactory_Dispatch_CoordinatorActive_Execution_Context()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActive_Execution_Context _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(s: String): Either[Factory_Dispatch_Coordinator.Active_Execution_Context_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorActive_Execution_Context_Payload(parser: Parser): Factory_Dispatch_Coordinator.Active_Execution_Context_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorActive_Execution_Context_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorActive_Execution_Context_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Context(o: Factory_Dispatch_Coordinator.Confirmation_Context, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Context(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Context(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Context, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Context(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Context = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Context()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Context _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o: Factory_Dispatch_Coordinator.Confirmation_Context_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Context_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Context_Payload(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Context_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Context_Payload(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Context_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Context_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Context_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision(o: Factory_Dispatch_Coordinator.Dispatch_Decision, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Instruction(o: Factory_Dispatch_Coordinator.Shipment_Instruction, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorShipment_Instruction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorShipment_Instruction(s: String): Either[Factory_Dispatch_Coordinator.Shipment_Instruction, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Instruction(parser: Parser): Factory_Dispatch_Coordinator.Shipment_Instruction = {
      val r = parser.parseFactory_Dispatch_CoordinatorShipment_Instruction()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorShipment_Instruction _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorShipment_Instruction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorShipment_Instruction_Payload(s: String): Either[Factory_Dispatch_Coordinator.Shipment_Instruction_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Instruction_Payload(parser: Parser): Factory_Dispatch_Coordinator.Shipment_Instruction_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorShipment_Instruction_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorShipment_Instruction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipping_Confirmation(o: Factory_Dispatch_Coordinator.Shipping_Confirmation, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorShipping_Confirmation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorShipping_Confirmation(s: String): Either[Factory_Dispatch_Coordinator.Shipping_Confirmation, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipping_Confirmation(parser: Parser): Factory_Dispatch_Coordinator.Shipping_Confirmation = {
      val r = parser.parseFactory_Dispatch_CoordinatorShipping_Confirmation()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorShipping_Confirmation _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(s: String): Either[Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(parser: Parser): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorShipping_Confirmation_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorShipping_Confirmation_Payload _)
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

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS _)
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