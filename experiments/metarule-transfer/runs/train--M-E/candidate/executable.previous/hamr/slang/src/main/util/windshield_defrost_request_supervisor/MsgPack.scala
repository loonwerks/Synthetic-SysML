// #Sireum
// @formatter:off

// This file is auto-generated from DefrostSelection.scala, RequestValidity.scala, RequestIntent.scala, GlazingCondition.scala, GlazingValidity.scala, VisibilityAssessment.scala, ElectricalInterfaceStatus.scala, DefrostLoadAllowance.scala, DefrostEligibility.scala, DefrostEnableCommand.scala, PolicyDisposition.scala, DriverDefrostStatus.scala, Base_Types.scala, RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_Containers.scala, GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Containers.scala, ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Containers.scala, DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_Containers.scala, DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package windshield_defrost_request_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Windshield_Defrost_Request_SupervisorDefrostSelection_Payload: Z = -32

    val Windshield_Defrost_Request_SupervisorRequestValidity_Payload: Z = -31

    val Windshield_Defrost_Request_SupervisorRequestIntent_Payload: Z = -30

    val Windshield_Defrost_Request_SupervisorGlazingCondition_Payload: Z = -29

    val Windshield_Defrost_Request_SupervisorGlazingValidity_Payload: Z = -28

    val Windshield_Defrost_Request_SupervisorVisibilityAssessment_Payload: Z = -27

    val Windshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload: Z = -26

    val Windshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload: Z = -25

    val Windshield_Defrost_Request_SupervisorDefrostEligibility_Payload: Z = -24

    val Windshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload: Z = -23

    val Windshield_Defrost_Request_SupervisorPolicyDisposition_Payload: Z = -22

    val Windshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload: Z = -21

    val Base_TypesBoolean_Payload: Z = -20

    val Base_TypesInteger_Payload: Z = -19

    val Base_TypesInteger_8_Payload: Z = -18

    val Base_TypesInteger_16_Payload: Z = -17

    val Base_TypesInteger_32_Payload: Z = -16

    val Base_TypesInteger_64_Payload: Z = -15

    val Base_TypesUnsigned_8_Payload: Z = -14

    val Base_TypesUnsigned_16_Payload: Z = -13

    val Base_TypesUnsigned_32_Payload: Z = -12

    val Base_TypesUnsigned_64_Payload: Z = -11

    val Base_TypesFloat_Payload: Z = -10

    val Base_TypesFloat_32_Payload: Z = -9

    val Base_TypesFloat_64_Payload: Z = -8

    val Base_TypesCharacter_Payload: Z = -7

    val Base_TypesString_Payload: Z = -6

    val Base_TypesBits_Payload: Z = -5

    val Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P: Z = -4

    val Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS: Z = -3

    val Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P: Z = -2

    val Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS: Z = -1

    val Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P: Z = 0

    val Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS: Z = 1

    val Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P: Z = 2

    val Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS: Z = 3

    val Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P: Z = 4

    val Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS: Z = 5

    val Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P: Z = 6

    val Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS: Z = 7

    val Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P: Z = 8

    val Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS: Z = 9

    val Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P: Z = 10

    val Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS: Z = 11

    val Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P: Z = 12

    val Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS: Z = 13

    val Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P: Z = 14

    val Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS: Z = 15

    val utilEmptyContainer: Z = 16

    val _artEmpty: Z = 17

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeWindshield_Defrost_Request_SupervisorDefrostSelectionType(o: Windshield_Defrost_Request_Supervisor.DefrostSelection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostSelection_Payload)
      writeWindshield_Defrost_Request_SupervisorDefrostSelectionType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorRequestValidityType(o: Windshield_Defrost_Request_Supervisor.RequestValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorRequestValidity_Payload)
      writeWindshield_Defrost_Request_SupervisorRequestValidityType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorRequestIntentType(o: Windshield_Defrost_Request_Supervisor.RequestIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntent_Payload)
      writeWindshield_Defrost_Request_SupervisorRequestIntentType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingConditionType(o: Windshield_Defrost_Request_Supervisor.GlazingCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorGlazingCondition_Payload)
      writeWindshield_Defrost_Request_SupervisorGlazingConditionType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingValidityType(o: Windshield_Defrost_Request_Supervisor.GlazingValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorGlazingValidity_Payload)
      writeWindshield_Defrost_Request_SupervisorGlazingValidityType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorVisibilityAssessment_Payload)
      writeWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload)
      writeWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload)
      writeWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o: Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostEligibility_Payload)
      writeWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload)
      writeWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorPolicyDispositionType(o: Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorPolicyDisposition_Payload)
      writeWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.value)
    }

    def writeWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload)
      writeWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o.value)
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

    def writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P)
      writeWindshield_Defrost_Request_SupervisorDefrostSelectionType(o.api_defrostSelection)
      writeWindshield_Defrost_Request_SupervisorRequestValidityType(o.api_requestValidity)
    }

    def writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorDefrostSelectionType(o.api_defrostSelection)
      writeWindshield_Defrost_Request_SupervisorRequestValidityType(o.api_requestValidity)
    }

    def writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P)
      writeWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P)
      writeWindshield_Defrost_Request_SupervisorGlazingConditionType(o.api_glazingCondition)
      writeWindshield_Defrost_Request_SupervisorGlazingValidityType(o.api_glazingValidity)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorGlazingConditionType(o.api_glazingCondition)
      writeWindshield_Defrost_Request_SupervisorGlazingValidityType(o.api_glazingValidity)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P)
      writeWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment)
    }

    def writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment)
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P)
      writeWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o.api_defrostLoadAllowance)
      writeWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o.api_electricalInterfaceStatus)
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o.api_defrostLoadAllowance)
      writeWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o.api_electricalInterfaceStatus)
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P)
      writeWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility)
    }

    def writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P)
      writeWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility)
      writeWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)
      writeWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility)
      writeWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)
      writeWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P)
      writeWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o.api_defrostEnableCommand)
      writeWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition)
    }

    def writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o.api_defrostEnableCommand)
      writeWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition)
    }

    def writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P)
      writeWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition)
      writeWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition)
      writeWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container): Unit = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
      }
    }

    def writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P)
      writeWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o.api_driverDefrostStatus)
    }

    def writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS)
      writeWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o.api_driverDefrostStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
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
        case o: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload => writeWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload => writeWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload => writeWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload => writeWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload => writeWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload => writeWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload => writeWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload => writeWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload => writeWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload => writeWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload => writeWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload => writeWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
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

    def readWindshield_Defrost_Request_SupervisorDefrostSelectionType(): Windshield_Defrost_Request_Supervisor.DefrostSelection.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.DefrostSelection.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(): Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostSelection_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostSelection_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostSelection_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorDefrostSelectionType()
      return Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorRequestValidityType(): Windshield_Defrost_Request_Supervisor.RequestValidity.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.RequestValidity.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorRequestValidity_Payload(): Windshield_Defrost_Request_Supervisor.RequestValidity_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorRequestValidity_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorRequestValidity_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorRequestValidity_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorRequestValidityType()
      return Windshield_Defrost_Request_Supervisor.RequestValidity_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentType(): Windshield_Defrost_Request_Supervisor.RequestIntent.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.RequestIntent.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntent_Payload(): Windshield_Defrost_Request_Supervisor.RequestIntent_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorRequestIntent_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntent_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntent_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorRequestIntentType()
      return Windshield_Defrost_Request_Supervisor.RequestIntent_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionType(): Windshield_Defrost_Request_Supervisor.GlazingCondition.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.GlazingCondition.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(): Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorGlazingCondition_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorGlazingCondition_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorGlazingCondition_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorGlazingConditionType()
      return Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorGlazingValidityType(): Windshield_Defrost_Request_Supervisor.GlazingValidity.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.GlazingValidity.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(): Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorGlazingValidity_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorGlazingValidity_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorGlazingValidity_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorGlazingValidityType()
      return Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(): Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.VisibilityAssessment.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(): Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorVisibilityAssessment_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorVisibilityAssessment_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorVisibilityAssessment_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      return Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType()
      return Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType()
      return Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorDefrostEligibilityType(): Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.DefrostEligibility.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(): Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostEligibility_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostEligibility_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostEligibility_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      return Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostEnableCommand_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostEnableCommand_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorDefrostEnableCommandType()
      return Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorPolicyDispositionType(): Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.PolicyDisposition.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(): Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorPolicyDisposition_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorPolicyDisposition_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorPolicyDisposition_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      return Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload(value)
    }

    def readWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type = {
      val r = reader.readZ()
      return Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.byOrdinal(r).get
    }

    def readWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload = {
      val r = readWindshield_Defrost_Request_SupervisorDriverDefrostStatus_PayloadT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDriverDefrostStatus_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload)
      }
      val value = readWindshield_Defrost_Request_SupervisorDriverDefrostStatusType()
      return Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload(value)
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

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P)
      }
      val api_defrostSelection = readWindshield_Defrost_Request_SupervisorDefrostSelectionType()
      val api_requestValidity = readWindshield_Defrost_Request_SupervisorRequestValidityType()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(api_defrostSelection, api_requestValidity)
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS)
      }
      val api_defrostSelection = readWindshield_Defrost_Request_SupervisorDefrostSelectionType()
      val api_requestValidity = readWindshield_Defrost_Request_SupervisorRequestValidityType()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(api_defrostSelection, api_requestValidity)
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P)
      }
      val api_requestIntent = readWindshield_Defrost_Request_SupervisorRequestIntentType()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(api_requestIntent)
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS)
      }
      val api_requestIntent = readWindshield_Defrost_Request_SupervisorRequestIntentType()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(api_requestIntent)
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P)
      }
      val api_glazingCondition = readWindshield_Defrost_Request_SupervisorGlazingConditionType()
      val api_glazingValidity = readWindshield_Defrost_Request_SupervisorGlazingValidityType()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(api_glazingCondition, api_glazingValidity)
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS)
      }
      val api_glazingCondition = readWindshield_Defrost_Request_SupervisorGlazingConditionType()
      val api_glazingValidity = readWindshield_Defrost_Request_SupervisorGlazingValidityType()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(api_glazingCondition, api_glazingValidity)
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P)
      }
      val api_visibilityAssessment = readWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(api_visibilityAssessment)
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS)
      }
      val api_visibilityAssessment = readWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(api_visibilityAssessment)
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P)
      }
      val api_defrostLoadAllowance = readWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType()
      val api_electricalInterfaceStatus = readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(api_defrostLoadAllowance, api_electricalInterfaceStatus)
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS)
      }
      val api_defrostLoadAllowance = readWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType()
      val api_electricalInterfaceStatus = readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(api_defrostLoadAllowance, api_electricalInterfaceStatus)
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P)
      }
      val api_defrostEligibility = readWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(api_defrostEligibility)
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS)
      }
      val api_defrostEligibility = readWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(api_defrostEligibility)
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P)
      }
      val api_defrostEligibility = readWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      val api_requestIntent = readWindshield_Defrost_Request_SupervisorRequestIntentType()
      val api_visibilityAssessment = readWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(api_defrostEligibility, api_requestIntent, api_visibilityAssessment)
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS)
      }
      val api_defrostEligibility = readWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      val api_requestIntent = readWindshield_Defrost_Request_SupervisorRequestIntentType()
      val api_visibilityAssessment = readWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(api_defrostEligibility, api_requestIntent, api_visibilityAssessment)
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P)
      }
      val api_defrostEnableCommand = readWindshield_Defrost_Request_SupervisorDefrostEnableCommandType()
      val api_policyDisposition = readWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(api_defrostEnableCommand, api_policyDisposition)
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS)
      }
      val api_defrostEnableCommand = readWindshield_Defrost_Request_SupervisorDefrostEnableCommandType()
      val api_policyDisposition = readWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(api_defrostEnableCommand, api_policyDisposition)
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P)
      }
      val api_policyDisposition = readWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      val api_requestIntent = readWindshield_Defrost_Request_SupervisorRequestIntentType()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(api_policyDisposition, api_requestIntent)
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS)
      }
      val api_policyDisposition = readWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      val api_requestIntent = readWindshield_Defrost_Request_SupervisorRequestIntentType()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(api_policyDisposition, api_requestIntent)
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container.")
          val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T)
          return r
      }
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P = {
      val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P)
      }
      val api_driverDefrostStatus = readWindshield_Defrost_Request_SupervisorDriverDefrostStatusType()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(api_driverDefrostStatus)
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS = {
      val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(F)
      return r
    }

    def readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS)
      }
      val api_driverDefrostStatus = readWindshield_Defrost_Request_SupervisorDriverDefrostStatusType()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(api_driverDefrostStatus)
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
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T)
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
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntent_Payload => val r = readWindshield_Defrost_Request_SupervisorRequestIntent_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestValidity_Payload => val r = readWindshield_Defrost_Request_SupervisorRequestValidity_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingValidity_Payload => val r = readWindshield_Defrost_Request_SupervisorGlazingValidity_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingCondition_Payload => val r = readWindshield_Defrost_Request_SupervisorGlazingCondition_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostSelection_Payload => val r = readWindshield_Defrost_Request_SupervisorDefrostSelection_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorPolicyDisposition_Payload => val r = readWindshield_Defrost_Request_SupervisorPolicyDisposition_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostEligibility_Payload => val r = readWindshield_Defrost_Request_SupervisorDefrostEligibility_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload => val r = readWindshield_Defrost_Request_SupervisorDriverDefrostStatus_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload => val r = readWindshield_Defrost_Request_SupervisorDefrostEnableCommand_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload => val r = readWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorVisibilityAssessment_Payload => val r = readWindshield_Defrost_Request_SupervisorVisibilityAssessment_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload => val r = readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_PayloadT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(T); return r
        case Constants.Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T)
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

  def fromWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostSelection_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostSelection_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestValidity_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestValidity_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestValidity_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestValidity_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestValidity_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestValidity_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntent_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestIntent_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntent_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestIntent_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestIntent_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestIntent_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingCondition_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingCondition_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingValidity_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingValidity_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(reader: Reader): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload _)
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

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(reader: Reader): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(reader: Reader): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
    return w.result
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(data: ISZ[U8]): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(reader: Reader): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS = {
      val r = reader.readWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS()
      return r
    }
    val r = to(data, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS _)
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