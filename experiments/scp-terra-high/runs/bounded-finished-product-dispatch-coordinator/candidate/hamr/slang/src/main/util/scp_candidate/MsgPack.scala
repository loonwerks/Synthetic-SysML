// #Sireum
// @formatter:off

// This file is auto-generated from Request_Arrival_Sample.scala, Arrival_Fact.scala, Shipment_Result_Sample.scala, Registry_Instruction.scala, Pending_Request_View.scala, Request_Value.scala, Registry_Outcome.scala, Angle_A_Stock_Band.scala, Angle_B_Stock_Band.scala, Input_Status.scala, Inventory_Finding.scala, Dispatch_Readiness.scala, Shipment_Release_Directive.scala, Dispatch_Disposition.scala, Customer_Dispatch_Notice.scala, Dispatch_Candidate.scala, Inventory_Sample.scala, Dispatch_Readiness_Sample.scala, Base_Types.scala, Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala, Request_Registry_dispatch_coordination_process_request_registry_Containers.scala, Inventory_Assessment_dispatch_coordination_process_inventory_assessment_Containers.scala, Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_Containers.scala, Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Factory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload: Z = -32

    val Factory_Dispatch_CoordinatorArrival_Fact_Payload: Z = -31

    val Factory_Dispatch_CoordinatorShipment_Result_Sample_Payload: Z = -30

    val Factory_Dispatch_CoordinatorRegistry_Instruction_Payload: Z = -29

    val Factory_Dispatch_CoordinatorPending_Request_View_Payload: Z = -28

    val Factory_Dispatch_CoordinatorRequest_Value_Payload: Z = -27

    val Factory_Dispatch_CoordinatorRegistry_Outcome_Payload: Z = -26

    val Factory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload: Z = -25

    val Factory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload: Z = -24

    val Factory_Dispatch_CoordinatorInput_Status_Payload: Z = -23

    val Factory_Dispatch_CoordinatorInventory_Finding_Payload: Z = -22

    val Factory_Dispatch_CoordinatorDispatch_Readiness_Payload: Z = -21

    val Factory_Dispatch_CoordinatorShipment_Release_Directive_Payload: Z = -20

    val Factory_Dispatch_CoordinatorDispatch_Disposition_Payload: Z = -19

    val Factory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload: Z = -18

    val Factory_Dispatch_CoordinatorDispatch_Candidate: Z = -17

    val Factory_Dispatch_CoordinatorDispatch_Candidate_Payload: Z = -16

    val Factory_Dispatch_CoordinatorInventory_Sample: Z = -15

    val Factory_Dispatch_CoordinatorInventory_Sample_Payload: Z = -14

    val Factory_Dispatch_CoordinatorDispatch_Readiness_Sample: Z = -13

    val Factory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload: Z = -12

    val Base_TypesBoolean_Payload: Z = -11

    val Base_TypesInteger_Payload: Z = -10

    val Base_TypesInteger_8_Payload: Z = -9

    val Base_TypesInteger_16_Payload: Z = -8

    val Base_TypesInteger_32_Payload: Z = -7

    val Base_TypesInteger_64_Payload: Z = -6

    val Base_TypesUnsigned_8_Payload: Z = -5

    val Base_TypesUnsigned_16_Payload: Z = -4

    val Base_TypesUnsigned_32_Payload: Z = -3

    val Base_TypesUnsigned_64_Payload: Z = -2

    val Base_TypesFloat_Payload: Z = -1

    val Base_TypesFloat_32_Payload: Z = 0

    val Base_TypesFloat_64_Payload: Z = 1

    val Base_TypesCharacter_Payload: Z = 2

    val Base_TypesString_Payload: Z = 3

    val Base_TypesBits_Payload: Z = 4

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P: Z = 5

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS: Z = 6

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P: Z = 7

    val Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS: Z = 8

    val Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P: Z = 9

    val Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS: Z = 10

    val Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P: Z = 11

    val Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS: Z = 12

    val Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P: Z = 13

    val Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS: Z = 14

    val Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P: Z = 15

    val Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS: Z = 16

    val Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P: Z = 17

    val Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS: Z = 18

    val Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P: Z = 19

    val Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS: Z = 20

    val Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P: Z = 21

    val Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS: Z = 22

    val Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P: Z = 23

    val Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS: Z = 24

    val utilEmptyContainer: Z = 25

    val _artEmpty: Z = 26

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o: Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload)
      writeFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorArrival_FactType(o: Factory_Dispatch_Coordinator.Arrival_Fact.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorArrival_Fact_Payload(o: Factory_Dispatch_Coordinator.Arrival_Fact_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorArrival_Fact_Payload)
      writeFactory_Dispatch_CoordinatorArrival_FactType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Result_SampleType(o: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipment_Result_Sample_Payload)
      writeFactory_Dispatch_CoordinatorShipment_Result_SampleType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRegistry_InstructionType(o: Factory_Dispatch_Coordinator.Registry_Instruction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o: Factory_Dispatch_Coordinator.Registry_Instruction_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRegistry_Instruction_Payload)
      writeFactory_Dispatch_CoordinatorRegistry_InstructionType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorPending_Request_ViewType(o: Factory_Dispatch_Coordinator.Pending_Request_View.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorPending_Request_View_Payload(o: Factory_Dispatch_Coordinator.Pending_Request_View_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorPending_Request_View_Payload)
      writeFactory_Dispatch_CoordinatorPending_Request_ViewType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRequest_ValueType(o: Factory_Dispatch_Coordinator.Request_Value.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Value_Payload(o: Factory_Dispatch_Coordinator.Request_Value_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Value_Payload)
      writeFactory_Dispatch_CoordinatorRequest_ValueType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorRegistry_OutcomeType(o: Factory_Dispatch_Coordinator.Registry_Outcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o: Factory_Dispatch_Coordinator.Registry_Outcome_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRegistry_Outcome_Payload)
      writeFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload)
      writeFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload)
      writeFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInput_StatusType(o: Factory_Dispatch_Coordinator.Input_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorInput_Status_Payload(o: Factory_Dispatch_Coordinator.Input_Status_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInput_Status_Payload)
      writeFactory_Dispatch_CoordinatorInput_StatusType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInventory_FindingType(o: Factory_Dispatch_Coordinator.Inventory_Finding.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Finding_Payload(o: Factory_Dispatch_Coordinator.Inventory_Finding_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Finding_Payload)
      writeFactory_Dispatch_CoordinatorInventory_FindingType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_ReadinessType(o: Factory_Dispatch_Coordinator.Dispatch_Readiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_ReadinessType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o: Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorShipment_Release_Directive_Payload)
      writeFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Disposition_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload)
      writeFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Candidate(o: Factory_Dispatch_Coordinator.Dispatch_Candidate): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Candidate)
      writeFactory_Dispatch_CoordinatorRequest_ValueType(o.request)
      writer.writeB(o.event_blocked)
      writer.writeB(o.recovery_hold)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Candidate_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Candidate(o.value)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Sample(o: Factory_Dispatch_Coordinator.Inventory_Sample): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Sample)
      writeFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(o.stock_band_angle_a)
      writeFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(o.stock_band_angle_b)
      writeFactory_Dispatch_CoordinatorInput_StatusType(o.status)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Sample_Payload(o: Factory_Dispatch_Coordinator.Inventory_Sample_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Sample_Payload)
      writeFactory_Dispatch_CoordinatorInventory_Sample(o.value)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Sample)
      writeFactory_Dispatch_CoordinatorDispatch_ReadinessType(o.readiness)
      writeFactory_Dispatch_CoordinatorInput_StatusType(o.status)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload)
      writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o.value)
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
      writeFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o.api_request_arrival)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(o.api_request_arrival)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact)
      writeFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)
      writeFactory_Dispatch_CoordinatorShipment_Result_SampleType(o.api_shipment_result)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorArrival_FactType(o.api_arrival_fact)
      writeFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)
      writeFactory_Dispatch_CoordinatorShipment_Result_SampleType(o.api_shipment_result)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)
      writeFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request)
      writeFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome)
    }

    def writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)
      writeFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request)
      writeFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorInventory_Sample(o.api_inventory_evidence)
      writeFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorInventory_Sample(o.api_inventory_evidence)
      writeFactory_Dispatch_CoordinatorPending_Request_ViewType(o.api_pending_request)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding)
    }

    def writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)
      writeFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding)
      writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o.api_readiness_sample)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_Candidate(o.api_dispatch_candidate)
      writeFactory_Dispatch_CoordinatorInventory_FindingType(o.api_inventory_finding)
      writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o.api_readiness_sample)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)
      writeFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)
      writeFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o.api_shipment_release)
    }

    def writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)
      writeFactory_Dispatch_CoordinatorRegistry_InstructionType(o.api_registry_instruction)
      writeFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(o.api_shipment_release)
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P)
      writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)
      writeFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome)
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS)
      writeFactory_Dispatch_CoordinatorDispatch_DispositionType(o.api_dispatch_disposition)
      writeFactory_Dispatch_CoordinatorRegistry_OutcomeType(o.api_registry_outcome)
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container): Unit = {
      o match {
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
      }
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P)
      writeFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o.api_customer_notice)
    }

    def writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS)
      writeFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(o.api_customer_notice)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
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
        case o: Factory_Dispatch_Coordinator.Arrival_Fact_Payload => writeFactory_Dispatch_CoordinatorArrival_Fact_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Value_Payload => writeFactory_Dispatch_CoordinatorRequest_Value_Payload(o)
        case o: Factory_Dispatch_Coordinator.Registry_Outcome_Payload => writeFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Sample_Payload => writeFactory_Dispatch_CoordinatorInventory_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Finding_Payload => writeFactory_Dispatch_CoordinatorInventory_Finding_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload => writeFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o)
        case o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload => writeFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o)
        case o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload => writeFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload => writeFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload => writeFactory_Dispatch_CoordinatorDispatch_Disposition_Payload(o)
        case o: Factory_Dispatch_Coordinator.Pending_Request_View_Payload => writeFactory_Dispatch_CoordinatorPending_Request_View_Payload(o)
        case o: Factory_Dispatch_Coordinator.Registry_Instruction_Payload => writeFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload => writeFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload => writeFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload => writeFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload => writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o)
        case o: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload => writeFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => writeFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
        case o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
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

    def readFactory_Dispatch_CoordinatorRequest_Arrival_SampleType(): Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Request_Arrival_Sample.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(): Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload = {
      val r = readFactory_Dispatch_CoordinatorRequest_Arrival_Sample_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Arrival_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRequest_Arrival_SampleType()
      return Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorArrival_FactType(): Factory_Dispatch_Coordinator.Arrival_Fact.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Arrival_Fact.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorArrival_Fact_Payload(): Factory_Dispatch_Coordinator.Arrival_Fact_Payload = {
      val r = readFactory_Dispatch_CoordinatorArrival_Fact_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorArrival_Fact_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Arrival_Fact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorArrival_Fact_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorArrival_FactType()
      return Factory_Dispatch_Coordinator.Arrival_Fact_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorShipment_Result_SampleType(): Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Shipment_Result_Sample.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(): Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload = {
      val r = readFactory_Dispatch_CoordinatorShipment_Result_Sample_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipment_Result_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipment_Result_Sample_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorShipment_Result_SampleType()
      return Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRegistry_InstructionType(): Factory_Dispatch_Coordinator.Registry_Instruction.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Registry_Instruction.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(): Factory_Dispatch_Coordinator.Registry_Instruction_Payload = {
      val r = readFactory_Dispatch_CoordinatorRegistry_Instruction_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRegistry_Instruction_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Registry_Instruction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRegistry_Instruction_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRegistry_InstructionType()
      return Factory_Dispatch_Coordinator.Registry_Instruction_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorPending_Request_ViewType(): Factory_Dispatch_Coordinator.Pending_Request_View.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Pending_Request_View.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorPending_Request_View_Payload(): Factory_Dispatch_Coordinator.Pending_Request_View_Payload = {
      val r = readFactory_Dispatch_CoordinatorPending_Request_View_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorPending_Request_View_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Pending_Request_View_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorPending_Request_View_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorPending_Request_ViewType()
      return Factory_Dispatch_Coordinator.Pending_Request_View_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRequest_ValueType(): Factory_Dispatch_Coordinator.Request_Value.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Request_Value.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRequest_Value_Payload(): Factory_Dispatch_Coordinator.Request_Value_Payload = {
      val r = readFactory_Dispatch_CoordinatorRequest_Value_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Value_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Value_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Value_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRequest_ValueType()
      return Factory_Dispatch_Coordinator.Request_Value_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorRegistry_OutcomeType(): Factory_Dispatch_Coordinator.Registry_Outcome.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Registry_Outcome.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(): Factory_Dispatch_Coordinator.Registry_Outcome_Payload = {
      val r = readFactory_Dispatch_CoordinatorRegistry_Outcome_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRegistry_Outcome_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Registry_Outcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRegistry_Outcome_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      return Factory_Dispatch_Coordinator.Registry_Outcome_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorAngle_A_Stock_BandType(): Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Angle_A_Stock_Band.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(): Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload = {
      val r = readFactory_Dispatch_CoordinatorAngle_A_Stock_Band_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAngle_A_Stock_Band_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorAngle_A_Stock_BandType()
      return Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorAngle_B_Stock_BandType(): Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Angle_B_Stock_Band.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(): Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload = {
      val r = readFactory_Dispatch_CoordinatorAngle_B_Stock_Band_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorAngle_B_Stock_Band_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorAngle_B_Stock_BandType()
      return Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload(value)
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

    def readFactory_Dispatch_CoordinatorInventory_FindingType(): Factory_Dispatch_Coordinator.Inventory_Finding.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Inventory_Finding.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorInventory_Finding_Payload(): Factory_Dispatch_Coordinator.Inventory_Finding_Payload = {
      val r = readFactory_Dispatch_CoordinatorInventory_Finding_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Finding_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Finding_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Finding_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorInventory_FindingType()
      return Factory_Dispatch_Coordinator.Inventory_Finding_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_ReadinessType(): Factory_Dispatch_Coordinator.Dispatch_Readiness.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Dispatch_Readiness.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(): Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Readiness_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Readiness_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_ReadinessType()
      return Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorShipment_Release_DirectiveType(): Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Shipment_Release_Directive.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(): Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload = {
      val r = readFactory_Dispatch_CoordinatorShipment_Release_Directive_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorShipment_Release_Directive_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorShipment_Release_Directive_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorShipment_Release_DirectiveType()
      return Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload(value)
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

    def readFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type = {
      val r = reader.readZ()
      return Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.byOrdinal(r).get
    }

    def readFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload = {
      val r = readFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType()
      return Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Candidate(): Factory_Dispatch_Coordinator.Dispatch_Candidate = {
      val r = readFactory_Dispatch_CoordinatorDispatch_CandidateT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_CandidateT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Candidate = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Candidate)
      }
      val request = readFactory_Dispatch_CoordinatorRequest_ValueType()
      val event_blocked = reader.readB()
      val recovery_hold = reader.readB()
      return Factory_Dispatch_Coordinator.Dispatch_Candidate(request, event_blocked, recovery_hold)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(): Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Candidate_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Candidate_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Candidate_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Candidate()
      return Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorInventory_Sample(): Factory_Dispatch_Coordinator.Inventory_Sample = {
      val r = readFactory_Dispatch_CoordinatorInventory_SampleT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Sample)
      }
      val stock_band_angle_a = readFactory_Dispatch_CoordinatorAngle_A_Stock_BandType()
      val stock_band_angle_b = readFactory_Dispatch_CoordinatorAngle_B_Stock_BandType()
      val status = readFactory_Dispatch_CoordinatorInput_StatusType()
      return Factory_Dispatch_Coordinator.Inventory_Sample(stock_band_angle_a, stock_band_angle_b, status)
    }

    def readFactory_Dispatch_CoordinatorInventory_Sample_Payload(): Factory_Dispatch_Coordinator.Inventory_Sample_Payload = {
      val r = readFactory_Dispatch_CoordinatorInventory_Sample_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Sample_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorInventory_Sample()
      return Factory_Dispatch_Coordinator.Inventory_Sample_Payload(value)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Readiness_SampleT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Readiness_SampleT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Sample)
      }
      val readiness = readFactory_Dispatch_CoordinatorDispatch_ReadinessType()
      val status = readFactory_Dispatch_CoordinatorInput_StatusType()
      return Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample(readiness, status)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_PayloadT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_PayloadT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload)
      }
      val value = readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      return Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload(value)
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
      val api_request_arrival = readFactory_Dispatch_CoordinatorRequest_Arrival_SampleType()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(api_request_arrival)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS)
      }
      val api_request_arrival = readFactory_Dispatch_CoordinatorRequest_Arrival_SampleType()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(api_request_arrival)
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
      val api_arrival_fact = readFactory_Dispatch_CoordinatorArrival_FactType()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(api_arrival_fact)
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS)
      }
      val api_arrival_fact = readFactory_Dispatch_CoordinatorArrival_FactType()
      return Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(api_arrival_fact)
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P)
      }
      val api_arrival_fact = readFactory_Dispatch_CoordinatorArrival_FactType()
      val api_registry_instruction = readFactory_Dispatch_CoordinatorRegistry_InstructionType()
      val api_shipment_result = readFactory_Dispatch_CoordinatorShipment_Result_SampleType()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(api_arrival_fact, api_registry_instruction, api_shipment_result)
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS)
      }
      val api_arrival_fact = readFactory_Dispatch_CoordinatorArrival_FactType()
      val api_registry_instruction = readFactory_Dispatch_CoordinatorRegistry_InstructionType()
      val api_shipment_result = readFactory_Dispatch_CoordinatorShipment_Result_SampleType()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(api_arrival_fact, api_registry_instruction, api_shipment_result)
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P)
      }
      val api_dispatch_candidate = readFactory_Dispatch_CoordinatorDispatch_Candidate()
      val api_pending_request = readFactory_Dispatch_CoordinatorPending_Request_ViewType()
      val api_registry_outcome = readFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(api_dispatch_candidate, api_pending_request, api_registry_outcome)
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS)
      }
      val api_dispatch_candidate = readFactory_Dispatch_CoordinatorDispatch_Candidate()
      val api_pending_request = readFactory_Dispatch_CoordinatorPending_Request_ViewType()
      val api_registry_outcome = readFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      return Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(api_dispatch_candidate, api_pending_request, api_registry_outcome)
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P)
      }
      val api_inventory_evidence = readFactory_Dispatch_CoordinatorInventory_Sample()
      val api_pending_request = readFactory_Dispatch_CoordinatorPending_Request_ViewType()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(api_inventory_evidence, api_pending_request)
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS)
      }
      val api_inventory_evidence = readFactory_Dispatch_CoordinatorInventory_Sample()
      val api_pending_request = readFactory_Dispatch_CoordinatorPending_Request_ViewType()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(api_inventory_evidence, api_pending_request)
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P)
      }
      val api_inventory_finding = readFactory_Dispatch_CoordinatorInventory_FindingType()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(api_inventory_finding)
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS)
      }
      val api_inventory_finding = readFactory_Dispatch_CoordinatorInventory_FindingType()
      return Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(api_inventory_finding)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P)
      }
      val api_dispatch_candidate = readFactory_Dispatch_CoordinatorDispatch_Candidate()
      val api_inventory_finding = readFactory_Dispatch_CoordinatorInventory_FindingType()
      val api_readiness_sample = readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(api_dispatch_candidate, api_inventory_finding, api_readiness_sample)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS)
      }
      val api_dispatch_candidate = readFactory_Dispatch_CoordinatorDispatch_Candidate()
      val api_inventory_finding = readFactory_Dispatch_CoordinatorInventory_FindingType()
      val api_readiness_sample = readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(api_dispatch_candidate, api_inventory_finding, api_readiness_sample)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P)
      }
      val api_dispatch_disposition = readFactory_Dispatch_CoordinatorDispatch_DispositionType()
      val api_registry_instruction = readFactory_Dispatch_CoordinatorRegistry_InstructionType()
      val api_shipment_release = readFactory_Dispatch_CoordinatorShipment_Release_DirectiveType()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(api_dispatch_disposition, api_registry_instruction, api_shipment_release)
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS)
      }
      val api_dispatch_disposition = readFactory_Dispatch_CoordinatorDispatch_DispositionType()
      val api_registry_instruction = readFactory_Dispatch_CoordinatorRegistry_InstructionType()
      val api_shipment_release = readFactory_Dispatch_CoordinatorShipment_Release_DirectiveType()
      return Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(api_dispatch_disposition, api_registry_instruction, api_shipment_release)
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container.")
          val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P)
      }
      val api_dispatch_disposition = readFactory_Dispatch_CoordinatorDispatch_DispositionType()
      val api_registry_outcome = readFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(api_dispatch_disposition, api_registry_outcome)
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS)
      }
      val api_dispatch_disposition = readFactory_Dispatch_CoordinatorDispatch_DispositionType()
      val api_registry_outcome = readFactory_Dispatch_CoordinatorRegistry_OutcomeType()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(api_dispatch_disposition, api_registry_outcome)
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container.")
          val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P = {
      val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P)
      }
      val api_customer_notice = readFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(api_customer_notice)
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS = {
      val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(F)
      return r
    }

    def readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(typeParsed: B): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS)
      }
      val api_customer_notice = readFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType()
      return Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(api_customer_notice)
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
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T)
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
        case Constants.Factory_Dispatch_CoordinatorArrival_Fact_Payload => val r = readFactory_Dispatch_CoordinatorArrival_Fact_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Value_Payload => val r = readFactory_Dispatch_CoordinatorRequest_Value_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRegistry_Outcome_Payload => val r = readFactory_Dispatch_CoordinatorRegistry_Outcome_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Sample_Payload => val r = readFactory_Dispatch_CoordinatorInventory_Sample_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Finding_Payload => val r = readFactory_Dispatch_CoordinatorInventory_Finding_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Readiness_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload => val r = readFactory_Dispatch_CoordinatorAngle_A_Stock_Band_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload => val r = readFactory_Dispatch_CoordinatorAngle_B_Stock_Band_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Candidate_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Candidate_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Disposition_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Disposition_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorPending_Request_View_Payload => val r = readFactory_Dispatch_CoordinatorPending_Request_View_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRegistry_Instruction_Payload => val r = readFactory_Dispatch_CoordinatorRegistry_Instruction_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorShipment_Result_Sample_Payload => val r = readFactory_Dispatch_CoordinatorShipment_Result_Sample_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload => val r = readFactory_Dispatch_CoordinatorRequest_Arrival_Sample_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload => val r = readFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload => val r = readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorShipment_Release_Directive_Payload => val r = readFactory_Dispatch_CoordinatorShipment_Release_Directive_PayloadT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PST(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PT(T); return r
        case Constants.Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PST(T)
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

  def fromFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(reader: Reader): Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorArrival_Fact_Payload(o: Factory_Dispatch_Coordinator.Arrival_Fact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorArrival_Fact_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorArrival_Fact_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Arrival_Fact_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorArrival_Fact_Payload(reader: Reader): Factory_Dispatch_Coordinator.Arrival_Fact_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorArrival_Fact_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorArrival_Fact_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload(reader: Reader): Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o: Factory_Dispatch_Coordinator.Registry_Instruction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Registry_Instruction_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRegistry_Instruction_Payload(reader: Reader): Factory_Dispatch_Coordinator.Registry_Instruction_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRegistry_Instruction_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRegistry_Instruction_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorPending_Request_View_Payload(o: Factory_Dispatch_Coordinator.Pending_Request_View_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorPending_Request_View_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorPending_Request_View_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Pending_Request_View_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorPending_Request_View_Payload(reader: Reader): Factory_Dispatch_Coordinator.Pending_Request_View_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorPending_Request_View_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorPending_Request_View_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Value_Payload(o: Factory_Dispatch_Coordinator.Request_Value_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Value_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Value_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Value_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Value_Payload(reader: Reader): Factory_Dispatch_Coordinator.Request_Value_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Value_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Value_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o: Factory_Dispatch_Coordinator.Registry_Outcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Registry_Outcome_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRegistry_Outcome_Payload(reader: Reader): Factory_Dispatch_Coordinator.Registry_Outcome_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorRegistry_Outcome_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRegistry_Outcome_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(reader: Reader): Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(reader: Reader): Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload _)
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

  def fromFactory_Dispatch_CoordinatorInventory_Finding_Payload(o: Factory_Dispatch_Coordinator.Inventory_Finding_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Finding_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Finding_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Finding_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Finding_Payload(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Finding_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Finding_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Finding_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Readiness_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Readiness_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Readiness_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload(reader: Reader): Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload _)
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

  def fromFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(reader: Reader): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Candidate(o: Factory_Dispatch_Coordinator.Dispatch_Candidate, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Candidate(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Candidate(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Candidate, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Candidate(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Candidate = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Candidate()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Candidate _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Candidate_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Candidate_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Candidate_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Sample(o: Factory_Dispatch_Coordinator.Inventory_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Sample(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Sample(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Sample, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Sample(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Sample = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Sample()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Sample_Payload(o: Factory_Dispatch_Coordinator.Inventory_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Sample_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Sample_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Sample_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Sample_Payload(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Sample_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Sample_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Sample_Payload _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload _)
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

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(reader: Reader): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(reader: Reader): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(reader: Reader): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P _)
    return r
  }

  def fromFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(reader: Reader): Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS = {
      val r = reader.readFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS _)
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