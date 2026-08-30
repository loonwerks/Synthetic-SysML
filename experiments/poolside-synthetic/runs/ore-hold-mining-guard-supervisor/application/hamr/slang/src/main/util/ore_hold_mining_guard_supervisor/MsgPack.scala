// #Sireum
// @formatter:off

// This file is auto-generated from InputStatus.scala, RequestDisposition.scala, HoldObservation.scala, HoldAssessment.scala, AsteroidCondition.scala, LaserCondition.scala, TargetCondition.scala, SupportAssessment.scala, GuardMode.scala, ResolutionReason.scala, MiningCommand.scala, GuardStatus.scala, OffloadReadiness.scala, PilotRequestSample.scala, RequestAssessment.scala, HoldSample.scala, MiningSupportSample.scala, GuardResolution.scala, Base_Types.scala, RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_Containers.scala, HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_Containers.scala, MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_Containers.scala, OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_Containers.scala, MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_Containers.scala, GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package ore_hold_mining_guard_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload: Z = -32

    val Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload: Z = -31

    val Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload: Z = -30

    val Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload: Z = -29

    val Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload: Z = -28

    val Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload: Z = -27

    val Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload: Z = -26

    val Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload: Z = -25

    val Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload: Z = -24

    val Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload: Z = -23

    val Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload: Z = -22

    val Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload: Z = -21

    val Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload: Z = -20

    val Ore_Hold_Mining_Guard_SupervisorPilotRequestSample: Z = -19

    val Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload: Z = -18

    val Ore_Hold_Mining_Guard_SupervisorRequestAssessment: Z = -17

    val Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload: Z = -16

    val Ore_Hold_Mining_Guard_SupervisorHoldSample: Z = -15

    val Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload: Z = -14

    val Ore_Hold_Mining_Guard_SupervisorMiningSupportSample: Z = -13

    val Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload: Z = -12

    val Ore_Hold_Mining_Guard_SupervisorGuardResolution: Z = -11

    val Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload: Z = -10

    val Base_TypesBoolean_Payload: Z = -9

    val Base_TypesInteger_Payload: Z = -8

    val Base_TypesInteger_8_Payload: Z = -7

    val Base_TypesInteger_16_Payload: Z = -6

    val Base_TypesInteger_32_Payload: Z = -5

    val Base_TypesInteger_64_Payload: Z = -4

    val Base_TypesUnsigned_8_Payload: Z = -3

    val Base_TypesUnsigned_16_Payload: Z = -2

    val Base_TypesUnsigned_32_Payload: Z = -1

    val Base_TypesUnsigned_64_Payload: Z = 0

    val Base_TypesFloat_Payload: Z = 1

    val Base_TypesFloat_32_Payload: Z = 2

    val Base_TypesFloat_64_Payload: Z = 3

    val Base_TypesCharacter_Payload: Z = 4

    val Base_TypesString_Payload: Z = 5

    val Base_TypesBits_Payload: Z = 6

    val Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P: Z = 7

    val Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS: Z = 8

    val Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P: Z = 9

    val Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS: Z = 10

    val Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P: Z = 11

    val Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS: Z = 12

    val Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P: Z = 13

    val Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS: Z = 14

    val Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P: Z = 15

    val Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS: Z = 16

    val Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P: Z = 17

    val Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS: Z = 18

    val Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P: Z = 19

    val Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS: Z = 20

    val Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P: Z = 21

    val Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS: Z = 22

    val Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P: Z = 23

    val Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS: Z = 24

    val Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P: Z = 25

    val Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS: Z = 26

    val Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P: Z = 27

    val Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS: Z = 28

    val Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P: Z = 29

    val Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS: Z = 30

    val utilEmptyContainer: Z = 31

    val _artEmpty: Z = 32

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeOre_Hold_Mining_Guard_SupervisorInputStatusType(o: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload)
      writeOre_Hold_Mining_Guard_SupervisorInputStatusType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestDispositionType(o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload)
      writeOre_Hold_Mining_Guard_SupervisorRequestDispositionType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldObservationType(o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload)
      writeOre_Hold_Mining_Guard_SupervisorHoldObservationType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload)
      writeOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload)
      writeOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorLaserConditionType(o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload)
      writeOre_Hold_Mining_Guard_SupervisorLaserConditionType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorTargetConditionType(o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload)
      writeOre_Hold_Mining_Guard_SupervisorTargetConditionType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload)
      writeOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardModeType(o: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload)
      writeOre_Hold_Mining_Guard_SupervisorGuardModeType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorResolutionReasonType(o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload)
      writeOre_Hold_Mining_Guard_SupervisorResolutionReasonType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommandType(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload)
      writeOre_Hold_Mining_Guard_SupervisorMiningCommandType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardStatusType(o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload)
      writeOre_Hold_Mining_Guard_SupervisorGuardStatusType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload)
      writeOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample)
      writer.writeB(o.start)
      writer.writeB(o.halt_request)
      writer.writeB(o.resume)
      writeOre_Hold_Mining_Guard_SupervisorInputStatusType(o.status)
    }

    def writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload)
      writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestAssessment(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestAssessment)
      writeOre_Hold_Mining_Guard_SupervisorRequestDispositionType(o.disposition)
      writer.writeB(o.conflict)
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload)
      writeOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldSample(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldSample)
      writeOre_Hold_Mining_Guard_SupervisorHoldObservationType(o.observation)
      writeOre_Hold_Mining_Guard_SupervisorInputStatusType(o.status)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload)
      writeOre_Hold_Mining_Guard_SupervisorHoldSample(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample)
      writeOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(o.asteroid)
      writeOre_Hold_Mining_Guard_SupervisorLaserConditionType(o.laser)
      writeOre_Hold_Mining_Guard_SupervisorTargetConditionType(o.target)
      writeOre_Hold_Mining_Guard_SupervisorInputStatusType(o.status)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload)
      writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o.value)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardResolution)
      writeOre_Hold_Mining_Guard_SupervisorGuardModeType(o.nextMode)
      writeOre_Hold_Mining_Guard_SupervisorResolutionReasonType(o.reason)
      writer.writeB(o.requestConflict)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.value)
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

    def writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o.api_pilot_request)
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o.api_pilot_request)
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorHoldSample(o.api_hold_sample)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorHoldSample(o.api_hold_sample)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o.api_mining_support)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o.api_mining_support)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment)
      writeOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment)
      writeOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment)
      writeOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment)
      writeOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment)
    }

    def writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_command)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_reporting)
    }

    def writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_command)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_reporting)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorMiningCommandType(o.api_mining_command)
    }

    def writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorMiningCommandType(o.api_mining_command)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container): Unit = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
      }
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P)
      writeOre_Hold_Mining_Guard_SupervisorGuardStatusType(o.api_guard_status)
      writeOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o.api_offload_readiness)
    }

    def writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS)
      writeOre_Hold_Mining_Guard_SupervisorGuardStatusType(o.api_guard_status)
      writeOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o.api_offload_readiness)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
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
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload => writeOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload => writeOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload => writeOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload => writeOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload => writeOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload => writeOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload => writeOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload => writeOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload => writeOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload => writeOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload => writeOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload => writeOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload => writeOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload => writeOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload => writeOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload => writeOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload => writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload => writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
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

    def readOre_Hold_Mining_Guard_SupervisorInputStatusType(): Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.InputStatus.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(): Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorInputStatus_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorInputStatusType()
      return Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestDispositionType(): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorRequestDisposition_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestDisposition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
      return Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldObservationType(): Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.HoldObservation.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldObservation_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldObservation_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorHoldObservationType()
      return Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldAssessment_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldAssessment_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorAsteroidCondition_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorAsteroidCondition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
      return Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorLaserConditionType(): Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.LaserCondition.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorLaserCondition_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorLaserCondition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorLaserConditionType()
      return Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorTargetConditionType(): Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.TargetCondition.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorTargetCondition_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorTargetCondition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorTargetConditionType()
      return Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorSupportAssessment_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorSupportAssessment_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardModeType(): Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.GuardMode.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardMode_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardMode_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorGuardModeType()
      return Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorResolutionReasonType(): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorResolutionReason_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorResolutionReason_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
      return Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandType(): Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommand.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(): Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningCommand_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommand_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorMiningCommandType()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardStatusType(): Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.GuardStatus.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardStatus_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardStatus_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorGuardStatusType()
      return Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = {
      val r = reader.readZ()
      return Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.byOrdinal(r).get
    }

    def readOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorOffloadReadiness_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorOffloadReadiness_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
      return Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorPilotRequestSample(): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = {
      val r = readOre_Hold_Mining_Guard_SupervisorPilotRequestSampleT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorPilotRequestSampleT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample)
      }
      val start = reader.readB()
      val halt_request = reader.readB()
      val resume = reader.readB()
      val status = readOre_Hold_Mining_Guard_SupervisorInputStatusType()
      return Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample(start, halt_request, resume, status)
    }

    def readOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorPilotRequestSample_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorPilotRequestSample_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      return Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestAssessment(): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = {
      val r = readOre_Hold_Mining_Guard_SupervisorRequestAssessmentT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestAssessmentT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestAssessment)
      }
      val disposition = readOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
      val conflict = reader.readB()
      return Ore_Hold_Mining_Guard_Supervisor.RequestAssessment(disposition, conflict)
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorRequestAssessment_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestAssessment_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      return Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldSample(): Ore_Hold_Mining_Guard_Supervisor.HoldSample = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldSampleT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldSampleT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldSample)
      }
      val observation = readOre_Hold_Mining_Guard_SupervisorHoldObservationType()
      val status = readOre_Hold_Mining_Guard_SupervisorInputStatusType()
      return Ore_Hold_Mining_Guard_Supervisor.HoldSample(observation, status)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldSample_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldSample_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorHoldSample()
      return Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportSample(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportSampleT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportSampleT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample)
      }
      val asteroid = readOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
      val laser = readOre_Hold_Mining_Guard_SupervisorLaserConditionType()
      val target = readOre_Hold_Mining_Guard_SupervisorTargetConditionType()
      val status = readOre_Hold_Mining_Guard_SupervisorInputStatusType()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample(asteroid, laser, target, status)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportSample_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportSample_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload(value)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardResolution(): Ore_Hold_Mining_Guard_Supervisor.GuardResolution = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardResolutionT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardResolutionT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardResolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardResolution)
      }
      val nextMode = readOre_Hold_Mining_Guard_SupervisorGuardModeType()
      val reason = readOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
      val requestConflict = reader.readB()
      return Ore_Hold_Mining_Guard_Supervisor.GuardResolution(nextMode, reason, requestConflict)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardResolution_PayloadT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardResolution_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload)
      }
      val value = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload(value)
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

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P)
      }
      val api_pilot_request = readOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(api_pilot_request)
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS)
      }
      val api_pilot_request = readOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(api_pilot_request)
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P)
      }
      val api_request_assessment = readOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(api_request_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS)
      }
      val api_request_assessment = readOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(api_request_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P)
      }
      val api_hold_sample = readOre_Hold_Mining_Guard_SupervisorHoldSample()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(api_hold_sample)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS)
      }
      val api_hold_sample = readOre_Hold_Mining_Guard_SupervisorHoldSample()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(api_hold_sample)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P)
      }
      val api_hold_assessment = readOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(api_hold_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS)
      }
      val api_hold_assessment = readOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(api_hold_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P)
      }
      val api_mining_support = readOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(api_mining_support)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS)
      }
      val api_mining_support = readOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(api_mining_support)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P)
      }
      val api_support_assessment = readOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(api_support_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS)
      }
      val api_support_assessment = readOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(api_support_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P)
      }
      val api_hold_assessment = readOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      val api_request_assessment = readOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      val api_support_assessment = readOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(api_hold_assessment, api_request_assessment, api_support_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS)
      }
      val api_hold_assessment = readOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      val api_request_assessment = readOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      val api_support_assessment = readOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(api_hold_assessment, api_request_assessment, api_support_assessment)
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P)
      }
      val api_resolution_to_command = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      val api_resolution_to_reporting = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(api_resolution_to_command, api_resolution_to_reporting)
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS)
      }
      val api_resolution_to_command = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      val api_resolution_to_reporting = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(api_resolution_to_command, api_resolution_to_reporting)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P)
      }
      val api_guard_resolution = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(api_guard_resolution)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS)
      }
      val api_guard_resolution = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(api_guard_resolution)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P)
      }
      val api_mining_command = readOre_Hold_Mining_Guard_SupervisorMiningCommandType()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(api_mining_command)
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS)
      }
      val api_mining_command = readOre_Hold_Mining_Guard_SupervisorMiningCommandType()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(api_mining_command)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P)
      }
      val api_guard_resolution = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(api_guard_resolution)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS)
      }
      val api_guard_resolution = readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(api_guard_resolution)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P)
      }
      val api_guard_status = readOre_Hold_Mining_Guard_SupervisorGuardStatusType()
      val api_offload_readiness = readOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(api_guard_status, api_offload_readiness)
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {
      val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(F)
      return r
    }

    def readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS)
      }
      val api_guard_status = readOre_Hold_Mining_Guard_SupervisorGuardStatusType()
      val api_offload_readiness = readOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(api_guard_status, api_offload_readiness)
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
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T)
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
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload => val r = readOre_Hold_Mining_Guard_SupervisorGuardMode_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload => val r = readOre_Hold_Mining_Guard_SupervisorHoldSample_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload => val r = readOre_Hold_Mining_Guard_SupervisorInputStatus_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload => val r = readOre_Hold_Mining_Guard_SupervisorGuardStatus_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommand_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload => val r = readOre_Hold_Mining_Guard_SupervisorLaserCondition_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload => val r = readOre_Hold_Mining_Guard_SupervisorHoldAssessment_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload => val r = readOre_Hold_Mining_Guard_SupervisorTargetCondition_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload => val r = readOre_Hold_Mining_Guard_SupervisorHoldObservation_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload => val r = readOre_Hold_Mining_Guard_SupervisorGuardResolution_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload => val r = readOre_Hold_Mining_Guard_SupervisorOffloadReadiness_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload => val r = readOre_Hold_Mining_Guard_SupervisorResolutionReason_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload => val r = readOre_Hold_Mining_Guard_SupervisorAsteroidCondition_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload => val r = readOre_Hold_Mining_Guard_SupervisorSupportAssessment_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload => val r = readOre_Hold_Mining_Guard_SupervisorRequestAssessment_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload => val r = readOre_Hold_Mining_Guard_SupervisorRequestDisposition_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload => val r = readOre_Hold_Mining_Guard_SupervisorPilotRequestSample_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportSample_PayloadT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T)
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

  def fromOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorInputStatus_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardMode_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardMode_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorPilotRequestSample(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorPilotRequestSample(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorPilotRequestSample _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestAssessment(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestAssessment(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestAssessment(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestAssessment, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestAssessment(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestAssessment _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldSample(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldSample(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldSample(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldSample, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldSample(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldSample = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldSample()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldSample _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldSample_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldSample_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportSample(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportSample(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportSample _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardResolution(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardResolution(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardResolution(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardResolution, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardResolution(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardResolution = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardResolution _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload _)
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

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
    return w.result
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(data: ISZ[U8]): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(reader: Reader): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {
      val r = reader.readOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _)
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