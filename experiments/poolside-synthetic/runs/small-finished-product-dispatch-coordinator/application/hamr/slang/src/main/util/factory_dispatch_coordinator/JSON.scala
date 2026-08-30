// #Sireum
// @formatter:off

// This file is auto-generated from Dispatch_Request_Event.scala, Input_Status.scala, Qualified_Request.scala, Product_Availability.scala, Availability_Assessment_Value.scala, Dispatch_Outcome.scala, Qualified_Outcome.scala, Dispatch_Phase.scala, Dispatch_Disposition.scala, Shipment_Release_Command.scala, Dispatch_Status.scala, Shipping_Confirmation.scala, Dispatch_Request_Sample.scala, Product_Availability_Sample.scala, Dispatch_Outcome_Sample.scala, Dispatch_Resolution.scala, Base_Types.scala, Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala, Availability_Assessment_dispatch_coordination_process_availability_assessment_Containers.scala, Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Containers.scala, Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_Containers.scala, Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_Containers.scala, Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFactory_Dispatch_CoordinatorDispatch_Request_EventType(o: Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Request_Event.No_Request => "No_Request"
        case Factory_Dispatch_Coordinator.Dispatch_Request_Event.Request_Shipment => "Request_Shipment"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Request_Event")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Request_EventType(o.value))
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

    @pure def printFactory_Dispatch_CoordinatorQualified_RequestType(o: Factory_Dispatch_Coordinator.Qualified_Request.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Qualified_Request.Invalid_Request => "Invalid_Request"
        case Factory_Dispatch_Coordinator.Qualified_Request.No_Qualified_Request => "No_Qualified_Request"
        case Factory_Dispatch_Coordinator.Qualified_Request.Qualified_Shipment_Request => "Qualified_Shipment_Request"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Qualified_Request")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQualified_Request_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Qualified_Request_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorQualified_RequestType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProduct_AvailabilityType(o: Factory_Dispatch_Coordinator.Product_Availability.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Product_Availability.Unavailable => "Unavailable"
        case Factory_Dispatch_Coordinator.Product_Availability.Available => "Available"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Product_Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProduct_Availability_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Product_Availability_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorProduct_AvailabilityType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o: Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Availability_Assessment_Value.Invalid_Availability => "Invalid_Availability"
        case Factory_Dispatch_Coordinator.Availability_Assessment_Value.Product_Unavailable => "Product_Unavailable"
        case Factory_Dispatch_Coordinator.Availability_Assessment_Value.Product_Available => "Product_Available"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Availability_Assessment_Value")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_OutcomeType(o: Factory_Dispatch_Coordinator.Dispatch_Outcome.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Outcome.No_Report => "No_Report"
        case Factory_Dispatch_Coordinator.Dispatch_Outcome.Shipment_Accepted => "Shipment_Accepted"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Outcome")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_OutcomeType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQualified_OutcomeType(o: Factory_Dispatch_Coordinator.Qualified_Outcome.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Qualified_Outcome.Invalid_Outcome => "Invalid_Outcome"
        case Factory_Dispatch_Coordinator.Qualified_Outcome.No_Qualified_Report => "No_Qualified_Report"
        case Factory_Dispatch_Coordinator.Qualified_Outcome.Qualified_Shipment_Accepted => "Qualified_Shipment_Accepted"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Qualified_Outcome")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Qualified_Outcome_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorQualified_OutcomeType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_PhaseType(o: Factory_Dispatch_Coordinator.Dispatch_Phase.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Phase.Idle => "Idle"
        case Factory_Dispatch_Coordinator.Dispatch_Phase.Awaiting_Product => "Awaiting_Product"
        case Factory_Dispatch_Coordinator.Dispatch_Phase.Release_Outstanding => "Release_Outstanding"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Dispatch_Phase")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Phase_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_PhaseType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_DispositionType(o: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Input_Fault => "Input_Fault"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Recovery_Blocked => "Recovery_Blocked"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Recovery_Cleared => "Recovery_Cleared"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Shipment_Acknowledged => "Shipment_Acknowledged"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Unexpected_Outcome => "Unexpected_Outcome"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Release_From_Idle => "Release_From_Idle"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Queue_For_Product => "Queue_For_Product"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Release_From_Queue => "Release_From_Queue"
        case Factory_Dispatch_Coordinator.Dispatch_Disposition.Hold_Position => "Hold_Position"
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

    @pure def printFactory_Dispatch_CoordinatorShipment_Release_CommandType(o: Factory_Dispatch_Coordinator.Shipment_Release_Command.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Shipment_Release_Command.Hold => "Hold"
        case Factory_Dispatch_Coordinator.Shipment_Release_Command.Release => "Release"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Shipment_Release_Command")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorShipment_Release_CommandType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_StatusType(o: Factory_Dispatch_Coordinator.Dispatch_Status.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Dispatch_Status.Idle => "Idle"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Waiting_Product => "Waiting_Product"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Release_Issued => "Release_Issued"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Shipment_Acknowledged => "Shipment_Acknowledged"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Unexpected_Outcome => "Unexpected_Outcome"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Input_Fault => "Input_Fault"
        case Factory_Dispatch_Coordinator.Dispatch_Status.Recovery_Awaiting_Neutral => "Recovery_Awaiting_Neutral"
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

    @pure def printFactory_Dispatch_CoordinatorShipping_ConfirmationType(o: Factory_Dispatch_Coordinator.Shipping_Confirmation.Type): ST = {
      val value: String = o match {
        case Factory_Dispatch_Coordinator.Shipping_Confirmation.Not_Issued => "Not_Issued"
        case Factory_Dispatch_Coordinator.Shipping_Confirmation.Issued => "Issued"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Dispatch_Coordinator.Shipping_Confirmation")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorShipping_ConfirmationType(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Request_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Request_Sample""""),
        ("request_event", printFactory_Dispatch_CoordinatorDispatch_Request_EventType(o.request_event)),
        ("status", printFactory_Dispatch_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Request_Sample(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProduct_Availability_Sample(o: Factory_Dispatch_Coordinator.Product_Availability_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Product_Availability_Sample""""),
        ("availability", printFactory_Dispatch_CoordinatorProduct_AvailabilityType(o.availability)),
        ("status", printFactory_Dispatch_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorProduct_Availability_Sample(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample""""),
        ("outcome", printFactory_Dispatch_CoordinatorDispatch_OutcomeType(o.outcome)),
        ("status", printFactory_Dispatch_CoordinatorInput_StatusType(o.status))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o.value))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Resolution(o: Factory_Dispatch_Coordinator.Dispatch_Resolution): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Resolution""""),
        ("next_phase", printFactory_Dispatch_CoordinatorDispatch_PhaseType(o.next_phase)),
        ("next_recovery_required", printB(o.next_recovery_required)),
        ("disposition", printFactory_Dispatch_CoordinatorDispatch_DispositionType(o.disposition))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload""""),
        ("value", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.value))
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
        ("api_raw_request", printFactory_Dispatch_CoordinatorDispatch_Request_Sample(o.api_raw_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS""""),
        ("api_raw_request", printFactory_Dispatch_CoordinatorDispatch_Request_Sample(o.api_raw_request))
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
        ("api_qualified_request", printFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS""""),
        ("api_qualified_request", printFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P""""),
        ("api_raw_availability", printFactory_Dispatch_CoordinatorProduct_Availability_Sample(o.api_raw_availability))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS""""),
        ("api_raw_availability", printFactory_Dispatch_CoordinatorProduct_Availability_Sample(o.api_raw_availability))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P""""),
        ("api_availability_assessment", printFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS""""),
        ("api_availability_assessment", printFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P""""),
        ("api_raw_outcome", printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o.api_raw_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS""""),
        ("api_raw_outcome", printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o.api_raw_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS""""),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P""""),
        ("api_availability_assessment", printFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment)),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome)),
        ("api_qualified_request", printFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS""""),
        ("In_current_phase", printFactory_Dispatch_CoordinatorDispatch_PhaseType(o.In_current_phase)),
        ("In_recovery_required", printB(o.In_recovery_required)),
        ("api_availability_assessment", printFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment)),
        ("api_qualified_outcome", printFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome)),
        ("api_qualified_request", printFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P""""),
        ("api_notice_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_notice_resolution)),
        ("api_release_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_release_resolution))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS""""),
        ("current_phase", printFactory_Dispatch_CoordinatorDispatch_PhaseType(o.current_phase)),
        ("recovery_required", printB(o.recovery_required)),
        ("api_notice_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_notice_resolution)),
        ("api_release_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_release_resolution))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P""""),
        ("api_dispatch_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS""""),
        ("api_dispatch_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P""""),
        ("api_shipment_release_command", printFactory_Dispatch_CoordinatorShipment_Release_CommandType(o.api_shipment_release_command))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS""""),
        ("api_shipment_release_command", printFactory_Dispatch_CoordinatorShipment_Release_CommandType(o.api_shipment_release_command))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P""""),
        ("api_dispatch_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS""""),
        ("api_dispatch_resolution", printFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container): ST = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P""""),
        ("api_dispatch_status", printFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status)),
        ("api_shipping_confirmation", printFactory_Dispatch_CoordinatorShipping_ConfirmationType(o.api_shipping_confirmation))
      ))
    }

    @pure def printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS""""),
        ("api_dispatch_status", printFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status)),
        ("api_shipping_confirmation", printFactory_Dispatch_CoordinatorShipping_ConfirmationType(o.api_shipping_confirmation))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_request_qualification_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_availability_assessment_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_availability_assessment_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_availability_assessment_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_availability_assessment_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_availability_assessment_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_availability_assessment_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_outcome_qualification_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_outcome_qualification_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_outcome_qualification_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_outcome_qualification_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_outcome_qualification_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_outcome_qualification_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_decision_owner_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_decision_owner_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_decision_owner_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_decision_owner_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_decision_owner_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_decision_owner_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_release_command_derivation_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_release_command_derivation_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_release_command_derivation_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_release_command_derivation_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_release_command_derivation_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_release_command_derivation_postCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_notice_derivation_postInit => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_notice_derivation_postInit"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_notice_derivation_preCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_notice_derivation_preCompute"
        case runtimemonitor.ObservationKind.Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_notice_derivation_postCompute => "Finished_Product_Dispatch_Coordinator_System_Instance_dispatch_coordination_process_dispatch_notice_derivation_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload => return printFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload => return printFactory_Dispatch_CoordinatorDispatch_Status_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload => return printFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Qualified_Request_Payload => return printFactory_Dispatch_CoordinatorQualified_Request_Payload(o)
        case o: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload => return printFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload => return printFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o)
        case o: Factory_Dispatch_Coordinator.Product_Availability_Payload => return printFactory_Dispatch_CoordinatorProduct_Availability_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload => return printFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload => return printFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload => return printFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload => return printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload => return printFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload => return printFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o)
        case o: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload => return printFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload => return printFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => return printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => return printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => return printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
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

    def parseFactory_Dispatch_CoordinatorDispatch_Request_EventType(): Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Request_EventT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Request_EventT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Request_Event")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Request_Event.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Request_Event.")
          return Factory_Dispatch_Coordinator.Dispatch_Request_Event.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(): Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Request_Event_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Request_Event_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Request_EventType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload(value)
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

    def parseFactory_Dispatch_CoordinatorQualified_RequestType(): Factory_Dispatch_Coordinator.Qualified_Request.Type = {
      val r = parseFactory_Dispatch_CoordinatorQualified_RequestT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualified_RequestT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Request.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Qualified_Request")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Qualified_Request.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Qualified_Request.")
          return Factory_Dispatch_Coordinator.Qualified_Request.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorQualified_Request_Payload(): Factory_Dispatch_Coordinator.Qualified_Request_Payload = {
      val r = parseFactory_Dispatch_CoordinatorQualified_Request_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualified_Request_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Request_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Qualified_Request_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorQualified_RequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Qualified_Request_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorProduct_AvailabilityType(): Factory_Dispatch_Coordinator.Product_Availability.Type = {
      val r = parseFactory_Dispatch_CoordinatorProduct_AvailabilityT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProduct_AvailabilityT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Product_Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Product_Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Product_Availability.")
          return Factory_Dispatch_Coordinator.Product_Availability.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorProduct_Availability_Payload(): Factory_Dispatch_Coordinator.Product_Availability_Payload = {
      val r = parseFactory_Dispatch_CoordinatorProduct_Availability_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProduct_Availability_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Product_Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorProduct_AvailabilityType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Product_Availability_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(): Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type = {
      val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueT(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Availability_Assessment_Value")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Availability_Assessment_Value.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Availability_Assessment_Value.")
          return Factory_Dispatch_Coordinator.Availability_Assessment_Value.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(): Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload = {
      val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_Value_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_Value_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_OutcomeType(): Factory_Dispatch_Coordinator.Dispatch_Outcome.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_OutcomeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_OutcomeT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Outcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Outcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Outcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Outcome.")
          return Factory_Dispatch_Coordinator.Dispatch_Outcome.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(): Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Outcome_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorQualified_OutcomeType(): Factory_Dispatch_Coordinator.Qualified_Outcome.Type = {
      val r = parseFactory_Dispatch_CoordinatorQualified_OutcomeT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualified_OutcomeT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Outcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Qualified_Outcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Qualified_Outcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Qualified_Outcome.")
          return Factory_Dispatch_Coordinator.Qualified_Outcome.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorQualified_Outcome_Payload(): Factory_Dispatch_Coordinator.Qualified_Outcome_Payload = {
      val r = parseFactory_Dispatch_CoordinatorQualified_Outcome_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorQualified_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Outcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Qualified_Outcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorQualified_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Qualified_Outcome_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_PhaseType(): Factory_Dispatch_Coordinator.Dispatch_Phase.Type = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_PhaseT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_PhaseT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Phase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Phase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Dispatch_Phase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Dispatch_Phase.")
          return Factory_Dispatch_Coordinator.Dispatch_Phase.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Phase_Payload(): Factory_Dispatch_Coordinator.Dispatch_Phase_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Phase_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Phase_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Phase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Phase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_PhaseType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Phase_Payload(value)
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

    def parseFactory_Dispatch_CoordinatorShipment_Release_CommandType(): Factory_Dispatch_Coordinator.Shipment_Release_Command.Type = {
      val r = parseFactory_Dispatch_CoordinatorShipment_Release_CommandT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_Release_CommandT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Release_Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Release_Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Shipment_Release_Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Shipment_Release_Command.")
          return Factory_Dispatch_Coordinator.Shipment_Release_Command.byOrdinal(0).get
      }
    }

    def parseFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(): Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload = {
      val r = parseFactory_Dispatch_CoordinatorShipment_Release_Command_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipment_Release_Command_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorShipment_Release_CommandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload(value)
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

    def parseFactory_Dispatch_CoordinatorShipping_ConfirmationType(): Factory_Dispatch_Coordinator.Shipping_Confirmation.Type = {
      val r = parseFactory_Dispatch_CoordinatorShipping_ConfirmationT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorShipping_ConfirmationT(typeParsed: B): Factory_Dispatch_Coordinator.Shipping_Confirmation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Shipping_Confirmation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Dispatch_Coordinator.Shipping_Confirmation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Dispatch_Coordinator.Shipping_Confirmation.")
          return Factory_Dispatch_Coordinator.Shipping_Confirmation.byOrdinal(0).get
      }
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
      val value = parseFactory_Dispatch_CoordinatorShipping_ConfirmationType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Request_Sample(): Factory_Dispatch_Coordinator.Dispatch_Request_Sample = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Request_SampleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Request_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Request_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Request_Sample")
      }
      parser.parseObjectKey("request_event")
      val request_event = parseFactory_Dispatch_CoordinatorDispatch_Request_EventType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseFactory_Dispatch_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Request_Sample(request_event, status)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(): Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Request_Sample_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Request_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorProduct_Availability_Sample(): Factory_Dispatch_Coordinator.Product_Availability_Sample = {
      val r = parseFactory_Dispatch_CoordinatorProduct_Availability_SampleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProduct_Availability_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Availability_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Product_Availability_Sample")
      }
      parser.parseObjectKey("availability")
      val availability = parseFactory_Dispatch_CoordinatorProduct_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseFactory_Dispatch_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Product_Availability_Sample(availability, status)
    }

    def parseFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(): Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload = {
      val r = parseFactory_Dispatch_CoordinatorProduct_Availability_Sample_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorProduct_Availability_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Outcome_SampleT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Outcome_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample")
      }
      parser.parseObjectKey("outcome")
      val outcome = parseFactory_Dispatch_CoordinatorDispatch_OutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseFactory_Dispatch_CoordinatorInput_StatusType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample(outcome, status)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload(value)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Resolution(): Factory_Dispatch_Coordinator.Dispatch_Resolution = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_ResolutionT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_ResolutionT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Resolution = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Resolution")
      }
      parser.parseObjectKey("next_phase")
      val next_phase = parseFactory_Dispatch_CoordinatorDispatch_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("next_recovery_required")
      val next_recovery_required = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseFactory_Dispatch_CoordinatorDispatch_DispositionType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Resolution(next_phase, next_recovery_required, disposition)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(): Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Resolution_PayloadT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Resolution_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload(value)
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
      parser.parseObjectKey("api_raw_request")
      val api_raw_request = parseFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(api_raw_request)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_request")
      val api_raw_request = parseFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(api_raw_request)
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
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseFactory_Dispatch_CoordinatorQualified_RequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(api_qualified_request)
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseFactory_Dispatch_CoordinatorQualified_RequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(api_qualified_request)
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_availability")
      val api_raw_availability = parseFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(api_raw_availability)
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_availability")
      val api_raw_availability = parseFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(api_raw_availability)
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_availability_assessment")
      val api_availability_assessment = parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(api_availability_assessment)
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_availability_assessment")
      val api_availability_assessment = parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(api_availability_assessment)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_outcome")
      val api_raw_outcome = parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(api_raw_outcome)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_outcome")
      val api_raw_outcome = parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(api_raw_outcome)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualified_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(api_qualified_outcome)
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualified_OutcomeType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(api_qualified_outcome)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_availability_assessment")
      val api_availability_assessment = parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualified_OutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseFactory_Dispatch_CoordinatorQualified_RequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(api_availability_assessment, api_qualified_outcome, api_qualified_request)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_current_phase")
      val In_current_phase = parseFactory_Dispatch_CoordinatorDispatch_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_recovery_required")
      val In_recovery_required = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_availability_assessment")
      val api_availability_assessment = parseFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_outcome")
      val api_qualified_outcome = parseFactory_Dispatch_CoordinatorQualified_OutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseFactory_Dispatch_CoordinatorQualified_RequestType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(In_current_phase, In_recovery_required, api_availability_assessment, api_qualified_outcome, api_qualified_request)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_notice_resolution")
      val api_notice_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_release_resolution")
      val api_release_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(api_notice_resolution, api_release_resolution)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("current_phase")
      val current_phase = parseFactory_Dispatch_CoordinatorDispatch_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_required")
      val recovery_required = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_notice_resolution")
      val api_notice_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_release_resolution")
      val api_release_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(current_phase, recovery_required, api_notice_resolution, api_release_resolution)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_resolution")
      val api_dispatch_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(api_dispatch_resolution)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_resolution")
      val api_dispatch_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(api_dispatch_resolution)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_shipment_release_command")
      val api_shipment_release_command = parseFactory_Dispatch_CoordinatorShipment_Release_CommandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(api_shipment_release_command)
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_shipment_release_command")
      val api_shipment_release_command = parseFactory_Dispatch_CoordinatorShipment_Release_CommandType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(api_shipment_release_command)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_resolution")
      val api_dispatch_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(api_dispatch_resolution)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_resolution")
      val api_dispatch_resolution = parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(api_dispatch_resolution)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS"))
      t.native match {
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_dispatch_status")
      val api_dispatch_status = parseFactory_Dispatch_CoordinatorDispatch_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipping_confirmation")
      val api_shipping_confirmation = parseFactory_Dispatch_CoordinatorShipping_ConfirmationType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(api_dispatch_status, api_shipping_confirmation)
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS = {
      val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(F)
      return r
    }

    def parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_dispatch_status")
      val api_dispatch_status = parseFactory_Dispatch_CoordinatorDispatch_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipping_confirmation")
      val api_shipping_confirmation = parseFactory_Dispatch_CoordinatorShipping_ConfirmationType()
      parser.parseObjectNext()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(api_dispatch_status, api_shipping_confirmation)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Factory_Dispatch_Coordinator.Input_Status_Payload", "Factory_Dispatch_Coordinator.Dispatch_Phase_Payload", "Factory_Dispatch_Coordinator.Dispatch_Status_Payload", "Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload", "Factory_Dispatch_Coordinator.Qualified_Request_Payload", "Factory_Dispatch_Coordinator.Qualified_Outcome_Payload", "Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload", "Factory_Dispatch_Coordinator.Product_Availability_Payload", "Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload", "Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload", "Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload", "Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload", "Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload", "Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload", "Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload", "Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P", "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P", "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P", "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS", "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS"))
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
        case "Factory_Dispatch_Coordinator.Dispatch_Phase_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Phase_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Status_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Outcome_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Qualified_Request_Payload" => val r = parseFactory_Dispatch_CoordinatorQualified_Request_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Qualified_Outcome_Payload" => val r = parseFactory_Dispatch_CoordinatorQualified_Outcome_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Resolution_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Product_Availability_Payload" => val r = parseFactory_Dispatch_CoordinatorProduct_Availability_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload" => val r = parseFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Request_Event_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload" => val r = parseFactory_Dispatch_CoordinatorDispatch_Request_Sample_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload" => val r = parseFactory_Dispatch_CoordinatorShipment_Release_Command_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload" => val r = parseFactory_Dispatch_CoordinatorProduct_Availability_Sample_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_Value_PayloadT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(T); return r
        case "Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T); return r
        case "Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS" => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
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

  def fromFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload _)
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

  def fromFactory_Dispatch_CoordinatorQualified_Request_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQualified_Request_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQualified_Request_Payload(s: String): Either[Factory_Dispatch_Coordinator.Qualified_Request_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Request_Payload(parser: Parser): Factory_Dispatch_Coordinator.Qualified_Request_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorQualified_Request_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQualified_Request_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Availability_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProduct_Availability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProduct_Availability_Payload(s: String): Either[Factory_Dispatch_Coordinator.Product_Availability_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Availability_Payload(parser: Parser): Factory_Dispatch_Coordinator.Product_Availability_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorProduct_Availability_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProduct_Availability_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(s: String): Either[Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(parser: Parser): Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Outcome_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorQualified_Outcome_Payload(s: String): Either[Factory_Dispatch_Coordinator.Qualified_Outcome_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Outcome_Payload(parser: Parser): Factory_Dispatch_Coordinator.Qualified_Outcome_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorQualified_Outcome_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorQualified_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Phase_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Phase_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Phase_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Phase_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Phase_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Phase_Payload _)
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

  def fromFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(s: String): Either[Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(parser: Parser): Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorShipment_Release_Command_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorShipment_Release_Command_Payload _)
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

  def fromFactory_Dispatch_CoordinatorDispatch_Request_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Request_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Request_Sample(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Request_Sample, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Request_Sample(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Request_Sample = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Request_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Availability_Sample(o: Factory_Dispatch_Coordinator.Product_Availability_Sample, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProduct_Availability_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProduct_Availability_Sample(s: String): Either[Factory_Dispatch_Coordinator.Product_Availability_Sample, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Availability_Sample(parser: Parser): Factory_Dispatch_Coordinator.Product_Availability_Sample = {
      val r = parser.parseFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProduct_Availability_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(s: String): Either[Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(parser: Parser): Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Resolution(o: Factory_Dispatch_Coordinator.Dispatch_Resolution, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Resolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Resolution(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Resolution, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Resolution(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Resolution = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Resolution()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Resolution _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Resolution_Payload()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Resolution_Payload _)
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

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(s: String): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(parser: Parser): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS = {
      val r = parser.parseFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS _)
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