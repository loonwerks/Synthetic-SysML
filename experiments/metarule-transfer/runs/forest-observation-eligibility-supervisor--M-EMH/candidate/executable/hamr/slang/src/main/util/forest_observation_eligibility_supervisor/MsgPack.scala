// #Sireum
// @formatter:off

// This file is auto-generated from RequestCommand.scala, RequestToken.scala, GateOutcome.scala, EvaluationTicket.scala, RequestContext.scala, EligibilityStatus.scala, EnergyEvidence.scala, EnergyVerdict.scala, TaggedTicket.scala, CameraEvidence.scala, RadioEvidence.scala, SupportVerdict.scala, EligibilityDecision.scala, ObservationProgress.scala, ObservationAuthorization.scala, RequestInput.scala, TaggedEnergyVerdict.scala, TaggedSupportVerdict.scala, Base_Types.scala, RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_Containers.scala, EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_Containers.scala, ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_Containers.scala, EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Containers.scala, AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package forest_observation_eligibility_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Forest_Observation_Eligibility_SupervisorRequestCommand_Payload: Z = -32

    val Forest_Observation_Eligibility_SupervisorRequestToken_Payload: Z = -31

    val Forest_Observation_Eligibility_SupervisorGateOutcome_Payload: Z = -30

    val Forest_Observation_Eligibility_SupervisorEvaluationTicket_Payload: Z = -29

    val Forest_Observation_Eligibility_SupervisorRequestContext_Payload: Z = -28

    val Forest_Observation_Eligibility_SupervisorEligibilityStatus_Payload: Z = -27

    val Forest_Observation_Eligibility_SupervisorEnergyEvidence_Payload: Z = -26

    val Forest_Observation_Eligibility_SupervisorEnergyVerdict_Payload: Z = -25

    val Forest_Observation_Eligibility_SupervisorTaggedTicket_Payload: Z = -24

    val Forest_Observation_Eligibility_SupervisorCameraEvidence_Payload: Z = -23

    val Forest_Observation_Eligibility_SupervisorRadioEvidence_Payload: Z = -22

    val Forest_Observation_Eligibility_SupervisorSupportVerdict_Payload: Z = -21

    val Forest_Observation_Eligibility_SupervisorEligibilityDecision_Payload: Z = -20

    val Forest_Observation_Eligibility_SupervisorObservationProgress_Payload: Z = -19

    val Forest_Observation_Eligibility_SupervisorObservationAuthorization_Payload: Z = -18

    val Forest_Observation_Eligibility_SupervisorRequestInput: Z = -17

    val Forest_Observation_Eligibility_SupervisorRequestInput_Payload: Z = -16

    val Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict: Z = -15

    val Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload: Z = -14

    val Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict: Z = -13

    val Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload: Z = -12

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

    val Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P: Z = 5

    val Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS: Z = 6

    val Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P: Z = 7

    val Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS: Z = 8

    val Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P: Z = 9

    val Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS: Z = 10

    val Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P: Z = 11

    val Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS: Z = 12

    val Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P: Z = 13

    val Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS: Z = 14

    val Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P: Z = 15

    val Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS: Z = 16

    val Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P: Z = 17

    val Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS: Z = 18

    val Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P: Z = 19

    val Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS: Z = 20

    val Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P: Z = 21

    val Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS: Z = 22

    val Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P: Z = 23

    val Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS: Z = 24

    val utilEmptyContainer: Z = 25

    val _artEmpty: Z = 26

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeForest_Observation_Eligibility_SupervisorRequestCommandType(o: Forest_Observation_Eligibility_Supervisor.RequestCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestCommand_Payload)
      writeForest_Observation_Eligibility_SupervisorRequestCommandType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestTokenType(o: Forest_Observation_Eligibility_Supervisor.RequestToken.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestToken_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestToken_Payload)
      writeForest_Observation_Eligibility_SupervisorRequestTokenType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorGateOutcomeType(o: Forest_Observation_Eligibility_Supervisor.GateOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorGateOutcome_Payload)
      writeForest_Observation_Eligibility_SupervisorGateOutcomeType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEvaluationTicket_Payload)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestContextType(o: Forest_Observation_Eligibility_Supervisor.RequestContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestContext_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestContext_Payload)
      writeForest_Observation_Eligibility_SupervisorRequestContextType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityStatusType(o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityStatus_Payload)
      writeForest_Observation_Eligibility_SupervisorEligibilityStatusType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyEvidence_Payload)
      writeForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyVerdictType(o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyVerdict_Payload)
      writeForest_Observation_Eligibility_SupervisorEnergyVerdictType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorTaggedTicketType(o: Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedTicket_Payload)
      writeForest_Observation_Eligibility_SupervisorTaggedTicketType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorCameraEvidenceType(o: Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorCameraEvidence_Payload)
      writeForest_Observation_Eligibility_SupervisorCameraEvidenceType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorRadioEvidenceType(o: Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRadioEvidence_Payload)
      writeForest_Observation_Eligibility_SupervisorRadioEvidenceType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorSupportVerdictType(o: Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorSupportVerdict_Payload)
      writeForest_Observation_Eligibility_SupervisorSupportVerdictType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityDecision_Payload)
      writeForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationProgressType(o: Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorObservationProgress_Payload)
      writeForest_Observation_Eligibility_SupervisorObservationProgressType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorObservationAuthorization_Payload)
      writeForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestInput(o: Forest_Observation_Eligibility_Supervisor.RequestInput): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestInput)
      writeForest_Observation_Eligibility_SupervisorRequestCommandType(o.command)
      writeForest_Observation_Eligibility_SupervisorRequestTokenType(o.token)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestInput_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestInput_Payload)
      writeForest_Observation_Eligibility_SupervisorRequestInput(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict)
      writeForest_Observation_Eligibility_SupervisorEnergyVerdictType(o.verdict)
      writeForest_Observation_Eligibility_SupervisorTaggedTicketType(o.ticket)
    }

    def writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload)
      writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.value)
    }

    def writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict)
      writeForest_Observation_Eligibility_SupervisorSupportVerdictType(o.verdict)
      writeForest_Observation_Eligibility_SupervisorTaggedTicketType(o.ticket)
    }

    def writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload)
      writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.value)
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

    def writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P)
      writeForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)
      writeForest_Observation_Eligibility_SupervisorRequestInput(o.api_requestInput)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)
      writeForest_Observation_Eligibility_SupervisorRequestInput(o.api_requestInput)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P)
      writeForest_Observation_Eligibility_SupervisorEligibilityStatusType(o.api_eligibilityStatus)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_energyTicket)
      writeForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_supportTicket)
    }

    def writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorEligibilityStatusType(o.api_eligibilityStatus)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_energyTicket)
      writeForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_supportTicket)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P)
      writeForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o.api_energyEvidence)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o.api_energyEvidence)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P)
      writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictOut)
    }

    def writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictOut)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P)
      writeForest_Observation_Eligibility_SupervisorCameraEvidenceType(o.api_cameraEvidence)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket)
      writeForest_Observation_Eligibility_SupervisorRadioEvidenceType(o.api_radioEvidence)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorCameraEvidenceType(o.api_cameraEvidence)
      writeForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket)
      writeForest_Observation_Eligibility_SupervisorRadioEvidenceType(o.api_radioEvidence)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P)
      writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictOut)
    }

    def writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictOut)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P)
      writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictIn)
      writeForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)
      writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictIn)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictIn)
      writeForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)
      writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictIn)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P)
      writeForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision)
    }

    def writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision)
    }

    def writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P)
      writeForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision)
      writeForest_Observation_Eligibility_SupervisorObservationProgressType(o.api_observationProgress)
    }

    def writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision)
      writeForest_Observation_Eligibility_SupervisorObservationProgressType(o.api_observationProgress)
    }

    def writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container): Unit = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
      }
    }

    def writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P)
      writeForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)
      writeForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o.api_observationAuthorization)
    }

    def writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS)
      writeForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)
      writeForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o.api_observationAuthorization)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
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
        case o: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload => writeForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload => writeForest_Observation_Eligibility_SupervisorRequestToken_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload => writeForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload => writeForest_Observation_Eligibility_SupervisorRequestInput_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload => writeForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload => writeForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload => writeForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload => writeForest_Observation_Eligibility_SupervisorRequestContext_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload => writeForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload => writeForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload => writeForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload => writeForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload => writeForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload => writeForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload => writeForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload => writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload => writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload => writeForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
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

    def readForest_Observation_Eligibility_SupervisorRequestCommandType(): Forest_Observation_Eligibility_Supervisor.RequestCommand.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.RequestCommand.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorRequestCommand_Payload(): Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorRequestCommand_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestCommand_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestCommand_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorRequestCommandType()
      return Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorRequestTokenType(): Forest_Observation_Eligibility_Supervisor.RequestToken.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.RequestToken.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorRequestToken_Payload(): Forest_Observation_Eligibility_Supervisor.RequestToken_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorRequestToken_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestToken_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestToken_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestToken_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorRequestTokenType()
      return Forest_Observation_Eligibility_Supervisor.RequestToken_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorGateOutcomeType(): Forest_Observation_Eligibility_Supervisor.GateOutcome.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.GateOutcome.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorGateOutcome_Payload(): Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorGateOutcome_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorGateOutcome_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorGateOutcome_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorGateOutcomeType()
      return Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorEvaluationTicketType(): Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.EvaluationTicket.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(): Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorEvaluationTicket_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEvaluationTicket_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEvaluationTicket_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      return Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorRequestContextType(): Forest_Observation_Eligibility_Supervisor.RequestContext.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.RequestContext.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorRequestContext_Payload(): Forest_Observation_Eligibility_Supervisor.RequestContext_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorRequestContext_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestContext_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestContext_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorRequestContextType()
      return Forest_Observation_Eligibility_Supervisor.RequestContext_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityStatusType(): Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.EligibilityStatus.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(): Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorEligibilityStatus_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityStatus_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityStatus_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorEligibilityStatusType()
      return Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorEnergyEvidenceType(): Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.EnergyEvidence.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(): Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorEnergyEvidence_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEnergyEvidence_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyEvidence_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorEnergyEvidenceType()
      return Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorEnergyVerdictType(): Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.EnergyVerdict.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorEnergyVerdict_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEnergyVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyVerdict_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorEnergyVerdictType()
      return Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorTaggedTicketType(): Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.TaggedTicket.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(): Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorTaggedTicket_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorTaggedTicket_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedTicket_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorTaggedTicketType()
      return Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorCameraEvidenceType(): Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.CameraEvidence.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(): Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorCameraEvidence_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorCameraEvidence_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorCameraEvidence_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorCameraEvidenceType()
      return Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorRadioEvidenceType(): Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.RadioEvidence.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(): Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorRadioEvidence_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRadioEvidence_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRadioEvidence_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorRadioEvidenceType()
      return Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorSupportVerdictType(): Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.SupportVerdict.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorSupportVerdict_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorSupportVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorSupportVerdict_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorSupportVerdictType()
      return Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityDecisionType(): Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.EligibilityDecision.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(): Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorEligibilityDecision_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityDecision_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityDecision_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      return Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorObservationProgressType(): Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.ObservationProgress.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorObservationProgress_Payload(): Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorObservationProgress_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorObservationProgress_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorObservationProgress_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorObservationProgressType()
      return Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorObservationAuthorizationType(): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type = {
      val r = reader.readZ()
      return Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.byOrdinal(r).get
    }

    def readForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorObservationAuthorization_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorObservationAuthorization_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorObservationAuthorization_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorObservationAuthorizationType()
      return Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorRequestInput(): Forest_Observation_Eligibility_Supervisor.RequestInput = {
      val r = readForest_Observation_Eligibility_SupervisorRequestInputT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestInputT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestInput = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestInput)
      }
      val command = readForest_Observation_Eligibility_SupervisorRequestCommandType()
      val token = readForest_Observation_Eligibility_SupervisorRequestTokenType()
      return Forest_Observation_Eligibility_Supervisor.RequestInput(command, token)
    }

    def readForest_Observation_Eligibility_SupervisorRequestInput_Payload(): Forest_Observation_Eligibility_Supervisor.RequestInput_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorRequestInput_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestInput_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestInput_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestInput_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorRequestInput()
      return Forest_Observation_Eligibility_Supervisor.RequestInput_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict = {
      val r = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdictT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdictT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict)
      }
      val verdict = readForest_Observation_Eligibility_SupervisorEnergyVerdictType()
      val ticket = readForest_Observation_Eligibility_SupervisorTaggedTicketType()
      return Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(verdict, ticket)
    }

    def readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      return Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload(value)
    }

    def readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict = {
      val r = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdictT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorTaggedSupportVerdictT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict)
      }
      val verdict = readForest_Observation_Eligibility_SupervisorSupportVerdictType()
      val ticket = readForest_Observation_Eligibility_SupervisorTaggedTicketType()
      return Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(verdict, ticket)
    }

    def readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload = {
      val r = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_PayloadT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload)
      }
      val value = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      return Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload(value)
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

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P)
      }
      val api_gateOutcome = readForest_Observation_Eligibility_SupervisorGateOutcomeType()
      val api_requestInput = readForest_Observation_Eligibility_SupervisorRequestInput()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(api_gateOutcome, api_requestInput)
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS)
      }
      val api_gateOutcome = readForest_Observation_Eligibility_SupervisorGateOutcomeType()
      val api_requestInput = readForest_Observation_Eligibility_SupervisorRequestInput()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(api_gateOutcome, api_requestInput)
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P)
      }
      val api_eligibilityStatus = readForest_Observation_Eligibility_SupervisorEligibilityStatusType()
      val api_energyTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      val api_requestContext = readForest_Observation_Eligibility_SupervisorRequestContextType()
      val api_supportTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(api_eligibilityStatus, api_energyTicket, api_requestContext, api_supportTicket)
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS)
      }
      val api_eligibilityStatus = readForest_Observation_Eligibility_SupervisorEligibilityStatusType()
      val api_energyTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      val api_requestContext = readForest_Observation_Eligibility_SupervisorRequestContextType()
      val api_supportTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(api_eligibilityStatus, api_energyTicket, api_requestContext, api_supportTicket)
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P)
      }
      val api_energyEvidence = readForest_Observation_Eligibility_SupervisorEnergyEvidenceType()
      val api_evaluationTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(api_energyEvidence, api_evaluationTicket)
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS)
      }
      val api_energyEvidence = readForest_Observation_Eligibility_SupervisorEnergyEvidenceType()
      val api_evaluationTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(api_energyEvidence, api_evaluationTicket)
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P)
      }
      val api_energyVerdictOut = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(api_energyVerdictOut)
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS)
      }
      val api_energyVerdictOut = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(api_energyVerdictOut)
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P)
      }
      val api_cameraEvidence = readForest_Observation_Eligibility_SupervisorCameraEvidenceType()
      val api_evaluationTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      val api_radioEvidence = readForest_Observation_Eligibility_SupervisorRadioEvidenceType()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(api_cameraEvidence, api_evaluationTicket, api_radioEvidence)
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS)
      }
      val api_cameraEvidence = readForest_Observation_Eligibility_SupervisorCameraEvidenceType()
      val api_evaluationTicket = readForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      val api_radioEvidence = readForest_Observation_Eligibility_SupervisorRadioEvidenceType()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(api_cameraEvidence, api_evaluationTicket, api_radioEvidence)
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P)
      }
      val api_supportVerdictOut = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(api_supportVerdictOut)
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS)
      }
      val api_supportVerdictOut = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(api_supportVerdictOut)
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P)
      }
      val api_energyVerdictIn = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      val api_requestContext = readForest_Observation_Eligibility_SupervisorRequestContextType()
      val api_supportVerdictIn = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(api_energyVerdictIn, api_requestContext, api_supportVerdictIn)
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS)
      }
      val api_energyVerdictIn = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      val api_requestContext = readForest_Observation_Eligibility_SupervisorRequestContextType()
      val api_supportVerdictIn = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(api_energyVerdictIn, api_requestContext, api_supportVerdictIn)
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P)
      }
      val api_eligibilityDecision = readForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(api_eligibilityDecision)
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS)
      }
      val api_eligibilityDecision = readForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(api_eligibilityDecision)
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P)
      }
      val api_eligibilityDecision = readForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      val api_observationProgress = readForest_Observation_Eligibility_SupervisorObservationProgressType()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(api_eligibilityDecision, api_observationProgress)
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS)
      }
      val api_eligibilityDecision = readForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      val api_observationProgress = readForest_Observation_Eligibility_SupervisorObservationProgressType()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(api_eligibilityDecision, api_observationProgress)
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container.")
          val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T)
          return r
      }
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P = {
      val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P)
      }
      val api_gateOutcome = readForest_Observation_Eligibility_SupervisorGateOutcomeType()
      val api_observationAuthorization = readForest_Observation_Eligibility_SupervisorObservationAuthorizationType()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(api_gateOutcome, api_observationAuthorization)
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS = {
      val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(F)
      return r
    }

    def readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS)
      }
      val api_gateOutcome = readForest_Observation_Eligibility_SupervisorGateOutcomeType()
      val api_observationAuthorization = readForest_Observation_Eligibility_SupervisorObservationAuthorizationType()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(api_gateOutcome, api_observationAuthorization)
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
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T)
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
        case Constants.Forest_Observation_Eligibility_SupervisorGateOutcome_Payload => val r = readForest_Observation_Eligibility_SupervisorGateOutcome_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestToken_Payload => val r = readForest_Observation_Eligibility_SupervisorRequestToken_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorTaggedTicket_Payload => val r = readForest_Observation_Eligibility_SupervisorTaggedTicket_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestInput_Payload => val r = readForest_Observation_Eligibility_SupervisorRequestInput_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyVerdict_Payload => val r = readForest_Observation_Eligibility_SupervisorEnergyVerdict_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRadioEvidence_Payload => val r = readForest_Observation_Eligibility_SupervisorRadioEvidence_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestCommand_Payload => val r = readForest_Observation_Eligibility_SupervisorRequestCommand_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestContext_Payload => val r = readForest_Observation_Eligibility_SupervisorRequestContext_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyEvidence_Payload => val r = readForest_Observation_Eligibility_SupervisorEnergyEvidence_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorSupportVerdict_Payload => val r = readForest_Observation_Eligibility_SupervisorSupportVerdict_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorCameraEvidence_Payload => val r = readForest_Observation_Eligibility_SupervisorCameraEvidence_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEvaluationTicket_Payload => val r = readForest_Observation_Eligibility_SupervisorEvaluationTicket_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityStatus_Payload => val r = readForest_Observation_Eligibility_SupervisorEligibilityStatus_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationProgress_Payload => val r = readForest_Observation_Eligibility_SupervisorObservationProgress_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityDecision_Payload => val r = readForest_Observation_Eligibility_SupervisorEligibilityDecision_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload => val r = readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload => val r = readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationAuthorization_Payload => val r = readForest_Observation_Eligibility_SupervisorObservationAuthorization_PayloadT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(T); return r
        case Constants.Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T)
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

  def fromForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestCommand_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestCommand_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestCommand_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestCommand_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestToken_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestToken_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestToken_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestToken_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestToken_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestToken_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestToken_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestToken_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorGateOutcome_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorGateOutcome_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorGateOutcome_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorGateOutcome_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestContext_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestContext_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestContext_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestContext_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestContext_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestContext_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestContext_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestContext_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorTaggedTicket_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorTaggedTicket_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorCameraEvidence_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorCameraEvidence_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRadioEvidence_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRadioEvidence_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorSupportVerdict_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorSupportVerdict_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationProgress_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationProgress_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationProgress_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationProgress_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestInput(o: Forest_Observation_Eligibility_Supervisor.RequestInput, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestInput(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestInput(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestInput, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestInput(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestInput = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestInput()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestInput _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestInput_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestInput_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestInput_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestInput_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestInput_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestInput_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestInput_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestInput_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(reader: Reader): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict = {
      val r = reader.readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(reader: Reader): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict = {
      val r = reader.readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(reader: Reader): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload = {
      val r = reader.readForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload _)
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

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(reader: Reader): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container = {
      val r = reader.readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(reader: Reader): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P = {
      val r = reader.readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
    return w.result
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(data: ISZ[U8]): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(reader: Reader): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS = {
      val r = reader.readForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS()
      return r
    }
    val r = to(data, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS _)
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