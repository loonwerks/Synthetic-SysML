// #Sireum
// @formatter:off

// This file is auto-generated from Lifecycle_Event.scala, Input_Status.scala, Qualified_Request.scala, Battery_Indication.scala, Battery_Assessment_Value.scala, Lifecycle_Phase.scala, Power_Permission.scala, Attention_Status.scala, Lifecycle_Request_Sample.scala, Battery_Sample.scala, Decision_Disposition.scala, Lifecycle_Actuation.scala, Base_Types.scala, Request_Qualification_governor_process_request_qualification_Containers.scala, Battery_Assessment_governor_process_battery_assessment_Containers.scala, Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_Containers.scala, Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_Containers.scala, Attention_Derivation_governor_process_attention_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_lifecycle_governor

import org.sireum._

object MsgPack {

  object Constants {

    val Drone_Lifecycle_GovernorLifecycle_Event_Payload: Z = -32

    val Drone_Lifecycle_GovernorInput_Status_Payload: Z = -31

    val Drone_Lifecycle_GovernorQualified_Request_Payload: Z = -30

    val Drone_Lifecycle_GovernorBattery_Indication_Payload: Z = -29

    val Drone_Lifecycle_GovernorBattery_Assessment_Value_Payload: Z = -28

    val Drone_Lifecycle_GovernorLifecycle_Phase_Payload: Z = -27

    val Drone_Lifecycle_GovernorPower_Permission_Payload: Z = -26

    val Drone_Lifecycle_GovernorAttention_Status_Payload: Z = -25

    val Drone_Lifecycle_GovernorLifecycle_Request_Sample: Z = -24

    val Drone_Lifecycle_GovernorLifecycle_Request_Sample_Payload: Z = -23

    val Drone_Lifecycle_GovernorBattery_Sample: Z = -22

    val Drone_Lifecycle_GovernorBattery_Sample_Payload: Z = -21

    val Drone_Lifecycle_GovernorDecision_Disposition: Z = -20

    val Drone_Lifecycle_GovernorDecision_Disposition_Payload: Z = -19

    val Drone_Lifecycle_GovernorLifecycle_Actuation: Z = -18

    val Drone_Lifecycle_GovernorLifecycle_Actuation_Payload: Z = -17

    val Base_TypesBoolean_Payload: Z = -16

    val Base_TypesInteger_Payload: Z = -15

    val Base_TypesInteger_8_Payload: Z = -14

    val Base_TypesInteger_16_Payload: Z = -13

    val Base_TypesInteger_32_Payload: Z = -12

    val Base_TypesInteger_64_Payload: Z = -11

    val Base_TypesUnsigned_8_Payload: Z = -10

    val Base_TypesUnsigned_16_Payload: Z = -9

    val Base_TypesUnsigned_32_Payload: Z = -8

    val Base_TypesUnsigned_64_Payload: Z = -7

    val Base_TypesFloat_Payload: Z = -6

    val Base_TypesFloat_32_Payload: Z = -5

    val Base_TypesFloat_64_Payload: Z = -4

    val Base_TypesCharacter_Payload: Z = -3

    val Base_TypesString_Payload: Z = -2

    val Base_TypesBits_Payload: Z = -1

    val Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P: Z = 0

    val Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS: Z = 1

    val Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P: Z = 2

    val Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS: Z = 3

    val Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P: Z = 4

    val Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS: Z = 5

    val Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P: Z = 6

    val Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS: Z = 7

    val Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P: Z = 8

    val Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS: Z = 9

    val Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P: Z = 10

    val Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS: Z = 11

    val Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P: Z = 12

    val Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS: Z = 13

    val Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P: Z = 14

    val Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS: Z = 15

    val Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P: Z = 16

    val Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS: Z = 17

    val Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P: Z = 18

    val Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS: Z = 19

    val utilEmptyContainer: Z = 20

    val _artEmpty: Z = 21

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDrone_Lifecycle_GovernorLifecycle_EventType(o: Drone_Lifecycle_Governor.Lifecycle_Event.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Event_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Event_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Event_Payload)
      writeDrone_Lifecycle_GovernorLifecycle_EventType(o.value)
    }

    def writeDrone_Lifecycle_GovernorInput_StatusType(o: Drone_Lifecycle_Governor.Input_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorInput_Status_Payload(o: Drone_Lifecycle_Governor.Input_Status_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorInput_Status_Payload)
      writeDrone_Lifecycle_GovernorInput_StatusType(o.value)
    }

    def writeDrone_Lifecycle_GovernorQualified_RequestType(o: Drone_Lifecycle_Governor.Qualified_Request.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorQualified_Request_Payload(o: Drone_Lifecycle_Governor.Qualified_Request_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorQualified_Request_Payload)
      writeDrone_Lifecycle_GovernorQualified_RequestType(o.value)
    }

    def writeDrone_Lifecycle_GovernorBattery_IndicationType(o: Drone_Lifecycle_Governor.Battery_Indication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorBattery_Indication_Payload(o: Drone_Lifecycle_Governor.Battery_Indication_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Indication_Payload)
      writeDrone_Lifecycle_GovernorBattery_IndicationType(o.value)
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o: Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_Value_Payload)
      writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.value)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o: Drone_Lifecycle_Governor.Lifecycle_Phase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Phase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Phase_Payload)
      writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o.value)
    }

    def writeDrone_Lifecycle_GovernorPower_PermissionType(o: Drone_Lifecycle_Governor.Power_Permission.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorPower_Permission_Payload(o: Drone_Lifecycle_Governor.Power_Permission_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPower_Permission_Payload)
      writeDrone_Lifecycle_GovernorPower_PermissionType(o.value)
    }

    def writeDrone_Lifecycle_GovernorAttention_StatusType(o: Drone_Lifecycle_Governor.Attention_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorAttention_Status_Payload(o: Drone_Lifecycle_Governor.Attention_Status_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorAttention_Status_Payload)
      writeDrone_Lifecycle_GovernorAttention_StatusType(o.value)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Request_Sample(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Request_Sample)
      writeDrone_Lifecycle_GovernorLifecycle_EventType(o.request_event)
      writeDrone_Lifecycle_GovernorInput_StatusType(o.status)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Request_Sample_Payload)
      writeDrone_Lifecycle_GovernorLifecycle_Request_Sample(o.value)
    }

    def writeDrone_Lifecycle_GovernorBattery_Sample(o: Drone_Lifecycle_Governor.Battery_Sample): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Sample)
      writeDrone_Lifecycle_GovernorBattery_IndicationType(o.indication)
      writeDrone_Lifecycle_GovernorInput_StatusType(o.status)
    }

    def writeDrone_Lifecycle_GovernorBattery_Sample_Payload(o: Drone_Lifecycle_Governor.Battery_Sample_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Sample_Payload)
      writeDrone_Lifecycle_GovernorBattery_Sample(o.value)
    }

    def writeDrone_Lifecycle_GovernorDecision_Disposition(o: Drone_Lifecycle_Governor.Decision_Disposition): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorDecision_Disposition)
      writer.writeB(o.input_fault_detected)
      writer.writeB(o.recovery_pending)
    }

    def writeDrone_Lifecycle_GovernorDecision_Disposition_Payload(o: Drone_Lifecycle_Governor.Decision_Disposition_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorDecision_Disposition_Payload)
      writeDrone_Lifecycle_GovernorDecision_Disposition(o.value)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Actuation(o: Drone_Lifecycle_Governor.Lifecycle_Actuation): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Actuation)
      writeDrone_Lifecycle_GovernorPower_PermissionType(o.power)
      writer.writeB(o.charging_permitted)
      writer.writeB(o.flight_permitted)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Actuation_Payload)
      writeDrone_Lifecycle_GovernorLifecycle_Actuation(o.value)
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

    def writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P)
      writeDrone_Lifecycle_GovernorLifecycle_Request_Sample(o.api_raw_request)
    }

    def writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorLifecycle_Request_Sample(o.api_raw_request)
    }

    def writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P)
      writeDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request)
    }

    def writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request)
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P)
      writeDrone_Lifecycle_GovernorBattery_Sample(o.api_raw_battery)
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorBattery_Sample(o.api_raw_battery)
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P)
      writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)
    }

    def writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P)
      writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)
      writeDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)
      writeDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P)
      writeDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition)
      writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_phase_report)
      writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase)
    }

    def writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition)
      writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_phase_report)
      writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase)
    }

    def writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P)
      writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase)
    }

    def writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase)
    }

    def writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P)
      writeDrone_Lifecycle_GovernorLifecycle_Actuation(o.api_lifecycle_actuation)
    }

    def writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorLifecycle_Actuation(o.api_lifecycle_actuation)
    }

    def writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P)
      writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)
      writeDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition)
    }

    def writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)
      writeDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition)
    }

    def writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P)
      writeDrone_Lifecycle_GovernorAttention_StatusType(o.api_attention_status)
    }

    def writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorAttention_StatusType(o.api_attention_status)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
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
        case o: Drone_Lifecycle_Governor.Input_Status_Payload => writeDrone_Lifecycle_GovernorInput_Status_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Sample_Payload => writeDrone_Lifecycle_GovernorBattery_Sample_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Phase_Payload => writeDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Event_Payload => writeDrone_Lifecycle_GovernorLifecycle_Event_Payload(o)
        case o: Drone_Lifecycle_Governor.Power_Permission_Payload => writeDrone_Lifecycle_GovernorPower_Permission_Payload(o)
        case o: Drone_Lifecycle_Governor.Attention_Status_Payload => writeDrone_Lifecycle_GovernorAttention_Status_Payload(o)
        case o: Drone_Lifecycle_Governor.Qualified_Request_Payload => writeDrone_Lifecycle_GovernorQualified_Request_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Indication_Payload => writeDrone_Lifecycle_GovernorBattery_Indication_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload => writeDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o)
        case o: Drone_Lifecycle_Governor.Decision_Disposition_Payload => writeDrone_Lifecycle_GovernorDecision_Disposition_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload => writeDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload => writeDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS => writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS => writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS => writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
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

    def readDrone_Lifecycle_GovernorLifecycle_EventType(): Drone_Lifecycle_Governor.Lifecycle_Event.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Lifecycle_Event.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorLifecycle_Event_Payload(): Drone_Lifecycle_Governor.Lifecycle_Event_Payload = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Event_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Event_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Event_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Event_Payload)
      }
      val value = readDrone_Lifecycle_GovernorLifecycle_EventType()
      return Drone_Lifecycle_Governor.Lifecycle_Event_Payload(value)
    }

    def readDrone_Lifecycle_GovernorInput_StatusType(): Drone_Lifecycle_Governor.Input_Status.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Input_Status.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorInput_Status_Payload(): Drone_Lifecycle_Governor.Input_Status_Payload = {
      val r = readDrone_Lifecycle_GovernorInput_Status_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorInput_Status_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Input_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorInput_Status_Payload)
      }
      val value = readDrone_Lifecycle_GovernorInput_StatusType()
      return Drone_Lifecycle_Governor.Input_Status_Payload(value)
    }

    def readDrone_Lifecycle_GovernorQualified_RequestType(): Drone_Lifecycle_Governor.Qualified_Request.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Qualified_Request.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorQualified_Request_Payload(): Drone_Lifecycle_Governor.Qualified_Request_Payload = {
      val r = readDrone_Lifecycle_GovernorQualified_Request_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorQualified_Request_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Qualified_Request_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorQualified_Request_Payload)
      }
      val value = readDrone_Lifecycle_GovernorQualified_RequestType()
      return Drone_Lifecycle_Governor.Qualified_Request_Payload(value)
    }

    def readDrone_Lifecycle_GovernorBattery_IndicationType(): Drone_Lifecycle_Governor.Battery_Indication.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Battery_Indication.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorBattery_Indication_Payload(): Drone_Lifecycle_Governor.Battery_Indication_Payload = {
      val r = readDrone_Lifecycle_GovernorBattery_Indication_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_Indication_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Indication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Indication_Payload)
      }
      val value = readDrone_Lifecycle_GovernorBattery_IndicationType()
      return Drone_Lifecycle_Governor.Battery_Indication_Payload(value)
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_ValueType(): Drone_Lifecycle_Governor.Battery_Assessment_Value.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Battery_Assessment_Value.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(): Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload = {
      val r = readDrone_Lifecycle_GovernorBattery_Assessment_Value_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_Value_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_Value_Payload)
      }
      val value = readDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      return Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload(value)
    }

    def readDrone_Lifecycle_GovernorLifecycle_PhaseType(): Drone_Lifecycle_Governor.Lifecycle_Phase.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Lifecycle_Phase.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorLifecycle_Phase_Payload(): Drone_Lifecycle_Governor.Lifecycle_Phase_Payload = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Phase_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Phase_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Phase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Phase_Payload)
      }
      val value = readDrone_Lifecycle_GovernorLifecycle_PhaseType()
      return Drone_Lifecycle_Governor.Lifecycle_Phase_Payload(value)
    }

    def readDrone_Lifecycle_GovernorPower_PermissionType(): Drone_Lifecycle_Governor.Power_Permission.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Power_Permission.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorPower_Permission_Payload(): Drone_Lifecycle_Governor.Power_Permission_Payload = {
      val r = readDrone_Lifecycle_GovernorPower_Permission_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPower_Permission_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Power_Permission_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPower_Permission_Payload)
      }
      val value = readDrone_Lifecycle_GovernorPower_PermissionType()
      return Drone_Lifecycle_Governor.Power_Permission_Payload(value)
    }

    def readDrone_Lifecycle_GovernorAttention_StatusType(): Drone_Lifecycle_Governor.Attention_Status.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.Attention_Status.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorAttention_Status_Payload(): Drone_Lifecycle_Governor.Attention_Status_Payload = {
      val r = readDrone_Lifecycle_GovernorAttention_Status_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorAttention_Status_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Attention_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorAttention_Status_Payload)
      }
      val value = readDrone_Lifecycle_GovernorAttention_StatusType()
      return Drone_Lifecycle_Governor.Attention_Status_Payload(value)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Request_Sample(): Drone_Lifecycle_Governor.Lifecycle_Request_Sample = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Request_SampleT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Request_SampleT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Request_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Request_Sample)
      }
      val request_event = readDrone_Lifecycle_GovernorLifecycle_EventType()
      val status = readDrone_Lifecycle_GovernorInput_StatusType()
      return Drone_Lifecycle_Governor.Lifecycle_Request_Sample(request_event, status)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(): Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Request_Sample_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Request_Sample_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Request_Sample_Payload)
      }
      val value = readDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      return Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload(value)
    }

    def readDrone_Lifecycle_GovernorBattery_Sample(): Drone_Lifecycle_Governor.Battery_Sample = {
      val r = readDrone_Lifecycle_GovernorBattery_SampleT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_SampleT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Sample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Sample)
      }
      val indication = readDrone_Lifecycle_GovernorBattery_IndicationType()
      val status = readDrone_Lifecycle_GovernorInput_StatusType()
      return Drone_Lifecycle_Governor.Battery_Sample(indication, status)
    }

    def readDrone_Lifecycle_GovernorBattery_Sample_Payload(): Drone_Lifecycle_Governor.Battery_Sample_Payload = {
      val r = readDrone_Lifecycle_GovernorBattery_Sample_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_Sample_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Sample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Sample_Payload)
      }
      val value = readDrone_Lifecycle_GovernorBattery_Sample()
      return Drone_Lifecycle_Governor.Battery_Sample_Payload(value)
    }

    def readDrone_Lifecycle_GovernorDecision_Disposition(): Drone_Lifecycle_Governor.Decision_Disposition = {
      val r = readDrone_Lifecycle_GovernorDecision_DispositionT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorDecision_DispositionT(typeParsed: B): Drone_Lifecycle_Governor.Decision_Disposition = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorDecision_Disposition)
      }
      val input_fault_detected = reader.readB()
      val recovery_pending = reader.readB()
      return Drone_Lifecycle_Governor.Decision_Disposition(input_fault_detected, recovery_pending)
    }

    def readDrone_Lifecycle_GovernorDecision_Disposition_Payload(): Drone_Lifecycle_Governor.Decision_Disposition_Payload = {
      val r = readDrone_Lifecycle_GovernorDecision_Disposition_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorDecision_Disposition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Decision_Disposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorDecision_Disposition_Payload)
      }
      val value = readDrone_Lifecycle_GovernorDecision_Disposition()
      return Drone_Lifecycle_Governor.Decision_Disposition_Payload(value)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Actuation(): Drone_Lifecycle_Governor.Lifecycle_Actuation = {
      val r = readDrone_Lifecycle_GovernorLifecycle_ActuationT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_ActuationT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Actuation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Actuation)
      }
      val power = readDrone_Lifecycle_GovernorPower_PermissionType()
      val charging_permitted = reader.readB()
      val flight_permitted = reader.readB()
      return Drone_Lifecycle_Governor.Lifecycle_Actuation(power, charging_permitted, flight_permitted)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(): Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Actuation_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Actuation_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Actuation_Payload)
      }
      val value = readDrone_Lifecycle_GovernorLifecycle_Actuation()
      return Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload(value)
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

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P)
      }
      val api_raw_request = readDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P(api_raw_request)
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS)
      }
      val api_raw_request = readDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS(api_raw_request)
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P)
      }
      val api_qualified_request = readDrone_Lifecycle_GovernorQualified_RequestType()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P(api_qualified_request)
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS)
      }
      val api_qualified_request = readDrone_Lifecycle_GovernorQualified_RequestType()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS(api_qualified_request)
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P)
      }
      val api_raw_battery = readDrone_Lifecycle_GovernorBattery_Sample()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P(api_raw_battery)
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS)
      }
      val api_raw_battery = readDrone_Lifecycle_GovernorBattery_Sample()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS(api_raw_battery)
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P)
      }
      val api_battery_assessment = readDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P(api_battery_assessment)
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS)
      }
      val api_battery_assessment = readDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS(api_battery_assessment)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P)
      }
      val api_battery_assessment = readDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      val api_qualified_request = readDrone_Lifecycle_GovernorQualified_RequestType()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(api_battery_assessment, api_qualified_request)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS)
      }
      val api_battery_assessment = readDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      val api_qualified_request = readDrone_Lifecycle_GovernorQualified_RequestType()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(api_battery_assessment, api_qualified_request)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P)
      }
      val api_decision_disposition = readDrone_Lifecycle_GovernorDecision_Disposition()
      val api_phase_report = readDrone_Lifecycle_GovernorLifecycle_PhaseType()
      val api_selected_phase = readDrone_Lifecycle_GovernorLifecycle_PhaseType()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(api_decision_disposition, api_phase_report, api_selected_phase)
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS)
      }
      val api_decision_disposition = readDrone_Lifecycle_GovernorDecision_Disposition()
      val api_phase_report = readDrone_Lifecycle_GovernorLifecycle_PhaseType()
      val api_selected_phase = readDrone_Lifecycle_GovernorLifecycle_PhaseType()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(api_decision_disposition, api_phase_report, api_selected_phase)
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P)
      }
      val api_selected_phase = readDrone_Lifecycle_GovernorLifecycle_PhaseType()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(api_selected_phase)
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS)
      }
      val api_selected_phase = readDrone_Lifecycle_GovernorLifecycle_PhaseType()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(api_selected_phase)
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P)
      }
      val api_lifecycle_actuation = readDrone_Lifecycle_GovernorLifecycle_Actuation()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(api_lifecycle_actuation)
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS)
      }
      val api_lifecycle_actuation = readDrone_Lifecycle_GovernorLifecycle_Actuation()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(api_lifecycle_actuation)
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P)
      }
      val api_battery_assessment = readDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      val api_decision_disposition = readDrone_Lifecycle_GovernorDecision_Disposition()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P(api_battery_assessment, api_decision_disposition)
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS)
      }
      val api_battery_assessment = readDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      val api_decision_disposition = readDrone_Lifecycle_GovernorDecision_Disposition()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS(api_battery_assessment, api_decision_disposition)
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P)
      }
      val api_attention_status = readDrone_Lifecycle_GovernorAttention_StatusType()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P(api_attention_status)
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS)
      }
      val api_attention_status = readDrone_Lifecycle_GovernorAttention_StatusType()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS(api_attention_status)
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
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T)
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
        case Constants.Drone_Lifecycle_GovernorInput_Status_Payload => val r = readDrone_Lifecycle_GovernorInput_Status_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Sample_Payload => val r = readDrone_Lifecycle_GovernorBattery_Sample_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Phase_Payload => val r = readDrone_Lifecycle_GovernorLifecycle_Phase_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Event_Payload => val r = readDrone_Lifecycle_GovernorLifecycle_Event_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorPower_Permission_Payload => val r = readDrone_Lifecycle_GovernorPower_Permission_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Status_Payload => val r = readDrone_Lifecycle_GovernorAttention_Status_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorQualified_Request_Payload => val r = readDrone_Lifecycle_GovernorQualified_Request_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Indication_Payload => val r = readDrone_Lifecycle_GovernorBattery_Indication_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Actuation_Payload => val r = readDrone_Lifecycle_GovernorLifecycle_Actuation_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorDecision_Disposition_Payload => val r = readDrone_Lifecycle_GovernorDecision_Disposition_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_Value_Payload => val r = readDrone_Lifecycle_GovernorBattery_Assessment_Value_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Request_Sample_Payload => val r = readDrone_Lifecycle_GovernorLifecycle_Request_Sample_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T)
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

  def fromDrone_Lifecycle_GovernorLifecycle_Event_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Event_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Event_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Event_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Event_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Event_Payload(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Event_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Event_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Event_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorInput_Status_Payload(o: Drone_Lifecycle_Governor.Input_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorInput_Status_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorInput_Status_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Input_Status_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorInput_Status_Payload(reader: Reader): Drone_Lifecycle_Governor.Input_Status_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorInput_Status_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorInput_Status_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorQualified_Request_Payload(o: Drone_Lifecycle_Governor.Qualified_Request_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorQualified_Request_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorQualified_Request_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Qualified_Request_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorQualified_Request_Payload(reader: Reader): Drone_Lifecycle_Governor.Qualified_Request_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorQualified_Request_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorQualified_Request_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Indication_Payload(o: Drone_Lifecycle_Governor.Battery_Indication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Indication_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Indication_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Indication_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Indication_Payload(reader: Reader): Drone_Lifecycle_Governor.Battery_Indication_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Indication_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Indication_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o: Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(reader: Reader): Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Phase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Phase_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Phase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Phase_Payload(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Phase_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Phase_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Phase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPower_Permission_Payload(o: Drone_Lifecycle_Governor.Power_Permission_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPower_Permission_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPower_Permission_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Power_Permission_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPower_Permission_Payload(reader: Reader): Drone_Lifecycle_Governor.Power_Permission_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorPower_Permission_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPower_Permission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Status_Payload(o: Drone_Lifecycle_Governor.Attention_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorAttention_Status_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorAttention_Status_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Attention_Status_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Status_Payload(reader: Reader): Drone_Lifecycle_Governor.Attention_Status_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorAttention_Status_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorAttention_Status_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Request_Sample(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Request_Sample(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Request_Sample(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Request_Sample, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Request_Sample(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Request_Sample = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Request_Sample _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Sample(o: Drone_Lifecycle_Governor.Battery_Sample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Sample(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Sample(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Sample, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Sample(reader: Reader): Drone_Lifecycle_Governor.Battery_Sample = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Sample()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Sample _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Sample_Payload(o: Drone_Lifecycle_Governor.Battery_Sample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Sample_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Sample_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Sample_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Sample_Payload(reader: Reader): Drone_Lifecycle_Governor.Battery_Sample_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Sample_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Sample_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecision_Disposition(o: Drone_Lifecycle_Governor.Decision_Disposition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorDecision_Disposition(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorDecision_Disposition(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Decision_Disposition, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecision_Disposition(reader: Reader): Drone_Lifecycle_Governor.Decision_Disposition = {
      val r = reader.readDrone_Lifecycle_GovernorDecision_Disposition()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorDecision_Disposition _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecision_Disposition_Payload(o: Drone_Lifecycle_Governor.Decision_Disposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorDecision_Disposition_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorDecision_Disposition_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Decision_Disposition_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecision_Disposition_Payload(reader: Reader): Drone_Lifecycle_Governor.Decision_Disposition_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorDecision_Disposition_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorDecision_Disposition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Actuation(o: Drone_Lifecycle_Governor.Lifecycle_Actuation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Actuation(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Actuation(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Actuation, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Actuation(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Actuation = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Actuation()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Actuation _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Actuation_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Actuation_Payload _)
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

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS _)
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