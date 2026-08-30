// #Sireum
// @formatter:off

// This file is auto-generated from Dispatch_Request_Event.scala, Input_Status.scala, Qualified_Request.scala, Product_Availability.scala, Availability_Assessment_Value.scala, Dispatch_Outcome.scala, Qualified_Outcome.scala, Dispatch_Phase.scala, Dispatch_Disposition.scala, Shipment_Release_Command.scala, Dispatch_Status.scala, Shipping_Confirmation.scala, Dispatch_Request_Sample.scala, Product_Availability_Sample.scala, Dispatch_Outcome_Sample.scala, Dispatch_Resolution.scala, Base_Types.scala, Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala, Availability_Assessment_dispatch_coordination_process_availability_assessment_Containers.scala, Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Containers.scala, Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_Containers.scala, Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_Containers.scala, Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package factory_dispatch_coordinator

import org.sireum._

object MsgPack {

  object Constants {

    val Factory_Dispatch_CoordinatorDispatch_Request_Event_Payload: Z = -32

    val Factory_Dispatch_CoordinatorInput_Status_Payload: Z = -31

    val Factory_Dispatch_CoordinatorQualified_Request_Payload: Z = -30

    val Factory_Dispatch_CoordinatorProduct_Availability_Payload: Z = -29

    val Factory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload: Z = -28

    val Factory_Dispatch_CoordinatorDispatch_Outcome_Payload: Z = -27

    val Factory_Dispatch_CoordinatorQualified_Outcome_Payload: Z = -26

    val Factory_Dispatch_CoordinatorDispatch_Phase_Payload: Z = -25

    val Factory_Dispatch_CoordinatorDispatch_Disposition_Payload: Z = -24

    val Factory_Dispatch_CoordinatorShipment_Release_Command_Payload: Z = -23

    val Factory_Dispatch_CoordinatorDispatch_Status_Payload: Z = -22

    val Factory_Dispatch_CoordinatorShipping_Confirmation_Payload: Z = -21

    val Factory_Dispatch_CoordinatorDispatch_Request_Sample: Z = -20

    val Factory_Dispatch_CoordinatorDispatch_Request_Sample_Payload: Z = -19

    val Factory_Dispatch_CoordinatorProduct_Availability_Sample: Z = -18

    val Factory_Dispatch_CoordinatorProduct_Availability_Sample_Payload: Z = -17

    val Factory_Dispatch_CoordinatorDispatch_Outcome_Sample: Z = -16

    val Factory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload: Z = -15

    val Factory_Dispatch_CoordinatorDispatch_Resolution: Z = -14

    val Factory_Dispatch_CoordinatorDispatch_Resolution_Payload: Z = -13

    val Base_TypesBoolean_Payload: Z = -12

    val Base_TypesInteger_Payload: Z = -11

    val Base_TypesInteger_8_Payload: Z = -10

    val Base_TypesInteger_16_Payload: Z = -9

    val Base_TypesInteger_32_Payload: Z = -8

    val Base_TypesInteger_64_Payload: Z = -7

    val Base_TypesUnsigned_8_Payload: Z = -6

    val Base_TypesUnsigned_16_Payload: Z = -5

    val Base_TypesUnsigned_32_Payload: Z = -4

    val Base_TypesUnsigned_64_Payload: Z = -3

    val Base_TypesFloat_Payload: Z = -2

    val Base_TypesFloat_32_Payload: Z = -1

    val Base_TypesFloat_64_Payload: Z = 0

    val Base_TypesCharacter_Payload: Z = 1

    val Base_TypesString_Payload: Z = 2

    val Base_TypesBits_Payload: Z = 3

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P: Z = 4

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS: Z = 5

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P: Z = 6

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS: Z = 7

    val Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P: Z = 8

    val Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS: Z = 9

    val Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P: Z = 10

    val Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS: Z = 11

    val Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P: Z = 12

    val Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS: Z = 13

    val Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P: Z = 14

    val Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS: Z = 15

    val Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P: Z = 16

    val Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS: Z = 17

    val Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P: Z = 18

    val Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS: Z = 19

    val Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P: Z = 20

    val Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS: Z = 21

    val Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P: Z = 22

    val Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS: Z = 23

    val Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P: Z = 24

    val Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS: Z = 25

    val Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P: Z = 26

    val Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS: Z = 27

    val utilEmptyContainer: Z = 28

    val _artEmpty: Z = 29

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFactory_Dispatch_CoordinatorDispatch_Request_EventType(o: Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Request_Event_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Request_EventType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInput_StatusType(o: Factory_Dispatch_Coordinator.Input_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorInput_Status_Payload(o: Factory_Dispatch_Coordinator.Input_Status_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInput_Status_Payload)
      writeFactory_Dispatch_CoordinatorInput_StatusType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorQualified_RequestType(o: Factory_Dispatch_Coordinator.Qualified_Request.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorQualified_Request_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQualified_Request_Payload)
      writeFactory_Dispatch_CoordinatorQualified_RequestType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorProduct_AvailabilityType(o: Factory_Dispatch_Coordinator.Product_Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorProduct_Availability_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProduct_Availability_Payload)
      writeFactory_Dispatch_CoordinatorProduct_AvailabilityType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o: Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload)
      writeFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_OutcomeType(o: Factory_Dispatch_Coordinator.Dispatch_Outcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_OutcomeType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorQualified_OutcomeType(o: Factory_Dispatch_Coordinator.Qualified_Outcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorQualified_Outcome_Payload)
      writeFactory_Dispatch_CoordinatorQualified_OutcomeType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_PhaseType(o: Factory_Dispatch_Coordinator.Dispatch_Phase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Phase_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_PhaseType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Disposition_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Release_CommandType(o: Factory_Dispatch_Coordinator.Shipment_Release_Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipment_Release_Command_Payload)
      writeFactory_Dispatch_CoordinatorShipment_Release_CommandType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_StatusType(o: Factory_Dispatch_Coordinator.Dispatch_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Status_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Status_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_StatusType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorShipping_ConfirmationType(o: Factory_Dispatch_Coordinator.Shipping_Confirmation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipping_Confirmation_Payload)
      writeFactory_Dispatch_CoordinatorShipping_ConfirmationType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Request_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Request_Sample)
      writeFactory_Dispatch_CoordinatorDispatch_Request_EventType(o.request_event)
      writeFactory_Dispatch_CoordinatorInput_StatusType(o.status)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Request_Sample_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Request_Sample(o.value)
    }

    def writeFactory_Dispatch_CoordinatorProduct_Availability_Sample(o: Factory_Dispatch_Coordinator.Product_Availability_Sample): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProduct_Availability_Sample)
      writeFactory_Dispatch_CoordinatorProduct_AvailabilityType(o.availability)
      writeFactory_Dispatch_CoordinatorInput_StatusType(o.status)
    }

    def writeFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorProduct_Availability_Sample_Payload)
      writeFactory_Dispatch_CoordinatorProduct_Availability_Sample(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Sample)
      writeFactory_Dispatch_CoordinatorDispatch_OutcomeType(o.outcome)
      writeFactory_Dispatch_CoordinatorInput_StatusType(o.status)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Resolution(o: Factory_Dispatch_Coordinator.Dispatch_Resolution): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Resolution)
      writeFactory_Dispatch_CoordinatorDispatch_PhaseType(o.next_phase)
      writer.writeB(o.next_recovery_required)
      writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o.disposition)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Resolution_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.value)
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

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Request_Sample(o.api_raw_request)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_Request_Sample(o.api_raw_request)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request)
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorProduct_Availability_Sample(o.api_raw_availability)
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorProduct_Availability_Sample(o.api_raw_availability)
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment)
    }

    def writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o.api_raw_outcome)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o.api_raw_outcome)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome)
    }

    def writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment)
      writeFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome)
      writeFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_PhaseType(o.In_current_phase)
      writer.writeB(o.In_recovery_required)
      writeFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(o.api_availability_assessment)
      writeFactory_Dispatch_CoordinatorQualified_OutcomeType(o.api_qualified_outcome)
      writeFactory_Dispatch_CoordinatorQualified_RequestType(o.api_qualified_request)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_notice_resolution)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_release_resolution)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_PhaseType(o.current_phase)
      writer.writeB(o.recovery_required)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_notice_resolution)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_release_resolution)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorShipment_Release_CommandType(o.api_shipment_release_command)
    }

    def writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorShipment_Release_CommandType(o.api_shipment_release_command)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_Resolution(o.api_dispatch_resolution)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status)
      writeFactory_Dispatch_CoordinatorShipping_ConfirmationType(o.api_shipping_confirmation)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_StatusType(o.api_dispatch_status)
      writeFactory_Dispatch_CoordinatorShipping_ConfirmationType(o.api_shipping_confirmation)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Input_Status_Payload => writeFactory_Dispatch_CoordinatorInput_Status_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload => writeFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Status_Payload => writeFactory_Dispatch_CoordinatorDispatch_Status_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload => writeFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Qualified_Request_Payload => writeFactory_Dispatch_CoordinatorQualified_Request_Payload(o)
        case o: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload => writeFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload => writeFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o)
        case o: Factory_Dispatch_Coordinator.Product_Availability_Payload => writeFactory_Dispatch_CoordinatorProduct_Availability_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload => writeFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload => writeFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload => writeFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload => writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload => writeFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload => writeFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o)
        case o: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload => writeFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload => writeFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
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

    def readFactory_Dispatch_CoordinatorDispatch_Request_EventType(): Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Request_Event.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(): Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Request_Event_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Request_Event_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Request_Event_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Request_EventType()
      return Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorInput_StatusType(): Factory_Dispatch_Coordinator.Input_Status.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Input_Status.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorInput_Status_Payload(): Factory_Dispatch_Coordinator.Input_Status_Payload = {
      val r = readFactory_Dispatch_CoordinatorInput_Status_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInput_Status_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Input_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInput_Status_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorInput_StatusType()
      return Factory_Dispatch_Coordinator.Input_Status_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorQualified_RequestType(): Factory_Dispatch_Coordinator.Qualified_Request.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Qualified_Request.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorQualified_Request_Payload(): Factory_Dispatch_Coordinator.Qualified_Request_Payload = {
      val r = readFactory_Dispatch_CoordinatorQualified_Request_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQualified_Request_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Request_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQualified_Request_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorQualified_RequestType()
      return Factory_Dispatch_Coordinator.Qualified_Request_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorProduct_AvailabilityType(): Factory_Dispatch_Coordinator.Product_Availability.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Product_Availability.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorProduct_Availability_Payload(): Factory_Dispatch_Coordinator.Product_Availability_Payload = {
      val r = readFactory_Dispatch_CoordinatorProduct_Availability_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProduct_Availability_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProduct_Availability_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorProduct_AvailabilityType()
      return Factory_Dispatch_Coordinator.Product_Availability_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType(): Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Availability_Assessment_Value.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(): Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload = {
      val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_Value_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_Value_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      return Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_OutcomeType(): Factory_Dispatch_Coordinator.Dispatch_Outcome.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Outcome.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(): Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Outcome_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_OutcomeType()
      return Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorQualified_OutcomeType(): Factory_Dispatch_Coordinator.Qualified_Outcome.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Qualified_Outcome.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorQualified_Outcome_Payload(): Factory_Dispatch_Coordinator.Qualified_Outcome_Payload = {
      val r = readFactory_Dispatch_CoordinatorQualified_Outcome_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorQualified_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Qualified_Outcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorQualified_Outcome_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorQualified_OutcomeType()
      return Factory_Dispatch_Coordinator.Qualified_Outcome_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_PhaseType(): Factory_Dispatch_Coordinator.Dispatch_Phase.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Phase.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Phase_Payload(): Factory_Dispatch_Coordinator.Dispatch_Phase_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Phase_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Phase_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Phase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Phase_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_PhaseType()
      return Factory_Dispatch_Coordinator.Dispatch_Phase_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_DispositionType(): Factory_Dispatch_Coordinator.Dispatch_Disposition.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Disposition.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(): Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Disposition_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_DispositionType()
      return Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorShipment_Release_CommandType(): Factory_Dispatch_Coordinator.Shipment_Release_Command.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Shipment_Release_Command.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(): Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload = {
      val r = readFactory_Dispatch_CoordinatorShipment_Release_Command_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipment_Release_Command_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipment_Release_Command_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorShipment_Release_CommandType()
      return Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload(value)
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

    def readFactory_Dispatch_CoordinatorShipping_ConfirmationType(): Factory_Dispatch_Coordinator.Shipping_Confirmation.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Shipping_Confirmation.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorShipping_Confirmation_Payload(): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      val r = readFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipping_Confirmation_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorShipping_ConfirmationType()
      return Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Request_Sample(): Factory_Dispatch_Coordinator.Dispatch_Request_Sample = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Request_SampleT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Request_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Request_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Request_Sample)
      }
      val request_event = readFactory_Dispatch_CoordinatorDispatch_Request_EventType()
      val status = readFactory_Dispatch_CoordinatorInput_StatusType()
      return Factory_Dispatch_Coordinator.Dispatch_Request_Sample(request_event, status)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(): Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Request_Sample_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Request_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Request_Sample_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      return Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorProduct_Availability_Sample(): Factory_Dispatch_Coordinator.Product_Availability_Sample = {
      val r = readFactory_Dispatch_CoordinatorProduct_Availability_SampleT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProduct_Availability_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Availability_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProduct_Availability_Sample)
      }
      val availability = readFactory_Dispatch_CoordinatorProduct_AvailabilityType()
      val status = readFactory_Dispatch_CoordinatorInput_StatusType()
      return Factory_Dispatch_Coordinator.Product_Availability_Sample(availability, status)
    }

    def readFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(): Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload = {
      val r = readFactory_Dispatch_CoordinatorProduct_Availability_Sample_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorProduct_Availability_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorProduct_Availability_Sample_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      return Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Outcome_SampleT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Outcome_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Sample)
      }
      val outcome = readFactory_Dispatch_CoordinatorDispatch_OutcomeType()
      val status = readFactory_Dispatch_CoordinatorInput_StatusType()
      return Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample(outcome, status)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      return Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Resolution(): Factory_Dispatch_Coordinator.Dispatch_Resolution = {
      val r = readFactory_Dispatch_CoordinatorDispatch_ResolutionT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_ResolutionT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Resolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Resolution)
      }
      val next_phase = readFactory_Dispatch_CoordinatorDispatch_PhaseType()
      val next_recovery_required = reader.readB()
      val disposition = readFactory_Dispatch_CoordinatorDispatch_DispositionType()
      return Factory_Dispatch_Coordinator.Dispatch_Resolution(next_phase, next_recovery_required, disposition)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(): Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Resolution_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Resolution_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Resolution_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload(value)
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

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P)
      }
      val api_raw_request = readFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(api_raw_request)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS)
      }
      val api_raw_request = readFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(api_raw_request)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P)
      }
      val api_qualified_request = readFactory_Dispatch_CoordinatorQualified_RequestType()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(api_qualified_request)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS)
      }
      val api_qualified_request = readFactory_Dispatch_CoordinatorQualified_RequestType()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(api_qualified_request)
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P)
      }
      val api_raw_availability = readFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(api_raw_availability)
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS)
      }
      val api_raw_availability = readFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(api_raw_availability)
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P)
      }
      val api_availability_assessment = readFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(api_availability_assessment)
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS)
      }
      val api_availability_assessment = readFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      return Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(api_availability_assessment)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P)
      }
      val api_raw_outcome = readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(api_raw_outcome)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS)
      }
      val api_raw_outcome = readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(api_raw_outcome)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P)
      }
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualified_OutcomeType()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(api_qualified_outcome)
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS)
      }
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualified_OutcomeType()
      return Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(api_qualified_outcome)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P)
      }
      val api_availability_assessment = readFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualified_OutcomeType()
      val api_qualified_request = readFactory_Dispatch_CoordinatorQualified_RequestType()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(api_availability_assessment, api_qualified_outcome, api_qualified_request)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS)
      }
      val In_current_phase = readFactory_Dispatch_CoordinatorDispatch_PhaseType()
      val In_recovery_required = reader.readB()
      val api_availability_assessment = readFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType()
      val api_qualified_outcome = readFactory_Dispatch_CoordinatorQualified_OutcomeType()
      val api_qualified_request = readFactory_Dispatch_CoordinatorQualified_RequestType()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(In_current_phase, In_recovery_required, api_availability_assessment, api_qualified_outcome, api_qualified_request)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P)
      }
      val api_notice_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      val api_release_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(api_notice_resolution, api_release_resolution)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS)
      }
      val current_phase = readFactory_Dispatch_CoordinatorDispatch_PhaseType()
      val recovery_required = reader.readB()
      val api_notice_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      val api_release_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(current_phase, recovery_required, api_notice_resolution, api_release_resolution)
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P)
      }
      val api_dispatch_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(api_dispatch_resolution)
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS)
      }
      val api_dispatch_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(api_dispatch_resolution)
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P)
      }
      val api_shipment_release_command = readFactory_Dispatch_CoordinatorShipment_Release_CommandType()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(api_shipment_release_command)
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS)
      }
      val api_shipment_release_command = readFactory_Dispatch_CoordinatorShipment_Release_CommandType()
      return Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(api_shipment_release_command)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P)
      }
      val api_dispatch_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(api_dispatch_resolution)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS)
      }
      val api_dispatch_resolution = readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(api_dispatch_resolution)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P)
      }
      val api_dispatch_status = readFactory_Dispatch_CoordinatorDispatch_StatusType()
      val api_shipping_confirmation = readFactory_Dispatch_CoordinatorShipping_ConfirmationType()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(api_dispatch_status, api_shipping_confirmation)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS)
      }
      val api_dispatch_status = readFactory_Dispatch_CoordinatorDispatch_StatusType()
      val api_shipping_confirmation = readFactory_Dispatch_CoordinatorShipping_ConfirmationType()
      return Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(api_dispatch_status, api_shipping_confirmation)
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
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T)
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
        case Constants.Factory_Dispatch_CoordinatorInput_Status_Payload => val r = readFactory_Dispatch_CoordinatorInput_Status_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Phase_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Phase_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Status_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Status_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Outcome_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQualified_Request_Payload => val r = readFactory_Dispatch_CoordinatorQualified_Request_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorQualified_Outcome_Payload => val r = readFactory_Dispatch_CoordinatorQualified_Outcome_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Resolution_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Resolution_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProduct_Availability_Payload => val r = readFactory_Dispatch_CoordinatorProduct_Availability_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Disposition_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorShipping_Confirmation_Payload => val r = readFactory_Dispatch_CoordinatorShipping_Confirmation_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Request_Event_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Request_Event_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Request_Sample_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Request_Sample_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorShipment_Release_Command_Payload => val r = readFactory_Dispatch_CoordinatorShipment_Release_Command_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorProduct_Availability_Sample_Payload => val r = readFactory_Dispatch_CoordinatorProduct_Availability_Sample_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_Value_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PST(T)
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

  def fromFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInput_Status_Payload(o: Factory_Dispatch_Coordinator.Input_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInput_Status_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInput_Status_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Input_Status_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInput_Status_Payload(reader: Reader): Factory_Dispatch_Coordinator.Input_Status_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorInput_Status_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInput_Status_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualified_Request_Payload(o: Factory_Dispatch_Coordinator.Qualified_Request_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQualified_Request_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQualified_Request_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Qualified_Request_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Request_Payload(reader: Reader): Factory_Dispatch_Coordinator.Qualified_Request_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorQualified_Request_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQualified_Request_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Availability_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProduct_Availability_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProduct_Availability_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Product_Availability_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Availability_Payload(reader: Reader): Factory_Dispatch_Coordinator.Product_Availability_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorProduct_Availability_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProduct_Availability_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(reader: Reader): Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Outcome_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Outcome_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorQualified_Outcome_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorQualified_Outcome_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Qualified_Outcome_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorQualified_Outcome_Payload(reader: Reader): Factory_Dispatch_Coordinator.Qualified_Outcome_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorQualified_Outcome_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorQualified_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Phase_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Phase_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Phase_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Phase_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Phase_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Phase_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Phase_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Disposition_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Disposition_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Release_Command_Payload(reader: Reader): Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorShipment_Release_Command_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorShipment_Release_Command_Payload _)
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

  def fromFactory_Dispatch_CoordinatorDispatch_Request_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Request_Sample(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Request_Sample(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Request_Sample, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Request_Sample(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Request_Sample = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Request_Sample()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Request_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Availability_Sample(o: Factory_Dispatch_Coordinator.Product_Availability_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProduct_Availability_Sample(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProduct_Availability_Sample(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Product_Availability_Sample, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Availability_Sample(reader: Reader): Factory_Dispatch_Coordinator.Product_Availability_Sample = {
      val r = reader.readFactory_Dispatch_CoordinatorProduct_Availability_Sample()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProduct_Availability_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(reader: Reader): Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Resolution(o: Factory_Dispatch_Coordinator.Dispatch_Resolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Resolution(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Resolution(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Resolution, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Resolution(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Resolution = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Resolution()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Resolution _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Resolution_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Resolution_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Resolution_Payload _)
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

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS _)
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