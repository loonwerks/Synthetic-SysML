// #Sireum
// @formatter:off

// This file is auto-generated from Request_Arrival_Sample.scala, Arrival_Fact.scala, Shipment_Result_Sample.scala, Registry_Instruction.scala, Pending_Request_View.scala, Request_Value.scala, Registry_Outcome.scala, Angle_A_Stock_Band.scala, Angle_B_Stock_Band.scala, Input_Status.scala, Inventory_Finding.scala, Dispatch_Readiness.scala, Shipment_Release_Directive.scala, Dispatch_Disposition.scala, Customer_Dispatch_Notice.scala, Dispatch_Candidate.scala, Inventory_Sample.scala, Dispatch_Readiness_Sample.scala, Base_Types.scala, Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala, Request_Registry_dispatch_coordination_process_request_registry_Containers.scala, Inventory_Assessment_dispatch_coordination_process_inventory_assessment_Containers.scala, Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_Containers.scala, Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o: Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.No_Arrival => "No_Arrival"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R1_AngleA_One => "Invalid_R1_AngleA_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R1_AngleA_Two => "Invalid_R1_AngleA_Two"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R1_AngleB_One => "Invalid_R1_AngleB_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R1_AngleB_Two => "Invalid_R1_AngleB_Two"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R2_AngleA_One => "Invalid_R2_AngleA_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R2_AngleA_Two => "Invalid_R2_AngleA_Two"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R2_AngleB_One => "Invalid_R2_AngleB_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Invalid_R2_AngleB_Two => "Invalid_R2_AngleB_Two"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R1_AngleA_One => "Valid_R1_AngleA_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R1_AngleA_Two => "Valid_R1_AngleA_Two"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R1_AngleB_One => "Valid_R1_AngleB_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R1_AngleB_Two => "Valid_R1_AngleB_Two"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R2_AngleA_One => "Valid_R2_AngleA_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R2_AngleA_Two => "Valid_R2_AngleA_Two"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R2_AngleB_One => "Valid_R2_AngleB_One"
        case Factory_Dispatch_Coordinator.Request_Arrival_Sample.Valid_R2_AngleB_Two => "Valid_R2_AngleB_Two"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Request_Arrival_Sample")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorArrival_FactType(o: Factory_Dispatch_Coordinator.Arrival_Fact.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Arrival_Fact.No_Arrival_Fact => "No_Arrival_Fact"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Invalid_Arrival => "Invalid_Arrival"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleA_One => "Valid_R1_AngleA_One"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleA_Two => "Valid_R1_AngleA_Two"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleB_One => "Valid_R1_AngleB_One"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleB_Two => "Valid_R1_AngleB_Two"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleA_One => "Valid_R2_AngleA_One"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleA_Two => "Valid_R2_AngleA_Two"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleB_One => "Valid_R2_AngleB_One"
        case Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleB_Two => "Valid_R2_AngleB_Two"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Arrival_Fact")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorArrival_Fact_Payload(o: Factory_Dispatch_Coordinator.Arrival_Fact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Arrival_Fact_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorArrival_FactType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipment_Result_SampleType(o: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.No_Result => "No_Result"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Invalid_R1_Succeeded => "Invalid_R1_Succeeded"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Invalid_R1_Failed => "Invalid_R1_Failed"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Invalid_R2_Succeeded => "Invalid_R2_Succeeded"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Invalid_R2_Failed => "Invalid_R2_Failed"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Valid_R1_Succeeded => "Valid_R1_Succeeded"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Valid_R1_Failed => "Valid_R1_Failed"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Valid_R2_Succeeded => "Valid_R2_Succeeded"
        case Factory_Dispatch_Coordinator.Shipment_Result_Sample.Valid_R2_Failed => "Valid_R2_Failed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Shipment_Result_Sample")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorShipment_Result_SampleType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRegistry_InstructionType(o: Factory_Dispatch_Coordinator.Registry_Instruction.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Registry_Instruction.No_State_Instruction => "No_State_Instruction"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R1_AngleA_One => "Mark_Submitted_R1_AngleA_One"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R1_AngleA_Two => "Mark_Submitted_R1_AngleA_Two"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R1_AngleB_One => "Mark_Submitted_R1_AngleB_One"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R1_AngleB_Two => "Mark_Submitted_R1_AngleB_Two"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R2_AngleA_One => "Mark_Submitted_R2_AngleA_One"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R2_AngleA_Two => "Mark_Submitted_R2_AngleA_Two"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R2_AngleB_One => "Mark_Submitted_R2_AngleB_One"
        case Factory_Dispatch_Coordinator.Registry_Instruction.Mark_Submitted_R2_AngleB_Two => "Mark_Submitted_R2_AngleB_Two"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Registry_Instruction")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o: Factory_Dispatch_Coordinator.Registry_Instruction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Registry_Instruction_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRegistry_InstructionType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPending_Request_ViewType(o: Factory_Dispatch_Coordinator.Pending_Request_View.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Pending_Request_View.No_Pending_Request => "No_Pending_Request"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R1_AngleA_One => "Pending_R1_AngleA_One"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R1_AngleA_Two => "Pending_R1_AngleA_Two"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R1_AngleB_One => "Pending_R1_AngleB_One"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R1_AngleB_Two => "Pending_R1_AngleB_Two"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R2_AngleA_One => "Pending_R2_AngleA_One"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R2_AngleA_Two => "Pending_R2_AngleA_Two"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R2_AngleB_One => "Pending_R2_AngleB_One"
        case Factory_Dispatch_Coordinator.Pending_Request_View.Pending_R2_AngleB_Two => "Pending_R2_AngleB_Two"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Pending_Request_View")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorPending_Request_View_Payload(o: Factory_Dispatch_Coordinator.Pending_Request_View_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Pending_Request_View_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorPending_Request_ViewType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_ValueType(o: Factory_Dispatch_Coordinator.Request_Value.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Request_Value.No_Request => "No_Request"
        case Factory_Dispatch_Coordinator.Request_Value.R1_AngleA_One => "R1_AngleA_One"
        case Factory_Dispatch_Coordinator.Request_Value.R1_AngleA_Two => "R1_AngleA_Two"
        case Factory_Dispatch_Coordinator.Request_Value.R1_AngleB_One => "R1_AngleB_One"
        case Factory_Dispatch_Coordinator.Request_Value.R1_AngleB_Two => "R1_AngleB_Two"
        case Factory_Dispatch_Coordinator.Request_Value.R2_AngleA_One => "R2_AngleA_One"
        case Factory_Dispatch_Coordinator.Request_Value.R2_AngleA_Two => "R2_AngleA_Two"
        case Factory_Dispatch_Coordinator.Request_Value.R2_AngleB_One => "R2_AngleB_One"
        case Factory_Dispatch_Coordinator.Request_Value.R2_AngleB_Two => "R2_AngleB_Two"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Request_Value")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Value_Payload(o: Factory_Dispatch_Coordinator.Request_Value_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Value_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRequest_ValueType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRegistry_OutcomeType(o: Factory_Dispatch_Coordinator.Registry_Outcome.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Registry_Outcome.No_Registry_Notice => "No_Registry_Notice"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Invalid_Event => "Invalid_Event"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Shipment_Confirmed => "Shipment_Confirmed"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Shipment_Failed_Retry_Pending => "Shipment_Failed_Retry_Pending"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Stale_Result => "Stale_Result"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Duplicate_Acknowledged => "Duplicate_Acknowledged"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Identifier_Conflict => "Identifier_Conflict"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Request_Accepted => "Request_Accepted"
        case Factory_Dispatch_Coordinator.Registry_Outcome.Busy => "Busy"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Registry_Outcome")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o: Factory_Dispatch_Coordinator.Registry_Outcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Registry_Outcome_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Zero => "Zero"
        case Factory_Dispatch_Coordinator.Angle_A_Stock_Band.One => "One"
        case Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Two_Or_More => "Two_Or_More"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Angle_A_Stock_Band")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Zero => "Zero"
        case Factory_Dispatch_Coordinator.Angle_B_Stock_Band.One => "One"
        case Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Two_Or_More => "Two_Or_More"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Angle_B_Stock_Band")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInput_StatusType(o: Factory_Dispatch_Coordinator.Input_Status.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Input_Status.Valid => "Valid"
        case Factory_Dispatch_Coordinator.Input_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Input_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInput_Status_Payload(o: Factory_Dispatch_Coordinator.Input_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Input_Status_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorInput_StatusType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_FindingType(o: Factory_Dispatch_Coordinator.Inventory_Finding.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Inventory_Finding.No_Demand => "No_Demand"
        case Factory_Dispatch_Coordinator.Inventory_Finding.Invalid_Inventory => "Invalid_Inventory"
        case Factory_Dispatch_Coordinator.Inventory_Finding.Sufficient => "Sufficient"
        case Factory_Dispatch_Coordinator.Inventory_Finding.Insufficient => "Insufficient"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Inventory_Finding")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Finding_Payload(o: Factory_Dispatch_Coordinator.Inventory_Finding_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Finding_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorInventory_FindingType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_ReadinessType(o: Factory_Dispatch_Coordinator.Dispatch_Readiness.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Readiness.Ready => "Ready"
        case Factory_Dispatch_Coordinator.Dispatch_Readiness.Not_Ready => "Not_Ready"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Readiness")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_ReadinessType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o: Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.No_Release => "No_Release"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R1_AngleA_One => "Release_R1_AngleA_One"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R1_AngleA_Two => "Release_R1_AngleA_Two"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R1_AngleB_One => "Release_R1_AngleB_One"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R1_AngleB_Two => "Release_R1_AngleB_Two"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R2_AngleA_One => "Release_R2_AngleA_One"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R2_AngleA_Two => "Release_R2_AngleA_Two"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R2_AngleB_One => "Release_R2_AngleB_One"
        case Factory_Dispatch_Coordinator.Shipment_Release_Directive.Release_R2_AngleB_Two => "Release_R2_AngleB_Two"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Shipment_Release_Directive")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_DispositionType(o: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.No_Dispatch_Demand => "No_Dispatch_Demand"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Event_Blocked => "Event_Blocked"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Recovery_Held => "Recovery_Held"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Inventory_Invalid => "Inventory_Invalid"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Readiness_Invalid => "Readiness_Invalid"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Waiting_Stock => "Waiting_Stock"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Waiting_Dispatch => "Waiting_Dispatch"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Release_Issued => "Release_Issued"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Disposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_DispositionType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.None => "None"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Invalid_Event => "Invalid_Event"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Request_Accepted => "Request_Accepted"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Duplicate_Acknowledged => "Duplicate_Acknowledged"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Identifier_Conflict => "Identifier_Conflict"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Busy => "Busy"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Stale_Result => "Stale_Result"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Inventory_Evidence_Invalid => "Inventory_Evidence_Invalid"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Readiness_Evidence_Invalid => "Readiness_Evidence_Invalid"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Waiting_For_Stock => "Waiting_For_Stock"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Waiting_For_Dispatch => "Waiting_For_Dispatch"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Release_Issued => "Release_Issued"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Shipment_Confirmed => "Shipment_Confirmed"
        case Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending => "Shipment_Failed_Retry_Pending"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Customer_Dispatch_Notice")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Candidate(o: Factory_Dispatch_Coordinator.Dispatch_Candidate): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Candidate""""),
        ("request", printFactory_Dispatch_CoordinatorRequest_ValueType(o.request)),
        ("event_blocked", printB(o.event_blocked)),
        ("recovery_hold", printB(o.recovery_hold))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Candidate(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Sample(o: Factory_Dispatch_Coordinator.Inventory_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Sample""""),
        ("stock_band_angle_a", printFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(o.stock_band_angle_a)),
        ("stock_band_angle_b", printFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(o.stock_band_angle_b)),
        ("status", printFactory_Dispatch_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Sample_Payload(o: Factory_Dispatch_Coordinator.Inventory_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Sample_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorInventory_Sample(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample""""),
        ("readiness", printFactory_Dispatch_CoordinatorDispatch_ReadinessType(o.readiness)),
        ("status", printFactory_Dispatch_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o.value))
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

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P""""),
        ("api_request_arrival", printFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o.api_request_arrival))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS""""),
        ("api_request_arrival", printFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o.api_request_arrival))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P""""),
        ("api_arrival_fact", printFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS""""),
        ("api_arrival_fact", printFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P""""),
        ("api_arrival_fact", printFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact)),
        ("api_registry_instruction", printFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)),
        ("api_shipment_result", printFactory_Dispatch_CoordinatorShipment_Result_SampleType(o.api_shipment_result))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS""""),
        ("api_arrival_fact", printFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact)),
        ("api_registry_instruction", printFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)),
        ("api_shipment_result", printFactory_Dispatch_CoordinatorShipment_Result_SampleType(o.api_shipment_result))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P""""),
        ("api_dispatch_candidate", printFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)),
        ("api_pending_request", printFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request)),
        ("api_registry_outcome", printFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS""""),
        ("api_dispatch_candidate", printFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)),
        ("api_pending_request", printFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request)),
        ("api_registry_outcome", printFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P""""),
        ("api_inventory_evidence", printFactory_Dispatch_CoordinatorInventory_Sample(o.api_inventory_evidence)),
        ("api_pending_request", printFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS""""),
        ("api_inventory_evidence", printFactory_Dispatch_CoordinatorInventory_Sample(o.api_inventory_evidence)),
        ("api_pending_request", printFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P""""),
        ("api_inventory_finding", printFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS""""),
        ("api_inventory_finding", printFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P""""),
        ("api_dispatch_candidate", printFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)),
        ("api_inventory_finding", printFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding)),
        ("api_readiness_sample", printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o.api_readiness_sample))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS""""),
        ("api_dispatch_candidate", printFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)),
        ("api_inventory_finding", printFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding)),
        ("api_readiness_sample", printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o.api_readiness_sample))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P""""),
        ("api_dispatch_disposition", printFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)),
        ("api_registry_instruction", printFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)),
        ("api_shipment_release", printFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o.api_shipment_release))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS""""),
        ("api_dispatch_disposition", printFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)),
        ("api_registry_instruction", printFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)),
        ("api_shipment_release", printFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o.api_shipment_release))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P""""),
        ("api_dispatch_disposition", printFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)),
        ("api_registry_outcome", printFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS""""),
        ("api_dispatch_disposition", printFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)),
        ("api_registry_outcome", printFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P""""),
        ("api_customer_notice", printFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o.api_customer_notice))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS""""),
        ("api_customer_notice", printFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o.api_customer_notice))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_registry_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_registry_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_registry_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_registry_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_registry_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_registry_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_inventory_assessment_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_inventory_assessment_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_inventory_assessment_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_inventory_assessment_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_inventory_assessment_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_inventory_assessment_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_arbiter_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_arbiter_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_arbiter_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_arbiter_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_arbiter_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_arbiter_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_customer_notice_synthesis_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_customer_notice_synthesis_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_customer_notice_synthesis_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_customer_notice_synthesis_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_customer_notice_synthesis_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_customer_notice_synthesis_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Input_Status_Payload => return printFactory_Dispatch_CoordinatorInput_Status_Payload(o)
        case o: Factory_Dispatch_Coordinator.Arrival_Fact_Payload => return printFactory_Dispatch_CoordinatorArrival_Fact_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Value_Payload => return printFactory_Dispatch_CoordinatorRequest_Value_Payload(o)
        case o: Factory_Dispatch_Coordinator.Registry_Outcome_Payload => return printFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Sample_Payload => return printFactory_Dispatch_CoordinatorInventory_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Finding_Payload => return printFactory_Dispatch_CoordinatorInventory_Finding_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload => return printFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o)
        case o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload => return printFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o)
        case o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload => return printFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload => return printFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload => return printFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.Pending_Request_View_Payload => return printFactory_Dispatch_CoordinatorPending_Request_View_Payload(o)
        case o: Factory_Dispatch_Coordinator.Registry_Instruction_Payload => return printFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload => return printFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload => return printFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload => return printFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload => return printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload => return printFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => return printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
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

    def parseFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(): Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Arrival_SampleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Arrival_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Arrival_Sample")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Request_Arrival_Sample.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Request_Arrival_Sample.")
          return Factory_Dispatch_Coordinator.Request_Arrival_Sample.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(): Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Arrival_Sample_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Arrival_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRequest_Arrival_SampleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorArrival_FactType(): Factory_Dispatch_Coordinator.Arrival_Fact.Type = {
      val r = parseFactory_Dispatch_CoordinatorArrival_FactT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorArrival_FactT(typeParsed: B): Factory_Dispatch_Coordinator.Arrival_Fact.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Arrival_Fact")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Arrival_Fact.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Arrival_Fact.")
          return Factory_Dispatch_Coordinator.Arrival_Fact.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorArrival_Fact_Payload(): Factory_Dispatch_Coordinator.Arrival_Fact_Payload = {
      val r = parseFactory_Dispatch_CoordinatorArrival_Fact_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorArrival_Fact_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Arrival_Fact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Arrival_Fact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorArrival_FactType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Arrival_Fact_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorShipment_Result_SampleType(): Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type = {
      val r = parseFactory_Dispatch_CoordinatorShipment_Result_SampleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_Result_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Result_Sample")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Shipment_Result_Sample.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Shipment_Result_Sample.")
          return Factory_Dispatch_Coordinator.Shipment_Result_Sample.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(): Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload = {
      val r = parseFactory_Dispatch_CoordinatorShipment_Result_Sample_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_Result_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorShipment_Result_SampleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRegistry_InstructionType(): Factory_Dispatch_Coordinator.Registry_Instruction.Type = {
      val r = parseFactory_Dispatch_CoordinatorRegistry_InstructionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRegistry_InstructionT(typeParsed: B): Factory_Dispatch_Coordinator.Registry_Instruction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Registry_Instruction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Registry_Instruction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Registry_Instruction.")
          return Factory_Dispatch_Coordinator.Registry_Instruction.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(): Factory_Dispatch_Coordinator.Registry_Instruction_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRegistry_Instruction_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRegistry_Instruction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Registry_Instruction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Registry_Instruction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRegistry_InstructionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Registry_Instruction_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorPending_Request_ViewType(): Factory_Dispatch_Coordinator.Pending_Request_View.Type = {
      val r = parseFactory_Dispatch_CoordinatorPending_Request_ViewT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPending_Request_ViewT(typeParsed: B): Factory_Dispatch_Coordinator.Pending_Request_View.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Pending_Request_View")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Pending_Request_View.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Pending_Request_View.")
          return Factory_Dispatch_Coordinator.Pending_Request_View.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorPending_Request_View_Payload(): Factory_Dispatch_Coordinator.Pending_Request_View_Payload = {
      val r = parseFactory_Dispatch_CoordinatorPending_Request_View_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorPending_Request_View_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Pending_Request_View_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Pending_Request_View_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorPending_Request_ViewType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Pending_Request_View_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRequest_ValueType(): Factory_Dispatch_Coordinator.Request_Value.Type = {
      val r = parseFactory_Dispatch_CoordinatorRequest_ValueT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_ValueT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Value.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Value")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Request_Value.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Request_Value.")
          return Factory_Dispatch_Coordinator.Request_Value.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Value_Payload(): Factory_Dispatch_Coordinator.Request_Value_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Value_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Value_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Value_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Value_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRequest_ValueType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Value_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorRegistry_OutcomeType(): Factory_Dispatch_Coordinator.Registry_Outcome.Type = {
      val r = parseFactory_Dispatch_CoordinatorRegistry_OutcomeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRegistry_OutcomeT(typeParsed: B): Factory_Dispatch_Coordinator.Registry_Outcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Registry_Outcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Registry_Outcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Registry_Outcome.")
          return Factory_Dispatch_Coordinator.Registry_Outcome.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(): Factory_Dispatch_Coordinator.Registry_Outcome_Payload = {
      val r = parseFactory_Dispatch_CoordinatorRegistry_Outcome_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRegistry_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Registry_Outcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Registry_Outcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Registry_Outcome_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(): Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type = {
      val r = parseFactory_Dispatch_CoordinatorAngle_A_Stock_BandT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAngle_A_Stock_BandT(typeParsed: B): Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Angle_A_Stock_Band")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Angle_A_Stock_Band.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Angle_A_Stock_Band.")
          return Factory_Dispatch_Coordinator.Angle_A_Stock_Band.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(): Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload = {
      val r = parseFactory_Dispatch_CoordinatorAngle_A_Stock_Band_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAngle_A_Stock_Band_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorAngle_A_Stock_BandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(): Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type = {
      val r = parseFactory_Dispatch_CoordinatorAngle_B_Stock_BandT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAngle_B_Stock_BandT(typeParsed: B): Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Angle_B_Stock_Band")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Angle_B_Stock_Band.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Angle_B_Stock_Band.")
          return Factory_Dispatch_Coordinator.Angle_B_Stock_Band.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(): Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload = {
      val r = parseFactory_Dispatch_CoordinatorAngle_B_Stock_Band_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAngle_B_Stock_Band_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorAngle_B_Stock_BandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorInput_StatusType(): Factory_Dispatch_Coordinator.Input_Status.Type = {
      val r = parseFactory_Dispatch_CoordinatorInput_StatusT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInput_StatusT(typeParsed: B): Factory_Dispatch_Coordinator.Input_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Input_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Input_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Input_Status.")
          return Factory_Dispatch_Coordinator.Input_Status.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorInput_Status_Payload(): Factory_Dispatch_Coordinator.Input_Status_Payload = {
      val r = parseFactory_Dispatch_CoordinatorInput_Status_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInput_Status_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Input_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Input_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Input_Status_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorInventory_FindingType(): Factory_Dispatch_Coordinator.Inventory_Finding.Type = {
      val r = parseFactory_Dispatch_CoordinatorInventory_FindingT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_FindingT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Finding.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Finding")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Inventory_Finding.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Inventory_Finding.")
          return Factory_Dispatch_Coordinator.Inventory_Finding.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorInventory_Finding_Payload(): Factory_Dispatch_Coordinator.Inventory_Finding_Payload = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Finding_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Finding_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Finding_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Finding_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorInventory_FindingType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Finding_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_ReadinessType(): Factory_Dispatch_Coordinator.Dispatch_Readiness.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_ReadinessT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_ReadinessT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Readiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Readiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Readiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Readiness.")
          return Factory_Dispatch_Coordinator.Dispatch_Readiness.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(): Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Readiness_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Readiness_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_ReadinessType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(): Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type = {
      val r = parseFactory_Dispatch_CoordinatorShipment_Release_DirectiveT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_Release_DirectiveT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Release_Directive")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Shipment_Release_Directive.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Shipment_Release_Directive.")
          return Factory_Dispatch_Coordinator.Shipment_Release_Directive.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(): Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload = {
      val r = parseFactory_Dispatch_CoordinatorShipment_Release_Directive_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_Release_Directive_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorShipment_Release_DirectiveType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_DispositionType(): Factory_Dispatch_Coordinator.Dispatch_Disposition.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_DispositionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_DispositionT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Disposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Disposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Disposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Disposition.")
          return Factory_Dispatch_Coordinator.Dispatch_Disposition.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(): Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_DispositionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type = {
      val r = parseFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeT(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Customer_Dispatch_Notice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.")
          return Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload = {
      val r = parseFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Candidate(): Factory_Dispatch_Coordinator.Dispatch_Candidate = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_CandidateT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_CandidateT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Candidate = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Candidate")
      }
      parser.parseObjectKey("request")
      val request = parseFactory_Dispatch_CoordinatorRequest_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("event_blocked")
      val event_blocked = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_hold")
      val recovery_hold = parser.parseB()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Candidate(request, event_blocked, recovery_hold)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(): Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Candidate_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Candidate_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Candidate()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Sample(): Factory_Dispatch_Coordinator.Inventory_Sample = {
      val r = parseFactory_Dispatch_CoordinatorInventory_SampleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Sample")
      }
      parser.parseObjectKey("stock_band_angle_a")
      val stock_band_angle_a = parseFactory_Dispatch_CoordinatorAngle_A_Stock_BandType()
      parser.parseObjectNext()
      parser.parseObjectKey("stock_band_angle_b")
      val stock_band_angle_b = parseFactory_Dispatch_CoordinatorAngle_B_Stock_BandType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseFactory_Dispatch_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Sample(stock_band_angle_a, stock_band_angle_b, status)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Sample_Payload(): Factory_Dispatch_Coordinator.Inventory_Sample_Payload = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Sample_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorInventory_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Sample_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Readiness_SampleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Readiness_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample")
      }
      parser.parseObjectKey("readiness")
      val readiness = parseFactory_Dispatch_CoordinatorDispatch_ReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseFactory_Dispatch_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample(readiness, status)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload(value)
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

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_request_arrival")
      val api_request_arrival = parseFactory_Dispatch_CoordinatorRequest_Arrival_SampleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(api_request_arrival)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_request_arrival")
      val api_request_arrival = parseFactory_Dispatch_CoordinatorRequest_Arrival_SampleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(api_request_arrival)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseFactory_Dispatch_CoordinatorArrival_FactType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(api_arrival_fact)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseFactory_Dispatch_CoordinatorArrival_FactType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(api_arrival_fact)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseFactory_Dispatch_CoordinatorArrival_FactType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_instruction")
      val api_registry_instruction = parseFactory_Dispatch_CoordinatorRegistry_InstructionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipment_result")
      val api_shipment_result = parseFactory_Dispatch_CoordinatorShipment_Result_SampleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(api_arrival_fact, api_registry_instruction, api_shipment_result)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseFactory_Dispatch_CoordinatorArrival_FactType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_instruction")
      val api_registry_instruction = parseFactory_Dispatch_CoordinatorRegistry_InstructionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipment_result")
      val api_shipment_result = parseFactory_Dispatch_CoordinatorShipment_Result_SampleType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(api_arrival_fact, api_registry_instruction, api_shipment_result)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_candidate")
      val api_dispatch_candidate = parseFactory_Dispatch_CoordinatorDispatch_Candidate()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pending_request")
      val api_pending_request = parseFactory_Dispatch_CoordinatorPending_Request_ViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_outcome")
      val api_registry_outcome = parseFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(api_dispatch_candidate, api_pending_request, api_registry_outcome)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_candidate")
      val api_dispatch_candidate = parseFactory_Dispatch_CoordinatorDispatch_Candidate()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pending_request")
      val api_pending_request = parseFactory_Dispatch_CoordinatorPending_Request_ViewType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_outcome")
      val api_registry_outcome = parseFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(api_dispatch_candidate, api_pending_request, api_registry_outcome)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_inventory_evidence")
      val api_inventory_evidence = parseFactory_Dispatch_CoordinatorInventory_Sample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pending_request")
      val api_pending_request = parseFactory_Dispatch_CoordinatorPending_Request_ViewType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(api_inventory_evidence, api_pending_request)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_inventory_evidence")
      val api_inventory_evidence = parseFactory_Dispatch_CoordinatorInventory_Sample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pending_request")
      val api_pending_request = parseFactory_Dispatch_CoordinatorPending_Request_ViewType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(api_inventory_evidence, api_pending_request)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_inventory_finding")
      val api_inventory_finding = parseFactory_Dispatch_CoordinatorInventory_FindingType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(api_inventory_finding)
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_inventory_finding")
      val api_inventory_finding = parseFactory_Dispatch_CoordinatorInventory_FindingType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(api_inventory_finding)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_candidate")
      val api_dispatch_candidate = parseFactory_Dispatch_CoordinatorDispatch_Candidate()
      parser.parseObjectNext()
      parser.parseObjectKey("api_inventory_finding")
      val api_inventory_finding = parseFactory_Dispatch_CoordinatorInventory_FindingType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_sample")
      val api_readiness_sample = parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(api_dispatch_candidate, api_inventory_finding, api_readiness_sample)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_candidate")
      val api_dispatch_candidate = parseFactory_Dispatch_CoordinatorDispatch_Candidate()
      parser.parseObjectNext()
      parser.parseObjectKey("api_inventory_finding")
      val api_inventory_finding = parseFactory_Dispatch_CoordinatorInventory_FindingType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_sample")
      val api_readiness_sample = parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(api_dispatch_candidate, api_inventory_finding, api_readiness_sample)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_disposition")
      val api_dispatch_disposition = parseFactory_Dispatch_CoordinatorDispatch_DispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_instruction")
      val api_registry_instruction = parseFactory_Dispatch_CoordinatorRegistry_InstructionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipment_release")
      val api_shipment_release = parseFactory_Dispatch_CoordinatorShipment_Release_DirectiveType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(api_dispatch_disposition, api_registry_instruction, api_shipment_release)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_disposition")
      val api_dispatch_disposition = parseFactory_Dispatch_CoordinatorDispatch_DispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_instruction")
      val api_registry_instruction = parseFactory_Dispatch_CoordinatorRegistry_InstructionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipment_release")
      val api_shipment_release = parseFactory_Dispatch_CoordinatorShipment_Release_DirectiveType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(api_dispatch_disposition, api_registry_instruction, api_shipment_release)
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_disposition")
      val api_dispatch_disposition = parseFactory_Dispatch_CoordinatorDispatch_DispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_outcome")
      val api_registry_outcome = parseFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(api_dispatch_disposition, api_registry_outcome)
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_disposition")
      val api_dispatch_disposition = parseFactory_Dispatch_CoordinatorDispatch_DispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_registry_outcome")
      val api_registry_outcome = parseFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(api_dispatch_disposition, api_registry_outcome)
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P")
      }
      parser.parseObjectKey("api_customer_notice")
      val api_customer_notice = parseFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(api_customer_notice)
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS")
      }
      parser.parseObjectKey("api_customer_notice")
      val api_customer_notice = parseFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(api_customer_notice)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Factory_Dispatch_Coordinator.Input_Status_Payload", "Factory_Dispatch_Coordinator.Arrival_Fact_Payload", "Factory_Dispatch_Coordinator.Request_Value_Payload", "Factory_Dispatch_Coordinator.Registry_Outcome_Payload", "Factory_Dispatch_Coordinator.Inventory_Sample_Payload", "Factory_Dispatch_Coordinator.Inventory_Finding_Payload", "Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload", "Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload", "Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload", "Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload", "Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload", "Factory_Dispatch_Coordinator.Pending_Request_View_Payload", "Factory_Dispatch_Coordinator.Registry_Instruction_Payload", "Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload", "Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload", "Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload", "Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload", "Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P", "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS"))
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
        case "Factory_Dispatch_Coordinator.Input_Status_Payload" => val r = parseFactory_Dispatch_CoordinatorInput_Status_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Arrival_Fact_Payload" => val r = parseFactory_Dispatch_CoordinatorArrival_Fact_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Value_Payload" => val r = parseFactory_Dispatch_CoordinatorRequest_Value_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Registry_Outcome_Payload" => val r = parseFactory_Dispatch_CoordinatorRegistry_Outcome_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Sample_Payload" => val r = parseFactory_Dispatch_CoordinatorInventory_Sample_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Finding_Payload" => val r = parseFactory_Dispatch_CoordinatorInventory_Finding_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Readiness_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload" => val r = parseFactory_Dispatch_CoordinatorAngle_A_Stock_Band_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload" => val r = parseFactory_Dispatch_CoordinatorAngle_B_Stock_Band_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Candidate_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Pending_Request_View_Payload" => val r = parseFactory_Dispatch_CoordinatorPending_Request_View_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Registry_Instruction_Payload" => val r = parseFactory_Dispatch_CoordinatorRegistry_Instruction_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload" => val r = parseFactory_Dispatch_CoordinatorShipment_Result_Sample_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload" => val r = parseFactory_Dispatch_CoordinatorRequest_Arrival_Sample_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload" => val r = parseFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload" => val r = parseFactory_Dispatch_CoordinatorShipment_Release_Directive_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
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

  def fromFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(s: String): Either[Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(parser: Parser): Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorArrival_Fact_Payload(o: Factory_Dispatch_Coordinator.Arrival_Fact_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorArrival_Fact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorArrival_Fact_Payload(s: String): Either[Factory_Dispatch_Coordinator.Arrival_Fact_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorArrival_Fact_Payload(parser: Parser): Factory_Dispatch_Coordinator.Arrival_Fact_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorArrival_Fact_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorArrival_Fact_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(s: String): Either[Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(parser: Parser): Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o: Factory_Dispatch_Coordinator.Registry_Instruction_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(s: String): Either[Factory_Dispatch_Coordinator.Registry_Instruction_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(parser: Parser): Factory_Dispatch_Coordinator.Registry_Instruction_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRegistry_Instruction_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRegistry_Instruction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPending_Request_View_Payload(o: Factory_Dispatch_Coordinator.Pending_Request_View_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorPending_Request_View_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorPending_Request_View_Payload(s: String): Either[Factory_Dispatch_Coordinator.Pending_Request_View_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPending_Request_View_Payload(parser: Parser): Factory_Dispatch_Coordinator.Pending_Request_View_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorPending_Request_View_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorPending_Request_View_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Value_Payload(o: Factory_Dispatch_Coordinator.Request_Value_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Value_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Value_Payload(s: String): Either[Factory_Dispatch_Coordinator.Request_Value_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Value_Payload(parser: Parser): Factory_Dispatch_Coordinator.Request_Value_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Value_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Value_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o: Factory_Dispatch_Coordinator.Registry_Outcome_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(s: String): Either[Factory_Dispatch_Coordinator.Registry_Outcome_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(parser: Parser): Factory_Dispatch_Coordinator.Registry_Outcome_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorRegistry_Outcome_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRegistry_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(s: String): Either[Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(parser: Parser): Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(s: String): Either[Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(parser: Parser): Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInput_Status_Payload(o: Factory_Dispatch_Coordinator.Input_Status_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInput_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInput_Status_Payload(s: String): Either[Factory_Dispatch_Coordinator.Input_Status_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInput_Status_Payload(parser: Parser): Factory_Dispatch_Coordinator.Input_Status_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorInput_Status_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInput_Status_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Finding_Payload(o: Factory_Dispatch_Coordinator.Inventory_Finding_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Finding_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Finding_Payload(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Finding_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Finding_Payload(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Finding_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Finding_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Finding_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Readiness_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Readiness_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(s: String): Either[Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(parser: Parser): Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Disposition_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Disposition_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(s: String): Either[Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(parser: Parser): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Candidate(o: Factory_Dispatch_Coordinator.Dispatch_Candidate, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Candidate(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Candidate(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Candidate, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Candidate(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Candidate = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Candidate()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Candidate _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Candidate_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Candidate_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Sample(o: Factory_Dispatch_Coordinator.Inventory_Sample, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Sample(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Sample, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Sample(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Sample = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Sample()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Sample_Payload(o: Factory_Dispatch_Coordinator.Inventory_Sample_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Sample_Payload(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Sample_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Sample_Payload(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Sample_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Sample_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload _)
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

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS _)
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