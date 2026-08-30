// #Sireum
// @formatter:off

// This file is auto-generated from LifecycleRequest.scala, ChargerState.scala, RecoveryProposal.scala, EffectiveIntent.scala, FreshRequestPreemption.scala, BatteryCapacityBand.scala, BatteryCheck.scala, BatteryQualification.scala, NavigationCondition.scala, RadioCondition.scala, FlightQualification.scala, LifecycleState.scala, EligibilityReason.scala, DecisionPreState.scala, DecisionNextState.scala, TransitionResult.scala, PowerCommand.scala, ChargeCommand.scala, FlightAuthorization.scala, PilotLifecycleState.scala, RequestDisposition.scala, PilotNotice.scala, ArbitratedIntent.scala, EligibilityEnvelope.scala, DecisionSnapshot.scala, PilotStatus.scala, Base_Types.scala, RequestArbiter_governorProcess_requestArbiter_Containers.scala, BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Containers.scala, FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala, OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_Containers.scala, LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_Containers.scala, PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_Containers.scala, FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_Containers.scala, SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Drone_Lifecycle_GovernorLifecycleRequest_Payload: Z = -32

    val Drone_Lifecycle_GovernorChargerState_Payload: Z = -31

    val Drone_Lifecycle_GovernorRecoveryProposal_Payload: Z = -30

    val Drone_Lifecycle_GovernorEffectiveIntent_Payload: Z = -29

    val Drone_Lifecycle_GovernorFreshRequestPreemption_Payload: Z = -28

    val Drone_Lifecycle_GovernorBatteryCapacityBand_Payload: Z = -27

    val Drone_Lifecycle_GovernorBatteryCheck_Payload: Z = -26

    val Drone_Lifecycle_GovernorBatteryQualification_Payload: Z = -25

    val Drone_Lifecycle_GovernorNavigationCondition_Payload: Z = -24

    val Drone_Lifecycle_GovernorRadioCondition_Payload: Z = -23

    val Drone_Lifecycle_GovernorFlightQualification_Payload: Z = -22

    val Drone_Lifecycle_GovernorLifecycleState_Payload: Z = -21

    val Drone_Lifecycle_GovernorEligibilityReason_Payload: Z = -20

    val Drone_Lifecycle_GovernorDecisionPreState_Payload: Z = -19

    val Drone_Lifecycle_GovernorDecisionNextState_Payload: Z = -18

    val Drone_Lifecycle_GovernorTransitionResult_Payload: Z = -17

    val Drone_Lifecycle_GovernorPowerCommand_Payload: Z = -16

    val Drone_Lifecycle_GovernorChargeCommand_Payload: Z = -15

    val Drone_Lifecycle_GovernorFlightAuthorization_Payload: Z = -14

    val Drone_Lifecycle_GovernorPilotLifecycleState_Payload: Z = -13

    val Drone_Lifecycle_GovernorRequestDisposition_Payload: Z = -12

    val Drone_Lifecycle_GovernorPilotNotice_Payload: Z = -11

    val Drone_Lifecycle_GovernorArbitratedIntent: Z = -10

    val Drone_Lifecycle_GovernorArbitratedIntent_Payload: Z = -9

    val Drone_Lifecycle_GovernorEligibilityEnvelope: Z = -8

    val Drone_Lifecycle_GovernorEligibilityEnvelope_Payload: Z = -7

    val Drone_Lifecycle_GovernorDecisionSnapshot: Z = -6

    val Drone_Lifecycle_GovernorDecisionSnapshot_Payload: Z = -5

    val Drone_Lifecycle_GovernorPilotStatus: Z = -4

    val Drone_Lifecycle_GovernorPilotStatus_Payload: Z = -3

    val Base_TypesBoolean_Payload: Z = -2

    val Base_TypesInteger_Payload: Z = -1

    val Base_TypesInteger_8_Payload: Z = 0

    val Base_TypesInteger_16_Payload: Z = 1

    val Base_TypesInteger_32_Payload: Z = 2

    val Base_TypesInteger_64_Payload: Z = 3

    val Base_TypesUnsigned_8_Payload: Z = 4

    val Base_TypesUnsigned_16_Payload: Z = 5

    val Base_TypesUnsigned_32_Payload: Z = 6

    val Base_TypesUnsigned_64_Payload: Z = 7

    val Base_TypesFloat_Payload: Z = 8

    val Base_TypesFloat_32_Payload: Z = 9

    val Base_TypesFloat_64_Payload: Z = 10

    val Base_TypesCharacter_Payload: Z = 11

    val Base_TypesString_Payload: Z = 12

    val Base_TypesBits_Payload: Z = 13

    val Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P: Z = 14

    val Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS: Z = 15

    val Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P: Z = 16

    val Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS: Z = 17

    val Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P: Z = 18

    val Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS: Z = 19

    val Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P: Z = 20

    val Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS: Z = 21

    val Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P: Z = 22

    val Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS: Z = 23

    val Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P: Z = 24

    val Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS: Z = 25

    val Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P: Z = 26

    val Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS: Z = 27

    val Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P: Z = 28

    val Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS: Z = 29

    val Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P: Z = 30

    val Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS: Z = 31

    val Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P: Z = 32

    val Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS: Z = 33

    val Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P: Z = 34

    val Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS: Z = 35

    val Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P: Z = 36

    val Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS: Z = 37

    val Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P: Z = 38

    val Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS: Z = 39

    val Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P: Z = 40

    val Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS: Z = 41

    val Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P: Z = 42

    val Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS: Z = 43

    val Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P: Z = 44

    val Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS: Z = 45

    val utilEmptyContainer: Z = 46

    val _artEmpty: Z = 47

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDrone_Lifecycle_GovernorLifecycleRequestType(o: Drone_Lifecycle_Governor.LifecycleRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Governor.LifecycleRequest_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycleRequest_Payload)
      writeDrone_Lifecycle_GovernorLifecycleRequestType(o.value)
    }

    def writeDrone_Lifecycle_GovernorChargerStateType(o: Drone_Lifecycle_Governor.ChargerState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorChargerState_Payload(o: Drone_Lifecycle_Governor.ChargerState_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorChargerState_Payload)
      writeDrone_Lifecycle_GovernorChargerStateType(o.value)
    }

    def writeDrone_Lifecycle_GovernorRecoveryProposalType(o: Drone_Lifecycle_Governor.RecoveryProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorRecoveryProposal_Payload(o: Drone_Lifecycle_Governor.RecoveryProposal_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRecoveryProposal_Payload)
      writeDrone_Lifecycle_GovernorRecoveryProposalType(o.value)
    }

    def writeDrone_Lifecycle_GovernorEffectiveIntentType(o: Drone_Lifecycle_Governor.EffectiveIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorEffectiveIntent_Payload(o: Drone_Lifecycle_Governor.EffectiveIntent_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorEffectiveIntent_Payload)
      writeDrone_Lifecycle_GovernorEffectiveIntentType(o.value)
    }

    def writeDrone_Lifecycle_GovernorFreshRequestPreemptionType(o: Drone_Lifecycle_Governor.FreshRequestPreemption.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFreshRequestPreemption_Payload)
      writeDrone_Lifecycle_GovernorFreshRequestPreemptionType(o.value)
    }

    def writeDrone_Lifecycle_GovernorBatteryCapacityBandType(o: Drone_Lifecycle_Governor.BatteryCapacityBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBatteryCapacityBand_Payload)
      writeDrone_Lifecycle_GovernorBatteryCapacityBandType(o.value)
    }

    def writeDrone_Lifecycle_GovernorBatteryCheckType(o: Drone_Lifecycle_Governor.BatteryCheck.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorBatteryCheck_Payload(o: Drone_Lifecycle_Governor.BatteryCheck_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBatteryCheck_Payload)
      writeDrone_Lifecycle_GovernorBatteryCheckType(o.value)
    }

    def writeDrone_Lifecycle_GovernorBatteryQualificationType(o: Drone_Lifecycle_Governor.BatteryQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorBatteryQualification_Payload(o: Drone_Lifecycle_Governor.BatteryQualification_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBatteryQualification_Payload)
      writeDrone_Lifecycle_GovernorBatteryQualificationType(o.value)
    }

    def writeDrone_Lifecycle_GovernorNavigationConditionType(o: Drone_Lifecycle_Governor.NavigationCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorNavigationCondition_Payload(o: Drone_Lifecycle_Governor.NavigationCondition_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorNavigationCondition_Payload)
      writeDrone_Lifecycle_GovernorNavigationConditionType(o.value)
    }

    def writeDrone_Lifecycle_GovernorRadioConditionType(o: Drone_Lifecycle_Governor.RadioCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorRadioCondition_Payload(o: Drone_Lifecycle_Governor.RadioCondition_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRadioCondition_Payload)
      writeDrone_Lifecycle_GovernorRadioConditionType(o.value)
    }

    def writeDrone_Lifecycle_GovernorFlightQualificationType(o: Drone_Lifecycle_Governor.FlightQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorFlightQualification_Payload(o: Drone_Lifecycle_Governor.FlightQualification_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightQualification_Payload)
      writeDrone_Lifecycle_GovernorFlightQualificationType(o.value)
    }

    def writeDrone_Lifecycle_GovernorLifecycleStateType(o: Drone_Lifecycle_Governor.LifecycleState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorLifecycleState_Payload(o: Drone_Lifecycle_Governor.LifecycleState_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycleState_Payload)
      writeDrone_Lifecycle_GovernorLifecycleStateType(o.value)
    }

    def writeDrone_Lifecycle_GovernorEligibilityReasonType(o: Drone_Lifecycle_Governor.EligibilityReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorEligibilityReason_Payload(o: Drone_Lifecycle_Governor.EligibilityReason_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorEligibilityReason_Payload)
      writeDrone_Lifecycle_GovernorEligibilityReasonType(o.value)
    }

    def writeDrone_Lifecycle_GovernorDecisionPreStateType(o: Drone_Lifecycle_Governor.DecisionPreState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorDecisionPreState_Payload(o: Drone_Lifecycle_Governor.DecisionPreState_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorDecisionPreState_Payload)
      writeDrone_Lifecycle_GovernorDecisionPreStateType(o.value)
    }

    def writeDrone_Lifecycle_GovernorDecisionNextStateType(o: Drone_Lifecycle_Governor.DecisionNextState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorDecisionNextState_Payload(o: Drone_Lifecycle_Governor.DecisionNextState_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorDecisionNextState_Payload)
      writeDrone_Lifecycle_GovernorDecisionNextStateType(o.value)
    }

    def writeDrone_Lifecycle_GovernorTransitionResultType(o: Drone_Lifecycle_Governor.TransitionResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorTransitionResult_Payload(o: Drone_Lifecycle_Governor.TransitionResult_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorTransitionResult_Payload)
      writeDrone_Lifecycle_GovernorTransitionResultType(o.value)
    }

    def writeDrone_Lifecycle_GovernorPowerCommandType(o: Drone_Lifecycle_Governor.PowerCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorPowerCommand_Payload(o: Drone_Lifecycle_Governor.PowerCommand_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPowerCommand_Payload)
      writeDrone_Lifecycle_GovernorPowerCommandType(o.value)
    }

    def writeDrone_Lifecycle_GovernorChargeCommandType(o: Drone_Lifecycle_Governor.ChargeCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorChargeCommand_Payload(o: Drone_Lifecycle_Governor.ChargeCommand_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorChargeCommand_Payload)
      writeDrone_Lifecycle_GovernorChargeCommandType(o.value)
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorizationType(o: Drone_Lifecycle_Governor.FlightAuthorization.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorization_Payload(o: Drone_Lifecycle_Governor.FlightAuthorization_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightAuthorization_Payload)
      writeDrone_Lifecycle_GovernorFlightAuthorizationType(o.value)
    }

    def writeDrone_Lifecycle_GovernorPilotLifecycleStateType(o: Drone_Lifecycle_Governor.PilotLifecycleState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o: Drone_Lifecycle_Governor.PilotLifecycleState_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPilotLifecycleState_Payload)
      writeDrone_Lifecycle_GovernorPilotLifecycleStateType(o.value)
    }

    def writeDrone_Lifecycle_GovernorRequestDispositionType(o: Drone_Lifecycle_Governor.RequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorRequestDisposition_Payload(o: Drone_Lifecycle_Governor.RequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequestDisposition_Payload)
      writeDrone_Lifecycle_GovernorRequestDispositionType(o.value)
    }

    def writeDrone_Lifecycle_GovernorPilotNoticeType(o: Drone_Lifecycle_Governor.PilotNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Lifecycle_GovernorPilotNotice_Payload(o: Drone_Lifecycle_Governor.PilotNotice_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPilotNotice_Payload)
      writeDrone_Lifecycle_GovernorPilotNoticeType(o.value)
    }

    def writeDrone_Lifecycle_GovernorArbitratedIntent(o: Drone_Lifecycle_Governor.ArbitratedIntent): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorArbitratedIntent)
      writeDrone_Lifecycle_GovernorEffectiveIntentType(o.effectiveIntent)
      writeDrone_Lifecycle_GovernorFreshRequestPreemptionType(o.preemption)
    }

    def writeDrone_Lifecycle_GovernorArbitratedIntent_Payload(o: Drone_Lifecycle_Governor.ArbitratedIntent_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorArbitratedIntent_Payload)
      writeDrone_Lifecycle_GovernorArbitratedIntent(o.value)
    }

    def writeDrone_Lifecycle_GovernorEligibilityEnvelope(o: Drone_Lifecycle_Governor.EligibilityEnvelope): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorEligibilityEnvelope)
      writer.writeB(o.flightEligible)
      writer.writeB(o.chargeEligible)
      writeDrone_Lifecycle_GovernorEligibilityReasonType(o.decisionReason)
    }

    def writeDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorEligibilityEnvelope_Payload)
      writeDrone_Lifecycle_GovernorEligibilityEnvelope(o.value)
    }

    def writeDrone_Lifecycle_GovernorDecisionSnapshot(o: Drone_Lifecycle_Governor.DecisionSnapshot): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorDecisionSnapshot)
      writeDrone_Lifecycle_GovernorDecisionPreStateType(o.preState)
      writeDrone_Lifecycle_GovernorDecisionNextStateType(o.nextState)
      writeDrone_Lifecycle_GovernorEffectiveIntentType(o.effectiveIntent)
      writeDrone_Lifecycle_GovernorTransitionResultType(o.transitionResult)
      writeDrone_Lifecycle_GovernorEligibilityReasonType(o.decisionReason)
    }

    def writeDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o: Drone_Lifecycle_Governor.DecisionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorDecisionSnapshot_Payload)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.value)
    }

    def writeDrone_Lifecycle_GovernorPilotStatus(o: Drone_Lifecycle_Governor.PilotStatus): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPilotStatus)
      writeDrone_Lifecycle_GovernorPilotLifecycleStateType(o.lifecycleState)
      writeDrone_Lifecycle_GovernorRequestDispositionType(o.requestDisposition)
      writeDrone_Lifecycle_GovernorPilotNoticeType(o.pilotNotice)
    }

    def writeDrone_Lifecycle_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Governor.PilotStatus_Payload): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPilotStatus_Payload)
      writeDrone_Lifecycle_GovernorPilotStatus(o.value)
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

    def writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P)
      writeDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)
      writeDrone_Lifecycle_GovernorLifecycleRequestType(o.api_pilotRequest)
      writeDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal)
    }

    def writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)
      writeDrone_Lifecycle_GovernorLifecycleRequestType(o.api_pilotRequest)
      writeDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal)
    }

    def writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P)
      writeDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent)
    }

    def writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent)
    }

    def writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P)
      writeDrone_Lifecycle_GovernorBatteryCapacityBandType(o.api_batteryCapacity)
      writeDrone_Lifecycle_GovernorBatteryCheckType(o.api_batteryCheck)
    }

    def writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorBatteryCapacityBandType(o.api_batteryCapacity)
      writeDrone_Lifecycle_GovernorBatteryCheckType(o.api_batteryCheck)
    }

    def writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P)
      writeDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)
    }

    def writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)
    }

    def writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P)
      writeDrone_Lifecycle_GovernorNavigationConditionType(o.api_navigationCondition)
      writeDrone_Lifecycle_GovernorRadioConditionType(o.api_radioCondition)
    }

    def writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorNavigationConditionType(o.api_navigationCondition)
      writeDrone_Lifecycle_GovernorRadioConditionType(o.api_radioCondition)
    }

    def writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P)
      writeDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification)
    }

    def writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification)
    }

    def writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P)
      writeDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)
      writeDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)
      writeDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)
      writeDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification)
    }

    def writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)
      writeDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)
      writeDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)
      writeDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification)
    }

    def writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P)
      writeDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope)
      writeDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal)
    }

    def writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope)
      writeDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal)
    }

    def writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P)
      writeDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent)
      writeDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope)
    }

    def writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorLifecycleStateType(o.In_committedLifecycleState)
      writeDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent)
      writeDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope)
    }

    def writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P)
      writeDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorLifecycleStateType(o.committedLifecycleState)
      writeDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P)
      writeDrone_Lifecycle_GovernorChargeCommandType(o.api_chargeCommand)
      writeDrone_Lifecycle_GovernorPowerCommandType(o.api_powerCommand)
    }

    def writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorChargeCommandType(o.api_chargeCommand)
      writeDrone_Lifecycle_GovernorPowerCommandType(o.api_powerCommand)
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P)
      writeDrone_Lifecycle_GovernorFlightAuthorizationType(o.api_flightAuthorization)
    }

    def writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorFlightAuthorizationType(o.api_flightAuthorization)
    }

    def writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P)
      writeDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS)
      writeDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)
      writeDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot)
    }

    def writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container): Unit = {
      o match {
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
      }
    }

    def writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P)
      writeDrone_Lifecycle_GovernorPilotStatus(o.api_pilotStatus)
    }

    def writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS)
      writeDrone_Lifecycle_GovernorPilotStatus(o.api_pilotStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
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
        case o: Drone_Lifecycle_Governor.PilotNotice_Payload => writeDrone_Lifecycle_GovernorPilotNotice_Payload(o)
        case o: Drone_Lifecycle_Governor.PilotStatus_Payload => writeDrone_Lifecycle_GovernorPilotStatus_Payload(o)
        case o: Drone_Lifecycle_Governor.BatteryCheck_Payload => writeDrone_Lifecycle_GovernorBatteryCheck_Payload(o)
        case o: Drone_Lifecycle_Governor.ChargerState_Payload => writeDrone_Lifecycle_GovernorChargerState_Payload(o)
        case o: Drone_Lifecycle_Governor.PowerCommand_Payload => writeDrone_Lifecycle_GovernorPowerCommand_Payload(o)
        case o: Drone_Lifecycle_Governor.ChargeCommand_Payload => writeDrone_Lifecycle_GovernorChargeCommand_Payload(o)
        case o: Drone_Lifecycle_Governor.RadioCondition_Payload => writeDrone_Lifecycle_GovernorRadioCondition_Payload(o)
        case o: Drone_Lifecycle_Governor.LifecycleState_Payload => writeDrone_Lifecycle_GovernorLifecycleState_Payload(o)
        case o: Drone_Lifecycle_Governor.EffectiveIntent_Payload => writeDrone_Lifecycle_GovernorEffectiveIntent_Payload(o)
        case o: Drone_Lifecycle_Governor.DecisionPreState_Payload => writeDrone_Lifecycle_GovernorDecisionPreState_Payload(o)
        case o: Drone_Lifecycle_Governor.TransitionResult_Payload => writeDrone_Lifecycle_GovernorTransitionResult_Payload(o)
        case o: Drone_Lifecycle_Governor.RecoveryProposal_Payload => writeDrone_Lifecycle_GovernorRecoveryProposal_Payload(o)
        case o: Drone_Lifecycle_Governor.LifecycleRequest_Payload => writeDrone_Lifecycle_GovernorLifecycleRequest_Payload(o)
        case o: Drone_Lifecycle_Governor.ArbitratedIntent_Payload => writeDrone_Lifecycle_GovernorArbitratedIntent_Payload(o)
        case o: Drone_Lifecycle_Governor.DecisionSnapshot_Payload => writeDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o)
        case o: Drone_Lifecycle_Governor.DecisionNextState_Payload => writeDrone_Lifecycle_GovernorDecisionNextState_Payload(o)
        case o: Drone_Lifecycle_Governor.EligibilityReason_Payload => writeDrone_Lifecycle_GovernorEligibilityReason_Payload(o)
        case o: Drone_Lifecycle_Governor.RequestDisposition_Payload => writeDrone_Lifecycle_GovernorRequestDisposition_Payload(o)
        case o: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload => writeDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorization_Payload => writeDrone_Lifecycle_GovernorFlightAuthorization_Payload(o)
        case o: Drone_Lifecycle_Governor.NavigationCondition_Payload => writeDrone_Lifecycle_GovernorNavigationCondition_Payload(o)
        case o: Drone_Lifecycle_Governor.FlightQualification_Payload => writeDrone_Lifecycle_GovernorFlightQualification_Payload(o)
        case o: Drone_Lifecycle_Governor.PilotLifecycleState_Payload => writeDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o)
        case o: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload => writeDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o)
        case o: Drone_Lifecycle_Governor.BatteryQualification_Payload => writeDrone_Lifecycle_GovernorBatteryQualification_Payload(o)
        case o: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload => writeDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
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

    def readDrone_Lifecycle_GovernorLifecycleRequestType(): Drone_Lifecycle_Governor.LifecycleRequest.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.LifecycleRequest.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorLifecycleRequest_Payload(): Drone_Lifecycle_Governor.LifecycleRequest_Payload = {
      val r = readDrone_Lifecycle_GovernorLifecycleRequest_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycleRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycleRequest_Payload)
      }
      val value = readDrone_Lifecycle_GovernorLifecycleRequestType()
      return Drone_Lifecycle_Governor.LifecycleRequest_Payload(value)
    }

    def readDrone_Lifecycle_GovernorChargerStateType(): Drone_Lifecycle_Governor.ChargerState.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.ChargerState.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorChargerState_Payload(): Drone_Lifecycle_Governor.ChargerState_Payload = {
      val r = readDrone_Lifecycle_GovernorChargerState_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorChargerState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.ChargerState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorChargerState_Payload)
      }
      val value = readDrone_Lifecycle_GovernorChargerStateType()
      return Drone_Lifecycle_Governor.ChargerState_Payload(value)
    }

    def readDrone_Lifecycle_GovernorRecoveryProposalType(): Drone_Lifecycle_Governor.RecoveryProposal.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.RecoveryProposal.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorRecoveryProposal_Payload(): Drone_Lifecycle_Governor.RecoveryProposal_Payload = {
      val r = readDrone_Lifecycle_GovernorRecoveryProposal_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRecoveryProposal_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.RecoveryProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRecoveryProposal_Payload)
      }
      val value = readDrone_Lifecycle_GovernorRecoveryProposalType()
      return Drone_Lifecycle_Governor.RecoveryProposal_Payload(value)
    }

    def readDrone_Lifecycle_GovernorEffectiveIntentType(): Drone_Lifecycle_Governor.EffectiveIntent.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.EffectiveIntent.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorEffectiveIntent_Payload(): Drone_Lifecycle_Governor.EffectiveIntent_Payload = {
      val r = readDrone_Lifecycle_GovernorEffectiveIntent_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorEffectiveIntent_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.EffectiveIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorEffectiveIntent_Payload)
      }
      val value = readDrone_Lifecycle_GovernorEffectiveIntentType()
      return Drone_Lifecycle_Governor.EffectiveIntent_Payload(value)
    }

    def readDrone_Lifecycle_GovernorFreshRequestPreemptionType(): Drone_Lifecycle_Governor.FreshRequestPreemption.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.FreshRequestPreemption.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(): Drone_Lifecycle_Governor.FreshRequestPreemption_Payload = {
      val r = readDrone_Lifecycle_GovernorFreshRequestPreemption_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFreshRequestPreemption_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.FreshRequestPreemption_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFreshRequestPreemption_Payload)
      }
      val value = readDrone_Lifecycle_GovernorFreshRequestPreemptionType()
      return Drone_Lifecycle_Governor.FreshRequestPreemption_Payload(value)
    }

    def readDrone_Lifecycle_GovernorBatteryCapacityBandType(): Drone_Lifecycle_Governor.BatteryCapacityBand.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.BatteryCapacityBand.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(): Drone_Lifecycle_Governor.BatteryCapacityBand_Payload = {
      val r = readDrone_Lifecycle_GovernorBatteryCapacityBand_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBatteryCapacityBand_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.BatteryCapacityBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBatteryCapacityBand_Payload)
      }
      val value = readDrone_Lifecycle_GovernorBatteryCapacityBandType()
      return Drone_Lifecycle_Governor.BatteryCapacityBand_Payload(value)
    }

    def readDrone_Lifecycle_GovernorBatteryCheckType(): Drone_Lifecycle_Governor.BatteryCheck.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.BatteryCheck.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorBatteryCheck_Payload(): Drone_Lifecycle_Governor.BatteryCheck_Payload = {
      val r = readDrone_Lifecycle_GovernorBatteryCheck_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBatteryCheck_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.BatteryCheck_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBatteryCheck_Payload)
      }
      val value = readDrone_Lifecycle_GovernorBatteryCheckType()
      return Drone_Lifecycle_Governor.BatteryCheck_Payload(value)
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationType(): Drone_Lifecycle_Governor.BatteryQualification.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.BatteryQualification.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorBatteryQualification_Payload(): Drone_Lifecycle_Governor.BatteryQualification_Payload = {
      val r = readDrone_Lifecycle_GovernorBatteryQualification_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBatteryQualification_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBatteryQualification_Payload)
      }
      val value = readDrone_Lifecycle_GovernorBatteryQualificationType()
      return Drone_Lifecycle_Governor.BatteryQualification_Payload(value)
    }

    def readDrone_Lifecycle_GovernorNavigationConditionType(): Drone_Lifecycle_Governor.NavigationCondition.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.NavigationCondition.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorNavigationCondition_Payload(): Drone_Lifecycle_Governor.NavigationCondition_Payload = {
      val r = readDrone_Lifecycle_GovernorNavigationCondition_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorNavigationCondition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.NavigationCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorNavigationCondition_Payload)
      }
      val value = readDrone_Lifecycle_GovernorNavigationConditionType()
      return Drone_Lifecycle_Governor.NavigationCondition_Payload(value)
    }

    def readDrone_Lifecycle_GovernorRadioConditionType(): Drone_Lifecycle_Governor.RadioCondition.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.RadioCondition.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorRadioCondition_Payload(): Drone_Lifecycle_Governor.RadioCondition_Payload = {
      val r = readDrone_Lifecycle_GovernorRadioCondition_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRadioCondition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.RadioCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRadioCondition_Payload)
      }
      val value = readDrone_Lifecycle_GovernorRadioConditionType()
      return Drone_Lifecycle_Governor.RadioCondition_Payload(value)
    }

    def readDrone_Lifecycle_GovernorFlightQualificationType(): Drone_Lifecycle_Governor.FlightQualification.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.FlightQualification.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorFlightQualification_Payload(): Drone_Lifecycle_Governor.FlightQualification_Payload = {
      val r = readDrone_Lifecycle_GovernorFlightQualification_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightQualification_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.FlightQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightQualification_Payload)
      }
      val value = readDrone_Lifecycle_GovernorFlightQualificationType()
      return Drone_Lifecycle_Governor.FlightQualification_Payload(value)
    }

    def readDrone_Lifecycle_GovernorLifecycleStateType(): Drone_Lifecycle_Governor.LifecycleState.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.LifecycleState.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorLifecycleState_Payload(): Drone_Lifecycle_Governor.LifecycleState_Payload = {
      val r = readDrone_Lifecycle_GovernorLifecycleState_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycleState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycleState_Payload)
      }
      val value = readDrone_Lifecycle_GovernorLifecycleStateType()
      return Drone_Lifecycle_Governor.LifecycleState_Payload(value)
    }

    def readDrone_Lifecycle_GovernorEligibilityReasonType(): Drone_Lifecycle_Governor.EligibilityReason.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.EligibilityReason.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorEligibilityReason_Payload(): Drone_Lifecycle_Governor.EligibilityReason_Payload = {
      val r = readDrone_Lifecycle_GovernorEligibilityReason_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorEligibilityReason_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.EligibilityReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorEligibilityReason_Payload)
      }
      val value = readDrone_Lifecycle_GovernorEligibilityReasonType()
      return Drone_Lifecycle_Governor.EligibilityReason_Payload(value)
    }

    def readDrone_Lifecycle_GovernorDecisionPreStateType(): Drone_Lifecycle_Governor.DecisionPreState.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.DecisionPreState.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorDecisionPreState_Payload(): Drone_Lifecycle_Governor.DecisionPreState_Payload = {
      val r = readDrone_Lifecycle_GovernorDecisionPreState_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorDecisionPreState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.DecisionPreState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorDecisionPreState_Payload)
      }
      val value = readDrone_Lifecycle_GovernorDecisionPreStateType()
      return Drone_Lifecycle_Governor.DecisionPreState_Payload(value)
    }

    def readDrone_Lifecycle_GovernorDecisionNextStateType(): Drone_Lifecycle_Governor.DecisionNextState.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.DecisionNextState.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorDecisionNextState_Payload(): Drone_Lifecycle_Governor.DecisionNextState_Payload = {
      val r = readDrone_Lifecycle_GovernorDecisionNextState_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorDecisionNextState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.DecisionNextState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorDecisionNextState_Payload)
      }
      val value = readDrone_Lifecycle_GovernorDecisionNextStateType()
      return Drone_Lifecycle_Governor.DecisionNextState_Payload(value)
    }

    def readDrone_Lifecycle_GovernorTransitionResultType(): Drone_Lifecycle_Governor.TransitionResult.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.TransitionResult.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorTransitionResult_Payload(): Drone_Lifecycle_Governor.TransitionResult_Payload = {
      val r = readDrone_Lifecycle_GovernorTransitionResult_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorTransitionResult_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.TransitionResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorTransitionResult_Payload)
      }
      val value = readDrone_Lifecycle_GovernorTransitionResultType()
      return Drone_Lifecycle_Governor.TransitionResult_Payload(value)
    }

    def readDrone_Lifecycle_GovernorPowerCommandType(): Drone_Lifecycle_Governor.PowerCommand.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.PowerCommand.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorPowerCommand_Payload(): Drone_Lifecycle_Governor.PowerCommand_Payload = {
      val r = readDrone_Lifecycle_GovernorPowerCommand_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPowerCommand_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PowerCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPowerCommand_Payload)
      }
      val value = readDrone_Lifecycle_GovernorPowerCommandType()
      return Drone_Lifecycle_Governor.PowerCommand_Payload(value)
    }

    def readDrone_Lifecycle_GovernorChargeCommandType(): Drone_Lifecycle_Governor.ChargeCommand.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.ChargeCommand.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorChargeCommand_Payload(): Drone_Lifecycle_Governor.ChargeCommand_Payload = {
      val r = readDrone_Lifecycle_GovernorChargeCommand_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorChargeCommand_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.ChargeCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorChargeCommand_Payload)
      }
      val value = readDrone_Lifecycle_GovernorChargeCommandType()
      return Drone_Lifecycle_Governor.ChargeCommand_Payload(value)
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationType(): Drone_Lifecycle_Governor.FlightAuthorization.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.FlightAuthorization.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorFlightAuthorization_Payload(): Drone_Lifecycle_Governor.FlightAuthorization_Payload = {
      val r = readDrone_Lifecycle_GovernorFlightAuthorization_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightAuthorization_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorization_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightAuthorization_Payload)
      }
      val value = readDrone_Lifecycle_GovernorFlightAuthorizationType()
      return Drone_Lifecycle_Governor.FlightAuthorization_Payload(value)
    }

    def readDrone_Lifecycle_GovernorPilotLifecycleStateType(): Drone_Lifecycle_Governor.PilotLifecycleState.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.PilotLifecycleState.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorPilotLifecycleState_Payload(): Drone_Lifecycle_Governor.PilotLifecycleState_Payload = {
      val r = readDrone_Lifecycle_GovernorPilotLifecycleState_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPilotLifecycleState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PilotLifecycleState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPilotLifecycleState_Payload)
      }
      val value = readDrone_Lifecycle_GovernorPilotLifecycleStateType()
      return Drone_Lifecycle_Governor.PilotLifecycleState_Payload(value)
    }

    def readDrone_Lifecycle_GovernorRequestDispositionType(): Drone_Lifecycle_Governor.RequestDisposition.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.RequestDisposition.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorRequestDisposition_Payload(): Drone_Lifecycle_Governor.RequestDisposition_Payload = {
      val r = readDrone_Lifecycle_GovernorRequestDisposition_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequestDisposition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.RequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequestDisposition_Payload)
      }
      val value = readDrone_Lifecycle_GovernorRequestDispositionType()
      return Drone_Lifecycle_Governor.RequestDisposition_Payload(value)
    }

    def readDrone_Lifecycle_GovernorPilotNoticeType(): Drone_Lifecycle_Governor.PilotNotice.Type = {
      val r = reader.readZ()
      return Drone_Lifecycle_Governor.PilotNotice.byOrdinal(r).get
    }

    def readDrone_Lifecycle_GovernorPilotNotice_Payload(): Drone_Lifecycle_Governor.PilotNotice_Payload = {
      val r = readDrone_Lifecycle_GovernorPilotNotice_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPilotNotice_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PilotNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPilotNotice_Payload)
      }
      val value = readDrone_Lifecycle_GovernorPilotNoticeType()
      return Drone_Lifecycle_Governor.PilotNotice_Payload(value)
    }

    def readDrone_Lifecycle_GovernorArbitratedIntent(): Drone_Lifecycle_Governor.ArbitratedIntent = {
      val r = readDrone_Lifecycle_GovernorArbitratedIntentT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorArbitratedIntentT(typeParsed: B): Drone_Lifecycle_Governor.ArbitratedIntent = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorArbitratedIntent)
      }
      val effectiveIntent = readDrone_Lifecycle_GovernorEffectiveIntentType()
      val preemption = readDrone_Lifecycle_GovernorFreshRequestPreemptionType()
      return Drone_Lifecycle_Governor.ArbitratedIntent(effectiveIntent, preemption)
    }

    def readDrone_Lifecycle_GovernorArbitratedIntent_Payload(): Drone_Lifecycle_Governor.ArbitratedIntent_Payload = {
      val r = readDrone_Lifecycle_GovernorArbitratedIntent_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorArbitratedIntent_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.ArbitratedIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorArbitratedIntent_Payload)
      }
      val value = readDrone_Lifecycle_GovernorArbitratedIntent()
      return Drone_Lifecycle_Governor.ArbitratedIntent_Payload(value)
    }

    def readDrone_Lifecycle_GovernorEligibilityEnvelope(): Drone_Lifecycle_Governor.EligibilityEnvelope = {
      val r = readDrone_Lifecycle_GovernorEligibilityEnvelopeT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorEligibilityEnvelopeT(typeParsed: B): Drone_Lifecycle_Governor.EligibilityEnvelope = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorEligibilityEnvelope)
      }
      val flightEligible = reader.readB()
      val chargeEligible = reader.readB()
      val decisionReason = readDrone_Lifecycle_GovernorEligibilityReasonType()
      return Drone_Lifecycle_Governor.EligibilityEnvelope(flightEligible, chargeEligible, decisionReason)
    }

    def readDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(): Drone_Lifecycle_Governor.EligibilityEnvelope_Payload = {
      val r = readDrone_Lifecycle_GovernorEligibilityEnvelope_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorEligibilityEnvelope_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.EligibilityEnvelope_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorEligibilityEnvelope_Payload)
      }
      val value = readDrone_Lifecycle_GovernorEligibilityEnvelope()
      return Drone_Lifecycle_Governor.EligibilityEnvelope_Payload(value)
    }

    def readDrone_Lifecycle_GovernorDecisionSnapshot(): Drone_Lifecycle_Governor.DecisionSnapshot = {
      val r = readDrone_Lifecycle_GovernorDecisionSnapshotT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorDecisionSnapshotT(typeParsed: B): Drone_Lifecycle_Governor.DecisionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorDecisionSnapshot)
      }
      val preState = readDrone_Lifecycle_GovernorDecisionPreStateType()
      val nextState = readDrone_Lifecycle_GovernorDecisionNextStateType()
      val effectiveIntent = readDrone_Lifecycle_GovernorEffectiveIntentType()
      val transitionResult = readDrone_Lifecycle_GovernorTransitionResultType()
      val decisionReason = readDrone_Lifecycle_GovernorEligibilityReasonType()
      return Drone_Lifecycle_Governor.DecisionSnapshot(preState, nextState, effectiveIntent, transitionResult, decisionReason)
    }

    def readDrone_Lifecycle_GovernorDecisionSnapshot_Payload(): Drone_Lifecycle_Governor.DecisionSnapshot_Payload = {
      val r = readDrone_Lifecycle_GovernorDecisionSnapshot_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorDecisionSnapshot_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.DecisionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorDecisionSnapshot_Payload)
      }
      val value = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.DecisionSnapshot_Payload(value)
    }

    def readDrone_Lifecycle_GovernorPilotStatus(): Drone_Lifecycle_Governor.PilotStatus = {
      val r = readDrone_Lifecycle_GovernorPilotStatusT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPilotStatusT(typeParsed: B): Drone_Lifecycle_Governor.PilotStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPilotStatus)
      }
      val lifecycleState = readDrone_Lifecycle_GovernorPilotLifecycleStateType()
      val requestDisposition = readDrone_Lifecycle_GovernorRequestDispositionType()
      val pilotNotice = readDrone_Lifecycle_GovernorPilotNoticeType()
      return Drone_Lifecycle_Governor.PilotStatus(lifecycleState, requestDisposition, pilotNotice)
    }

    def readDrone_Lifecycle_GovernorPilotStatus_Payload(): Drone_Lifecycle_Governor.PilotStatus_Payload = {
      val r = readDrone_Lifecycle_GovernorPilotStatus_PayloadT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPilotStatus_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PilotStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPilotStatus_Payload)
      }
      val value = readDrone_Lifecycle_GovernorPilotStatus()
      return Drone_Lifecycle_Governor.PilotStatus_Payload(value)
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

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P)
      }
      val api_chargerState = readDrone_Lifecycle_GovernorChargerStateType()
      val api_pilotRequest = readDrone_Lifecycle_GovernorLifecycleRequestType()
      val api_recoveryProposal = readDrone_Lifecycle_GovernorRecoveryProposalType()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P(api_chargerState, api_pilotRequest, api_recoveryProposal)
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS)
      }
      val api_chargerState = readDrone_Lifecycle_GovernorChargerStateType()
      val api_pilotRequest = readDrone_Lifecycle_GovernorLifecycleRequestType()
      val api_recoveryProposal = readDrone_Lifecycle_GovernorRecoveryProposalType()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(api_chargerState, api_pilotRequest, api_recoveryProposal)
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P)
      }
      val api_arbitratedIntent = readDrone_Lifecycle_GovernorArbitratedIntent()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P(api_arbitratedIntent)
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS)
      }
      val api_arbitratedIntent = readDrone_Lifecycle_GovernorArbitratedIntent()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(api_arbitratedIntent)
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P)
      }
      val api_batteryCapacity = readDrone_Lifecycle_GovernorBatteryCapacityBandType()
      val api_batteryCheck = readDrone_Lifecycle_GovernorBatteryCheckType()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS)
      }
      val api_batteryCapacity = readDrone_Lifecycle_GovernorBatteryCapacityBandType()
      val api_batteryCheck = readDrone_Lifecycle_GovernorBatteryCheckType()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P)
      }
      val api_batteryQualification = readDrone_Lifecycle_GovernorBatteryQualificationType()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(api_batteryQualification)
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS)
      }
      val api_batteryQualification = readDrone_Lifecycle_GovernorBatteryQualificationType()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(api_batteryQualification)
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P)
      }
      val api_navigationCondition = readDrone_Lifecycle_GovernorNavigationConditionType()
      val api_radioCondition = readDrone_Lifecycle_GovernorRadioConditionType()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(api_navigationCondition, api_radioCondition)
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS)
      }
      val api_navigationCondition = readDrone_Lifecycle_GovernorNavigationConditionType()
      val api_radioCondition = readDrone_Lifecycle_GovernorRadioConditionType()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(api_navigationCondition, api_radioCondition)
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P)
      }
      val api_flightQualification = readDrone_Lifecycle_GovernorFlightQualificationType()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(api_flightQualification)
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS)
      }
      val api_flightQualification = readDrone_Lifecycle_GovernorFlightQualificationType()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(api_flightQualification)
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P)
      }
      val api_batteryQualification = readDrone_Lifecycle_GovernorBatteryQualificationType()
      val api_chargerState = readDrone_Lifecycle_GovernorChargerStateType()
      val api_currentLifecycleState = readDrone_Lifecycle_GovernorLifecycleStateType()
      val api_flightQualification = readDrone_Lifecycle_GovernorFlightQualificationType()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(api_batteryQualification, api_chargerState, api_currentLifecycleState, api_flightQualification)
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS)
      }
      val api_batteryQualification = readDrone_Lifecycle_GovernorBatteryQualificationType()
      val api_chargerState = readDrone_Lifecycle_GovernorChargerStateType()
      val api_currentLifecycleState = readDrone_Lifecycle_GovernorLifecycleStateType()
      val api_flightQualification = readDrone_Lifecycle_GovernorFlightQualificationType()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(api_batteryQualification, api_chargerState, api_currentLifecycleState, api_flightQualification)
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P)
      }
      val api_eligibilityEnvelope = readDrone_Lifecycle_GovernorEligibilityEnvelope()
      val api_recoveryProposal = readDrone_Lifecycle_GovernorRecoveryProposalType()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(api_eligibilityEnvelope, api_recoveryProposal)
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS)
      }
      val api_eligibilityEnvelope = readDrone_Lifecycle_GovernorEligibilityEnvelope()
      val api_recoveryProposal = readDrone_Lifecycle_GovernorRecoveryProposalType()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(api_eligibilityEnvelope, api_recoveryProposal)
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P)
      }
      val api_arbitratedIntent = readDrone_Lifecycle_GovernorArbitratedIntent()
      val api_eligibilityEnvelope = readDrone_Lifecycle_GovernorEligibilityEnvelope()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(api_arbitratedIntent, api_eligibilityEnvelope)
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS)
      }
      val In_committedLifecycleState = readDrone_Lifecycle_GovernorLifecycleStateType()
      val api_arbitratedIntent = readDrone_Lifecycle_GovernorArbitratedIntent()
      val api_eligibilityEnvelope = readDrone_Lifecycle_GovernorEligibilityEnvelope()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(In_committedLifecycleState, api_arbitratedIntent, api_eligibilityEnvelope)
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P)
      }
      val api_currentLifecycleState = readDrone_Lifecycle_GovernorLifecycleStateType()
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(api_currentLifecycleState, api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS)
      }
      val committedLifecycleState = readDrone_Lifecycle_GovernorLifecycleStateType()
      val api_currentLifecycleState = readDrone_Lifecycle_GovernorLifecycleStateType()
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(committedLifecycleState, api_currentLifecycleState, api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P)
      }
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS)
      }
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P)
      }
      val api_chargeCommand = readDrone_Lifecycle_GovernorChargeCommandType()
      val api_powerCommand = readDrone_Lifecycle_GovernorPowerCommandType()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(api_chargeCommand, api_powerCommand)
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS)
      }
      val api_chargeCommand = readDrone_Lifecycle_GovernorChargeCommandType()
      val api_powerCommand = readDrone_Lifecycle_GovernorPowerCommandType()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(api_chargeCommand, api_powerCommand)
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P)
      }
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS)
      }
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P)
      }
      val api_flightAuthorization = readDrone_Lifecycle_GovernorFlightAuthorizationType()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(api_flightAuthorization)
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS)
      }
      val api_flightAuthorization = readDrone_Lifecycle_GovernorFlightAuthorizationType()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(api_flightAuthorization)
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container.")
          val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P = {
      val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P)
      }
      val api_batteryQualification = readDrone_Lifecycle_GovernorBatteryQualificationType()
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(api_batteryQualification, api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS)
      }
      val api_batteryQualification = readDrone_Lifecycle_GovernorBatteryQualificationType()
      val api_decisionSnapshot = readDrone_Lifecycle_GovernorDecisionSnapshot()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(api_batteryQualification, api_decisionSnapshot)
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container.")
          val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P = {
      val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(F)
      return r
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P)
      }
      val api_pilotStatus = readDrone_Lifecycle_GovernorPilotStatus()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(api_pilotStatus)
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS = {
      val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(F)
      return r
    }

    def readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS)
      }
      val api_pilotStatus = readDrone_Lifecycle_GovernorPilotStatus()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(api_pilotStatus)
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
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T)
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
        case Constants.Drone_Lifecycle_GovernorPilotNotice_Payload => val r = readDrone_Lifecycle_GovernorPilotNotice_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorPilotStatus_Payload => val r = readDrone_Lifecycle_GovernorPilotStatus_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryCheck_Payload => val r = readDrone_Lifecycle_GovernorBatteryCheck_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorChargerState_Payload => val r = readDrone_Lifecycle_GovernorChargerState_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerCommand_Payload => val r = readDrone_Lifecycle_GovernorPowerCommand_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorChargeCommand_Payload => val r = readDrone_Lifecycle_GovernorChargeCommand_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorRadioCondition_Payload => val r = readDrone_Lifecycle_GovernorRadioCondition_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleState_Payload => val r = readDrone_Lifecycle_GovernorLifecycleState_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorEffectiveIntent_Payload => val r = readDrone_Lifecycle_GovernorEffectiveIntent_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorDecisionPreState_Payload => val r = readDrone_Lifecycle_GovernorDecisionPreState_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorTransitionResult_Payload => val r = readDrone_Lifecycle_GovernorTransitionResult_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorRecoveryProposal_Payload => val r = readDrone_Lifecycle_GovernorRecoveryProposal_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleRequest_Payload => val r = readDrone_Lifecycle_GovernorLifecycleRequest_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorArbitratedIntent_Payload => val r = readDrone_Lifecycle_GovernorArbitratedIntent_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorDecisionSnapshot_Payload => val r = readDrone_Lifecycle_GovernorDecisionSnapshot_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorDecisionNextState_Payload => val r = readDrone_Lifecycle_GovernorDecisionNextState_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorEligibilityReason_Payload => val r = readDrone_Lifecycle_GovernorEligibilityReason_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestDisposition_Payload => val r = readDrone_Lifecycle_GovernorRequestDisposition_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryCapacityBand_Payload => val r = readDrone_Lifecycle_GovernorBatteryCapacityBand_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorization_Payload => val r = readDrone_Lifecycle_GovernorFlightAuthorization_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorNavigationCondition_Payload => val r = readDrone_Lifecycle_GovernorNavigationCondition_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightQualification_Payload => val r = readDrone_Lifecycle_GovernorFlightQualification_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorPilotLifecycleState_Payload => val r = readDrone_Lifecycle_GovernorPilotLifecycleState_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorEligibilityEnvelope_Payload => val r = readDrone_Lifecycle_GovernorEligibilityEnvelope_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualification_Payload => val r = readDrone_Lifecycle_GovernorBatteryQualification_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorFreshRequestPreemption_Payload => val r = readDrone_Lifecycle_GovernorFreshRequestPreemption_PayloadT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T)
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

  def fromDrone_Lifecycle_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Governor.LifecycleRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleRequest_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleRequest_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleRequest_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleRequest_Payload(reader: Reader): Drone_Lifecycle_Governor.LifecycleRequest_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleRequest_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorChargerState_Payload(o: Drone_Lifecycle_Governor.ChargerState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorChargerState_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorChargerState_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.ChargerState_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorChargerState_Payload(reader: Reader): Drone_Lifecycle_Governor.ChargerState_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorChargerState_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorChargerState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRecoveryProposal_Payload(o: Drone_Lifecycle_Governor.RecoveryProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRecoveryProposal_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRecoveryProposal_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RecoveryProposal_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRecoveryProposal_Payload(reader: Reader): Drone_Lifecycle_Governor.RecoveryProposal_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorRecoveryProposal_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRecoveryProposal_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEffectiveIntent_Payload(o: Drone_Lifecycle_Governor.EffectiveIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorEffectiveIntent_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorEffectiveIntent_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.EffectiveIntent_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEffectiveIntent_Payload(reader: Reader): Drone_Lifecycle_Governor.EffectiveIntent_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorEffectiveIntent_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorEffectiveIntent_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FreshRequestPreemption_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(reader: Reader): Drone_Lifecycle_Governor.FreshRequestPreemption_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorFreshRequestPreemption_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFreshRequestPreemption_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryCapacityBand_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(reader: Reader): Drone_Lifecycle_Governor.BatteryCapacityBand_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryCapacityBand_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryCapacityBand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryCheck_Payload(o: Drone_Lifecycle_Governor.BatteryCheck_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryCheck_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryCheck_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryCheck_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryCheck_Payload(reader: Reader): Drone_Lifecycle_Governor.BatteryCheck_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryCheck_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryCheck_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualification_Payload(o: Drone_Lifecycle_Governor.BatteryQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryQualification_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryQualification_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryQualification_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualification_Payload(reader: Reader): Drone_Lifecycle_Governor.BatteryQualification_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryQualification_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryQualification_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorNavigationCondition_Payload(o: Drone_Lifecycle_Governor.NavigationCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorNavigationCondition_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorNavigationCondition_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.NavigationCondition_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorNavigationCondition_Payload(reader: Reader): Drone_Lifecycle_Governor.NavigationCondition_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorNavigationCondition_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorNavigationCondition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRadioCondition_Payload(o: Drone_Lifecycle_Governor.RadioCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRadioCondition_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRadioCondition_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RadioCondition_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRadioCondition_Payload(reader: Reader): Drone_Lifecycle_Governor.RadioCondition_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorRadioCondition_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRadioCondition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightQualification_Payload(o: Drone_Lifecycle_Governor.FlightQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightQualification_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightQualification_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightQualification_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightQualification_Payload(reader: Reader): Drone_Lifecycle_Governor.FlightQualification_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorFlightQualification_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightQualification_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleState_Payload(o: Drone_Lifecycle_Governor.LifecycleState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleState_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleState_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleState_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleState_Payload(reader: Reader): Drone_Lifecycle_Governor.LifecycleState_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleState_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEligibilityReason_Payload(o: Drone_Lifecycle_Governor.EligibilityReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorEligibilityReason_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorEligibilityReason_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.EligibilityReason_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEligibilityReason_Payload(reader: Reader): Drone_Lifecycle_Governor.EligibilityReason_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorEligibilityReason_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorEligibilityReason_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionPreState_Payload(o: Drone_Lifecycle_Governor.DecisionPreState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorDecisionPreState_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorDecisionPreState_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.DecisionPreState_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionPreState_Payload(reader: Reader): Drone_Lifecycle_Governor.DecisionPreState_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorDecisionPreState_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorDecisionPreState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionNextState_Payload(o: Drone_Lifecycle_Governor.DecisionNextState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorDecisionNextState_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorDecisionNextState_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.DecisionNextState_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionNextState_Payload(reader: Reader): Drone_Lifecycle_Governor.DecisionNextState_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorDecisionNextState_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorDecisionNextState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorTransitionResult_Payload(o: Drone_Lifecycle_Governor.TransitionResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorTransitionResult_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorTransitionResult_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.TransitionResult_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorTransitionResult_Payload(reader: Reader): Drone_Lifecycle_Governor.TransitionResult_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorTransitionResult_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorTransitionResult_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerCommand_Payload(o: Drone_Lifecycle_Governor.PowerCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPowerCommand_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPowerCommand_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PowerCommand_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerCommand_Payload(reader: Reader): Drone_Lifecycle_Governor.PowerCommand_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorPowerCommand_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPowerCommand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorChargeCommand_Payload(o: Drone_Lifecycle_Governor.ChargeCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorChargeCommand_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorChargeCommand_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.ChargeCommand_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorChargeCommand_Payload(reader: Reader): Drone_Lifecycle_Governor.ChargeCommand_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorChargeCommand_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorChargeCommand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorization_Payload(o: Drone_Lifecycle_Governor.FlightAuthorization_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightAuthorization_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightAuthorization_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightAuthorization_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorization_Payload(reader: Reader): Drone_Lifecycle_Governor.FlightAuthorization_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorFlightAuthorization_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightAuthorization_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o: Drone_Lifecycle_Governor.PilotLifecycleState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPilotLifecycleState_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PilotLifecycleState_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotLifecycleState_Payload(reader: Reader): Drone_Lifecycle_Governor.PilotLifecycleState_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorPilotLifecycleState_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPilotLifecycleState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestDisposition_Payload(o: Drone_Lifecycle_Governor.RequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequestDisposition_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequestDisposition_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestDisposition_Payload(reader: Reader): Drone_Lifecycle_Governor.RequestDisposition_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorRequestDisposition_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequestDisposition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotNotice_Payload(o: Drone_Lifecycle_Governor.PilotNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPilotNotice_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPilotNotice_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PilotNotice_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotNotice_Payload(reader: Reader): Drone_Lifecycle_Governor.PilotNotice_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorPilotNotice_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPilotNotice_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorArbitratedIntent(o: Drone_Lifecycle_Governor.ArbitratedIntent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorArbitratedIntent(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorArbitratedIntent(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.ArbitratedIntent, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorArbitratedIntent(reader: Reader): Drone_Lifecycle_Governor.ArbitratedIntent = {
      val r = reader.readDrone_Lifecycle_GovernorArbitratedIntent()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorArbitratedIntent _)
    return r
  }

  def fromDrone_Lifecycle_GovernorArbitratedIntent_Payload(o: Drone_Lifecycle_Governor.ArbitratedIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorArbitratedIntent_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorArbitratedIntent_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.ArbitratedIntent_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorArbitratedIntent_Payload(reader: Reader): Drone_Lifecycle_Governor.ArbitratedIntent_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorArbitratedIntent_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorArbitratedIntent_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEligibilityEnvelope(o: Drone_Lifecycle_Governor.EligibilityEnvelope, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorEligibilityEnvelope(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorEligibilityEnvelope(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.EligibilityEnvelope, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEligibilityEnvelope(reader: Reader): Drone_Lifecycle_Governor.EligibilityEnvelope = {
      val r = reader.readDrone_Lifecycle_GovernorEligibilityEnvelope()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorEligibilityEnvelope _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.EligibilityEnvelope_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(reader: Reader): Drone_Lifecycle_Governor.EligibilityEnvelope_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorEligibilityEnvelope_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorEligibilityEnvelope_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionSnapshot(o: Drone_Lifecycle_Governor.DecisionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorDecisionSnapshot(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorDecisionSnapshot(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.DecisionSnapshot, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionSnapshot(reader: Reader): Drone_Lifecycle_Governor.DecisionSnapshot = {
      val r = reader.readDrone_Lifecycle_GovernorDecisionSnapshot()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorDecisionSnapshot _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o: Drone_Lifecycle_Governor.DecisionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorDecisionSnapshot_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.DecisionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionSnapshot_Payload(reader: Reader): Drone_Lifecycle_Governor.DecisionSnapshot_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorDecisionSnapshot_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorDecisionSnapshot_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotStatus(o: Drone_Lifecycle_Governor.PilotStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPilotStatus(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPilotStatus(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PilotStatus, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotStatus(reader: Reader): Drone_Lifecycle_Governor.PilotStatus = {
      val r = reader.readDrone_Lifecycle_GovernorPilotStatus()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPilotStatus _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Governor.PilotStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPilotStatus_Payload(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPilotStatus_Payload(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PilotStatus_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotStatus_Payload(reader: Reader): Drone_Lifecycle_Governor.PilotStatus_Payload = {
      val r = reader.readDrone_Lifecycle_GovernorPilotStatus_Payload()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPilotStatus_Payload _)
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

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(reader: Reader): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(reader: Reader): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(reader: Reader): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container = {
      val r = reader.readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(reader: Reader): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P = {
      val r = reader.readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(reader: Reader): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS = {
      val r = reader.readDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS _)
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