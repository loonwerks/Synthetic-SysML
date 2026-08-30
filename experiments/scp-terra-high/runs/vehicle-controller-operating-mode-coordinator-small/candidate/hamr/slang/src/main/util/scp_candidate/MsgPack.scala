// #Sireum
// @formatter:off

// This file is auto-generated from LifecycleEvent.scala, InputStatus.scala, LifecycleAssessment.scala, ConditionEvent.scala, ConditionAssessment.scala, CoordinationClass.scala, ControllerModeDisposition.scala, DecisionReason.scala, CoordinationResult.scala, LifecycleSample.scala, ConditionSample.scala, ModeDecision.scala, Base_Types.scala, LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_Containers.scala, ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_Containers.scala, CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_Containers.scala, ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_Containers.scala, CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Vehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload: Z = -32

    val Vehicle_Controller_Mode_CoordinatorInputStatus_Payload: Z = -31

    val Vehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload: Z = -30

    val Vehicle_Controller_Mode_CoordinatorConditionEvent_Payload: Z = -29

    val Vehicle_Controller_Mode_CoordinatorConditionAssessment_Payload: Z = -28

    val Vehicle_Controller_Mode_CoordinatorCoordinationClass_Payload: Z = -27

    val Vehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload: Z = -26

    val Vehicle_Controller_Mode_CoordinatorDecisionReason_Payload: Z = -25

    val Vehicle_Controller_Mode_CoordinatorCoordinationResult_Payload: Z = -24

    val Vehicle_Controller_Mode_CoordinatorLifecycleSample: Z = -23

    val Vehicle_Controller_Mode_CoordinatorLifecycleSample_Payload: Z = -22

    val Vehicle_Controller_Mode_CoordinatorConditionSample: Z = -21

    val Vehicle_Controller_Mode_CoordinatorConditionSample_Payload: Z = -20

    val Vehicle_Controller_Mode_CoordinatorModeDecision: Z = -19

    val Vehicle_Controller_Mode_CoordinatorModeDecision_Payload: Z = -18

    val Base_TypesBoolean_Payload: Z = -17

    val Base_TypesInteger_Payload: Z = -16

    val Base_TypesInteger_8_Payload: Z = -15

    val Base_TypesInteger_16_Payload: Z = -14

    val Base_TypesInteger_32_Payload: Z = -13

    val Base_TypesInteger_64_Payload: Z = -12

    val Base_TypesUnsigned_8_Payload: Z = -11

    val Base_TypesUnsigned_16_Payload: Z = -10

    val Base_TypesUnsigned_32_Payload: Z = -9

    val Base_TypesUnsigned_64_Payload: Z = -8

    val Base_TypesFloat_Payload: Z = -7

    val Base_TypesFloat_32_Payload: Z = -6

    val Base_TypesFloat_64_Payload: Z = -5

    val Base_TypesCharacter_Payload: Z = -4

    val Base_TypesString_Payload: Z = -3

    val Base_TypesBits_Payload: Z = -2

    val Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P: Z = -1

    val Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS: Z = 0

    val Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P: Z = 1

    val Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS: Z = 2

    val Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P: Z = 3

    val Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS: Z = 4

    val Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P: Z = 5

    val Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS: Z = 6

    val Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P: Z = 7

    val Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS: Z = 8

    val Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P: Z = 9

    val Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS: Z = 10

    val Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P: Z = 11

    val Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS: Z = 12

    val Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P: Z = 13

    val Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS: Z = 14

    val Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P: Z = 15

    val Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS: Z = 16

    val Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P: Z = 17

    val Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS: Z = 18

    val utilEmptyContainer: Z = 19

    val _artEmpty: Z = 20

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeVehicle_Controller_Mode_CoordinatorLifecycleEventType(o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload)
      writeVehicle_Controller_Mode_CoordinatorLifecycleEventType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorInputStatusType(o: Vehicle_Controller_Mode_Coordinator.InputStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorInputStatus_Payload)
      writeVehicle_Controller_Mode_CoordinatorInputStatusType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionEventType(o: Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionEvent_Payload)
      writeVehicle_Controller_Mode_CoordinatorConditionEventType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionAssessment_Payload)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationClassType(o: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationClass_Payload)
      writeVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload)
      writeVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorDecisionReasonType(o: Vehicle_Controller_Mode_Coordinator.DecisionReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorDecisionReason_Payload)
      writeVehicle_Controller_Mode_CoordinatorDecisionReasonType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationResultType(o: Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationResult_Payload)
      writeVehicle_Controller_Mode_CoordinatorCoordinationResultType(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleSample(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleSample)
      writeVehicle_Controller_Mode_CoordinatorLifecycleEventType(o.eventValue)
      writeVehicle_Controller_Mode_CoordinatorInputStatusType(o.status)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleSample_Payload)
      writeVehicle_Controller_Mode_CoordinatorLifecycleSample(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionSample(o: Vehicle_Controller_Mode_Coordinator.ConditionSample): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionSample)
      writeVehicle_Controller_Mode_CoordinatorConditionEventType(o.eventValue)
      writeVehicle_Controller_Mode_CoordinatorInputStatusType(o.status)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionSample_Payload)
      writeVehicle_Controller_Mode_CoordinatorConditionSample(o.value)
    }

    def writeVehicle_Controller_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Mode_Coordinator.ModeDecision): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorModeDecision)
      writeVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.nextMode)
      writeVehicle_Controller_Mode_CoordinatorDecisionReasonType(o.reason)
    }

    def writeVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorModeDecision_Payload)
      writeVehicle_Controller_Mode_CoordinatorModeDecision(o.value)
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

    def writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorLifecycleSample(o.api_lifecycle_sample)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorLifecycleSample(o.api_lifecycle_sample)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_arbiter)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_compatibility)
    }

    def writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_arbiter)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_compatibility)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorConditionSample(o.api_condition_sample)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorConditionSample(o.api_condition_sample)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_arbiter)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_compatibility)
    }

    def writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_arbiter)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_compatibility)
    }

    def writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment)
    }

    def writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment)
    }

    def writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class)
    }

    def writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class)
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)
      writeVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment)
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)
      writeVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class)
      writeVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment)
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision)
    }

    def writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P)
      writeVehicle_Controller_Mode_CoordinatorCoordinationResultType(o.api_coordination_result)
      writeVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.api_mode_disposition)
    }

    def writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS)
      writeVehicle_Controller_Mode_CoordinatorCoordinationResultType(o.api_coordination_result)
      writeVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.api_mode_disposition)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
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
        case o: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload => writeVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload => writeVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload => writeVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload => writeVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload => writeVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload => writeVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload => writeVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload => writeVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload => writeVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload => writeVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload => writeVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload => writeVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
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

    def readVehicle_Controller_Mode_CoordinatorLifecycleEventType(): Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.LifecycleEvent.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(): Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleEvent_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleEvent_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorLifecycleEventType()
      return Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorInputStatusType(): Vehicle_Controller_Mode_Coordinator.InputStatus.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.InputStatus.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorInputStatus_Payload(): Vehicle_Controller_Mode_Coordinator.InputStatus_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorInputStatus_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorInputStatus_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.InputStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorInputStatus_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorInputStatusType()
      return Vehicle_Controller_Mode_Coordinator.InputStatus_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleAssessment_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleAssessment_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionEventType(): Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.ConditionEvent.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(): Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionEvent_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionEvent_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionEvent_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorConditionEventType()
      return Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionAssessmentType(): Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.ConditionAssessment.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(): Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionAssessment_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionAssessment_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionAssessment_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationClassType(): Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.CoordinationClass.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(): Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorCoordinationClass_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationClass_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationClass_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      return Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorControllerModeDisposition_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeDisposition_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorDecisionReasonType(): Vehicle_Controller_Mode_Coordinator.DecisionReason.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.DecisionReason.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(): Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorDecisionReason_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorDecisionReason_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorDecisionReason_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorDecisionReasonType()
      return Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationResultType(): Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Mode_Coordinator.CoordinationResult.byOrdinal(r).get
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(): Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorCoordinationResult_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationResult_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationResult_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorCoordinationResultType()
      return Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleSample(): Vehicle_Controller_Mode_Coordinator.LifecycleSample = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleSampleT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleSampleT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleSample)
      }
      val eventValue = readVehicle_Controller_Mode_CoordinatorLifecycleEventType()
      val status = readVehicle_Controller_Mode_CoordinatorInputStatusType()
      return Vehicle_Controller_Mode_Coordinator.LifecycleSample(eventValue, status)
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(): Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleSample_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleSample_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleSample_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorLifecycleSample()
      return Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionSample(): Vehicle_Controller_Mode_Coordinator.ConditionSample = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionSampleT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionSampleT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionSample)
      }
      val eventValue = readVehicle_Controller_Mode_CoordinatorConditionEventType()
      val status = readVehicle_Controller_Mode_CoordinatorInputStatusType()
      return Vehicle_Controller_Mode_Coordinator.ConditionSample(eventValue, status)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionSample_Payload(): Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionSample_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionSample_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionSample_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorConditionSample()
      return Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload(value)
    }

    def readVehicle_Controller_Mode_CoordinatorModeDecision(): Vehicle_Controller_Mode_Coordinator.ModeDecision = {
      val r = readVehicle_Controller_Mode_CoordinatorModeDecisionT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorModeDecisionT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ModeDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorModeDecision)
      }
      val nextMode = readVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      val reason = readVehicle_Controller_Mode_CoordinatorDecisionReasonType()
      return Vehicle_Controller_Mode_Coordinator.ModeDecision(nextMode, reason)
    }

    def readVehicle_Controller_Mode_CoordinatorModeDecision_Payload(): Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload = {
      val r = readVehicle_Controller_Mode_CoordinatorModeDecision_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorModeDecision_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorModeDecision_Payload)
      }
      val value = readVehicle_Controller_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload(value)
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

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P)
      }
      val api_lifecycle_sample = readVehicle_Controller_Mode_CoordinatorLifecycleSample()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(api_lifecycle_sample)
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS)
      }
      val api_lifecycle_sample = readVehicle_Controller_Mode_CoordinatorLifecycleSample()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(api_lifecycle_sample)
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P)
      }
      val api_assessment_to_arbiter = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      val api_assessment_to_compatibility = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS)
      }
      val api_assessment_to_arbiter = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      val api_assessment_to_compatibility = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P)
      }
      val api_condition_sample = readVehicle_Controller_Mode_CoordinatorConditionSample()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(api_condition_sample)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS)
      }
      val api_condition_sample = readVehicle_Controller_Mode_CoordinatorConditionSample()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(api_condition_sample)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P)
      }
      val api_assessment_to_arbiter = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      val api_assessment_to_compatibility = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS)
      }
      val api_assessment_to_arbiter = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      val api_assessment_to_compatibility = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P)
      }
      val api_condition_assessment = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      val api_lifecycle_assessment = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(api_condition_assessment, api_lifecycle_assessment)
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS)
      }
      val api_condition_assessment = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      val api_lifecycle_assessment = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(api_condition_assessment, api_lifecycle_assessment)
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P)
      }
      val api_coordination_class = readVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(api_coordination_class)
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS)
      }
      val api_coordination_class = readVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(api_coordination_class)
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P)
      }
      val api_condition_assessment = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      val api_coordination_class = readVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      val api_lifecycle_assessment = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(api_condition_assessment, api_coordination_class, api_lifecycle_assessment)
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS)
      }
      val api_condition_assessment = readVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      val api_coordination_class = readVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      val api_lifecycle_assessment = readVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(api_condition_assessment, api_coordination_class, api_lifecycle_assessment)
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P)
      }
      val api_mode_decision = readVehicle_Controller_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(api_mode_decision)
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS)
      }
      val api_mode_decision = readVehicle_Controller_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(api_mode_decision)
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P)
      }
      val api_mode_decision = readVehicle_Controller_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(api_mode_decision)
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS)
      }
      val api_mode_decision = readVehicle_Controller_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(api_mode_decision)
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container.")
          val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P = {
      val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P)
      }
      val api_coordination_result = readVehicle_Controller_Mode_CoordinatorCoordinationResultType()
      val api_mode_disposition = readVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(api_coordination_result, api_mode_disposition)
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS = {
      val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS)
      }
      val api_coordination_result = readVehicle_Controller_Mode_CoordinatorCoordinationResultType()
      val api_mode_disposition = readVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(api_coordination_result, api_mode_disposition)
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
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T)
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
        case Constants.Vehicle_Controller_Mode_CoordinatorInputStatus_Payload => val r = readVehicle_Controller_Mode_CoordinatorInputStatus_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorModeDecision_Payload => val r = readVehicle_Controller_Mode_CoordinatorModeDecision_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload => val r = readVehicle_Controller_Mode_CoordinatorLifecycleEvent_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionEvent_Payload => val r = readVehicle_Controller_Mode_CoordinatorConditionEvent_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorDecisionReason_Payload => val r = readVehicle_Controller_Mode_CoordinatorDecisionReason_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleSample_Payload => val r = readVehicle_Controller_Mode_CoordinatorLifecycleSample_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionSample_Payload => val r = readVehicle_Controller_Mode_CoordinatorConditionSample_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationClass_Payload => val r = readVehicle_Controller_Mode_CoordinatorCoordinationClass_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationResult_Payload => val r = readVehicle_Controller_Mode_CoordinatorCoordinationResult_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload => val r = readVehicle_Controller_Mode_CoordinatorLifecycleAssessment_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionAssessment_Payload => val r = readVehicle_Controller_Mode_CoordinatorConditionAssessment_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload => val r = readVehicle_Controller_Mode_CoordinatorControllerModeDisposition_PayloadT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T)
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

  def fromVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorInputStatus_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.InputStatus_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorInputStatus_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.InputStatus_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorInputStatus_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorInputStatus_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionEvent_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionEvent_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorDecisionReason_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorDecisionReason_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleSample(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleSample(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleSample(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleSample, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleSample(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleSample = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleSample()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleSample _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionSample(o: Vehicle_Controller_Mode_Coordinator.ConditionSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionSample(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionSample(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionSample, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionSample(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionSample = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionSample()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionSample _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionSample_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionSample_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionSample_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionSample_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Mode_Coordinator.ModeDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorModeDecision(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorModeDecision(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ModeDecision, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorModeDecision(reader: Reader): Vehicle_Controller_Mode_Coordinator.ModeDecision = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorModeDecision()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorModeDecision _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorModeDecision_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorModeDecision_Payload(reader: Reader): Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorModeDecision_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorModeDecision_Payload _)
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

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(reader: Reader): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS _)
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